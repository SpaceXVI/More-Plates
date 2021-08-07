package ms55.moreplates.common.plugin.helper;

import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.item.ModItems;

public class PluginHelper {

	public static void reg(EnumMaterials info) {
        regGear(info);
        regPlate(info);
    }

	protected static void reg2(EnumMaterials info) {
        regGear(info);
        regPlate(info);
        regStick(info);
    }

    protected static void regGear(EnumMaterials info) {
    	if (info.isEnabled.get()) {
    		ModItems.register(info.toString() + "_gear");
    	}
    }

    protected static void regPlate(EnumMaterials info) {
    	if (info.isEnabled.get()) {
    		ModItems.register(info.toString() + "_plate");
    	}
    }

    protected static void regStick(EnumMaterials info) {
    	if (info.isEnabled.get()) {
    		ModItems.register(info.toString() + "_stick");
    	}
    }
}