package ms55.moreplates.common.util;

import net.minecraftforge.fml.ModList;

public enum Mods {
	ALL_THE_MODIUM("allthemodium"),
	APPLIED_ENERGISTICS2("appliedenergistics2"),
	ASTRAL_SORCERY("astralsorcery"),
	BLUE_POWER("bluepower"),
	BOTANIA("botania"),
	COFH("cofh_core"),
	EXTENDED_CRAFTING("extendedcrafting"),
	IMMERSIVE_ENGINEERING("immersiveengineering"),
	MEKANISM("mekanism"),
	MYSTICAL_AGRADDITIONS("mysticalagradditions"),
	MYSTICAL_AGRICULTURE("mysticalagriculture"),
	POWAH("powah"),
	PNEUMATIC_CRAFT_REPRESSURIZED("pneumaticcraftrepressurized"),
	REFINED_STORAGE("refinedstorage");

	public String modid;

	Mods(String modid) {
		this.modid = modid;
	}

	public boolean isModPresent() {
		return ModList.get().isLoaded(modid);
	}
}