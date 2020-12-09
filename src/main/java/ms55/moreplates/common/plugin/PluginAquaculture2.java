package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.NEPTUNIUM;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginAquaculture2.modid, modname = PluginAquaculture2.modname)
public class PluginAquaculture2 extends PluginHelper {

	public static final String modid   = "aquaculture";
	public static final String modname = "Aquaculture 2";

	@Plugin.registry
	public static void registry() {
		reg(NEPTUNIUM);
    }
}