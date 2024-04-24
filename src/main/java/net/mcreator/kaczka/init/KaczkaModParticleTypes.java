
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, KaczkaMod.MODID);
	public static final RegistryObject<SimpleParticleType> RUBYCAVEPARTICLE = REGISTRY.register("rubycaveparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> JADEITEPARTICLE = REGISTRY.register("jadeiteparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> DUSTPARTICLE = REGISTRY.register("dustparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SAPPHIREPARTICLE = REGISTRY.register("sapphireparticle", () -> new SimpleParticleType(false));
}
