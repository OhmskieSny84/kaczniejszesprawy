package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

public class TheSunBurnsEnemyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.NONE);
	}
}
