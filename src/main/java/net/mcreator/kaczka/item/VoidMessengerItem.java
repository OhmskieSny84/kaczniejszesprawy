
package net.mcreator.kaczka.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.kaczka.procedures.VoidMessengerLivingEntityIsHitWithItemProcedure;

import java.util.List;

public class VoidMessengerItem extends Item {
	public VoidMessengerItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("One-time use:"));
		list.add(Component.literal("deal 5 VOID damage to enemy on hit"));
		list.add(Component.literal("give one POWERTOKEN to user."));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		VoidMessengerLivingEntityIsHitWithItemProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}
}
