package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ALLTHEMODIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.UNOBTAINIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.UNOBTAINIUM_ALLTHEMODIUM_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.VIBRANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.VIBRANIUM_ALLTHEMODIUM_ALLOY;
import static ms55.moreplates.common.enumeration.EnumMaterials.VIBRANIUM_UNOBTAINIUM_ALLOY;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginAllTheModium.modid, modname = PluginAllTheModium.modname)
public class PluginAllTheModium extends PluginHelper {

	public static final String modid   = "allthemodium";
	public static final String modname = "All The Modium";

	@Plugin.registry
	public static void registry() {
		reg2(ALLTHEMODIUM);
		reg2(UNOBTAINIUM_ALLTHEMODIUM_ALLOY);
		reg2(UNOBTAINIUM);
		reg2(VIBRANIUM_ALLTHEMODIUM_ALLOY);
		reg2(VIBRANIUM);
		reg2(VIBRANIUM_UNOBTAINIUM_ALLOY);
    }
}