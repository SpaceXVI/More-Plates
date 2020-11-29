package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.data.MoreTags.Items;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.util.Groups;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemTags extends ItemTagsProvider {

	public ItemTags(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, MorePlates.MODID, existingFileHelper);
	}

	@Override
	protected void registerTags() {
		for (EnumMaterials material : EnumMaterials.values()) {
			int limit = 0;

    		for (int i = 0; i < Groups.cofh.length; i++) {
    			if (material == Groups.cofh[i]) {
    				limit = 3;
    				break;
    			} else {
    				limit = 2;
    			}
    		}

    		if (limit != 3) {
    			if (material == EnumMaterials.GOLD || material == EnumMaterials.IRON) {
    				limit = 3;
    			} else {
    				limit = 2;
    			}
    		}

    		for (int i = 0; i < limit; i++) {
    			if (i == 0) {
    				Item PLATE = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_plate"));
        	        getOrCreateBuilder(Items.PLATES).add(PLATE).replace();
        	        getOrCreateBuilder(Items.createTag("plates", material.toString())).add(PLATE).replace();
    			} else if (i == 1) {
    				Item GEAR = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_gear"));
        	        getOrCreateBuilder(Items.GEARS).add(GEAR).replace();
        	        getOrCreateBuilder(Items.createTag("gears", material.toString())).add(GEAR).replace();
    			} else {
    				Item STICK = ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, material.toString() + "_stick"));
        	        getOrCreateBuilder(Items.RODS).add(STICK).replace();
        	        getOrCreateBuilder(Items.createTag("rods", material.toString())).add(STICK).replace();
    			}
    		}
		}
	}
}