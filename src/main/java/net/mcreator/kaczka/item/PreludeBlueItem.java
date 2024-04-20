
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.kaczka.procedures.PreludeBlueSwitchStateProcedure;

public class PreludeBlueItem extends Item {
	public PreludeBlueItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PreludeBlueSwitchStateProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}
}
