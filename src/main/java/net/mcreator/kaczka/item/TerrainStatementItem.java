
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TerrainStatementItem extends Item {
	public TerrainStatementItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
