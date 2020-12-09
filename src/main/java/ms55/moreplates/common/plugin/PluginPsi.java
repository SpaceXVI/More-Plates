package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.EBONY_PSIMETAL;
import static ms55.moreplates.common.enumeration.EnumMaterials.IVORY_PSIMETAL;
import static ms55.moreplates.common.enumeration.EnumMaterials.PSIMETAL;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginPsi.modid, modname = PluginPsi.modname)
public class PluginPsi extends PluginHelper {

	public static final String modid   = "psi";
	public static final String modname = "Psi";

	@Plugin.registry
	public static void registry() {
		reg(EBONY_PSIMETAL);
		reg(IVORY_PSIMETAL);
		reg(PSIMETAL);
    }
}