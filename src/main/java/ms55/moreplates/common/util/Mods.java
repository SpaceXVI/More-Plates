package ms55.moreplates.common.util;

public enum Mods {
	ALL_THE_MODIUM("allthemodium"),
	APPLIED_ENERGISTICS2("appliedenergistics2"),
	AQUACULTURE("aquaculture"),
	ASSEMBLY_LINE_MACHINES("assemblylinemachines"),
	ASTRAL_SORCERY("astralsorcery"),
	BLUE_POWER("bluepower"),
	BOTANIA("botania"),
	COFH("cofh_core"),
	EXTENDED_CRAFTING("extendedcrafting"),
	ICE_AND_FIRE("iceandfire"),
	IMMERSIVE_ENGINEERING("immersiveengineering"),
	MEKANISM("mekanism"),
	MYSTICAL_AGRADDITIONS("mysticalagradditions"),
	MYSTICAL_AGRICULTURE("mysticalagriculture"),
	POWAH("powah"),
	PSI("psi"),
	PNEUMATIC_CRAFT_REPRESSURIZED("pneumaticcraftrepressurized"),
	REFINED_STORAGE("refinedstorage"),
	SILENTS_MECHANISMS("silents_mechanisms");

	public String modid;

	Mods(String modid) {
		this.modid = modid;
	}

	public boolean isModPresent() {
		return Utils.isModPresent(modid);
	}
}