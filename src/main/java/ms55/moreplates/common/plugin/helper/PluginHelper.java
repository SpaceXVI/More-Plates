package ms55.moreplates.common.plugin.helper;

import ms55.moreplates.common.RegistryHandler;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.util.Mods;

public class PluginHelper {
	protected static void reg(EnumMaterials info) {
        regGear(info);
        regPlate(info);
    }

    protected static void regGear(EnumMaterials info) {
    	if (info.isEnabled.get()) {
    		RegistryHandler.register(info.toString() + "_gear");
    	}

    	if (Mods.IMMERSIVE_ENGINEERING.isModPresent()) {
    		//ImmersiveEngineeringSupport.add(info, "stick", 4, 1);
    	}
    }

    protected static void regPlate(EnumMaterials info) {
    	if (info.isEnabled.get()) {
    		RegistryHandler.register(info.toString() + "_plate");
    	}

    	if (Mods.IMMERSIVE_ENGINEERING.isModPresent()) {
    		//ImmersiveEngineeringSupport.add(info, "plate", 1, 1);
    	}
    }

    protected static void regStick(EnumMaterials info) {
    	if (info.isEnabled.get()) {
    		RegistryHandler.register(info.toString() + "_stick");
    	}

    	if (Mods.IMMERSIVE_ENGINEERING.isModPresent()) {
    		//ImmersiveEngineeringSupport.add(info, "stick", 1, 2);
    	}
    }
}