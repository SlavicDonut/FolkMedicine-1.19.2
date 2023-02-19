package donut.folkmedicine.init;

import com.google.common.collect.Maps;
import donut.folkmedicine.world.level.block.ModBlocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class ModVanillaCompatibility {

    public static void init() {
        registerFlammable(ModBlocks.LINDEN_LOG.get(), 20, 5);
        registerFlammable(ModBlocks.JUNIPER_LOG.get(), 20, 5);
        registerFlammable(ModBlocks.SANDALWOOD_LOG.get(), 20, 5);

        registerFlammable(ModBlocks.LINDEN_WOOD.get(), 20, 5);
        registerFlammable(ModBlocks.JUNIPER_WOOD.get(), 20, 5);
        registerFlammable(ModBlocks.SANDALWOOD_WOOD.get(), 20, 5);

        registerFlammable(ModBlocks.STRIPPED_LINDEN_LOG.get(), 20, 5);
        registerFlammable(ModBlocks.STRIPPED_JUNIPER_LOG.get(), 20, 5);
        registerFlammable(ModBlocks.STRIPPED_SANDALWOOD_LOG.get(), 20, 5);

        registerFlammable(ModBlocks.STRIPPED_LINDEN_WOOD.get(), 20, 5);
        registerFlammable(ModBlocks.STRIPPED_JUNIPER_WOOD.get(), 20, 5);
        registerFlammable(ModBlocks.STRIPPED_SANDALWOOD_WOOD.get(), 20, 5);

        registerFlammable(ModBlocks.LINDEN_LEAVES.get(), 20, 5);
        registerFlammable(ModBlocks.JUNIPER_LEAVES.get(), 20, 5);
        registerFlammable(ModBlocks.SANDALWOOD_LEAVES.get(), 20, 5);

        registerFlammable(ModBlocks.LINDEN_PLANKS.get(), 20, 5);
        registerFlammable(ModBlocks.JUNIPER_PLANKS.get(), 20, 5);
        registerFlammable(ModBlocks.SANDALWOOD_PLANKS.get(), 20, 5);

        registerStrippable(ModBlocks.LINDEN_LOG.get(), ModBlocks.STRIPPED_LINDEN_LOG.get());
        registerStrippable(ModBlocks.JUNIPER_LOG.get(), ModBlocks.STRIPPED_JUNIPER_LOG.get());
        registerStrippable(ModBlocks.SANDALWOOD_LOG.get(), ModBlocks.STRIPPED_SANDALWOOD_LOG.get());

        registerStrippable(ModBlocks.LINDEN_WOOD.get(), ModBlocks.STRIPPED_LINDEN_WOOD.get());
        registerStrippable(ModBlocks.JUNIPER_WOOD.get(), ModBlocks.STRIPPED_JUNIPER_WOOD.get());
        registerStrippable(ModBlocks.SANDALWOOD_WOOD.get(), ModBlocks.STRIPPED_SANDALWOOD_WOOD.get());
    }

    public static void registerStrippable(Block log, Block stripped_log) {
        AxeItem.STRIPPABLES = Maps.newHashMap(AxeItem.STRIPPABLES);
        AxeItem.STRIPPABLES.put(log, stripped_log);
    }

    public static void registerFlammable(Block blockIn, int encouragement, int flammability)
    {
        FireBlock fireblock = (FireBlock) Blocks.FIRE;
        fireblock.setFlammable(blockIn, encouragement, flammability);
    }
}
