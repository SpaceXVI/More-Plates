package ms55.moreplates.common.util;

import java.lang.reflect.Field;

import net.minecraftforge.fml.ModList;

public class Utils {

	public static String getFieldName(Object fieldObject, Object parent) {
	    Field[] allFields = parent.getClass().getFields();
	    for (Field field : allFields) {
	        Object currentFieldObject;
	        try {
	            currentFieldObject = field.get(parent);
	        } catch (Exception e) {
	    	    System.out.println("Couldn't get field name 1");
	            return null;
	        }
	        boolean isWantedField = fieldObject.equals(currentFieldObject);
	        if (isWantedField) {
	            String fieldName = field.getName();
	            return fieldName;
	        }
	    }
	    System.out.println("Couldn't get field name 2");
	    return null;
	}

	public static String makeNameUpperCase(String name) {
    	if (name.contains("_")) {
    		String firstbit  = (name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf("_"))).replaceFirst("_", " ");
    		String secondbit = name.substring(name.indexOf("_") + 1, name.indexOf("_") + 2).toUpperCase() + name.substring(name.indexOf("_") + 2).toLowerCase();

    		if (secondbit.contains("_")) {
    			secondbit = makeNameUpperCase(secondbit);
    		}

    		return firstbit + " " +secondbit;
    	} else {
        	return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    	}
    }

	public static boolean isModPresent(String modid) {
		return ModList.get().isLoaded(modid);
	}
}