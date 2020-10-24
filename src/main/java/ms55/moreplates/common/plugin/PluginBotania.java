package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ELEMENTIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.GAIA_SPIRIT;
import static ms55.moreplates.common.enumeration.EnumMaterials.MANASTEEL;
import static ms55.moreplates.common.enumeration.EnumMaterials.TERRASTEEL;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginBotania extends PluginHelper {

	public static final String modid   = "botania";
	public static final String modname = "Botania";

	public static void registry() {
		reg(ELEMENTIUM);
		reg(GAIA_SPIRIT);
		reg(MANASTEEL);
		reg(TERRASTEEL);
    }
}