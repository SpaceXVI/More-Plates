package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTags extends BlockTagsProvider {

	public BlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, MorePlates.MODID, existingFileHelper);
	}
}