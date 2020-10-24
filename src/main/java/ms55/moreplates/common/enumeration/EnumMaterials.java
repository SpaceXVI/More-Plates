package ms55.moreplates.common.enumeration;

import java.util.Locale;

import ms55.moreplates.common.util.Mods;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public enum EnumMaterials {
    BRICK("Brick", new ResourceLocation("brick")),
    CHARCOAL("Charcoal", new ResourceLocation("charcoal")),
    COAL("Coal", new ResourceLocation("coal")),
    DIAMOND("Diamond", new ResourceLocation("forge:gems/diamond"), Type.GEM),
    EMERALD("Emerald", new ResourceLocation("forge:gems/emerald"), Type.GEM),
    GLOWSTONE("Glowstone", new ResourceLocation("forge:dusts/glowstone"), Type.DUST),
    GOLD("Gold", new ResourceLocation("forge:ingots/gold")),
	IRON("Iron", new ResourceLocation("forge:ingots/iron")),
    LAPIS_LAZULI("Lapis", new ResourceLocation("forge:gems/lapis"), Type.GEM),
    NETHER_BRICK("Nether Brick", new ResourceLocation("forge:ingots/nether_brick")),
    NETHERITE("Netherite", new ResourceLocation("forge:ingots/netherite")),
    NETHER_QUARTZ("Quartz", new ResourceLocation("forge:gems/quartz"), Type.GEM),
    PAPER("Paper", new ResourceLocation("paper")),
    PRISMARINE_CRYSTALS("Prismarine", new ResourceLocation("forge:gems/prismarine"), Type.CRYSTAL),
    REDSTONE("Redstone", new ResourceLocation("forge:dusts/redstone"), Type.DUST),

    ALLTHEMODIUM("All The Modium", new ResourceLocation("forge:ingots/allthemodium")),
    UNOBTAINIUM_ALLTHEMODIUM_ALLOY("Unobtainium All The Modium Alloy", new ResourceLocation("forge:ingots/unobtainium_allthemodium_alloy")),
    UNOBTAINIUM("Unobtainium", new ResourceLocation("forge:ingots/unobtainium")),
    VIBRANIUM_ALLTHEMODIUM_ALLOY("Vibranium All The Modium Alloy", new ResourceLocation("forge:ingots/vibranium_allthemodium_alloy")),
    VIBRANIUM("Vibranium", new ResourceLocation("forge:ingots/vibranium")),
    VIBRANIUM_UNOBTAINIUM_ALLOY("Vibranium Unobtainium Alloy", new ResourceLocation("forge:ingots/vibranium_unobtainium_alloy")),

    CERTUS_QUARTZ("Certus Quartz", new ResourceLocation("forge:gems/certus_quartz"), Type.CRYSTAL),
    FLUIX("Fluix", new ResourceLocation("appliedenergistics2", "crystals/fluix"), Type.CRYSTAL),

    ELEMENTIUM("Elementium", new ResourceLocation("forge:ingots/elementium")),
    GAIA_SPIRIT("Gaia Spirit", new ResourceLocation(Mods.BOTANIA.modid, "gaia_ingot")),
    MANASTEEL("Manasteel", new ResourceLocation("forge:ingots/manasteel")),
    TERRASTEEL("Terrasteel", new ResourceLocation("forge:ingots/terrasteel")),

    BLACK_IRON("Black Iron", new ResourceLocation("extendedcrafting", "black_iron_ingot")),
    CRYSTALTINE("Crystaltine", new ResourceLocation("extendedcrafting", "crystaltine_ingot")),
    ENDER("Ender", new ResourceLocation("extendedcrafting", "ender_ingot")),
    ENHANCED_ENDER("Enhanced Ender", new ResourceLocation("extendedcrafting", "enhanced_ender_ingot")),
    REDSTONE_INGOT("Redstone Ingot", new ResourceLocation("extendedcrafting", "redstone_ingot")),
    THE_ULTIMATE("The Ultimate", new ResourceLocation("extendedcrafting", "the_ultimate_ingot")),

    QUARTZ_ENRICHED_IRON("Quartz Enriched Iron", new ResourceLocation("refinedstorage", "quartz_enriched_iron"));

    ResourceLocation tag;
    String name;
    Type type;

    public BooleanValue isEnabled;

    EnumMaterials(String name, ResourceLocation tag, Type type) {
    	this.name = name;
        this.tag = tag;
        this.type = type;
    }

    EnumMaterials(String name, ResourceLocation tag) {
    	this.name = name;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    public ResourceLocation getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        if (type == null)
            return Type.INGOT.toString();
        else
            return type.toString();
    }

    @Deprecated //Remove
    public String getInput() {
        return getType() + getTag();
    }

    public enum Type {

        GEAR, PLATE, STICK, INGOT, CRYSTAL, GEM, ITEM, BLOCK, DUST;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}