package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.INSANIUM;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginMysticalAgradditions extends PluginHelper {

	public static final String modid   = "mysticalagradditions";
	public static final String modname = "Mystical Agradditions";

	public static void registry() {
		if (Mods.MYSTICAL_AGRADDITIONS.isModPresent() || MorePlates.DEBUG) {
			reg(INSANIUM);
		}
    }
}