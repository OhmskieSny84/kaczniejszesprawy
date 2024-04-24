
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.kaczka.KaczkaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KaczkaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KaczkaMod.MODID);
	public static final RegistryObject<CreativeModeTab> DUSTY = REGISTRY.register("dusty",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.dusty")).icon(() -> new ItemStack(KaczkaModBlocks.DUSTYGRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModItems.DUST.get());
				tabData.accept(KaczkaModBlocks.DUSTYOBSIDIAN.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYDIRT.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYGRASS.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYPLANKS.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYLOG.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYLEAVES.get().asItem());
				tabData.accept(KaczkaModItems.DUSTYDIMENSION.get());
				tabData.accept(KaczkaModBlocks.DUSTYSTAIRS.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYSLAB.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYSAPLING.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYCRAFTINGTABLE.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYSTONE.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYCOBBLESTONE.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYMOSS.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYNETHERRACK.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYGLOWSTONE.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYRUBYORE.get().asItem());
				tabData.accept(KaczkaModBlocks.THE.get().asItem());
				tabData.accept(KaczkaModItems.DUSTIERDIEMSION.get());
				tabData.accept(KaczkaModBlocks.DUSTYCRYINGOBSIDIAN.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYCRYINGGLOWSTONE.get().asItem());
				tabData.accept(KaczkaModBlocks.GLOWINGOBSIDIAN.get().asItem());
				tabData.accept(KaczkaModBlocks.NETHERREACTOR.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> KACZKA = REGISTRY.register("kaczka",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.kaczka")).icon(() -> new ItemStack(KaczkaModBlocks.GILDEDCLAY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModBlocks.DUSTYAETHERPORTALPAWN.get().asItem());
				tabData.accept(KaczkaModItems.PRELUDE.get());
				tabData.accept(KaczkaModItems.PRELUDE_BLUE.get());
				tabData.accept(KaczkaModItems.HEAT_TRANSMISSION.get());
				tabData.accept(KaczkaModItems.TERRAIN_STATEMENT.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> HYPER = REGISTRY.register("hyper",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.hyper")).icon(() -> new ItemStack(Blocks.SOUL_FIRE)).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModBlocks.CAVESTONE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> STRUCTURES = REGISTRY.register("structures",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.structures")).icon(() -> new ItemStack(Blocks.BIRCH_LOG)).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModBlocks.DUSTYHOUSESPAWN.get().asItem());
				tabData.accept(KaczkaModBlocks.DUSTYPORTALSPAWN.get().asItem());
				tabData.accept(KaczkaModBlocks.AETHERPORTALSPAWN.get().asItem());
				tabData.accept(KaczkaModBlocks.NETHERREACTORSPAWNER.get().asItem());
				tabData.accept(KaczkaModBlocks.INSTASPAWNTREE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> CHEMIAKRAFT = REGISTRY.register("chemiakraft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.chemiakraft")).icon(() -> new ItemStack(Items.EXPERIENCE_BOTTLE)).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModItems.NITROGEN_BUCKET.get());
				tabData.accept(KaczkaModItems.CESIUMAMPULE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ORESWIRAZ = REGISTRY.register("oreswiraz",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.oreswiraz")).icon(() -> new ItemStack(KaczkaModItems.TORETZAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModBlocks.DEEPSTONE.get().asItem());
				tabData.accept(KaczkaModItems.DEEP_SHARD.get());
				tabData.accept(KaczkaModItems.DEEP_IRON.get());
				tabData.accept(KaczkaModBlocks.DEEP_IRON_BLOCK.get().asItem());
				tabData.accept(KaczkaModItems.DEEP_IRON_BLADE.get());
				tabData.accept(KaczkaModItems.DEPTH.get());
				tabData.accept(KaczkaModBlocks.BLOCK_OF_DEPTH.get().asItem());
				tabData.accept(KaczkaModBlocks.DEEP_SHARD_BLOCK.get().asItem());
				tabData.accept(KaczkaModBlocks.DEPTH_EXTRACTOR.get().asItem());
				tabData.accept(KaczkaModBlocks.TORETZAN_ORE.get().asItem());
				tabData.accept(KaczkaModItems.TORETZAN.get());
				tabData.accept(KaczkaModBlocks.FORAVARA_ORE.get().asItem());
				tabData.accept(KaczkaModItems.FORAVARA.get());
				tabData.accept(KaczkaModItems.VOID_MESSENGER.get());
				tabData.accept(KaczkaModItems.POWERTOKEN.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> FARMAZONY = REGISTRY.register("farmazony",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kaczka.farmazony")).icon(() -> new ItemStack(KaczkaModItems.FIREWORKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KaczkaModBlocks.GILDEDCLAY.get().asItem());
				tabData.accept(KaczkaModItems.GILDEDCLAYPIECE.get());
				tabData.accept(KaczkaModBlocks.GOLDENBRICKS.get().asItem());
				tabData.accept(KaczkaModBlocks.NETHERDIAMONDORE.get().asItem());
				tabData.accept(KaczkaModItems.RUBY.get());
				tabData.accept(KaczkaModBlocks.RUBYORE.get().asItem());
				tabData.accept(KaczkaModBlocks.RUBYPRISMARINE.get().asItem());
				tabData.accept(KaczkaModBlocks.RUBYBLOCK.get().asItem());
				tabData.accept(KaczkaModBlocks.RUBYPRISMARINESTAIRS.get().asItem());
				tabData.accept(KaczkaModBlocks.RUBYPRISMARINESLAB.get().asItem());
				tabData.accept(KaczkaModBlocks.GOLDENBRICKSTAIRS.get().asItem());
				tabData.accept(KaczkaModBlocks.GOLDENBRICKSLAB.get().asItem());
				tabData.accept(KaczkaModBlocks.RUBYLANTERN.get().asItem());
				tabData.accept(KaczkaModItems.RUBYNECKLE_CHESTPLATE.get());
				tabData.accept(KaczkaModBlocks.RUBYFLOWER.get().asItem());
				tabData.accept(KaczkaModBlocks.RUBYCRYSTAL.get().asItem());
				tabData.accept(KaczkaModBlocks.JADEITEGRAVELORE.get().asItem());
				tabData.accept(KaczkaModBlocks.JADEITEBLOCK.get().asItem());
				tabData.accept(KaczkaModBlocks.CRYINGGLOWSTONE.get().asItem());
				tabData.accept(KaczkaModBlocks.SAPPHIREORE.get().asItem());
				tabData.accept(KaczkaModItems.SAPPHIRE.get());
				tabData.accept(KaczkaModBlocks.SAPPHIREBLOCK.get().asItem());
				tabData.accept(KaczkaModBlocks.ENDERITEORE.get().asItem());
				tabData.accept(KaczkaModItems.ENDERITESHARD.get());
				tabData.accept(KaczkaModBlocks.TSAVORITE.get().asItem());
				tabData.accept(KaczkaModItems.JADEITECHISEL.get());
				tabData.accept(KaczkaModItems.JADEITEGEM.get());
				tabData.accept(KaczkaModBlocks.JADEITEGEMBLOCK.get().asItem());
				tabData.accept(KaczkaModBlocks.JADEITEGEMORE.get().asItem());
				tabData.accept(KaczkaModItems.FIREWORKS.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(KaczkaModItems.PRELUDE_MAN_SPAWN_EGG.get());
		}
	}
}
