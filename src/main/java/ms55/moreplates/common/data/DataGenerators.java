package ms55.moreplates.common.data;

import ms55.moreplates.MorePlates;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = MorePlates.MODID, bus = Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

    	if (event.includeClient()) {
    		generator.addProvider(new ItemModels(generator, helper));
    		generator.addProvider(new Language(generator));
        }
    	
    	if (event.includeServer()) {
    		generator.addProvider(new Recipes(generator));
        }
    }
}