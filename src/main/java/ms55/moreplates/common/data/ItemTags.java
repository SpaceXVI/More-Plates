package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.data.MoreTags.Items;
import ms55.moreplates.common.enumeration.EnumMaterials;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {

	public ItemTags(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, MorePlates.MODID, existingFileHelper);
	}

	@Override
	protected void registerTags() {
		for (EnumMaterials material : EnumMaterials.values()) {
			int limit = 3;

			if (material.equals(EnumMaterials.WOOD)) {
    			limit = 2;
    		}

    		for (int i = 0; i < limit; i++) {
    			if (i == 0) {
    				ResourceLocation PLATE = new ResourceLocation(MorePlates.MODID, material.toString() + "_plate");
        	        IOptionalNamedTag<Item> tag = Items.createTag("plates", material.toString());
        	        getOrCreateBuilder(tag).addOptional(PLATE);
        	        getOrCreateBuilder(Items.PLATES).addOptional(PLATE);
    			} else if (i == 1) {
    				ResourceLocation GEAR = new ResourceLocation(MorePlates.MODID, material.toString() + "_gear");
        	        IOptionalNamedTag<Item> tag = Items.createTag("gears", material.toString());
        	        getOrCreateBuilder(tag).addOptional(GEAR);
        	        getOrCreateBuilder(Items.GEARS).addOptional(GEAR);
    			} else {
    				ResourceLocation STICK = new ResourceLocation(MorePlates.MODID, material.toString() + "_stick");
        	        IOptionalNamedTag<Item> tag = Items.createTag("rods", material.toString());
        	        getOrCreateBuilder(tag).addOptional(STICK);
        	        getOrCreateBuilder(Items.RODS).addOptional(STICK);
    			}
    		}
		}
	}
}