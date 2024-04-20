
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.kaczka.fluid.types.NitrogenFluidType;
import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, KaczkaMod.MODID);
	public static final RegistryObject<FluidType> NITROGEN_TYPE = REGISTRY.register("nitrogen", () -> new NitrogenFluidType());
}
