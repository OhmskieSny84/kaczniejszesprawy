package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TerrainStatementIIPropertyValueProviderProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
			if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR) {
				if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR) {
					return 1;
				}
			}
		}
		return 0;
	}
}
