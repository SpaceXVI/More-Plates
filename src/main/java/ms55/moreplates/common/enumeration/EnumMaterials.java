package ms55.moreplates.common.enumeration;

import java.util.Locale;

import ms55.moreplates.common.util.Mods;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public enum EnumMaterials {
	// Minecraft
    BRICK("Brick", new ResourceLocation("brick"), false),
    CHARCOAL("Charcoal", new ResourceLocation("charcoal"), false),
    COAL("Coal", new ResourceLocation("coal"), false),
    DIAMOND("Diamond", new ResourceLocation("forge:gems/diamond")),
    EMERALD("Emerald", new ResourceLocation("forge:gems/emerald")),
    FLINT("Flint", new ResourceLocation("flint"), false),
    GLOWSTONE("Glowstone", new ResourceLocation("forge:dusts/glowstone")),
    GOLD("Gold", new ResourceLocation("forge:ingots/gold")),
	IRON("Iron", new ResourceLocation("forge:ingots/iron")),
    LAPIS_LAZULI("Lapis", new ResourceLocation("forge:gems/lapis")),
    NETHER_BRICK("Nether Brick", new ResourceLocation("forge:ingots/nether_brick")),
    NETHERITE("Netherite", new ResourceLocation("forge:ingots/netherite")),
    NETHER_QUARTZ("Quartz", new ResourceLocation("forge:gems/quartz")),
    PAPER("Paper", new ResourceLocation("paper"), false),
    PRISMARINE_CRYSTALS("Prismarine", new ResourceLocation("forge:gems/prismarine")),
    REDSTONE("Redstone", new ResourceLocation("forge:dusts/redstone")),
    WOOD("Wooden", new ResourceLocation("planks")),

    // Allthemodium
    ALLTHEMODIUM("All The Modium", new ResourceLocation("forge:ingots/allthemodium")),
    UNOBTAINIUM_ALLTHEMODIUM_ALLOY("Unobtainium All The Modium Alloy", new ResourceLocation("forge:ingots/unobtainium_allthemodium_alloy")),
    UNOBTAINIUM("Unobtainium", new ResourceLocation("forge:ingots/unobtainium")),
    VIBRANIUM_ALLTHEMODIUM_ALLOY("Vibranium All The Modium Alloy", new ResourceLocation("forge:ingots/vibranium_allthemodium_alloy")),
    VIBRANIUM("Vibranium", new ResourceLocation("forge:ingots/vibranium")),
    VIBRANIUM_UNOBTAINIUM_ALLOY("Vibranium Unobtainium Alloy", new ResourceLocation("forge:ingots/unobtainium_vibranium_alloy")),

    // Applied Energistics2
    CERTUS_QUARTZ("Certus Quartz", new ResourceLocation("forge:gems/certus_quartz")),
    FLUIX("Fluix", new ResourceLocation(Mods.APPLIED_ENERGISTICS2.modid, "crystals/fluix"), false),

    // Aquaculture 2
    NEPTUNIUM("Neptunium", new ResourceLocation("forge:ingots/neptunium")),

    // Assembly Line Machines
    ATTUNED_TITANIUM("Attuned Titanium", new ResourceLocation(Mods.ASSEMBLY_LINE_MACHINES.modid, "attuned_titanium_ingot"), false),
    CHROMIUM("Chromium", new ResourceLocation("forge:ingots/chromium")),
    ENERGIZED_GOLD("Energized Gold", new ResourceLocation("forge:ingots/energized_gold")),
    MYSTIUM("Mystium", new ResourceLocation("forge:ingots/mystium")),
    PURE_GOLD("Pure Gold", new ResourceLocation("forge:ingots/pure_gold")),
    PURE_IRON("Pure Iron", new ResourceLocation("forge:ingots/pure_iron")),
    PURE_STEEL("Pure Steel", new ResourceLocation("forge:ingots/pure_steel")),
    PURE_TITANIUM("Pure Titanium", new ResourceLocation("forge:ingots/pure_titanium")),
    TITANIUM("Titanium", new ResourceLocation("forge:ingots/titanium")),

    // Astral Sorcery
    AQUAMARINE("Aquamarine", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "aquamarine"), false),
    RESONATING_GEM("Resonating Gem", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "resonating_gem"), false),
    STARMETAL("Starmetal", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "starmetal_ingot"), false),

    // Blue Power
    BRASS("Brass", new ResourceLocation("forge:ingots/brass")),
    BLUE_ALLOY("Blue Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "blue_alloy_ingot"), false),
    PURPLE_ALLOY("Purple Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "purple_alloy_ingot"), false),
    RED_ALLOY("Red Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "red_alloy_ingot"), false),
    SILICON("Silicon", new ResourceLocation(Mods.BLUE_POWER.modid, "silicon_wafer"), false),
    TUNGSTEN("Tungsten", new ResourceLocation("forge:ingots/tungsten")),
    TUNGSTEN_CARBIDE("Tungsten Carbide", new ResourceLocation(Mods.BLUE_POWER.modid, "tungsten_carbide"), false),
    ZINC("Zinc", new ResourceLocation("forge:ingots/zinc")),
    AMETHYST("Amethyst", new ResourceLocation("forge:gems/amethyst")),
    GREEN_SAPPHIRE("Green Sapphire", new ResourceLocation("forge:gems/green_sapphire")),
    RUBY("Ruby", new ResourceLocation("forge:gems/ruby")),
    SAPPHIRE("Sapphire", new ResourceLocation("forge:gems/sapphire")),

    // Botania
    ELEMENTIUM("Elementium", new ResourceLocation("forge:ingots/elementium")),
    GAIA_SPIRIT("Gaia Spirit", new ResourceLocation(Mods.BOTANIA.modid, "gaia_ingot"), false),
    MANASTEEL("Manasteel", new ResourceLocation("forge:ingots/manasteel")),
    TERRASTEEL("Terrasteel", new ResourceLocation("forge:ingots/terrasteel")),

    // Metals
    ALUMINUM("Aluminum", new ResourceLocation("forge:ingots/aluminum")),
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
    STEEL("Steel", new ResourceLocation("forge:ingots/steel")),
    TIN("Tin", new ResourceLocation("forge:ingots/tin")),
    URANIUM("Uranium", new ResourceLocation("forge:ingots/uranium")),

    // Extended Crafting
    BLACK_IRON("Black Iron", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "black_iron_ingot"), false),
    CRYSTALTINE("Crystaltine", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "crystaltine_ingot"), false),
    ENDER("Ender", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "ender_ingot"), false),
    ENHANCED_ENDER("Enhanced Ender", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "enhanced_ender_ingot"), false),
    REDSTONE_INGOT("Redstone Ingot", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "redstone_ingot"), false),
    THE_ULTIMATE("The Ultimate", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "the_ultimate_ingot"), false),

    // Ice and Fire
    DRAGONSTEEL_FIRE("Fire Dragonsteel", new ResourceLocation("forge:ingots/dragonsteel_fire")),
    DRAGONSTEEL_ICE("Ice Dragonsteel", new ResourceLocation("forge:ingots/dragonsteel_ice")),
    DRAGONSTEEL_LIGHTNING("Lightning Dragonsteel", new ResourceLocation("forge:ingots/dragonsteel_lightning")),
    GHOST("Phantasmal", new ResourceLocation(Mods.ICE_AND_FIRE.modid, "ghost_ingot"), false),

    // Mekanism
    OSMIUM("Osmium", new ResourceLocation("forge:ingots/osmium")),
    REFINED_GLOWSTONE("Refined Glowstone", new ResourceLocation("forge:ingots/refined_glowstone")),
    REFINED_OBSIDIAN("Refined Obsidian", new ResourceLocation("forge:ingots/refined_obsidian")),

    // Mystical Agradditions
    INSANIUM("Insanium", new ResourceLocation(Mods.MYSTICAL_AGRADDITIONS.modid, "insanium_ingot"), false),

    // Pneumaticcraft
    COMPRESSED_IRON("Compressed Iron", new ResourceLocation("forge:ingots/compressed_iron")),

    // Powah!
    ENERGIZED_STEEL("Energized Steel", new ResourceLocation(Mods.POWAH.modid, "steel_energized"), false),

    // Project Red
    ELECTROTINE_ALLOY("Electrotine", new ResourceLocation(Mods.PROJECT_RED.modid, "electrotine_ingot"), false),
    RED_INGOT("Red Alloy", new ResourceLocation(Mods.PROJECT_RED.modid, "red_ingot"), false),
    SILICON2("Silicon", new ResourceLocation(Mods.PROJECT_RED.modid, "silicon"), false),

    // Psi
    EBONY_PSIMETAL("Ebony Psimetal", new ResourceLocation("forge:ingots/ebony_psimetal")),
    IVORY_PSIMETAL("Ivory Psimetal", new ResourceLocation("forge:ingots/ivory_psimetal")),
    PSIMETAL("Psimetal", new ResourceLocation("forge:ingots/psimetal")),

    // Mystical Agriculture
    IMPERIUM("Imperium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "imperium_ingot"), false),
    INFERIUM("Inferium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "inferium_ingot"), false),
    PROSPERITY("Prosperity", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "prosperity_ingot"), false),
    PRUDENTIUM("Prudentium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "prudentium_ingot"), false),
    SOULIUM("Soulium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "soulium_ingot"), false),
    SUPREMIUM("Supremium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "supremium_ingot"), false),
    TERTIUM("Tertium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "tertium_ingot"), false),

    // Refined Storage
    QUARTZ_ENRICHED_IRON("Quartz Enriched Iron", new ResourceLocation(Mods.REFINED_STORAGE.modid, "quartz_enriched_iron"), false),
	
	// Silent's Mechanisms
    BISMUTH("Bismuth", new ResourceLocation("forge:ingots/bismuth"));

    ResourceLocation tag;
    String name;
    boolean type;

    public BooleanValue isEnabled;

    EnumMaterials(String name, ResourceLocation tag, boolean type) {
    	this.name = name;
        this.tag = tag;
        this.type = type;
    }

    EnumMaterials(String name, ResourceLocation tag) {
    	this.name = name;
        this.tag = tag;
        this.type = true;
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

    public boolean hasTag() {
    	return type;
    }
}