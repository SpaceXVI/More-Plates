package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.COMPRESSED_IRON;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginPneumaticCraft.modid, modname = PluginPneumaticCraft.modname)
public class PluginPneumaticCraft extends PluginHelper {

	public static final String modid   = "pneumaticcraft";
	public static final String modname = "PneumaticCraft";

	@Plugin.registry
	public static void registry() {
		reg(COMPRESSED_IRON);
	}
}