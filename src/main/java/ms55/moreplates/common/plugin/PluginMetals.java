package ms55.moreplates.common.plugin;

import static ms55.moreplates.common.enumeration.EnumMaterials.ALUMINUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.AMETHYST;
import static ms55.moreplates.common.enumeration.EnumMaterials.BISMUTH;
import static ms55.moreplates.common.enumeration.EnumMaterials.BRASS;
import static ms55.moreplates.common.enumeration.EnumMaterials.BRONZE;
import static ms55.moreplates.common.enumeration.EnumMaterials.CHROMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.CONSTANTAN;
import static ms55.moreplates.common.enumeration.EnumMaterials.COPPER;
import static ms55.moreplates.common.enumeration.EnumMaterials.ELECTRUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.ENDERIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.GREEN_SAPPHIRE;
import static ms55.moreplates.common.enumeration.EnumMaterials.INVAR;
import static ms55.moreplates.common.enumeration.EnumMaterials.LEAD;
import static ms55.moreplates.common.enumeration.EnumMaterials.LUMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.NICKEL;
import static ms55.moreplates.common.enumeration.EnumMaterials.OSMIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.PLATINUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.RUBY;
import static ms55.moreplates.common.enumeration.EnumMaterials.SAPPHIRE;
import static ms55.moreplates.common.enumeration.EnumMaterials.SIGNALUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.SILVER;
import static ms55.moreplates.common.enumeration.EnumMaterials.STEEL;
import static ms55.moreplates.common.enumeration.EnumMaterials.TIN;
import static ms55.moreplates.common.enumeration.EnumMaterials.TITANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.TUNGSTEN;
import static ms55.moreplates.common.enumeration.EnumMaterials.URANIUM;
import static ms55.moreplates.common.enumeration.EnumMaterials.ZINC;

import ms55.moreplates.common.plugin.core.Plugin;
import ms55.moreplates.common.plugin.helper.PluginHelper;

@Plugin(modid = "", modname = PluginMetals.modname, checkModid = false)
public class PluginMetals extends PluginHelper {

	public static final String modname = "Metals";

	@Plugin.registry
	public static void registry() {
		reg2(ALUMINUM);
		reg2(COPPER);
		reg2(TIN);
		reg2(LEAD);
		reg2(SILVER);
		reg2(STEEL);
		reg2(NICKEL);
		reg2(BRONZE);
		reg2(ELECTRUM);
		reg2(CONSTANTAN);
	
		//COFH Core
		reg2(URANIUM);
		reg2(ENDERIUM);
		reg2(INVAR);
		reg2(LUMIUM);
		reg2(PLATINUM);
		reg2(SIGNALUM);

		//Assembly Line Machines
		reg2(TITANIUM);
		reg2(CHROMIUM);

		//Blue Power
		reg2(BRASS);
		reg2(TUNGSTEN);
		reg2(ZINC);

		//Mekanism
		reg2(OSMIUM);

		//Silent's Mechanisms
		reg2(BISMUTH);

		//Proj Red/Blue Power
		reg2(AMETHYST);
		reg2(GREEN_SAPPHIRE);
		reg2(RUBY);
		reg2(SAPPHIRE);
    }
}