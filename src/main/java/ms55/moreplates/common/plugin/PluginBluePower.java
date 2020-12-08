package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.AMETHYST;
import static ms55.moreplates.common.enumeration.EnumMaterials.BLUE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.BRASS;
import static ms55.moreplates.common.enumeration.EnumMaterials.MALACHITE;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURPLE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.RED_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.RUBY;
import static ms55.moreplates.common.enumeration.EnumMaterials.SAPPHIRE;
import static ms55.moreplates.common.enumeration.EnumMaterials.TUNGSTEN;
import static ms55.moreplates.common.enumeration.EnumMaterials.TUNGSTEN_CARBIDE;
import static ms55.moreplates.common.enumeration.EnumMaterials.ZINC;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginBluePower extends PluginHelper {

	public static final String modid   = "bluepower";
	public static final String modname = "Blue Power";

	public static void registry() {
		if (Mods.BLUE_POWER.isModPresent() || MorePlates.DEBUG) {
			reg(BRASS);
			reg(BLUE_ALLOY);
			reg(PURPLE_ALLOY);
			reg(RED_ALLOY);
			reg(TUNGSTEN);
			reg(TUNGSTEN_CARBIDE);
			reg(ZINC);

			reg(AMETHYST);
			reg(MALACHITE);
			reg(RUBY);
			reg(SAPPHIRE);
		}
	}
}