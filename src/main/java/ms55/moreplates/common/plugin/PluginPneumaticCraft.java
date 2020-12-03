package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.COMPRESSED_IRON;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginPneumaticCraft extends PluginHelper {

	public static final String modid   = "pneumaticcraftrepressurized";
	public static final String modname = "PneumaticCraft Repressurized";

	public static void registry() {
		if (Mods.PNEUMATIC_CRAFT_REPRESSURIZED.isModPresent() || MorePlates.DEBUG) {
			reg(COMPRESSED_IRON);
		}
	}
}