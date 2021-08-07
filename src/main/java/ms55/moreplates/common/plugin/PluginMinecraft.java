package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BRICK;
import static ms55.moreplates.common.enumeration.EnumMaterials.CHARCOAL;
import static ms55.moreplates.common.enumeration.EnumMaterials.COAL;
import static ms55.moreplates.common.enumeration.EnumMaterials.DIAMOND;
import static ms55.moreplates.common.enumeration.EnumMaterials.EMERALD;
import static ms55.moreplates.common.enumeration.EnumMaterials.FLINT;
import static ms55.moreplates.common.enumeration.EnumMaterials.GLOWSTONE;
import static ms55.moreplates.common.enumeration.EnumMaterials.GOLD;
import static ms55.moreplates.common.enumeration.EnumMaterials.IRON;
import static ms55.moreplates.common.enumeration.EnumMaterials.LAPIS_LAZULI;
import static ms55.moreplates.common.enumeration.EnumMaterials.NETHERITE;
import static ms55.moreplates.common.enumeration.EnumMaterials.NETHER_BRICK;
import static ms55.moreplates.common.enumeration.EnumMaterials.NETHER_QUARTZ;
import static ms55.moreplates.common.enumeration.EnumMaterials.PAPER;
import static ms55.moreplates.common.enumeration.EnumMaterials.PRISMARINE_CRYSTALS;
import static ms55.moreplates.common.enumeration.EnumMaterials.REDSTONE;
import static ms55.moreplates.common.enumeration.EnumMaterials.WOOD;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = PluginMinecraft.modid, modname = PluginMinecraft.modname, checkModid = false)
public class PluginMinecraft extends PluginHelper {

	public static final String modid   = "minecraft";
	public static final String modname = "Minecraft";

	@Plugin.registry
	public static void registry() {
		reg2(BRICK);
		reg2(CHARCOAL);
		reg2(COAL);
		reg2(DIAMOND);
		reg2(EMERALD);
		reg2(FLINT);
		reg2(GLOWSTONE);
		reg2(GOLD);
        reg2(IRON);
        reg2(LAPIS_LAZULI);
        reg2(NETHER_BRICK);
        reg2(NETHERITE);
        reg2(NETHER_QUARTZ);
        reg2(PAPER);
        reg2(PRISMARINE_CRYSTALS);
        reg2(REDSTONE);
        reg(WOOD);
    }
}