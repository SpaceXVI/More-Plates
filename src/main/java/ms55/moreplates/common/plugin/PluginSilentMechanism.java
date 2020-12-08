package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BISMUTH;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginSilentMechanism extends PluginHelper {

	public static final String modid   = "silents_mechanisms";
	public static final String modname = "Silent's Mechanisms";

	public static void registry() {
		if (Mods.SILENTS_MECHANISMS.isModPresent() || MorePlates.DEBUG) {
			reg(BISMUTH);
		}
    }
}