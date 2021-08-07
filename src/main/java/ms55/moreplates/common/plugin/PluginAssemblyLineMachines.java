package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ATTUNED_TITANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENERGIZED_GOLD;
import static ms55.moreplates.common.enumeration.EnumMaterials.MYSTIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_GOLD;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_IRON;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_STEEL;
import static ms55.moreplates.common.enumeration.EnumMaterials.PURE_TITANIUM;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginAssemblyLineMachines.modid, modname = PluginAssemblyLineMachines.modname)
public class PluginAssemblyLineMachines extends PluginHelper {

	public static final String modid   = "assemblylinemachines";
	public static final String modname = "Assembly Line Machines";

	@Plugin.registry
	public static void registry() {	
		reg2(ATTUNED_TITANIUM);
		reg2(ENERGIZED_GOLD);
		reg2(MYSTIUM);
		reg2(PURE_GOLD);
		reg2(PURE_IRON);
		reg2(PURE_STEEL);
		reg2(PURE_TITANIUM);
    }
}