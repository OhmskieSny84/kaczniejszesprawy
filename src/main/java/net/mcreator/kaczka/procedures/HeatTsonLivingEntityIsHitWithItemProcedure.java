package net.mcreator.kaczka.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.kaczka.init.KaczkaModItems;

public class HeatTsonLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.getRemainingFireTicks() > 1) {
			entity.setSecondsOnFire(5);
			sourceentity.clearFire();
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(KaczkaModItems.POWERTOKEN.get()).copy();
				_setstack.setCount(5);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(KaczkaModItems.HEAT_TRANSMISSION.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
