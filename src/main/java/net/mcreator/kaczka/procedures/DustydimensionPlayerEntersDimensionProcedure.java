package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.kaczka.init.KaczkaModParticleTypes;

public class DustydimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 20, 25); index0++) {
			world.addParticle((SimpleParticleType) (KaczkaModParticleTypes.DUSTPARTICLE.get()), x, y, z, 0, 1, 0);
		}
	}
}
