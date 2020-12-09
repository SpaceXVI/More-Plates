package ms55.moreplates.common.plugin.core;

import java.lang.reflect.Method;

import org.apache.logging.log4j.Level;
import org.objectweb.asm.Type;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.util.Utils;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.forgespi.language.ModFileScanData.AnnotationData;

public class PluginLoader {

	/*public static void initializePlugins() throws Exception {
		Set<Class<? extends PluginHelper>> plugins = Utils.getAllPlugins();

		if (!plugins.isEmpty()) {
			for (Class<? extends PluginHelper> cls : plugins) {
				try {
					cls.getDeclaredMethod("registry").invoke(null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
					throw e;
				}
			}
		}
	}*/

	private static final Type ANNOTATION = Type.getType(Plugin.class);

	public static void initializePlugins() throws Exception {
		ModList modList = ModList.get();
		for (ModFileScanData scanData : modList.getAllScanData()) {
		    for (AnnotationData data : scanData.getAnnotations()) {
		        if (ANNOTATION.equals(data.getAnnotationType())) {
		        	String modid = (String) data.getAnnotationData().get("modid");
	                String modname = (String) data.getAnnotationData().get("modname");
	                String clsName = data.getClassType().getClassName();
	                Class<?> cls = Class.forName(clsName);
	                Plugin details = (Plugin) cls.getAnnotation(Plugin.class);
	                boolean loaded, config;

	                if (details.checkModid()) {
	                    loaded = Utils.isModPresent(modid);
	                } else {
	                    loaded = true;
	                }

	                if (details.checkConfig()) {
	                    config = getB(modid);
	                } else { 
	                    config = true;
	                }

	                if (loaded && config) {
	                	/*try {
	    					cls.getDeclaredMethod("registry").invoke(null);
    	                    MorePlates.LOGGER.debug("Plugin " + modname + " loaded, adding");
	    				} catch (Exception e) {
							MorePlates.LOGGER.error("Unable to initialise plugin " + modname + " due to the method \"registry\" not being found! The following error was thrown:");
	                        MorePlates.LOGGER.catching(Level.ERROR, e);
	    				}*/
	                	for (Method method : cls.getMethods()) {
	                        if (method.isAnnotationPresent(Plugin.registry.class)) {
	                        	System.out.println(cls);
	                        	System.out.println(cls.getName());
	                            try {
	                                method.invoke(cls.newInstance());
	        	                    MorePlates.LOGGER.debug("Plugin " + modname + " loaded, adding");
	                            } catch (Exception e) {
	    							MorePlates.LOGGER.error("Unable to initialise plugin " + modname + " due to the method \"registry\" not being found! The following error was thrown:");
	    	                        MorePlates.LOGGER.catching(Level.ERROR, e);
	                            }
	                        }
	                    }
	                } else {
	                    MorePlates.LOGGER.debug("Plugin " + modname + " not loaded, skipping");
	                }
		        }
		    }
		}
	}

	private static boolean getB(String modid) {
		return true;
        //return Config.COMMON_SPEC.get("enable_" + modid);
    }
}