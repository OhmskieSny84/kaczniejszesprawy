
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.kaczka.world.inventory.DustycraftingMenu;
import net.mcreator.kaczka.world.inventory.DepthExtractorInterfaceMenu;
import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KaczkaMod.MODID);
	public static final RegistryObject<MenuType<DepthExtractorInterfaceMenu>> DEPTH_EXTRACTOR_INTERFACE = REGISTRY.register("depth_extractor_interface", () -> IForgeMenuType.create(DepthExtractorInterfaceMenu::new));
	public static final RegistryObject<MenuType<DustycraftingMenu>> DUSTYCRAFTING = REGISTRY.register("dustycrafting", () -> IForgeMenuType.create(DustycraftingMenu::new));
}
