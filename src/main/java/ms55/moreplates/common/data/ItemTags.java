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

    		/*for (int i = 0; i < Groups.metals.length; i++) {
    			if (material == Groups.metals[i]) {
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
    		}*/

    		for (int i = 0; i < limit; i++) {
    			if (i == 0) {
    				ResourceLocation PLATE = new ResourceLocation(MorePlates.MODID, material.toString() + "_plate");
        	        IOptionalNamedTag<Item> tag = Items.createTag("plates", material.toString());
        	        getOrCreateBuilder(tag).addOptional(PLATE).replace();
        	        getOrCreateBuilder(Items.PLATES).addOptional(PLATE).replace();
        	        //getOrCreateBuilder(Items.PLATES).addTag(tag).replace();
    			} else if (i == 1) {
    				ResourceLocation GEAR = new ResourceLocation(MorePlates.MODID, material.toString() + "_gear");
        	        IOptionalNamedTag<Item> tag = Items.createTag("gears", material.toString());
        	        getOrCreateBuilder(tag).addOptional(GEAR).replace();
        	        getOrCreateBuilder(Items.GEARS).addOptional(GEAR).replace();
        	        //getOrCreateBuilder(Items.GEARS).addTag(tag).replace();
    			} else {
    				ResourceLocation STICK = new ResourceLocation(MorePlates.MODID, material.toString() + "_stick");
        	        IOptionalNamedTag<Item> tag = Items.createTag("rods", material.toString());
        	        getOrCreateBuilder(tag).addOptional(STICK).replace();
        	        getOrCreateBuilder(Items.RODS).addOptional(STICK).replace();
        	        //getOrCreateBuilder(Items.RODS).addTag(tag).replace();
    			}
    		}
		}
	}
}