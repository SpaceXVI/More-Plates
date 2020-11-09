package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.enumeration.EnumMaterials;
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
    	add("item.moreplates.iron_stick", "Iron Rod");
    	add("item.moreplates.gold_stick", "Gold Rod");
    	for (EnumMaterials material : EnumMaterials.values()) {
			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					add("item.moreplates." + material.toString() + "_plate", material.getName() + " Plate");
				} else {
					add("item.moreplates." + material.toString() + "_gear", material.getName() + " Gear");
				}
			}
		}
    }
}