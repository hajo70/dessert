package de.spricom.dessert.resolve;

import de.spricom.dessert.util.Predicate;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class ClassResolver {
    private static Logger log = Logger.getLogger(ClassResolver.class.getName());

    private List<ClassRoot> path = new ArrayList<ClassRoot>(60);
    private final Map<String, ClassPackage> packages = new HashMap<String, ClassPackage>(3000);
    private final Map<String, ClassFileEntry> classes = new HashMap<String, ClassFileEntry>(60000);

    public static ClassResolver of(String path) throws IOException {
        ClassResolver r = new ClassResolver();
        r.add(path);
        return r;
    }

    public static ClassResolver ofClassPath() throws IOException {
        ClassResolver r = new ClassResolver();
        r.addClassPath();
        return r;
    }

    public static ClassResolver ofClassPathWithoutJars() throws IOException {
        ClassResolver r = new ClassResolver();
        for (String entry : System.getProperty("java.class.path").split(File.pathSeparator)) {
            if (!entry.endsWith(".jar")) {
                r.addFile(entry);
            }
        }
        return r;
    }

    public static ClassResolver ofBootClassPath() throws IOException {
        ClassResolver r = new ClassResolver();
        r.addBootClassPath();
        return r;
    }

    public static ClassResolver ofClassPathAndBootClassPath() throws IOException {
        ClassResolver r = new ClassResolver();
        r.addClassPath();
        r.addBootClassPath();
        return r;
    }

    public void addClassPath() throws IOException {
        add(System.getProperty("java.class.path"));
    }

    public void addBootClassPath() throws IOException {
        String path = System.getProperty("sun.boot.class.path");
        // For JDK 9 there is no sun.boot.class.path property
        if (path != null) {
            add(path);
        }
    }

    public void add(String path) throws IOException {
        for (String entry : path.split(File.pathSeparator)) {
            addFile(entry);
        }
    }

    private void addFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            log.warning("Does not exist: " + filename);
        } else if (getRoot(file) != null) {
            log.warning("Already on path: " + filename);
        } else if (file.isDirectory()) {
            path.add(new DirectoryRoot(this, file));
        } else if (file.isFile() && file.getName().endsWith(".jar")) {
            path.add(new JarRoot(this, file));
        } else {
            log.warning("Don't know how to process: " + filename);
        }
    }

    void addPackage(ClassPackage cp) {
        ClassPackage previous = packages.put(cp.getPackageName(), cp);
        assert previous == null : "Added " + cp + " twice!";
    }

    void addClass(ClassFileEntry cf) {
        String cn = cf.getClassfile().getThisClass();
        ClassFileEntry prev = classes.get(cn);
        if (prev == null) {
            classes.put(cn, cf);
        } else {
            prev.addAlternative(cf);
        }
    }

    public ClassRoot getRoot(File file) {
        for (ClassRoot root : path) {
            if (root.getRootFile().equals(file)) {
                return root;
            }
        }
        return null;
    }

    public ClassPackage getPackage(String packageName) {
        return packages.get(packageName);
    }

    public ClassPackage getPackage(File root, String packageName) {
        ClassPackage cp = getPackage(packageName);
        while (cp != null && !root.equals(cp.getRootFile())) {
            cp = cp.getAlternative();
        }
        return cp;
    }

    public ClassFileEntry getClassFile(String classname) {
        return classes.get(classname);
    }

    public ClassFileEntry getClassFile(File root, String classname) {
        ClassFileEntry cf = getClassFile(classname);
        if (root.equals(cf.getPackage().getRootFile())) {
            return cf;
        }
        if (cf.getAlternatives() == null) {
            return null;
        }
        for (ClassFileEntry alt : cf.getAlternatives()) {
            if (root.equals(alt.getPackage().getRootFile())) {
                return alt;
            }
        }
        return null;
    }

    public Set<File> getRootFiles() {
        return getRootFiles(new Predicate<File>() {

            @Override
            public boolean test(File t) {
                return true;
            }
        });
    }

    public Set<File> getRootJars() {
        return getRootFiles(new Predicate<File>() {

            @Override
            public boolean test(File t) {
                return !t.isDirectory();
            }
        });
    }

    public Set<File> getRootDirs() {
        return getRootFiles(new Predicate<File>() {

            @Override
            public boolean test(File t) {
                return t.isDirectory();
            }
        });
    }

    public Set<File> getRootFiles(Predicate<File> predicate) {
        Set<File> files = new HashSet<File>();
        for (ClassRoot cr : path) {
            if (predicate.test(cr.getRootFile())) {
                files.add(cr.getRootFile());
            }
        }
        return files;
    }

    public int getPackageCount() {
        return packages.size();
    }

    public int getClassCount() {
        return classes.size();
    }
}
