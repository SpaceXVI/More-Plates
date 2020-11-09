package ms55.moreplates.common.item;

import ms55.moreplates.common.RegistryHandler;

public class ModItems {	
	public static void registry() {
		RegistryHandler.ITEMS.register("hammer",
                () -> new HammerItem());
	}
}