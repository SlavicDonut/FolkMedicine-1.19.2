package donut.folkmedicine.world.level.block;

import net.minecraft.world.level.block.TallSeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class TallWaterHerbBlock extends TallSeagrassBlock {
    public TallWaterHerbBlock(Properties p_154745_) {
        super(p_154745_);
    }

    @Override
    public FluidState getFluidState(BlockState blockState) {
        if (blockState.getValue(HALF) == DoubleBlockHalf.UPPER) {
            return Fluids.EMPTY.defaultFluidState();
        }
        else {
            return Fluids.WATER.getSource(false);
        }
    }
}
