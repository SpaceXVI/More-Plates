package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.AQUAMARINE;
import static ms55.moreplates.common.enumeration.EnumMaterials.RESONATING_GEM;
import static ms55.moreplates.common.enumeration.EnumMaterials.STARMETAL;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginAstralSorcery.modid, modname = PluginAstralSorcery.modname)
public class PluginAstralSorcery extends PluginHelper {

	public static final String modid   = "astralsorcery";
	public static final String modname = "Astral Sorcery";

	@Plugin.registry
	public static void registry() {
		reg2(AQUAMARINE);
		reg2(RESONATING_GEM);
	    reg2(STARMETAL);
	}
}