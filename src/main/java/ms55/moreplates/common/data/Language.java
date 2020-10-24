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