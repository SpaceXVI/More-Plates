package ms55.moreplates.common.advancements;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import ms55.moreplates.MorePlates;
import ms55.moreplates.client.config.Config;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public final class BooleanCondition implements ICondition {
	private static final ResourceLocation NAME = new ResourceLocation(MorePlates.MODID, "isconfigenabled");

    private BooleanSupplier bool;
    private String type;

    public BooleanCondition(BooleanSupplier bool, String type) {
    	this.bool = bool;
    	this.type = type;
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test() {
        return bool.getAsBoolean() == true;
    }

    @Override
    public String toString() {
        return ((Boolean) bool.getAsBoolean()).toString();
    }

    public static enum Type {
    	ENABLE_GEAR("enable_gear"),
    	ENABLE_PLATE("enable_plate"),
    	ENABLE_STICK("enable_stick");

    	String name;

    	Type(String name) {
    		this.name = name;
    	}

    	public String get() {
    		return this.name;
    	}
    }

    public static class Serializer implements IConditionSerializer<BooleanCondition> {

        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, BooleanCondition value) {
            json.addProperty("type", value.bool.getAsBoolean());
            json.addProperty("config_setting", value.type);
        }

        @Override
        public BooleanCondition read(JsonObject json)  {
        	String configSetting = JSONUtils.getString(json, "config_setting");

            switch (configSetting) {
                //Not now!
                /*case "enableIC2Hammer":
                    if (PluginHelper.isLoaded(PluginIndustrialCraft2.MODID))
                        return () -> Config.getBoolean("Enable IC2 Hammer", Config.CATEGORY_IC2, "Enable this to add option to make all Plates with Forge Hammer");
                    else
                        return () -> false;
                case "enableIEHammer":
                    if (PluginHelper.isLoaded(PluginImmersiveEngineering.MODID))
                        return () -> Config.getBoolean("Enable IE Hammer", Config.CATEGORY_IMMERSIVE, "Enable this to add option to make all Plates with Engineer's Hammer");
                    else
                        return () -> false;*/
                case "enable_gear":
                    return new BooleanCondition(() -> Config.GENERAL.GEAR_RECIPES.get(), configSetting);
                case "enable_plate":
                    return new BooleanCondition(() -> Config.GENERAL.PLATE_RECIPES.get(), configSetting);
                case "enable_stick":
                    return new BooleanCondition(() -> Config.GENERAL.ROD_RECIPES.get(), configSetting);
                default:
                    throw new RuntimeException("Invalid config setting: " + configSetting);
            }
        }

        @Override
        public ResourceLocation getID() {
            return BooleanCondition.NAME;
        }
    }
}