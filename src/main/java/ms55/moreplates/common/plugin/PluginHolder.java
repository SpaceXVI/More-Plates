package ms55.moreplates.common.plugin;

import ms55.moreplates.common.item.ModItems;

public class PluginHolder {

	public static void registry() {
		ModItems.registry();

		PluginMinecraft.registry();
		PluginAllTheModium.registry();
		PluginAppliedEnergistics2.registry();
		PluginBotania.registry();
		PluginExtendedCrafting.registry();
		PluginRefinedStorage.registry();
	}
}
