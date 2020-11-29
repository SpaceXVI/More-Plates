package ms55.moreplates.common.data;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class MoreTags {

	public static class Items {
		public static final Tags.IOptionalNamedTag<Item> PLATES = forgeTag("plates");
		public static final Tags.IOptionalNamedTag<Item> GEARS = forgeTag("gears");
		public static final Tags.IOptionalNamedTag<Item> RODS = forgeTag("rods");

        public static Tags.IOptionalNamedTag<Item> createTag(String prefix, String name) {
        	return forgeTag(prefix + "/" + name);
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return  net.minecraft.tags.ItemTags.createOptional(new ResourceLocation("forge", name));
        }
	}
}