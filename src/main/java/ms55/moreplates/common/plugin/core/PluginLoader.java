package ms55.moreplates.common.plugin.core;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Utils;

//TODO remove PluginHolder
public class PluginLoader {

	public static void initializePlugins() throws NoSuchMethodException, SecurityException {
		List<Class<PluginHelper>> plugins = null;

		try {
			plugins = Utils.getAllPlugins();
		} catch (UnsupportedEncodingException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (!plugins.isEmpty()) {
			Iterator<Class<PluginHelper>> itr = plugins.iterator();
			while (itr.hasNext()) {
				Class<PluginHelper> cls = itr.next();
				try {
					cls.getDeclaredMethod("registry").invoke(null);
				//Why is reflection so hard for me
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
					e.printStackTrace();
				}
			}
		}
	}
}