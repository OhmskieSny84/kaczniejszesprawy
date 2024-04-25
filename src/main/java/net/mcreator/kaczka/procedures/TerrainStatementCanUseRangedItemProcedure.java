package net.mcreator.kaczka.procedures;

import net.minecraft.world.item.ItemStack;

public class TerrainStatementCanUseRangedItemProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("charge") >= 3;
	}
}
