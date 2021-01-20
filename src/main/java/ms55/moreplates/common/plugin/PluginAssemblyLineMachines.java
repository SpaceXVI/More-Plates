package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ATTUNED_TITANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.CHROMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENERGIZED_GOLD;
import static ms55.moreplates.common.enumeration.EnumMaterials.MYSTIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_GOLD;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_IRON;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_TITANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.TITANIUM;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginAssemblyLineMachines.modid, modname = PluginAssemblyLineMachines.modname)
public class PluginAssemblyLineMachines extends PluginHelper {

	public static final String modid   = "assemblylinemachines";
	public static final String modname = "Assembly Line Machines";

	@Plugin.registry
	public static void registry() {	
		reg(ATTUNED_TITANIUM);
		reg(CHROMIUM);
		reg(ENERGIZED_GOLD);
		reg(MYSTIUM);
		reg(PURE_GOLD);
		reg(PURE_IRON);
		reg(PURE_TITANIUM);
		reg(TITANIUM);
    }
}