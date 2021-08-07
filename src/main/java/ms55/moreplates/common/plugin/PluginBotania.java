package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ELEMENTIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.GAIA_SPIRIT;
import static ms55.moreplates.common.enumeration.EnumMaterials.MANASTEEL;
import static ms55.moreplates.common.enumeration.EnumMaterials.TERRASTEEL;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginBotania.modid, modname = PluginBotania.modname)
public class PluginBotania extends PluginHelper {

	public static final String modid   = "botania";
	public static final String modname = "Botania";

	@Plugin.registry
	public static void registry() {
		reg2(ELEMENTIUM);
		reg2(GAIA_SPIRIT);
		reg2(MANASTEEL);
		reg2(TERRASTEEL);
    }
}