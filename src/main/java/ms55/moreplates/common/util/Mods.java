package ms55.moreplates.common.util;

import net.minecraftforge.fml.ModList;

//TODO check all of these mod's modid
public enum Mods {
	ALL_THE_MODIUM("allthemodium"),
	APPLIED_ENERGISTICS2("appliedenergistics2"),
	BOTANIA("botania"),
	EXTENDED_CRAFTING("extendedcrafting"),
	IMMERSIVE_ENGINEERING("immersiveengineering"),
	INDUSTRIAL_FOREGOING("industrialforegoing"),
	MEKANISM("mekanism"),
	MYSTICAL_AGRADDITIONS("mysticalagradditions"),
	MYSTICAL_AGRICULTURE("mysticalagriculture"),
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
