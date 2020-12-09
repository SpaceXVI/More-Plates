package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.CERTUS_QUARTZ;
import static ms55.moreplates.common.enumeration.EnumMaterials.FLUIX;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginAppliedEnergistics2.modid, modname = PluginAppliedEnergistics2.modname)
public class PluginAppliedEnergistics2 extends PluginHelper {

	public static final String modid   = "appliedenergistics2";
	public static final String modname = "Applied Energistics 2";

	@Plugin.registry
	public static void registry() {
		reg(CERTUS_QUARTZ);
		reg(FLUIX);
    }
}