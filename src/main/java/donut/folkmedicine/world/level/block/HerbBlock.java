package donut.folkmedicine.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

public class HerbBlock extends SweetBerryBushBlock {
    
    private Supplier<Item> drop;
    private Supplier<Item> dropSeed;


    public HerbBlock(Properties properties, Supplier<Item> drop, Supplier<Item> dropSeed) {
        super(properties);
        this.drop = drop;
        this.dropSeed = dropSeed;
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos pos, BlockState state) {
        return new ItemStack(drop.get());
    }

    @Override
    public InteractionResult use(BlockState blockState, Level world, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        int i = blockState.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && player.getItemInHand(hand).getItem() == Items.BONE_MEAL) {
            return InteractionResult.PASS;
        }
        else if (i > 1) {
            int j = 1 + world.random.nextInt(2);
            popResource(world, blockPos, new ItemStack(drop.get(), j + (flag ? 1 : 0)));
            if (flag) {
                popResource(world, blockPos, new ItemStack(dropSeed.get(), world.random.nextInt(2)));
            }
            world.playSound((Player)null, blockPos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState1 = blockState.setValue(AGE, Integer.valueOf(1));
            world.setBlock(blockPos, blockState1, 2);
            world.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(player, blockState1));
            return InteractionResult.sidedSuccess(world.isClientSide);
        }
        else {
            return super.use(blockState, world, blockPos, player, hand, blockHitResult);
        }
    }
}
