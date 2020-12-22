package ms55.moreplates.common.enumeration;

import java.util.Locale;

import ms55.moreplates.common.util.Mods;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public enum EnumMaterials {
	// Minecraft
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

    // Allthemodium
    ALLTHEMODIUM("All The Modium", new ResourceLocation("forge:ingots/allthemodium")),
    UNOBTAINIUM_ALLTHEMODIUM_ALLOY("Unobtainium All The Modium Alloy", new ResourceLocation("forge:ingots/unobtainium_allthemodium_alloy")),
    UNOBTAINIUM("Unobtainium", new ResourceLocation("forge:ingots/unobtainium")),
    VIBRANIUM_ALLTHEMODIUM_ALLOY("Vibranium All The Modium Alloy", new ResourceLocation("forge:ingots/vibranium_allthemodium_alloy")),
    VIBRANIUM("Vibranium", new ResourceLocation("forge:ingots/vibranium")),
    VIBRANIUM_UNOBTAINIUM_ALLOY("Vibranium Unobtainium Alloy", new ResourceLocation("forge:ingots/vibranium_unobtainium_alloy")),

    // Applied Energistics2
    CERTUS_QUARTZ("Certus Quartz", new ResourceLocation("forge:gems/certus_quartz"), Type.CRYSTAL),
    FLUIX("Fluix", new ResourceLocation(Mods.APPLIED_ENERGISTICS2.modid, "crystals/fluix"), Type.CRYSTAL),

    // Aquaculture 2
    NEPTUNIUM("Neptunium", new ResourceLocation("forge:ingots/neptunium")),

    // Astral Sorcery
    AQUAMARINE("Aquamarine", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "aquamarine")),
    RESONATING_GEM("Resonating Gem", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "resonating_gem")),
    STARMETAL("Starmetal", new ResourceLocation(Mods.ASTRAL_SORCERY.modid, "starmetal_ingot")),

    // Blue Power
    BRASS("Brass", new ResourceLocation("forge:ingots/brass")),
    BLUE_ALLOY("Blue Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "blue_alloy_ingot")),
    PURPLE_ALLOY("Purple Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "purple_alloy_ingot")),
    RED_ALLOY("Red Alloy", new ResourceLocation(Mods.BLUE_POWER.modid, "red_alloy_ingot")),
    TUNGSTEN("Tungsten", new ResourceLocation("forge:ingots/tungsten")),
    TUNGSTEN_CARBIDE("Tungsten Carbide", new ResourceLocation(Mods.BLUE_POWER.modid, "tungsten_carbide")),
    ZINC("Zinc", new ResourceLocation("forge:ingots/zinc")),
    AMETHYST("Amethyst", new ResourceLocation("forge:gems/amethyst"), Type.GEM),
    MALACHITE("Malachite", new ResourceLocation("forge:gems/malachite"), Type.GEM),
    RUBY("Ruby", new ResourceLocation("forge:gems/ruby"), Type.GEM),
    SAPPHIRE("Sapphire", new ResourceLocation("forge:gems/sapphire"), Type.GEM),

    // Botania
    ELEMENTIUM("Elementium", new ResourceLocation("forge:ingots/elementium")),
    GAIA_SPIRIT("Gaia Spirit", new ResourceLocation(Mods.BOTANIA.modid, "gaia_ingot")),
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
    BLACK_IRON("Black Iron", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "black_iron_ingot")),
    CRYSTALTINE("Crystaltine", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "crystaltine_ingot")),
    ENDER("Ender", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "ender_ingot")),
    ENHANCED_ENDER("Enhanced Ender", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "enhanced_ender_ingot")),
    REDSTONE_INGOT("Redstone Ingot", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "redstone_ingot")),
    THE_ULTIMATE("The Ultimate", new ResourceLocation(Mods.EXTENDED_CRAFTING.modid, "the_ultimate_ingot")),

    // Ice and Fire
    DRAGONSTEEL_FIRE("Fire Dragonsteel", new ResourceLocation("forge:ingots/dragonsteel_fire")),
    DRAGONSTEEL_ICE("Ice Dragonsteel", new ResourceLocation("forge:ingots/dragonsteel_ice")),
    DRAGONSTEEL_LIGHTNING("Lightning Dragonsteel", new ResourceLocation("forge:ingots/dragonsteel_lightning")),
    GHOST("Phantasmal", new ResourceLocation(Mods.ICE_AND_FIRE.modid, "ghost_ingot")),

    // Mekanism
    OSMIUM("Osmium", new ResourceLocation("forge:ingots/osmium")),
    REFINED_GLOWSTONE("Refined Glowstone", new ResourceLocation("forge:ingots/refined_glowstone")),
    REFINED_OBSIDIAN("Refined Obsidian", new ResourceLocation("forge:ingots/refined_obsidian")),

    // Mystical Agradditions
    INSANIUM("Insanium", new ResourceLocation(Mods.MYSTICAL_AGRADDITIONS.modid, "insanium_ingot")),

    // Pneumaticcraft
    COMPRESSED_IRON("Compressed Iron", new ResourceLocation("forge:ingots/compressed_iron")),

    // Powah!
    ENERGIZED_STEEL("Energized Steel", new ResourceLocation(Mods.POWAH.modid, "steel_energized")),

    // Psi
    EBONY_PSIMETAL("Ebony Psimetal", new ResourceLocation("forge:ingots/ebony_psimetal")),
    IVORY_PSIMETAL("Ivory Psimetal", new ResourceLocation("forge:ingots/ivory_psimetal")),
    PSIMETAL("Psimetal", new ResourceLocation("forge:ingots/psimetal")),

    // Mystical Agriculture
    IMPERIUM("Imperium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "imperium_ingot")),
    INFERIUM("Inferium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "inferium_ingot")),
    PROSPERITY("Prosperity", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "prosperity_ingot")),
    PRUDENTIUM("Prudentium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "prudentium_ingot")),
    SOULIUM("Soulium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "soulium_ingot")),
    SUPREMIUM("Supremium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "supremium_ingot")),
    TERTIUM("Tertium", new ResourceLocation(Mods.MYSTICAL_AGRICULTURE.modid, "tertium_ingot")),

    // Refined Storage
    QUARTZ_ENRICHED_IRON("Quartz Enriched Iron", new ResourceLocation(Mods.REFINED_STORAGE.modid, "quartz_enriched_iron")),
	
	// Silent's Mechanisms
    BISMUTH("Bismuth", new ResourceLocation("forge:ingots/bismuth"));

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

    public enum Type {

        GEAR, PLATE, STICK, INGOT, CRYSTAL, GEM, ITEM, BLOCK, DUST;

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}