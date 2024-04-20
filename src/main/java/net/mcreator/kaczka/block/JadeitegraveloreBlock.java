
package net.mcreator.kaczka.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.procedures.JadeitegraveloreUpdateTickProcedure;

public class JadeitegraveloreBlock extends FallingBlock {
	public JadeitegraveloreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.6f, 1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		JadeitegraveloreUpdateTickProcedure.execute(world, x, y, z);
	}
}
