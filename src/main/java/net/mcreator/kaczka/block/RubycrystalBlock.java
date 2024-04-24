
package net.mcreator.kaczka.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class RubycrystalBlock extends Block {
	public RubycrystalBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AMETHYST).strength(3f, 4f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
