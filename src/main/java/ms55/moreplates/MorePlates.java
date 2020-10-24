package ms55.moreplates;

import ms55.moreplates.client.config.Config;
import ms55.moreplates.common.RegistryHandler;
import ms55.moreplates.common.advancements.BooleanCondition;
import ms55.moreplates.common.data.DataGenerators;
import ms55.moreplates.common.plugin.PluginHolder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MorePlates.MODID)
public class MorePlates {
    public static final String MODID = "moreplates";
	public static final String NAME = "More Plates";
	
	public static final ItemGroup ITEMGROUP = new MorePlatesItemGroup();

    public MorePlates() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(Config.class);

        FMLJavaModLoadingContext.get().getModEventBus().register(this);

        ModLoadingContext.get().registerConfig(Type.COMMON, Config.COMMON_SPEC, "moreplates.toml");

        PluginHolder.registry();
        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(DataGenerators.class);
    }

    @SubscribeEvent
    public void registerRecipeSerialziers(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        CraftingHelper.register(BooleanCondition.Serializer.INSTANCE);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }
}
