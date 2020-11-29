package ms55.moreplates.client.config;

import java.util.Arrays;
import java.util.List;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.enumeration.EnumMaterials;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(modid = MorePlates.MODID, bus = Bus.MOD)
public class Config {

	public static class General {
	    public final IntValue DURABILITY_HAMMER;

		public final BooleanValue GEAR_RECIPES;
	    public final BooleanValue PLATE_RECIPES;
	    public final BooleanValue ROD_RECIPES;

	    public final List<String> DEFAULT_LIST = Arrays.asList(new String[] {"forge:ingots/iron", "forge:ingots/copper", "forge:ingots/tin", "forge:ingots/bronze", "forge:ingots/constructionalloy"});

		public General(ForgeConfigSpec.Builder builder) {
			builder.comment("General configurations for More Plates")
			       .push("General");

			DURABILITY_HAMMER = builder
					.comment("Hammer Durability")
	                .defineInRange("hammer_durability", 150, 1, Integer.MAX_VALUE);
			GEAR_RECIPES = builder
	                .comment("Set this to false to disable all crafting recipes for Gears")
	                .define("enable_gear", true);
	        PLATE_RECIPES = builder
	                .comment("Set this to false to disable all crafting recipes for Plates")
	                .define("enable_plate", true);
	        ROD_RECIPES = builder
	                .comment("Set this to false to disable all crafting recipes for Rods")
	                .define("enable_rod", true);

	        builder.pop();
		}
	}

	public static class Items {
		public Items(ForgeConfigSpec.Builder builder) {
			builder.comment("Item configurations for More Plates")
			       .push("Items");

			for (EnumMaterials material : EnumMaterials.values()) {
				material.isEnabled = loadItem(builder, material);
			}

	        builder.pop();
		}

		public static BooleanValue loadItem(ForgeConfigSpec.Builder builder, EnumMaterials item) {
			String name = item.getName().toLowerCase().contains(" ") ? item.getName().toLowerCase().replaceAll(" ", "_") : item.getName().toLowerCase();
	        return builder.comment("Enable" + item.getName())
	        			  .define("register_" + name, true);
	    }
	}

	public static final ForgeConfigSpec COMMON_SPEC;
	public static final General GENERAL;
	public static final Items ITEMS;

	static {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
		GENERAL = new General(builder);
		ITEMS = new Items(builder);

		COMMON_SPEC = builder.build();
	}

	@SubscribeEvent
	public static void onLoad(final ModConfig.Loading event) {

	}

	@SubscribeEvent
	public static void onFileChange(final ModConfig.Reloading event) {

	}
}