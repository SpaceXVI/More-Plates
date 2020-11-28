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
    FLINT("Flint", new ResourceLocation("flint")),
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

    AQUAMARINE("Aquamarine", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "aquamarine")),
    RESONATING_GEM("Resonating Gem", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "resonating_gem")),
    STARMETAL("Starmetal", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "starmetal_ingot")),

    BRASS("Brass", new ResourceLocation("forge:ingots/brass")),
    BLUE_ALLOY("Blue Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "blue_alloy_ingot")),
    PURPLE_ALLOY("Purple Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "purple_alloy_ingot")),
    RED_ALLOY("Red Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "red_alloy_ingot")),
    TUNGSTEN("Tungsten", new ResourceLocation("forge:ingots/tungsten")),
    TUNGSTEN_CARBIDE("Tungsten Carbide", new ResourceLocation(Mods.BLUE_POWER.modid, "tungsten_carbide")),
    ZINC("Zinc", new ResourceLocation("forge:ingots/zinc")),

    ELEMENTIUM("Elementium", new ResourceLocation("forge:ingots/elementium")),
    GAIA_SPIRIT("Gaia Spirit", new ResourceLocation(Mods.BOTANIA.modid, "gaia_ingot")),
    MANASTEEL("Manasteel", new ResourceLocation("forge:ingots/manasteel")),
    TERRASTEEL("Terrasteel", new ResourceLocation("forge:ingots/terrasteel")),

    BRONZE("Bronze", new ResourceLocation("forge:ingots/bronze")),
    CONSTANTAN("Constantan", new ResourceLocation("forge:ingots/constantan")),
    COPPER("Copper", new ResourceLocation("forge:ingots/copper")),
    ELECTRUM("Electrum", new ResourceLocation("forge:ingots/electrum")),
    ENDERIUM("Enderium", new ResourceLocation("forge:ingots/enderium")),
    INVAR("Invar", new ResourceLocation("forge:ingots/invar")),
    LEAD("Lead", new ResourceLocation("forge:ingots/lead")),
    LUMIUM("Lumium", new ResourceLocation("forge:ingots/lumium")),
    NICKEL("Nickel", new ResourceLocation("forge:ingots/nickel")),
    PLATINUM("Platinum", new ResourceLocation("forge:ingots/platinum")),
    SIGNALUM("Signalum", new ResourceLocation("forge:ingots/signalum")),
    SILVER("Silver", new ResourceLocation("forge:ingots/silver")),
    TIN("Tin", new ResourceLocation("forge:ingots/tin")),

    BLACK_IRON("Black Iron", new ResourceLocation("extendedcrafting", "black_iron_ingot")),
    CRYSTALTINE("Crystaltine", new ResourceLocation("extendedcrafting", "crystaltine_ingot")),
    ENDER("Ender", new ResourceLocation("extendedcrafting", "ender_ingot")),
    ENHANCED_ENDER("Enhanced Ender", new ResourceLocation("extendedcrafting", "enhanced_ender_ingot")),
    REDSTONE_INGOT("Redstone Ingot", new ResourceLocation("extendedcrafting", "redstone_ingot")),
    THE_ULTIMATE("The Ultimate", new ResourceLocation("extendedcrafting", "the_ultimate_ingot")),

    OSMIUM("Osmium", new ResourceLocation("forge:ingots/osmium")),
    REFINED_GLOWSTONE("Refined Glowstone", new ResourceLocation("forge:ingots/refined_glowstone")),
    REFINED_OBSIDIAN("Refined Obsidian", new ResourceLocation("forge:ingots/refined_obsidian")),

    INSANIUM("Insanium", new ResourceLocation("mysticalagradditions", "insanium_ingot")),

    ENERGIZED_STEEL("Energized Steel", new ResourceLocation("powah", "steel_energized")),

    IMPERIUM("Imperium", new ResourceLocation("mysticalagriculture", "imperium_ingot")),
    INFERIUM("Inferium", new ResourceLocation("mysticalagriculture", "inferium_ingot")),
    PROSPERITY("Prosperity", new ResourceLocation("mysticalagriculture", "prosperity_ingot")),
    PRUDENTIUM("Prudentium", new ResourceLocation("mysticalagriculture", "prudentium_ingot")),
    SOULIUM("Soulium", new ResourceLocation("mysticalagriculture", "soulium_ingot")),
    SUPREMIUM("Supremium", new ResourceLocation("mysticalagriculture", "supremium_ingot")),
    TERTIUM("Tertium", new ResourceLocation("mysticalagriculture", "tertium_ingot")),

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