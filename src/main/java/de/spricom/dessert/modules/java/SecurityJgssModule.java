package de.spricom.dessert.modules.java;

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
import de.spricom.dessert.modules.core.FixedModule;
import de.spricom.dessert.slicing.Classpath;
import de.spricom.dessert.slicing.Slices;

/**
 * Generated by de.spricom.dessert.tools.GenerateStaticModulesTool.
 */
class SecurityJgssModule extends FixedModule {

    SecurityJgssModule(Classpath cp) {
        super("java.security.jgss", "17",
                Slices.of(
                        cp.slice("javax.security.auth.kerberos.*"),
                        cp.slice("org.ietf.jgss.*")
                ),
                Slices.of(
                        cp.slice("javax.security.auth.kerberos.*"),
                        cp.slice("org.ietf.jgss.*"),
                        cp.slice("sun.net.www.protocol.http.spnego.*"),
                        cp.slice("sun.security.jgss.*"),
                        cp.slice("sun.security.jgss.krb5.*"),
                        cp.slice("sun.security.jgss.krb5.internal.*"),
                        cp.slice("sun.security.jgss.spi.*"),
                        cp.slice("sun.security.jgss.spnego.*"),
                        cp.slice("sun.security.jgss.wrapper.*"),
                        cp.slice("sun.security.krb5.*"),
                        cp.slice("sun.security.krb5.internal.*"),
                        cp.slice("sun.security.krb5.internal.ccache.*"),
                        cp.slice("sun.security.krb5.internal.crypto.*"),
                        cp.slice("sun.security.krb5.internal.crypto.dk.*"),
                        cp.slice("sun.security.krb5.internal.ktab.*"),
                        cp.slice("sun.security.krb5.internal.rcache.*"),
                        cp.slice("sun.security.krb5.internal.tools.*"),
                        cp.slice("sun.security.krb5.internal.util.*")
                ));
    }
}
