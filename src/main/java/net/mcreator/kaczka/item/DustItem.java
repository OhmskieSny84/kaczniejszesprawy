
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DustItem extends Item {
	public DustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
