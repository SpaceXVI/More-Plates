package ms55.moreplates.common.data;

import java.util.function.Consumer;

import ms55.moreplates.MorePlates;
import ms55.moreplates.client.config.Config;
import ms55.moreplates.common.advancements.BooleanCondition;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.plugin.PluginAllTheModium;
import ms55.moreplates.common.plugin.PluginAppliedEnergistics2;
import ms55.moreplates.common.plugin.PluginBotania;
import ms55.moreplates.common.plugin.PluginExtendedCrafting;
import ms55.moreplates.common.plugin.PluginMinecraft;
import ms55.moreplates.common.plugin.PluginRefinedStorage;
import ms55.moreplates.common.util.Groups;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
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
    		for (int i = 0; i < 2; i++) {
    			if (i == 0) {
    				Item PLATE = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_plate"));
    				Ingredient INGOT = Ingredient.fromTag(ItemTags.createOptional(material.getTag()));

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
    			} else {
    				Item GEAR = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_gear"));
    				Ingredient INGOT = Ingredient.fromTag(ItemTags.createOptional(material.getTag()));

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
    			}
    		}
		}
    }

    public static String checkModId(EnumMaterials material) {
    	for (int i = 0; i < Groups.minecraft.length; i++) {
        	if (material == Groups.minecraft[i]) {
        		return PluginMinecraft.modid;
        	}
        }
    	for (int i = 0; i < Groups.allthemodium.length; i++) {
    		if (material == Groups.allthemodium[i]) {
				return PluginAllTheModium.modid;
			}
        }
    	for (int i = 0; i < Groups.appliedenergistics2.length; i++) {
    		if (material == Groups.appliedenergistics2[i]) {
				return PluginAppliedEnergistics2.modid;
			}
        }
    	for (int i = 0; i < Groups.botania.length; i++) {
    		if (material == Groups.botania[i]) {
				return PluginBotania.modid;
			}
        }
    	for (int i = 0; i < Groups.extendedcrafting.length; i++) {
    		if (material == Groups.extendedcrafting[i]) {
				return PluginExtendedCrafting.modid;
			}
        }
    	if (material == EnumMaterials.QUARTZ_ENRICHED_IRON) {
			return PluginRefinedStorage.modid;
		}

		System.err.println("Material " + material.getName() + " isn't bound to a modid");
    	return null;
    }
}