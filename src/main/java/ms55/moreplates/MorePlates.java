package ms55.moreplates;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ms55.moreplates.client.config.Config;
import ms55.moreplates.common.RegistryHandler;
import ms55.moreplates.common.advancements.BooleanCondition;
import ms55.moreplates.common.data.DataGenerators;
import ms55.moreplates.common.plugin.core.PluginLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MorePlates.MODID)
public class MorePlates {
    public static final String MODID = "moreplates";
	public static final String NAME = "More Plates";

    public static final Logger LOGGER = LogManager.getLogger();

	public static final ItemGroup ITEMGROUP = new MorePlatesItemGroup();

	public static final boolean DEBUG = false;

    public MorePlates() {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(Config.class);

        FMLJavaModLoadingContext.get().getModEventBus().register(this);

        ModLoadingContext.get().registerConfig(Type.COMMON, Config.COMMON_SPEC, "moreplates.toml");

		try {
			PluginLoader.initializePlugins();
		} catch (Exception e) {
			e.printStackTrace();
		}

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(DataGenerators.class);
    }

    @SubscribeEvent
    public void registerRecipeSerialziers(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        CraftingHelper.register(BooleanCondition.Serializer.INSTANCE);
    }
}
