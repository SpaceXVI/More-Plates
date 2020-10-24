package ms55.moreplates;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class MorePlatesItemGroup extends ItemGroup {
	public MorePlatesItemGroup() {
		super(MorePlates.MODID);
	}

	@Override
	public ItemStack createIcon() {
		//return new ItemStack(ModItems.PLATE.get(), 1);
		return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MorePlates.MODID, "hammer")));
	}
}