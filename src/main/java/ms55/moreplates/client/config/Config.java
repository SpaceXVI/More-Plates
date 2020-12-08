package ms55.moreplates.client.config;

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
				String name = material.getName().toLowerCase().contains(" ") ? material.getName().toLowerCase().replaceAll(" ", "_") : material.getName().toLowerCase();
				material.isEnabled = builder
						.comment("Enable" + material.getName())
						.define("register_" + name, true);
			}

	        builder.pop();
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