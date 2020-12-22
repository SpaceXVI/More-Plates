package ms55.moreplates.common.util;

import java.lang.reflect.Field;

import net.minecraftforge.fml.ModList;

public class Utils {

	//copy-pasta
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

	public static boolean isModPresent(String modid) {
		return ModList.get().isLoaded(modid);
	}
}