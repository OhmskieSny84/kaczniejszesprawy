package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class TerrainStatementPropertyValueProviderProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double charge = 0;
		charge = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
			charge = charge + 1;
			if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR) {
				charge = charge + 1;
				if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR) {
					charge = charge + 1;
				}
			}
		}
		itemstack.getOrCreateTag().putDouble("charge", charge);
		return charge;
	}
}
