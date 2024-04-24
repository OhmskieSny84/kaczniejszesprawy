
package net.mcreator.kaczka.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.kaczka.init.KaczkaModItems;
import net.mcreator.kaczka.init.KaczkaModFluids;
import net.mcreator.kaczka.init.KaczkaModFluidTypes;
import net.mcreator.kaczka.init.KaczkaModBlocks;

public abstract class NitrogenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> KaczkaModFluidTypes.NITROGEN_TYPE.get(), () -> KaczkaModFluids.NITROGEN.get(), () -> KaczkaModFluids.FLOWING_NITROGEN.get())
			.explosionResistance(100f).bucket(() -> KaczkaModItems.NITROGEN_BUCKET.get()).block(() -> (LiquidBlock) KaczkaModBlocks.NITROGEN.get());

	private NitrogenFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SNOWFLAKE;
	}

	public static class Source extends NitrogenFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NitrogenFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
