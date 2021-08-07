package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BLACK_IRON;
import static ms55.moreplates.common.enumeration.EnumMaterials.CRYSTALTINE;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENDER;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENHANCED_ENDER;
import static ms55.moreplates.common.enumeration.EnumMaterials.REDSTONE_INGOT;
import static ms55.moreplates.common.enumeration.EnumMaterials.THE_ULTIMATE;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginExtendedCrafting.modid, modname = PluginExtendedCrafting.modname)
public class PluginExtendedCrafting extends PluginHelper {

	public static final String modid   = "extendedcrafting";
	public static final String modname = "Extended Crafting";

	@Plugin.registry
	public static void registry() {
		reg2(BLACK_IRON);
		reg2(CRYSTALTINE);
		reg2(ENDER);
		reg2(ENHANCED_ENDER);
		reg2(REDSTONE_INGOT);
		reg2(THE_ULTIMATE);
    }
}