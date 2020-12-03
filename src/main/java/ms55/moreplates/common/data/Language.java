package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.util.Groups;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class Language extends LanguageProvider {
	public Language(DataGenerator gen) {
        super(gen, MorePlates.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
    	add("itemGroup.moreplates", "More Plates");
    	add("moreplates.hammer_durability", "Hammer Durability");
    	add("moreplates.enable_gear", "Enable Gear");
    	add("moreplates.enable_plate", "Enable Plate");
    	add("moreplates.enable_rod", "Enable Rod");
    	add("item.moreplates.hammer", "Hammer");
    	for (EnumMaterials material : EnumMaterials.values()) {
    		int limit = 0;

    		for (int i = 0; i < Groups.metals.length; i++) {
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
    		}

			for (int i = 0; i < limit; i++) {
				if (i == 0) {
					add("item.moreplates." + material.toString() + "_plate", material.getName() + " Plate");
				} else if (i == 1) {
					add("item.moreplates." + material.toString() + "_gear" , material.getName() + " Gear" );
				} else {
					add("item.moreplates." + material.toString() + "_stick", material.getName() + " Rod"  );
				}
			}
		}
    }
}