package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.enumeration.EnumMaterials;
import ms55.moreplates.common.util.Groups;
import ms55.moreplates.common.util.Utils;
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
			for (EnumMaterials[] group : Groups.materials) {
				String name = Utils.getFieldName(group, new Groups());
				for (int x = 0; x < group.length; x++) {
					if (group[x] == material) {
						registry(material, name);
						break;
					}
				}
			}
		}
	}

	public void registry(EnumMaterials material, String mod) {
		for (int i = 0 ; i < 3/*(mod.equals("metals") || material.equals(EnumMaterials.GOLD) || material.equals(EnumMaterials.IRON) ? 3 : 2)*/; i++) {
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