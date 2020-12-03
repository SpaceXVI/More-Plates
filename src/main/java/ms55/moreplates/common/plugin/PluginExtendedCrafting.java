package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BLACK_IRON;
import static ms55.moreplates.common.enumeration.EnumMaterials.CRYSTALTINE;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENDER;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENHANCED_ENDER;
import static ms55.moreplates.common.enumeration.EnumMaterials.REDSTONE_INGOT;
import static ms55.moreplates.common.enumeration.EnumMaterials.THE_ULTIMATE;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginExtendedCrafting extends PluginHelper {

	public static final String modid   = "extendedcrafting";
	public static final String modname = "Extended Crafting";

	public static void registry() {
		if (Mods.EXTENDED_CRAFTING.isModPresent() || MorePlates.DEBUG) {
			reg(BLACK_IRON);
			reg(CRYSTALTINE);
			reg(ENDER);
			reg(ENHANCED_ENDER);
			reg(REDSTONE_INGOT);
			reg(THE_ULTIMATE);
		}
    }
}