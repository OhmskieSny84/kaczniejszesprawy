package net.mcreator.kaczka.procedures;

import net.minecraft.world.entity.Entity;

public class TheSunBurnsUserProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(1);
	}
}
