
package net.mcreator.kaczka.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CavestoneBlock extends Block {
	public CavestoneBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(2f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}