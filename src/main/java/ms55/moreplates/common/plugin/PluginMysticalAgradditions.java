package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.INSANIUM;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginMysticalAgradditions extends PluginHelper {

	public static final String modid   = "mysticalagradditions";
	public static final String modname = "Mystical Agradditions";

	public static void registry() {
		reg(INSANIUM);
    }
}