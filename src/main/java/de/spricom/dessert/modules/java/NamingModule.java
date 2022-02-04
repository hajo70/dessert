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

class NamingModule extends FixedModule {

    NamingModule(Classpath cp) {
        super("java.naming", "17",
                Slices.of(
                        cp.slice("javax.naming.*"),
                        cp.slice("javax.naming.directory.*"),
                        cp.slice("javax.naming.event.*"),
                        cp.slice("javax.naming.ldap.*"),
                        cp.slice("javax.naming.ldap.spi.*"),
                        cp.slice("javax.naming.spi.*")
                ),
                Slices.of(
                        cp.slice("com.sun.jndi.ldap.*"),
                        cp.slice("com.sun.jndi.ldap.ext.*"),
                        cp.slice("com.sun.jndi.ldap.pool.*"),
                        cp.slice("com.sun.jndi.ldap.sasl.*"),
                        cp.slice("com.sun.jndi.toolkit.ctx.*"),
                        cp.slice("com.sun.jndi.toolkit.dir.*"),
                        cp.slice("com.sun.jndi.toolkit.url.*"),
                        cp.slice("com.sun.jndi.url.ldap.*"),
                        cp.slice("com.sun.jndi.url.ldaps.*"),
                        cp.slice("com.sun.naming.internal.*"),
                        cp.slice("javax.naming.*"),
                        cp.slice("javax.naming.directory.*"),
                        cp.slice("javax.naming.event.*"),
                        cp.slice("javax.naming.ldap.*"),
                        cp.slice("javax.naming.ldap.spi.*"),
                        cp.slice("javax.naming.spi.*"),
                        cp.slice("sun.security.provider.certpath.ldap.*")
                ));
    }
}
