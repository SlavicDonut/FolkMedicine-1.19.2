package donut.folkmedicine.world.level.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModSignBlockEntity extends SignBlockEntity {

    public ModSignBlockEntity(BlockPos p_155700_, BlockState p_155701_) {
        super(p_155700_, p_155701_);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntity.SIGN.get();
    }
}
