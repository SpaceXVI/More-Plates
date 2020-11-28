package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.plugin.PluginAllTheModium;
import ms55.moreplates.common.plugin.PluginAppliedEnergistics2;
import ms55.moreplates.common.plugin.PluginAstralSorcery;
import ms55.moreplates.common.plugin.PluginBluePower;
import ms55.moreplates.common.plugin.PluginBotania;
import ms55.moreplates.common.plugin.PluginExtendedCrafting;
import ms55.moreplates.common.plugin.PluginMekanism;
import ms55.moreplates.common.plugin.PluginMinecraft;
import ms55.moreplates.common.plugin.PluginMysticalAgradditions;
import ms55.moreplates.common.plugin.PluginMysticalAgriculture;
import ms55.moreplates.common.plugin.PluginPowah;
import ms55.moreplates.common.plugin.PluginRefinedStorage;
import ms55.moreplates.common.plugin.PluginThermal;
import ms55.moreplates.common.util.Groups;
import ms55.moreplates.common.util.Mods;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

	public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, MorePlates.MODID, existingFileHelper);
	}

	@Override
	public void registerModels() {
		for (EnumMaterials material : EnumMaterials.values()) {
			for (int i = 0; i < EnumMaterials.values().length; i++) {
				if (i < Groups.minecraft.length) {
					if (Groups.minecraft[i] == material) {
						registry(material, PluginMinecraft.modid);
						break;
					}
				}
				if (i < Groups.allthemodium.length) {
					if (Groups.allthemodium[i] == material) {
						registry(material, PluginAllTheModium.modid);
						break;
					}
				}
				if (i < Groups.appliedenergistics2.length) {
					if (Groups.appliedenergistics2[i] == material) {
						registry(material, PluginAppliedEnergistics2.modid);
						break;
					}
				}
				if (i < Groups.astralsorcery.length) {
					if (Groups.astralsorcery[i] == material) {
						registry(material, PluginAstralSorcery.modid);
						break;
					}
				}
				if (i < Groups.blue_power.length) {
					if (Groups.blue_power[i] == material) {
						registry(material, PluginBluePower.modid);
						break;
					}
				}
				if (i < Groups.botania.length) {
					if (Groups.botania[i] == material) {
						registry(material, PluginBotania.modid);
						break;
					}
				}
				if (i < Groups.cofh.length) {
					if (Groups.cofh[i] == material) {
						registry(material, PluginThermal.modid);
						break;
					}
				}
				if (i < Groups.extendedcrafting.length) {
					if (Groups.extendedcrafting[i] == material) {
						registry(material, PluginExtendedCrafting.modid);
						break;
					}
				}
				if (i < Groups.mekanism.length) {
					if (Groups.mekanism[i] == material) {
						registry(material, PluginMekanism.modid);
						break;
					}
				}
				if (EnumMaterials.INSANIUM == material) {
					registry(material, PluginMysticalAgradditions.modid);
					break;
				}
				if (i < Groups.mysticalagriculture.length) {
					if (Groups.mysticalagriculture[i] == material) {
						registry(material, PluginMysticalAgriculture.modid);
						break;
					}
				}
				if (EnumMaterials.ENERGIZED_STEEL == material) {
					registry(material, PluginPowah.modid);
					break;
				}
				if (EnumMaterials.QUARTZ_ENRICHED_IRON == material) {
					registry(material, PluginRefinedStorage.modid);
					break;
				}
			}
		}
	}

	public void registry(EnumMaterials material, String mod) {
		for (int i = 0 ; i < (mod == Mods.COFH.modid ? 3 : 2); i++) {
			if (i == 0) {
				getBuilder(material.toString() + "_plate")
	              .parent(new UncheckedModelFile(new ResourceLocation("item/generated")))
                  .texture("layer0", modLoc("item/" + mod + "/" + material.toString() + "_plate"));
			} else if (i == 1) {
				getBuilder(material.toString() + "_gear")
	              .parent(new UncheckedModelFile(new ResourceLocation("item/generated")))
                  .texture("layer0", modLoc("item/" + mod + "/" + material.toString() + "_gear"));
			} else {
				getBuilder(material.toString() + "_stick")
	              .parent(new UncheckedModelFile(new ResourceLocation("item/generated")))
	              .texture("layer0", modLoc("item/" + mod + "/" + material.toString() + "_stick"));
			}
		}
	}

    @Override
    public String getName() {
        return "More Plates Item Models";
    }
}