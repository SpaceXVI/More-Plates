package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ENERGIZED_STEEL;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginPowah extends PluginHelper {

	public static final String modid   = "powah";
	public static final String modname = "Powah";

	public static void registry() {
		reg(ENERGIZED_STEEL);
	}
}