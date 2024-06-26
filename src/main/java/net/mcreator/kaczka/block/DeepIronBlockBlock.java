
package net.mcreator.kaczka.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DeepIronBlockBlock extends Block {
	public DeepIronBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(5.5f, 7f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
