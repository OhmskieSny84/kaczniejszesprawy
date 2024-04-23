
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kaczka.item.VoidMessengerItem;
import net.mcreator.kaczka.item.ToretzanItem;
import net.mcreator.kaczka.item.SapphireItem;
import net.mcreator.kaczka.item.RubyneckleItem;
import net.mcreator.kaczka.item.RubyItem;
import net.mcreator.kaczka.item.PreludeItem;
import net.mcreator.kaczka.item.PreludeBlueItem;
import net.mcreator.kaczka.item.PowertokenItem;
import net.mcreator.kaczka.item.NitrogenItem;
import net.mcreator.kaczka.item.JadeitegemItem;
import net.mcreator.kaczka.item.JadeitechiselItem;
import net.mcreator.kaczka.item.HeatTransmissionItem;
import net.mcreator.kaczka.item.GildedclaypieceItem;
import net.mcreator.kaczka.item.ForavaraItem;
import net.mcreator.kaczka.item.FireworksItem;
import net.mcreator.kaczka.item.EnderiteshardItem;
import net.mcreator.kaczka.item.DustydimensionItem;
import net.mcreator.kaczka.item.DustierdiemsionItem;
import net.mcreator.kaczka.item.DustItem;
import net.mcreator.kaczka.item.DepthItem;
import net.mcreator.kaczka.item.DeepShardItem;
import net.mcreator.kaczka.item.DeepIronItem;
import net.mcreator.kaczka.item.DeepIronBladeItem;
import net.mcreator.kaczka.item.CesiumampuleItem;
import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KaczkaMod.MODID);
	public static final RegistryObject<Item> GILDEDCLAY = block(KaczkaModBlocks.GILDEDCLAY);
	public static final RegistryObject<Item> GILDEDCLAYPIECE = REGISTRY.register("gildedclaypiece", () -> new GildedclaypieceItem());
	public static final RegistryObject<Item> GOLDENBRICKS = block(KaczkaModBlocks.GOLDENBRICKS);
	public static final RegistryObject<Item> NETHERDIAMONDORE = block(KaczkaModBlocks.NETHERDIAMONDORE);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBYORE = block(KaczkaModBlocks.RUBYORE);
	public static final RegistryObject<Item> RUBYPRISMARINE = block(KaczkaModBlocks.RUBYPRISMARINE);
	public static final RegistryObject<Item> RUBYBLOCK = block(KaczkaModBlocks.RUBYBLOCK);
	public static final RegistryObject<Item> RUBYPRISMARINESTAIRS = block(KaczkaModBlocks.RUBYPRISMARINESTAIRS);
	public static final RegistryObject<Item> RUBYPRISMARINESLAB = block(KaczkaModBlocks.RUBYPRISMARINESLAB);
	public static final RegistryObject<Item> GOLDENBRICKSTAIRS = block(KaczkaModBlocks.GOLDENBRICKSTAIRS);
	public static final RegistryObject<Item> GOLDENBRICKSLAB = block(KaczkaModBlocks.GOLDENBRICKSLAB);
	public static final RegistryObject<Item> RUBYLANTERN = block(KaczkaModBlocks.RUBYLANTERN);
	public static final RegistryObject<Item> RUBYNECKLE_CHESTPLATE = REGISTRY.register("rubyneckle_chestplate", () -> new RubyneckleItem.Chestplate());
	public static final RegistryObject<Item> RUBYFLOWER = block(KaczkaModBlocks.RUBYFLOWER);
	public static final RegistryObject<Item> RUBYCRYSTAL = block(KaczkaModBlocks.RUBYCRYSTAL);
	public static final RegistryObject<Item> JADEITEGRAVELORE = block(KaczkaModBlocks.JADEITEGRAVELORE);
	public static final RegistryObject<Item> JADEITEBLOCK = block(KaczkaModBlocks.JADEITEBLOCK);
	public static final RegistryObject<Item> DEEPSTONE = block(KaczkaModBlocks.DEEPSTONE);
	public static final RegistryObject<Item> DEEP_SHARD = REGISTRY.register("deep_shard", () -> new DeepShardItem());
	public static final RegistryObject<Item> DEEP_IRON = REGISTRY.register("deep_iron", () -> new DeepIronItem());
	public static final RegistryObject<Item> DEEP_IRON_BLOCK = block(KaczkaModBlocks.DEEP_IRON_BLOCK);
	public static final RegistryObject<Item> DEEP_IRON_BLADE = REGISTRY.register("deep_iron_blade", () -> new DeepIronBladeItem());
	public static final RegistryObject<Item> DUST = REGISTRY.register("dust", () -> new DustItem());
	public static final RegistryObject<Item> DUSTYOBSIDIAN = block(KaczkaModBlocks.DUSTYOBSIDIAN);
	public static final RegistryObject<Item> DEPTH = REGISTRY.register("depth", () -> new DepthItem());
	public static final RegistryObject<Item> BLOCK_OF_DEPTH = block(KaczkaModBlocks.BLOCK_OF_DEPTH);
	public static final RegistryObject<Item> DEEP_SHARD_BLOCK = block(KaczkaModBlocks.DEEP_SHARD_BLOCK);
	public static final RegistryObject<Item> DEPTH_EXTRACTOR = block(KaczkaModBlocks.DEPTH_EXTRACTOR);
	public static final RegistryObject<Item> DUSTYDIRT = block(KaczkaModBlocks.DUSTYDIRT);
	public static final RegistryObject<Item> DUSTYGRASS = block(KaczkaModBlocks.DUSTYGRASS);
	public static final RegistryObject<Item> TORETZAN_ORE = block(KaczkaModBlocks.TORETZAN_ORE);
	public static final RegistryObject<Item> TORETZAN = REGISTRY.register("toretzan", () -> new ToretzanItem());
	public static final RegistryObject<Item> FORAVARA_ORE = block(KaczkaModBlocks.FORAVARA_ORE);
	public static final RegistryObject<Item> FORAVARA = REGISTRY.register("foravara", () -> new ForavaraItem());
	public static final RegistryObject<Item> DUSTYPLANKS = block(KaczkaModBlocks.DUSTYPLANKS);
	public static final RegistryObject<Item> DUSTYLOG = block(KaczkaModBlocks.DUSTYLOG);
	public static final RegistryObject<Item> DUSTYLEAVES = block(KaczkaModBlocks.DUSTYLEAVES);
	public static final RegistryObject<Item> DUSTYDIMENSION = REGISTRY.register("dustydimension", () -> new DustydimensionItem());
	public static final RegistryObject<Item> DUSTYSTAIRS = block(KaczkaModBlocks.DUSTYSTAIRS);
	public static final RegistryObject<Item> DUSTYSLAB = block(KaczkaModBlocks.DUSTYSLAB);
	public static final RegistryObject<Item> DUSTYSAPLING = block(KaczkaModBlocks.DUSTYSAPLING);
	public static final RegistryObject<Item> DUSTYCRAFTINGTABLE = block(KaczkaModBlocks.DUSTYCRAFTINGTABLE);
	public static final RegistryObject<Item> DUSTYSTONE = block(KaczkaModBlocks.DUSTYSTONE);
	public static final RegistryObject<Item> DUSTYCOBBLESTONE = block(KaczkaModBlocks.DUSTYCOBBLESTONE);
	public static final RegistryObject<Item> DUSTYMOSS = block(KaczkaModBlocks.DUSTYMOSS);
	public static final RegistryObject<Item> DUSTYNETHERRACK = block(KaczkaModBlocks.DUSTYNETHERRACK);
	public static final RegistryObject<Item> DUSTYGLOWSTONE = block(KaczkaModBlocks.DUSTYGLOWSTONE);
	public static final RegistryObject<Item> DUSTYRUBYORE = block(KaczkaModBlocks.DUSTYRUBYORE);
	public static final RegistryObject<Item> CRYINGGLOWSTONE = block(KaczkaModBlocks.CRYINGGLOWSTONE);
	public static final RegistryObject<Item> THE = block(KaczkaModBlocks.THE);
	public static final RegistryObject<Item> DUSTYHOUSESPAWN = block(KaczkaModBlocks.DUSTYHOUSESPAWN);
	public static final RegistryObject<Item> SAPPHIREORE = block(KaczkaModBlocks.SAPPHIREORE);
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> SAPPHIREBLOCK = block(KaczkaModBlocks.SAPPHIREBLOCK);
	public static final RegistryObject<Item> DUSTIERDIEMSION = REGISTRY.register("dustierdiemsion", () -> new DustierdiemsionItem());
	public static final RegistryObject<Item> DUSTYCRYINGOBSIDIAN = block(KaczkaModBlocks.DUSTYCRYINGOBSIDIAN);
	public static final RegistryObject<Item> DUSTYCRYINGGLOWSTONE = block(KaczkaModBlocks.DUSTYCRYINGGLOWSTONE);
	public static final RegistryObject<Item> DUSTYPORTALSPAWN = block(KaczkaModBlocks.DUSTYPORTALSPAWN);
	public static final RegistryObject<Item> AETHERPORTALSPAWN = block(KaczkaModBlocks.AETHERPORTALSPAWN);
	public static final RegistryObject<Item> DUSTYAETHERPORTALPAWN = block(KaczkaModBlocks.DUSTYAETHERPORTALPAWN);
	public static final RegistryObject<Item> GLOWINGOBSIDIAN = block(KaczkaModBlocks.GLOWINGOBSIDIAN);
	public static final RegistryObject<Item> NETHERREACTOR = block(KaczkaModBlocks.NETHERREACTOR);
	public static final RegistryObject<Item> NETHERREACTORSPAWNER = block(KaczkaModBlocks.NETHERREACTORSPAWNER);
	public static final RegistryObject<Item> ENDERITEORE = block(KaczkaModBlocks.ENDERITEORE);
	public static final RegistryObject<Item> ENDERITESHARD = REGISTRY.register("enderiteshard", () -> new EnderiteshardItem());
	public static final RegistryObject<Item> PRELUDE = REGISTRY.register("prelude", () -> new PreludeItem());
	public static final RegistryObject<Item> PRELUDE_BLUE = REGISTRY.register("prelude_blue", () -> new PreludeBlueItem());
	public static final RegistryObject<Item> TSAVORITE = block(KaczkaModBlocks.TSAVORITE);
	public static final RegistryObject<Item> JADEITECHISEL = REGISTRY.register("jadeitechisel", () -> new JadeitechiselItem());
	public static final RegistryObject<Item> JADEITEGEM = REGISTRY.register("jadeitegem", () -> new JadeitegemItem());
	public static final RegistryObject<Item> JADEITEGEMBLOCK = block(KaczkaModBlocks.JADEITEGEMBLOCK);
	public static final RegistryObject<Item> JADEITEGEMORE = block(KaczkaModBlocks.JADEITEGEMORE);
	public static final RegistryObject<Item> VOID_MESSENGER = REGISTRY.register("void_messenger", () -> new VoidMessengerItem());
	public static final RegistryObject<Item> POWERTOKEN = REGISTRY.register("powertoken", () -> new PowertokenItem());
	public static final RegistryObject<Item> NITROGEN_BUCKET = REGISTRY.register("nitrogen_bucket", () -> new NitrogenItem());
	public static final RegistryObject<Item> FIREWORKS = REGISTRY.register("fireworks", () -> new FireworksItem());
	public static final RegistryObject<Item> CESIUMAMPULE = REGISTRY.register("cesiumampule", () -> new CesiumampuleItem());
	public static final RegistryObject<Item> HEAT_TRANSMISSION = REGISTRY.register("heat_transmission", () -> new HeatTransmissionItem());
	public static final RegistryObject<Item> PRELUDE_MAN_SPAWN_EGG = REGISTRY.register("prelude_man_spawn_egg", () -> new ForgeSpawnEggItem(KaczkaModEntities.PRELUDE_MAN, -16777012, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
