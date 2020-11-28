package ms55.moreplates.common.data;

import java.util.function.Consumer;

import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import blusunrize.immersiveengineering.api.crafting.builders.MetalPressRecipeBuilder;
import blusunrize.immersiveengineering.common.items.IEItems;
import ms55.moreplates.MorePlates;
import ms55.moreplates.client.config.Config;
import ms55.moreplates.common.advancements.BooleanCondition;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.util.Groups;
import ms55.moreplates.common.util.Mods;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

public class Recipes extends RecipeProvider implements IConditionBuilder {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
    	for (EnumMaterials material : EnumMaterials.values()) {
    		int limit = 3;

    		for (int i = 0; i < Groups.cofh.length; i++) {
    			if (material == Groups.cofh[i]) {
    				limit = 3;
    				break;
    			} else {
    				limit = 2;
    			}
    		}

    		for (int i = 0; i < limit; i++) {
    			if (i == 0) {
    				Item PLATE = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_plate"));
    				ITag<Item> TAG = ItemTags.createOptional(material.getTag());
    				Ingredient INGOT = Ingredient.fromTag(TAG);

    				ConditionalRecipe.builder()
                    .addCondition(
                    	and(
                            new BooleanCondition(() -> Config.GENERAL.PLATE_RECIPES.get(), BooleanCondition.Type.ENABLE_PLATE.get()),
                            itemExists(MorePlates.MODID, material.toString() + "_plate")
                        )
                    )
                    .addRecipe(
                    	ShapedRecipeBuilder.shapedRecipe(PLATE)
                            .patternLine("H")
                            .patternLine("I")
                            .patternLine("I")
                            .key('H', ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, "hammer")))
                            .key('I', INGOT)
                            .setGroup("")
        	                .addCriterion("has_item", hasItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, "hammer"))))
                            ::build
                    )
                    .build(consumer, new ResourceLocation(MorePlates.MODID, material.toString() + "_plate"));

    				if (Mods.IMMERSIVE_ENGINEERING.isModPresent()) {
    					MetalPressRecipeBuilder.builder(IEItems.Molds.moldPlate, PLATE)
    						.addCondition(
    	                    	and(
    	                            new BooleanCondition(() -> Config.GENERAL.PLATE_RECIPES.get(), BooleanCondition.Type.ENABLE_PLATE.get()),
    	                            itemExists(MorePlates.MODID, material.toString() + "_plate")
    	                        )
    	                    )
    						.addInput(INGOT)
    						.setEnergy(2400)
    					    .build(consumer, new ResourceLocation(MorePlates.MODID, "metal_press/" + material.toString() + "_plate"));
    				}
    			} else if (i == 1) {
    				Item GEAR = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_gear"));
    				ITag<Item> TAG = ItemTags.createOptional(material.getTag());
    				Ingredient INGOT = Ingredient.fromTag(TAG);

    				ConditionalRecipe.builder()
                    .addCondition(
                    	and(
                    		new BooleanCondition(() -> Config.GENERAL.GEAR_RECIPES.get(), BooleanCondition.Type.ENABLE_GEAR.get()),
                            itemExists(MorePlates.MODID, material.toString() + "_gear")
                    	)
                    )
                    .addRecipe(
                    	ShapedRecipeBuilder.shapedRecipe(GEAR)
                        	.patternLine(" x ")
                        	.patternLine("x#x")
                        	.patternLine(" x ")
                        	.key('x', INGOT)
                        	.key('#', Tags.Items.INGOTS_IRON)
        	                .setGroup("")
        	                .addCriterion("has_item", hasItem(Items.IRON_INGOT))
        	                ::build
                    )
                    .build(consumer, new ResourceLocation(MorePlates.MODID, material.toString() + "_gear"));

    				if (Mods.IMMERSIVE_ENGINEERING.isModPresent()) {
    					MetalPressRecipeBuilder.builder(IEItems.Molds.moldGear, GEAR)
    						.addCondition(
    	                    	and(
    	                    		new BooleanCondition(() -> Config.GENERAL.GEAR_RECIPES.get(), BooleanCondition.Type.ENABLE_GEAR.get()),
    	                            itemExists(MorePlates.MODID, material.toString() + "_gear")
    	                    	)
    	                    )
							.addInput(new IngredientWithSize(TAG, 4))
							.setEnergy(2400)
							.build(consumer, new ResourceLocation(MorePlates.MODID, "metal_press/" + material.toString() + "_gear"));
    				}
    			} else {
    				Item STICK = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_stick"));
    				ITag<Item> TAG = ItemTags.createOptional(material.getTag());
    				Ingredient INGOT = Ingredient.fromTag(TAG);

    				ConditionalRecipe.builder()
                    .addCondition(
                    	and(
                    		new BooleanCondition(() -> Config.GENERAL.ROD_RECIPES.get(), BooleanCondition.Type.ENABLE_STICK.get()),
                            itemExists(MorePlates.MODID, material.toString() + "_stick")
                    	)
                    )
                    .addRecipe(
                    	ShapedRecipeBuilder.shapedRecipe(STICK, 2)
                        	.patternLine("x")
                        	.patternLine("x")
                        	.key('x', INGOT)
        	                .setGroup("")
        	                .addCriterion("has_item", hasItem(Items.GOLD_INGOT))
        	                ::build
                    )
                    .build(consumer, new ResourceLocation(MorePlates.MODID, material.toString() + "_stick"));

    				if (Mods.IMMERSIVE_ENGINEERING.isModPresent()) {
    					MetalPressRecipeBuilder.builder(IEItems.Molds.moldRod, STICK)
    						.addCondition(
    	                    	and(
    	                    		new BooleanCondition(() -> Config.GENERAL.ROD_RECIPES.get(), BooleanCondition.Type.ENABLE_STICK.get()),
    	                            itemExists(MorePlates.MODID, material.toString() + "_stick")
    	                    	)
    	                    )
							.addInput(new IngredientWithSize(TAG, 2))
							.setEnergy(2400)
						.build(consumer, new ResourceLocation(MorePlates.MODID, "metal_press/" + material.toString() + "_stick"));
    				}
    			}
    		}
		}
    }
}