package de.spricom.dessert.modules.jdk;

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
import de.spricom.dessert.modules.core.ModuleResolver;
import de.spricom.dessert.slicing.Classpath;

import java.util.Arrays;
import java.util.List;

public class JdkModulesResolver implements ModuleResolver {

    private final List<FixedModule> modules;

    public JdkModulesResolver(Classpath cp) {
        modules =
                Arrays.asList(
                        new AccessibilityModule(cp),
                        new AttachModule(cp),
                        new CharsetsModule(cp),
                        new CompilerModule(cp),
                        new CryptoCryptokiModule(cp),
                        new CryptoEcModule(cp),
                        new CryptoMscapiModule(cp),
                        new DynalinkModule(cp),
                        new EditpadModule(cp),
                        new HotspotAgentModule(cp),
                        new HttpserverModule(cp),
                        new IncubatorForeignModule(cp),
                        new IncubatorVectorModule(cp),
                        new InternalEdModule(cp),
                        new InternalJvmstatModule(cp),
                        new InternalLeModule(cp),
                        new InternalOptModule(cp),
                        new InternalVmCiModule(cp),
                        new InternalVmCompilerModule(cp),
                        new InternalVmCompilerManagementModule(cp),
                        new JartoolModule(cp),
                        new JavadocModule(cp),
                        new JcmdModule(cp),
                        new JconsoleModule(cp),
                        new JdepsModule(cp),
                        new JdiModule(cp),
                        new JdwpAgentModule(cp),
                        new JfrModule(cp),
                        new JlinkModule(cp),
                        new JpackageModule(cp),
                        new JshellModule(cp),
                        new JsobjectModule(cp),
                        new JstatdModule(cp),
                        new LocaledataModule(cp),
                        new ManagementModule(cp),
                        new ManagementAgentModule(cp),
                        new ManagementJfrModule(cp),
                        new NamingDnsModule(cp),
                        new NamingRmiModule(cp),
                        new NetModule(cp),
                        new NioMapmodeModule(cp),
                        new RandomModule(cp),
                        new SctpModule(cp),
                        new SecurityAuthModule(cp),
                        new SecurityJgssModule(cp),
                        new UnsupportedModule(cp),
                        new UnsupportedDesktopModule(cp),
                        new XmlDomModule(cp),
                        new ZipfsModule(cp)
                );
    }

    @Override
    public List<FixedModule> getModules() {
        return modules;
    }
}
