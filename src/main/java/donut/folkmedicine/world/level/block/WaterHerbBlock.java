package donut.folkmedicine.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SeagrassBlock;
import net.minecraft.world.level.block.TallSeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class WaterHerbBlock extends SeagrassBlock {
    public WaterHerbBlock(Properties p_154496_) {
        super(p_154496_);
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos blockPos, BlockState blockState) {
        BlockState blockstate = ModBlocks.TALL_SWEETFLAG.get().defaultBlockState();
        BlockState blockstate1 = blockstate.setValue(TallSeagrassBlock.HALF, DoubleBlockHalf.UPPER);
        BlockPos blockPos1 = blockPos.above();
        if (world.getBlockState(blockPos1).equals(Blocks.AIR)) {
            world.setBlock(blockPos, blockstate, 2);
            world.setBlock(blockPos1, blockstate1, 2);
        }
    }
}
