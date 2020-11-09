package ms55.moreplates.common.plugin;

import ms55.moreplates.common.item.ModItems;
import static ms55.moreplates.common.util.Mods.*;

public class PluginHolder {

	public static void registry() {
		ModItems.registry();

		PluginMinecraft.registry();
		
		if (ALL_THE_MODIUM.isModPresent()) {
			PluginAllTheModium.registry();
		}
		
		if (APPLIED_ENERGISTICS2.isModPresent()) {
			PluginAppliedEnergistics2.registry();
		}
		
		if (BOTANIA.isModPresent()) {
			PluginBotania.registry();
		}
		
		if (EXTENDED_CRAFTING.isModPresent()) {
			PluginExtendedCrafting.registry();
		}
		
		if (MEKANISM.isModPresent()) {
			PluginMekanism.registry();
		}
		
		if (MYSTICAL_AGRADDITIONS.isModPresent()) {
			PluginMysticalAgradditions.registry();
		}
		
		if (MYSTICAL_AGRICULTURE.isModPresent()) {
			PluginMysticalAgriculture.registry();
		}
		
		if (REFINED_STORAGE.isModPresent()) {
			PluginRefinedStorage.registry();
		}
	}
}
