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

class IncubatorForeignModule extends FixedModule {

    IncubatorForeignModule(Classpath cp) {
        super("jdk.incubator.foreign", "17",
                Slices.of(
                        cp.slice("jdk.incubator.foreign.*")
                ),
                Slices.of(
                        cp.slice("jdk.incubator.foreign.*"),
                        cp.slice("jdk.internal.foreign.*"),
                        cp.slice("jdk.internal.foreign.abi.*"),
                        cp.slice("jdk.internal.foreign.abi.aarch64.*"),
                        cp.slice("jdk.internal.foreign.abi.aarch64.linux.*"),
                        cp.slice("jdk.internal.foreign.abi.aarch64.macos.*"),
                        cp.slice("jdk.internal.foreign.abi.x64.*"),
                        cp.slice("jdk.internal.foreign.abi.x64.sysv.*"),
                        cp.slice("jdk.internal.foreign.abi.x64.windows.*")
                ));
    }
}
