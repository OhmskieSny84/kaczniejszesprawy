package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.init.KaczkaModBlocks;

public class GlowingobsidianUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(BlockPos.containing(x, y - 1, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(BlockPos.containing(x, y + 1, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(BlockPos.containing(x + 1, y, z)) && !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(BlockPos.containing(x + 1, y, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(BlockPos.containing(x - 1, y, z)) && !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(BlockPos.containing(x - 1, y, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(BlockPos.containing(x, y, z - 1)) && !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(BlockPos.containing(x, y, z - 1), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(BlockPos.containing(x, y, z + 1)) && !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(BlockPos.containing(x, y, z + 1), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
	}
}
