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
import de.spricom.dessert.modules.core.ModuleResolver;
import de.spricom.dessert.slicing.Classpath;

import java.util.Arrays;
import java.util.List;

public class JavaModulesResolver implements ModuleResolver {

    private final List<FixedModule> modules;

    public JavaModulesResolver(Classpath cp) {
        modules =
                Arrays.asList(
                        new BaseModule(cp),
                        new CompilerModule(cp),
                        new DatatransferModule(cp),
                        new DesktopModule(cp),
                        new InstrumentModule(cp),
                        new LoggingModule(cp),
                        new ManagementModule(cp),
                        new ManagementRmiModule(cp),
                        new NamingModule(cp),
                        new NetHttpModule(cp),
                        new PrefsModule(cp),
                        new RmiModule(cp),
                        new ScriptingModule(cp),
                        new SeModule(cp),
                        new SecurityJgssModule(cp),
                        new SecuritySaslModule(cp),
                        new SmartcardioModule(cp),
                        new SqlModule(cp),
                        new SqlRowsetModule(cp),
                        new TransactionXaModule(cp),
                        new XmlModule(cp),
                        new XmlCryptoModule(cp)
                );
    }

    @Override
    public List<FixedModule> getModules() {
        return modules;
    }
}
