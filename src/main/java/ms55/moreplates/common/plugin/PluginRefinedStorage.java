package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.QUARTZ_ENRICHED_IRON;

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginRefinedStorage extends PluginHelper {

	public static final String modid   = "refinedstorage";
	public static final String modname = "Refined Storage";

	public static void registry() {
		reg(QUARTZ_ENRICHED_IRON);
    }
}