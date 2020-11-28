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

import ms55.moreplates.common.plugin.helper.PluginHelper;

public class PluginThermal extends PluginHelper {

	public static final String modid   = "cofh_core";
	public static final String modname = "Cofh Core";

	public static void registry() {
		reg2(BRONZE);
		reg2(CONSTANTAN);
		reg2(COPPER);
		reg2(ELECTRUM);
		reg2(ENDERIUM);
		reg2(INVAR);
		reg2(LEAD);
		reg2(LUMIUM);
		reg2(NICKEL);
		reg2(PLATINUM);
		reg2(SIGNALUM);
		reg2(SILVER);
		reg2(TIN);
    }
}