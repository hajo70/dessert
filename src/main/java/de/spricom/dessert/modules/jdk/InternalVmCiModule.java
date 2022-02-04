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
import de.spricom.dessert.slicing.Classpath;
import de.spricom.dessert.slicing.Slices;

class InternalVmCiModule extends FixedModule {

    InternalVmCiModule(Classpath cp) {
        super("jdk.internal.vm.ci", "17",
                Slices.of(
                        
                ),
                Slices.of(
                        cp.slice("jdk.vm.ci.aarch64.*"),
                        cp.slice("jdk.vm.ci.amd64.*"),
                        cp.slice("jdk.vm.ci.code.*"),
                        cp.slice("jdk.vm.ci.code.site.*"),
                        cp.slice("jdk.vm.ci.code.stack.*"),
                        cp.slice("jdk.vm.ci.common.*"),
                        cp.slice("jdk.vm.ci.hotspot.*"),
                        cp.slice("jdk.vm.ci.hotspot.aarch64.*"),
                        cp.slice("jdk.vm.ci.hotspot.amd64.*"),
                        cp.slice("jdk.vm.ci.meta.*"),
                        cp.slice("jdk.vm.ci.runtime.*"),
                        cp.slice("jdk.vm.ci.services.*")
                ));
    }
}
