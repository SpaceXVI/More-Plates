package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.AQUAMARINE;
import static ms55.moreplates.common.enumeration.EnumMaterials.RESONATING_GEM;
import static ms55.moreplates.common.enumeration.EnumMaterials.STARMETAL;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginAstralSorcery extends PluginHelper {

	public static final String modid   = "astralsorcery";
	public static final String modname = "Astral Sorcery";

	public static void registry() {
		if (Mods.APPLIED_ENERGISTICS2.isModPresent() || MorePlates.DEBUG) {
			reg(AQUAMARINE);
			reg(RESONATING_GEM);
			reg(STARMETAL);
		}
	}
}