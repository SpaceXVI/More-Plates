package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BISMUTH;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginSilentMechanism.modid, modname = PluginSilentMechanism.modname)
public class PluginSilentMechanism extends PluginHelper {

	public static final String modid   = "silents_mechanisms";
	public static final String modname = "Silent's Mechanisms";

	@Plugin.registry
	public static void registry() {
		reg(BISMUTH);
    }
}