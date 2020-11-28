package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.util.Mods.ALL_THE_MODIUM;
import static ms55.moreplates.common.util.Mods.APPLIED_ENERGISTICS2;
import static ms55.moreplates.common.util.Mods.ASTRAL_SORCERY;
import static ms55.moreplates.common.util.Mods.BLUE_POWER;
import static ms55.moreplates.common.util.Mods.BOTANIA;
import static ms55.moreplates.common.util.Mods.COFH;
import static ms55.moreplates.common.util.Mods.EXTENDED_CRAFTING;
import static ms55.moreplates.common.util.Mods.MEKANISM;
import static ms55.moreplates.common.util.Mods.MYSTICAL_AGRADDITIONS;
import static ms55.moreplates.common.util.Mods.MYSTICAL_AGRICULTURE;
import static ms55.moreplates.common.util.Mods.POWAH;
import static ms55.moreplates.common.util.Mods.REFINED_STORAGE;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.item.ModItems;

public class PluginHolder {

	public static void registry() {
		ModItems.registry();

		PluginMinecraft.registry();

		if (MorePlates.DEBUG) {
			PluginAllTheModium.registry();
			PluginAppliedEnergistics2.registry();
			PluginAstralSorcery.registry();
			PluginBluePower.registry();
			PluginBotania.registry();
			PluginThermal.registry();
			PluginExtendedCrafting.registry();
			PluginMekanism.registry();
			PluginMysticalAgradditions.registry();
			PluginMysticalAgriculture.registry();
			PluginPowah.registry();
			PluginRefinedStorage.registry();
		} else {
			if (ALL_THE_MODIUM.isModPresent()) {
				PluginAllTheModium.registry();
			}

			if (APPLIED_ENERGISTICS2.isModPresent()) {
				PluginAppliedEnergistics2.registry();
			}

			if (ASTRAL_SORCERY.isModPresent()) {
				PluginAstralSorcery.registry();
			}

			if (BLUE_POWER.isModPresent()) {
				PluginBluePower.registry();
			}

			if (BOTANIA.isModPresent()) {
				PluginBotania.registry();
			}

			if (COFH.isModPresent()) {
				PluginThermal.registry();
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

			if (POWAH.isModPresent()) {
				PluginPowah.registry();
			}

			if (REFINED_STORAGE.isModPresent()) {
				PluginRefinedStorage.registry();
			}
		}
	}
}