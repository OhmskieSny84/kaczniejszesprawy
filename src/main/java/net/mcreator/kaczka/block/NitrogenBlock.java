
package net.mcreator.kaczka.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.procedures.NitrogenMobplayerCollidesBlockProcedure;
import net.mcreator.kaczka.init.KaczkaModFluids;

public class NitrogenBlock extends LiquidBlock {
	public NitrogenBlock() {
		super(() -> KaczkaModFluids.NITROGEN.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		NitrogenMobplayerCollidesBlockProcedure.execute(world, entity);
	}
}
