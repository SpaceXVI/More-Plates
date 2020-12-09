package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.OSMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.REFINED_GLOWSTONE;
import static ms55.moreplates.common.enumeration.EnumMaterials.REFINED_OBSIDIAN;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginMekanism.modid, modname = PluginMekanism.modname)
public class PluginMekanism extends PluginHelper {

	public static final String modid   = "mekanism";
	public static final String modname = "Mekanism";

	@Plugin.registry
	public static void registry() {
		reg(OSMIUM);
		reg(REFINED_GLOWSTONE);
		reg(REFINED_OBSIDIAN);
    }
}