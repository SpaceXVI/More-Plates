package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.NEPTUNIUM;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginAquaculture2 extends PluginHelper {

	public static final String modid   = "aquaculture";
	public static final String modname = "Aquaculture 2";

	public static void registry() {
		if (Mods.AQUACULTURE.isModPresent() || MorePlates.DEBUG) {
			reg(NEPTUNIUM);
		}
    }
}