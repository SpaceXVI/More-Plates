package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.EBONY_PSIMETAL;
import static ms55.moreplates.common.enumeration.EnumMaterials.IVORY_PSIMETAL;
import static ms55.moreplates.common.enumeration.EnumMaterials.PSIMETAL;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginPsi extends PluginHelper {

	public static final String modid   = "psi";
	public static final String modname = "Psi";

	public static void registry() {
		if (Mods.PSI.isModPresent() || MorePlates.DEBUG) {
			reg(EBONY_PSIMETAL);
			reg(IVORY_PSIMETAL);
			reg(PSIMETAL);
		}
    }
}