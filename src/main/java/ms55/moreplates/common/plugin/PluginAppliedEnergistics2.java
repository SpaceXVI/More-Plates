package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.CERTUS_QUARTZ;
import static ms55.moreplates.common.enumeration.EnumMaterials.FLUIX;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginAppliedEnergistics2 extends PluginHelper {

	public static final String modid   = "appliedenergistics2";
	public static final String modname = "Applied Energistics 2";

	public static void registry() {
		reg(CERTUS_QUARTZ);
		reg(FLUIX);
    }
}