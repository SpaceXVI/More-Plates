package ms55.moreplates.common.util;

import java.lang.reflect.Field;
import java.util.Set;

import org.reflections.Reflections;

import ms55.moreplates.common.plugin.helper.PluginHelper;
import net.minecraftforge.fml.ModList;

//A class that is just copy-pasta
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
	
	public static boolean isModPresent(String modid) {
		return ModList.get().isLoaded(modid);
	}
	
	public static Set<Class<? extends PluginHelper>> getAllPlugins() {
		Reflections reflections = new Reflections("ms55.moreplates.common.plugin");

		return reflections.getSubTypesOf(PluginHelper.class);
	}

	/*@SuppressWarnings("unchecked")
	public static List<Class<PluginHelper>> getAllPlugins() throws UnsupportedEncodingException, ClassNotFoundException {
		String packageName = "ms55.moreplates.common.plugin";

		List<Class<PluginHelper>> plugins = new ArrayList<Class<PluginHelper>>();
		URL root = Thread.currentThread().getContextClassLoader().getResource(packageName.replace(".", "/"));

		File[] files = new File(URLDecoder.decode(root.getFile(), "UTF-8")).listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.endsWith(".class");
		    }
		});

		// Find classes extending PluginHelper.
		for (File file : files) {
		    String className = file.getName().replaceAll(".class$", "");
		    Class<?> cls = Class.forName(packageName + "." + className);
		    if (PluginHelper.class.isAssignableFrom(cls)) {
		    	plugins.add((Class<PluginHelper>) cls);
		    }
		}

		return plugins;
	}*/
}