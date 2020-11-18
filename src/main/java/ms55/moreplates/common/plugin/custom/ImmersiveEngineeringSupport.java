package ms55.moreplates.common.plugin.custom;

import blusunrize.immersiveengineering.api.ComparableItemStack;
import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import blusunrize.immersiveengineering.common.items.IEItems;
import ms55.moreplates.MorePlates;
import ms55.moreplates.client.config.Config;
import ms55.moreplates.common.enumeration.EnumMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class ImmersiveEngineeringSupport {

    public static int MetalPressRecipes = 0;

	public static void add(EnumMaterials material, String type, int input, int output) { 
		//Say hello to this little, chunk of code that drove me insane!
		//Don't really think making a new instance would register, but let's give it a go..

		Ingredient INGOT = Ingredient.fromTag(ItemTags.createOptional(material.getTag()));

		new MetalPressRecipe(
				new ResourceLocation(material.getName().toLowerCase() + "_" + type),
				new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_" + type)).getItem(), output),
				new IngredientWithSize(INGOT),
				getMold(type),
				energyMetalPress())
		.setInputSize(input);
	}

	private static int energyMetalPress() {
        return Config.GENERAL.ENERGY_IE.get();
    }

    private static ComparableItemStack getMold(String type) {
    	return type == "gear" ? getMoldGear() : type == "plate" ? getMoldPlate() : getMoldRod();
    }

    private static ComparableItemStack getMoldPlate() {
        return new ComparableItemStack(new ItemStack(IEItems.Molds.moldPlate));
    }

    private static ComparableItemStack getMoldGear() {
        return new ComparableItemStack(new ItemStack(IEItems.Molds.moldGear));
    }

    private static ComparableItemStack getMoldRod() {
        return new ComparableItemStack(new ItemStack(IEItems.Molds.moldRod));
    }
}
