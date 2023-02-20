package de.spricom.dessert.modules.fixed;

/*-
 * #%L
 * Dessert Dependency Assertion Library for Java
 * %%
 * Copyright (C) 2017 - 2023 Hans Jörg Heßmann
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import de.spricom.dessert.modules.core.DelegateModule;
import de.spricom.dessert.modules.core.ModuleLookup;
import de.spricom.dessert.modules.core.ModuleSlice;

/**
 * Generated by de.spricom.dessert.tools.GenerateStaticModulesTool.
 */
public final class JdkModules {

    public final ModuleSlice accessibility;
    public final ModuleSlice attach;
    public final ModuleSlice charsets;
    public final ModuleSlice compiler;
    public final Crypto crypto;
    public final ModuleSlice dynalink;
    public final ModuleSlice editpad;
    public final Hotspot hotspot;
    public final ModuleSlice httpserver;
    public final Incubator incubator;
    public final Internal internal;
    public final ModuleSlice jartool;
    public final ModuleSlice javadoc;
    public final ModuleSlice jcmd;
    public final ModuleSlice jconsole;
    public final ModuleSlice jdeps;
    public final ModuleSlice jdi;
    public final Jdwp jdwp;
    public final ModuleSlice jfr;
    public final ModuleSlice jlink;
    public final ModuleSlice jpackage;
    public final ModuleSlice jshell;
    public final ModuleSlice jsobject;
    public final ModuleSlice jstatd;
    public final ModuleSlice localedata;
    public final Management management;
    public final Naming naming;
    public final ModuleSlice net;
    public final Nio nio;
    public final ModuleSlice random;
    public final ModuleSlice sctp;
    public final Security security;
    public final Unsupported unsupported;
    public final Xml xml;
    public final ModuleSlice zipfs;

    public static final class Crypto {

        public final ModuleSlice cryptoki;
        public final ModuleSlice ec;
        public final ModuleSlice mscapi;

        Crypto(ModuleLookup registry) {
            cryptoki = registry.getModule("jdk.crypto.cryptoki");
            ec = registry.getModule("jdk.crypto.ec");
            mscapi = registry.getModule("jdk.crypto.mscapi");
        }
    }

    public static final class Hotspot {

        public final ModuleSlice agent;

        Hotspot(ModuleLookup registry) {
            agent = registry.getModule("jdk.hotspot.agent");
        }
    }

    public static final class Incubator {

        public final ModuleSlice foreign;
        public final ModuleSlice vector;

        Incubator(ModuleLookup registry) {
            foreign = registry.getModule("jdk.incubator.foreign");
            vector = registry.getModule("jdk.incubator.vector");
        }
    }

    public static final class Internal {

        public final ModuleSlice ed;
        public final ModuleSlice jvmstat;
        public final ModuleSlice le;
        public final ModuleSlice opt;
        public final InternalVm vm;

        Internal(ModuleLookup registry) {
            ed = registry.getModule("jdk.internal.ed");
            jvmstat = registry.getModule("jdk.internal.jvmstat");
            le = registry.getModule("jdk.internal.le");
            opt = registry.getModule("jdk.internal.opt");
            vm = new InternalVm(registry);
        }
    }

    public static final class InternalVm {

        public final ModuleSlice ci;
        public final InternalVmCompiler compiler;

        InternalVm(ModuleLookup registry) {
            ci = registry.getModule("jdk.internal.vm.ci");
            compiler = new InternalVmCompiler(registry);
        }
    }

    public static final class InternalVmCompiler extends DelegateModule {

        public final ModuleSlice management;

        InternalVmCompiler(ModuleLookup registry) {
            super(registry.getModule("jdk.internal.vm.compiler"));
            management = registry.getModule("jdk.internal.vm.compiler.management");
        }
    }

    public static final class Jdwp {

        public final ModuleSlice agent;

        Jdwp(ModuleLookup registry) {
            agent = registry.getModule("jdk.jdwp.agent");
        }
    }

    public static final class Management extends DelegateModule {

        public final ModuleSlice agent;
        public final ModuleSlice jfr;

        Management(ModuleLookup registry) {
            super(registry.getModule("jdk.management"));
            agent = registry.getModule("jdk.management.agent");
            jfr = registry.getModule("jdk.management.jfr");
        }
    }

    public static final class Naming {

        public final ModuleSlice dns;
        public final ModuleSlice rmi;

        Naming(ModuleLookup registry) {
            dns = registry.getModule("jdk.naming.dns");
            rmi = registry.getModule("jdk.naming.rmi");
        }
    }

    public static final class Nio {

        public final ModuleSlice mapmode;

        Nio(ModuleLookup registry) {
            mapmode = registry.getModule("jdk.nio.mapmode");
        }
    }

    public static final class Security {

        public final ModuleSlice auth;
        public final ModuleSlice jgss;

        Security(ModuleLookup registry) {
            auth = registry.getModule("jdk.security.auth");
            jgss = registry.getModule("jdk.security.jgss");
        }
    }

    public static final class Unsupported extends DelegateModule {

        public final ModuleSlice desktop;

        Unsupported(ModuleLookup registry) {
            super(registry.getModule("jdk.unsupported"));
            desktop = registry.getModule("jdk.unsupported.desktop");
        }
    }

    public static final class Xml {

        public final ModuleSlice dom;

        Xml(ModuleLookup registry) {
            dom = registry.getModule("jdk.xml.dom");
        }
    }


    public JdkModules(ModuleLookup registry) {
        accessibility = registry.getModule("jdk.accessibility");
        attach = registry.getModule("jdk.attach");
        charsets = registry.getModule("jdk.charsets");
        compiler = registry.getModule("jdk.compiler");
        crypto = new Crypto(registry);
        dynalink = registry.getModule("jdk.dynalink");
        editpad = registry.getModule("jdk.editpad");
        hotspot = new Hotspot(registry);
        httpserver = registry.getModule("jdk.httpserver");
        incubator = new Incubator(registry);
        internal = new Internal(registry);
        jartool = registry.getModule("jdk.jartool");
        javadoc = registry.getModule("jdk.javadoc");
        jcmd = registry.getModule("jdk.jcmd");
        jconsole = registry.getModule("jdk.jconsole");
        jdeps = registry.getModule("jdk.jdeps");
        jdi = registry.getModule("jdk.jdi");
        jdwp = new Jdwp(registry);
        jfr = registry.getModule("jdk.jfr");
        jlink = registry.getModule("jdk.jlink");
        jpackage = registry.getModule("jdk.jpackage");
        jshell = registry.getModule("jdk.jshell");
        jsobject = registry.getModule("jdk.jsobject");
        jstatd = registry.getModule("jdk.jstatd");
        localedata = registry.getModule("jdk.localedata");
        management = new Management(registry);
        naming = new Naming(registry);
        net = registry.getModule("jdk.net");
        nio = new Nio(registry);
        random = registry.getModule("jdk.random");
        sctp = registry.getModule("jdk.sctp");
        security = new Security(registry);
        unsupported = new Unsupported(registry);
        xml = new Xml(registry);
        zipfs = registry.getModule("jdk.zipfs");
    }
}
