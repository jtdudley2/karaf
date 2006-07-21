/*
 *   Copyright 2005 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.felix.mosgi.console.component;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.apache.felix.mosgi.console.ifc.CommonPlugin;

public class Activator implements BundleActivator
{
    private BundleContext m_context = null;

    public void start(BundleContext context) throws Exception
    {
        m_context = context;
        m_context.registerService( CommonPlugin.class.getName(), new RemoteLogger(), null);
//        m_context.registerService( Plugin.class.getName(), new NodeDetails(), null);
//        m_context.registerService( Plugin.class.getName(), new BundleListPanel(), null);

//        m_context.registerService( CommonPlugin.class.getName(), new OBRPlugin(context), null);

        //        m_context.registerService( Plugin.class.getName(), new MemoryLauncher(context), null);
//        m_context.registerService( Plugin.class.getName(), new LinuxDetails(), null);
    }

    public void stop(BundleContext context)
    {
    }
}
