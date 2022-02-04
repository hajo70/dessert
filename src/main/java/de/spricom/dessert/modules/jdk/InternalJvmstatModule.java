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

class InternalJvmstatModule extends FixedModule {

    InternalJvmstatModule(Classpath cp) {
        super("jdk.internal.jvmstat", "17",
                Slices.of(
                        
                ),
                Slices.of(
                        cp.slice("sun.jvmstat.*"),
                        cp.slice("sun.jvmstat.monitor.*"),
                        cp.slice("sun.jvmstat.monitor.event.*"),
                        cp.slice("sun.jvmstat.perfdata.monitor.*"),
                        cp.slice("sun.jvmstat.perfdata.monitor.protocol.file.*"),
                        cp.slice("sun.jvmstat.perfdata.monitor.protocol.local.*"),
                        cp.slice("sun.jvmstat.perfdata.monitor.v1_0.*"),
                        cp.slice("sun.jvmstat.perfdata.monitor.v2_0.*"),
                        cp.slice("sun.jvmstat.perfdata.resources.*")
                ));
    }
}
