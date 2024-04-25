
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

import net.mcreator.kaczka.entity.TerrainMessageEntity;
import net.mcreator.kaczka.entity.PreludeManEntity;
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
	public static final RegistryObject<EntityType<PreludeManEntity>> PRELUDE_MAN = register("prelude_man",
			EntityType.Builder.<PreludeManEntity>of(PreludeManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PreludeManEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TerrainMessageEntity>> TERRAIN_MESSAGE = register("terrain_message",
			EntityType.Builder.<TerrainMessageEntity>of(TerrainMessageEntity::new, MobCategory.MISC).setCustomClientFactory(TerrainMessageEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PreludeManEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRELUDE_MAN.get(), PreludeManEntity.createAttributes().build());
	}
}
