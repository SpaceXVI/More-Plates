package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.IMPERIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.INFERIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.PROSPERITY;
import static ms55.moreplates.common.enumeration.EnumMaterials.PRUDENTIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.SOULIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.SUPREMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.TERTIUM;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginMysticalAgriculture extends PluginHelper {

	public static final String modid   = "mysticalagriculture";
	public static final String modname = "Mystical Agriculture";

	public static void registry() {
		reg(IMPERIUM);
		reg(INFERIUM);
		reg(PROSPERITY);
		reg(PRUDENTIUM);
		reg(SOULIUM);
		reg(SUPREMIUM);
		reg(TERTIUM);
    }
}