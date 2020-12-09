package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.INSANIUM;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginMysticalAgradditions.modid, modname = PluginMysticalAgradditions.modname)
public class PluginMysticalAgradditions extends PluginHelper {

	public static final String modid   = "mysticalagradditions";
	public static final String modname = "Mystical Agradditions";

	@Plugin.registry
	public static void registry() {
		reg(INSANIUM);
    }
}