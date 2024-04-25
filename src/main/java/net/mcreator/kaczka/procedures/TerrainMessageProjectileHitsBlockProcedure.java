package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.KaczkaMod;

public class TerrainMessageProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double iterator = 0;
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() instanceof LiquidBlock)) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
				iterator = 0;
				for (int index0 = 0; index0 < 3; index0++) {
					iterator = iterator + 1;
					world.setBlock(BlockPos.containing(x + iterator, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - iterator, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z - iterator), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z + iterator), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
				}
			}
		}
		KaczkaMod.LOGGER.info("do gazu");
	}
}
