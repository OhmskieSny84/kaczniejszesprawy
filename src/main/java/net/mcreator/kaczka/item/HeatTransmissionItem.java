
package net.mcreator.kaczka.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.kaczka.procedures.HeatTsonLivingEntityIsHitWithItemProcedure;

import java.util.List;

public class HeatTransmissionItem extends Item {
	public HeatTransmissionItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("One-time use:"));
		list.add(Component.literal("If user is on fire:"));
		list.add(Component.literal("On hit extinguish user,"));
		list.add(Component.literal("Set enemy on fire for 5s,"));
		list.add(Component.literal("Give 2 POWERTOKENS to user."));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		HeatTsonLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
		return retval;
	}
}
