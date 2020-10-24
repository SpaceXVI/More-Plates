package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ALLTHEMODIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.UNOBTAINIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.UNOBTAINIUM_ALLTHEMODIUM_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.VIBRANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.VIBRANIUM_ALLTHEMODIUM_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.VIBRANIUM_UNOBTAINIUM_ALLOY;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginAllTheModium extends PluginHelper {

	public static final String modid   = "allthemodium";
	public static final String modname = "All The Modium";

	public static void registry() {
		reg(ALLTHEMODIUM);
		reg(UNOBTAINIUM_ALLTHEMODIUM_ALLOY);
		reg(UNOBTAINIUM);
		reg(VIBRANIUM_ALLTHEMODIUM_ALLOY);
		reg(VIBRANIUM);
		reg(VIBRANIUM_UNOBTAINIUM_ALLOY);
    }
}