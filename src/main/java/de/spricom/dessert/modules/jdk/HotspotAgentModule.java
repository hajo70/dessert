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

class HotspotAgentModule extends FixedModule {

    HotspotAgentModule(Classpath cp) {
        super("jdk.hotspot.agent", "17",
                Slices.of(
                        
                ),
                Slices.of(
                        cp.slice("com.sun.java.swing.action.*"),
                        cp.slice("com.sun.java.swing.ui.*"),
                        cp.slice("images.toolbarButtonGraphics.general.*"),
                        cp.slice("sun.jvm.hotspot.*"),
                        cp.slice("sun.jvm.hotspot.asm.*"),
                        cp.slice("sun.jvm.hotspot.c1.*"),
                        cp.slice("sun.jvm.hotspot.ci.*"),
                        cp.slice("sun.jvm.hotspot.classfile.*"),
                        cp.slice("sun.jvm.hotspot.code.*"),
                        cp.slice("sun.jvm.hotspot.compiler.*"),
                        cp.slice("sun.jvm.hotspot.debugger.*"),
                        cp.slice("sun.jvm.hotspot.debugger.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.bsd.*"),
                        cp.slice("sun.jvm.hotspot.debugger.bsd.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.bsd.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.bsd.x86.*"),
                        cp.slice("sun.jvm.hotspot.debugger.cdbg.*"),
                        cp.slice("sun.jvm.hotspot.debugger.cdbg.basic.*"),
                        cp.slice("sun.jvm.hotspot.debugger.dummy.*"),
                        cp.slice("sun.jvm.hotspot.debugger.linux.*"),
                        cp.slice("sun.jvm.hotspot.debugger.linux.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.linux.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.linux.ppc64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.linux.x86.*"),
                        cp.slice("sun.jvm.hotspot.debugger.posix.*"),
                        cp.slice("sun.jvm.hotspot.debugger.posix.elf.*"),
                        cp.slice("sun.jvm.hotspot.debugger.ppc64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.proc.*"),
                        cp.slice("sun.jvm.hotspot.debugger.proc.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.proc.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.proc.ppc64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.proc.x86.*"),
                        cp.slice("sun.jvm.hotspot.debugger.remote.*"),
                        cp.slice("sun.jvm.hotspot.debugger.remote.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.remote.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.remote.ppc64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.remote.x86.*"),
                        cp.slice("sun.jvm.hotspot.debugger.win32.coff.*"),
                        cp.slice("sun.jvm.hotspot.debugger.windbg.*"),
                        cp.slice("sun.jvm.hotspot.debugger.windbg.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.windbg.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.windbg.x86.*"),
                        cp.slice("sun.jvm.hotspot.debugger.windows.amd64.*"),
                        cp.slice("sun.jvm.hotspot.debugger.windows.x86.*"),
                        cp.slice("sun.jvm.hotspot.debugger.x86.*"),
                        cp.slice("sun.jvm.hotspot.gc.epsilon.*"),
                        cp.slice("sun.jvm.hotspot.gc.g1.*"),
                        cp.slice("sun.jvm.hotspot.gc.parallel.*"),
                        cp.slice("sun.jvm.hotspot.gc.serial.*"),
                        cp.slice("sun.jvm.hotspot.gc.shared.*"),
                        cp.slice("sun.jvm.hotspot.gc.shenandoah.*"),
                        cp.slice("sun.jvm.hotspot.gc.z.*"),
                        cp.slice("sun.jvm.hotspot.interpreter.*"),
                        cp.slice("sun.jvm.hotspot.memory.*"),
                        cp.slice("sun.jvm.hotspot.oops.*"),
                        cp.slice("sun.jvm.hotspot.opto.*"),
                        cp.slice("sun.jvm.hotspot.prims.*"),
                        cp.slice("sun.jvm.hotspot.runtime.*"),
                        cp.slice("sun.jvm.hotspot.runtime.aarch64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.amd64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.bsd.*"),
                        cp.slice("sun.jvm.hotspot.runtime.bsd_aarch64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.bsd_amd64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.bsd_x86.*"),
                        cp.slice("sun.jvm.hotspot.runtime.linux.*"),
                        cp.slice("sun.jvm.hotspot.runtime.linux_aarch64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.linux_amd64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.linux_ppc64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.linux_x86.*"),
                        cp.slice("sun.jvm.hotspot.runtime.posix.*"),
                        cp.slice("sun.jvm.hotspot.runtime.ppc64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.win32_aarch64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.win32_amd64.*"),
                        cp.slice("sun.jvm.hotspot.runtime.win32_x86.*"),
                        cp.slice("sun.jvm.hotspot.runtime.x86.*"),
                        cp.slice("sun.jvm.hotspot.tools.*"),
                        cp.slice("sun.jvm.hotspot.tools.jcore.*"),
                        cp.slice("sun.jvm.hotspot.types.*"),
                        cp.slice("sun.jvm.hotspot.types.basic.*"),
                        cp.slice("sun.jvm.hotspot.ui.*"),
                        cp.slice("sun.jvm.hotspot.ui.action.*"),
                        cp.slice("sun.jvm.hotspot.ui.classbrowser.*"),
                        cp.slice("sun.jvm.hotspot.ui.resources.*"),
                        cp.slice("sun.jvm.hotspot.ui.table.*"),
                        cp.slice("sun.jvm.hotspot.ui.tree.*"),
                        cp.slice("sun.jvm.hotspot.ui.treetable.*"),
                        cp.slice("sun.jvm.hotspot.utilities.*"),
                        cp.slice("sun.jvm.hotspot.utilities.memo.*"),
                        cp.slice("toolbarButtonGraphics.development.*"),
                        cp.slice("toolbarButtonGraphics.general.*"),
                        cp.slice("toolbarButtonGraphics.navigation.*"),
                        cp.slice("toolbarButtonGraphics.text.*")
                ));
    }
}
