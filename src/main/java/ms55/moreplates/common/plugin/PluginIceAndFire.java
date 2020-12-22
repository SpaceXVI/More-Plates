package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.DRAGONSTEEL_FIRE;
import static ms55.moreplates.common.enumeration.EnumMaterials.DRAGONSTEEL_ICE;
import static ms55.moreplates.common.enumeration.EnumMaterials.DRAGONSTEEL_LIGHTNING;
import static ms55.moreplates.common.enumeration.EnumMaterials.GHOST;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginIceAndFire.modid, modname = PluginIceAndFire.modname)
public class PluginIceAndFire extends PluginHelper {

	public static final String modid   = "iceandfire";
	public static final String modname = "Ice and Fire";

	@Plugin.registry
	public static void registry() {
		reg(DRAGONSTEEL_FIRE);
		reg(DRAGONSTEEL_ICE);
		reg(DRAGONSTEEL_LIGHTNING);
		reg(GHOST);
    }
}