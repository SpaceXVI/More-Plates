package ms55.moreplates.common.item;

import ms55.moreplates.MorePlates;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MorePlates.MODID);

	public static final RegistryObject<HammerItem> HAMMER = ITEMS.register("hammer", () -> new HammerItem());

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static RegistryObject<Item> register(String name) {
    	return ITEMS.register(name, () -> new Item(
    			new Item.Properties().group(MorePlates.ITEMGROUP)
    		)
        );
	}

    //Something for now
    public static RegistryObject<HammerItem> registerHammer(String name) {
    	return ITEMS.register(name, () -> new HammerItem());
	}
}