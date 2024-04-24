
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.kaczka.client.particle.SapphireparticleParticle;
import net.mcreator.kaczka.client.particle.RubycaveparticleParticle;
import net.mcreator.kaczka.client.particle.JadeiteparticleParticle;
import net.mcreator.kaczka.client.particle.DustparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KaczkaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(KaczkaModParticleTypes.RUBYCAVEPARTICLE.get(), RubycaveparticleParticle::provider);
		event.registerSpriteSet(KaczkaModParticleTypes.JADEITEPARTICLE.get(), JadeiteparticleParticle::provider);
		event.registerSpriteSet(KaczkaModParticleTypes.DUSTPARTICLE.get(), DustparticleParticle::provider);
		event.registerSpriteSet(KaczkaModParticleTypes.SAPPHIREPARTICLE.get(), SapphireparticleParticle::provider);
	}
}
