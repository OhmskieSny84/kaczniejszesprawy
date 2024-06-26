
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.kaczka.client.renderer.PreludeManRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KaczkaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(KaczkaModEntities.FIREWORKS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KaczkaModEntities.CESIUMAMPULE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(KaczkaModEntities.PRELUDE_MAN.get(), PreludeManRenderer::new);
		event.registerEntityRenderer(KaczkaModEntities.TERRAIN_MESSAGE.get(), ThrownItemRenderer::new);
	}
}
