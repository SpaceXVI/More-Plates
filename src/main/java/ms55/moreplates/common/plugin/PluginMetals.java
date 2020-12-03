package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.BRONZE;
import static ms55.moreplates.common.enumeration.EnumMaterials.CONSTANTAN;
import static ms55.moreplates.common.enumeration.EnumMaterials.COPPER;
import static ms55.moreplates.common.enumeration.EnumMaterials.ELECTRUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENDERIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.INVAR;
import static ms55.moreplates.common.enumeration.EnumMaterials.LEAD;
import static ms55.moreplates.common.enumeration.EnumMaterials.LUMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.NICKEL;
import static ms55.moreplates.common.enumeration.EnumMaterials.PLATINUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.SIGNALUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.SILVER;
import static ms55.moreplates.common.enumeration.EnumMaterials.TIN;

import ms55.moreplates.MorePlates;
import ms55.moreplates.common.plugin.helper.PluginHelper;
import ms55.moreplates.common.util.Mods;

public class PluginMetals extends PluginHelper {

	public static final String modid   = "metals";
	public static final String modname = "Metals";

	public static void registry() {
		boolean COFH = Mods.COFH.isModPresent();
		boolean MEKANISM = Mods.MEKANISM.isModPresent();
		boolean BLUE_POWER = Mods.BLUE_POWER.isModPresent();
		boolean IMMERSIVE_ENGINEERING = Mods.IMMERSIVE_ENGINEERING.isModPresent();
		boolean ICE_AND_FIRE = Mods.ICE_AND_FIRE.isModPresent();

		if (COFH || MEKANISM || BLUE_POWER || IMMERSIVE_ENGINEERING || ICE_AND_FIRE || MorePlates.DEBUG) {
			reg2(COPPER);
		}

		if (COFH || MEKANISM || MorePlates.DEBUG) {
			reg2(TIN);
		}

		if (COFH || IMMERSIVE_ENGINEERING || MorePlates.DEBUG) {
			reg2(LEAD);
		}

		if (COFH || BLUE_POWER || ICE_AND_FIRE || MorePlates.DEBUG) {
			reg2(SILVER);
		}

		if (COFH || IMMERSIVE_ENGINEERING || MorePlates.DEBUG) {
			reg2(NICKEL);
		}

		if (COFH || MEKANISM || MorePlates.DEBUG) {
			reg2(BRONZE);
		}

		if (COFH || IMMERSIVE_ENGINEERING || MorePlates.DEBUG) {
			reg2(ELECTRUM);
		}

		if (COFH || IMMERSIVE_ENGINEERING || MorePlates.DEBUG) {
			reg2(CONSTANTAN);
		}

		if (COFH || MorePlates.DEBUG) {
			reg2(ENDERIUM);
			reg2(INVAR);
			reg2(LUMIUM);
			reg2(PLATINUM);
			reg2(SIGNALUM);
		}		
    }
}