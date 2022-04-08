package de.spricom.dessert.modules.java;

/*-
 * #%L
 * Dessert Dependency Assertion Library for Java
 * %%
 * Copyright (C) 2017 - 2022 Hans Jörg Heßmann
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
import de.spricom.dessert.modules.core.FixedModule;
import de.spricom.dessert.slicing.Classpath;
import de.spricom.dessert.slicing.Slices;

/**
 * Generated by de.spricom.dessert.tools.GenerateStaticModulesTool.
 */
class XmlCryptoModule extends FixedModule {

    XmlCryptoModule(Classpath cp) {
        super("java.xml.crypto", "17",
                Slices.of(
                        cp.slice("javax.xml.crypto.*"),
                        cp.slice("javax.xml.crypto.dom.*"),
                        cp.slice("javax.xml.crypto.dsig.*"),
                        cp.slice("javax.xml.crypto.dsig.dom.*"),
                        cp.slice("javax.xml.crypto.dsig.keyinfo.*"),
                        cp.slice("javax.xml.crypto.dsig.spec.*")
                ),
                Slices.of(
                        cp.slice("com.sun.org.apache.xml.internal.security.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.algorithms.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.algorithms.implementations.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.c14n.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.c14n.helper.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.c14n.implementations.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.exceptions.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.content.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.content.keyvalues.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.content.x509.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.keyresolver.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.storage.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.keys.storage.implementations.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.parser.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.resource.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.signature.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.signature.reference.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.transforms.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.transforms.implementations.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.transforms.params.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.utils.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.utils.resolver.*"),
                        cp.slice("com.sun.org.apache.xml.internal.security.utils.resolver.implementations.*"),
                        cp.slice("com.sun.org.slf4j.internal.*"),
                        cp.slice("javax.xml.crypto.*"),
                        cp.slice("javax.xml.crypto.dom.*"),
                        cp.slice("javax.xml.crypto.dsig.*"),
                        cp.slice("javax.xml.crypto.dsig.dom.*"),
                        cp.slice("javax.xml.crypto.dsig.keyinfo.*"),
                        cp.slice("javax.xml.crypto.dsig.spec.*"),
                        cp.slice("org.jcp.xml.dsig.internal.*"),
                        cp.slice("org.jcp.xml.dsig.internal.dom.*")
                ));
    }
}