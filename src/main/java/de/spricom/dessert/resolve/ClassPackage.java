package de.spricom.dessert.resolve;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A ClassEntry represents a single package within one classes directory or .jar file.
 * It's either linked to the parent {@link ClassPackage} it belongs to or it is a
 * {@link ClassRoot} itself. It maintains a probably empty list of all its subpackages
 * and classes it contains directly.
 * If there is an other package with the same name in some other classes directory or
 * .jar file within the {@link ClassResolver} scope it has a reference to a list of all
 * such packages.
 */
public class ClassPackage {
    private final String packageName;
    private final ClassPackage parent;
    private final List<ClassPackage> subPackages = new ArrayList<ClassPackage>();
    private final List<ClassEntry> classes = new ArrayList<ClassEntry>();
    private List<ClassPackage> alternatives;

    protected ClassPackage() {
        packageName = "";
        parent = null;
    }

    public ClassPackage(ClassPackage parent, String packageName) {
        this.parent = parent;
        this.packageName = packageName;
        assert getSubPackage(packageName) == null : "Package " + packageName + " added twice.";
        parent.subPackages.add(this);
    }

    public ClassPackage getParent() {
        return parent;
    }

    public final String getPackageName() {
        return packageName;
    }

    /**
     * @return the package name without parent package prefix
     */
    public String getShortName() {
        if (parent == null) {
            return "";
        }
        return packageName.substring(getParent().getPackageName().length());
    }

    public ClassRoot getRoot() {
        return parent.getRoot();
    }

    public File getRootFile() {
        return getRoot().getRootFile();
    }

    @Override
    public String toString() {
        return packageName;
    }

    /**
     * @return the probably empty list of all direct nested packages of this package
     */
    public List<ClassPackage> getSubPackages() {
        return subPackages;
    }

    public ClassPackage getSubPackage(String packageName) {
        for (ClassPackage subPackage : subPackages) {
            if (packageName.equals(subPackage.getPackageName())) {
                return subPackage;
            }
        }
        return null;
    }

    /**
     * @return the list of all classes directly contained in this package
     */
    public List<ClassEntry> getClasses() {
        return classes;
    }

    public void addClass(ClassEntry ce) {
        assert getClass(ce.getClassname()) == null : "Class " + ce.getClassname() + " added twice.";
        classes.add(ce);
    }

    public ClassEntry getClass(String classname) {
        for (ClassEntry ce : classes) {
            if (classname.equals(ce.getClassname())) {
                return ce;
            }
        }
        return null;
    }

    /**
     * Returns a list of all other packages with the same fully qualified name.
     * For the root package "" this method returns all roots ({@link ClassRoot})
     * within the {@link ClassResolver}.
     *
     * @return the other packages or null if there are none
     */
    public List<ClassPackage> getAlternatives() {
        return alternatives;
    }

    void addAlternative(ClassPackage alt) {
        assert alt.alternatives == null : "alt.alternatives != null";
        if (alternatives == null) {
            alternatives = new LinkedList<ClassPackage>();
            alternatives.add(this);
        }
        assert !alternatives.contains(alt) : "alternatives.contains(alt)";
        alternatives.add(alt);
        alt.alternatives = alternatives;
    }
}
