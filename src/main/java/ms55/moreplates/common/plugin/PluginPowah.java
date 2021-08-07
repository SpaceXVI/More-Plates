package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ENERGIZED_STEEL;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginPowah.modid, modname = PluginPowah.modname)
public class PluginPowah extends PluginHelper {

	public static final String modid   = "powah";
	public static final String modname = "Powah";

	@Plugin.registry
	public static void registry() {
		reg2(ENERGIZED_STEEL);
	}
}