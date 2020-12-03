package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ENERGIZED_STEEL;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginPowah extends PluginHelper {

	public static final String modid   = "powah";
	public static final String modname = "Powah";

	public static void registry() {
		if (Mods.POWAH.isModPresent() || MorePlates.DEBUG) {
			reg(ENERGIZED_STEEL);
		}
	}
}