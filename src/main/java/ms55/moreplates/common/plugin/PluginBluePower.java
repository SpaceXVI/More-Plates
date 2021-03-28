package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.AMETHYST;
import static ms55.moreplates.common.enumeration.EnumMaterials.BLUE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.BRASS;
import static ms55.moreplates.common.enumeration.EnumMaterials.GREEN_SAPPHIRE;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURPLE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.RED_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.RUBY;
import static ms55.moreplates.common.enumeration.EnumMaterials.SAPPHIRE;
import static ms55.moreplates.common.enumeration.EnumMaterials.SILICON;
import static ms55.moreplates.common.enumeration.EnumMaterials.TUNGSTEN;
import static ms55.moreplates.common.enumeration.EnumMaterials.TUNGSTEN_CARBIDE;
import static ms55.moreplates.common.enumeration.EnumMaterials.ZINC;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginBluePower.modid, modname = PluginBluePower.modname)
public class PluginBluePower extends PluginHelper {

	public static final String modid   = "bluepower";
	public static final String modname = "Blue Power";

	@Plugin.registry
	public static void registry() {
		reg(BRASS);
		reg(BLUE_ALLOY);
		reg(PURPLE_ALLOY);
		reg(RED_ALLOY);
		reg(SILICON);
		reg(TUNGSTEN);
		reg(TUNGSTEN_CARBIDE);
		reg(ZINC);

		reg(AMETHYST);
		reg(GREEN_SAPPHIRE);
		reg(RUBY);
		reg(SAPPHIRE);
	}
}