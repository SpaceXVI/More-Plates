package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ELECTROTINE_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.RED_INGOT;
import static ms55.moreplates.common.enumeration.EnumMaterials.SILICON2;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginProjectRed.modid, modname = PluginProjectRed.modname)
public class PluginProjectRed extends PluginHelper {

	public static final String modid   = "projectred-core";
	public static final String modname = "Project Red";

	@Plugin.registry
	public static void registry() {
		reg2(ELECTROTINE_ALLOY);
		reg2(RED_INGOT);
		reg2(SILICON2);
	}
}