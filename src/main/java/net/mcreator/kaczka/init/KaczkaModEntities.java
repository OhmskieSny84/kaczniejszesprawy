
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.kaczka.entity.FireworksProjectileEntity;
import net.mcreator.kaczka.entity.CesiumampuleProjectileEntity;
import net.mcreator.kaczka.KaczkaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KaczkaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KaczkaMod.MODID);
	public static final RegistryObject<EntityType<FireworksProjectileEntity>> FIREWORKS_PROJECTILE = register("fireworks_projectile", EntityType.Builder.<FireworksProjectileEntity>of(FireworksProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireworksProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CesiumampuleProjectileEntity>> CESIUMAMPULE_PROJECTILE = register("cesiumampule_projectile", EntityType.Builder.<CesiumampuleProjectileEntity>of(CesiumampuleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CesiumampuleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
