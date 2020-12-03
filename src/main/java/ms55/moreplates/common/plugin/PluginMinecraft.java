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

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginMinecraft extends PluginHelper {

	public static final String modid   = "minecraft";
	public static final String modname = "Minecraft";

	public static void registry() {
		reg(BRICK);
		reg(CHARCOAL);
		reg(COAL);
		reg(DIAMOND);
		reg(EMERALD);
		reg(FLINT);
		reg(GLOWSTONE);
		reg2(GOLD);
        reg2(IRON);
        reg(LAPIS_LAZULI);
        reg(NETHER_BRICK);
        reg(NETHERITE);
        reg(NETHER_QUARTZ);
        reg(PAPER);
        reg(PRISMARINE_CRYSTALS);
        reg(REDSTONE);
    }
}