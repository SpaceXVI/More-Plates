package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BLUE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURPLE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.RED_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.SILICON;
import static ms55.moreplates.common.enumeration.EnumMaterials.TUNGSTEN_CARBIDE;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

@Plugin(modid = PluginBluePower.modid, modname = PluginBluePower.modname)
public class PluginBluePower extends PluginHelper {

	public static final String modid   = "bluepower";
	public static final String modname = "Blue Power";

	@Plugin.registry
	public static void registry() {
		if (!Mods.PROJECT_RED.isModPresent()) {
			reg2(BLUE_ALLOY);
			reg2(PURPLE_ALLOY);
			reg2(RED_ALLOY);
			reg2(TUNGSTEN_CARBIDE);
			reg2(SILICON);
		}
	}
}