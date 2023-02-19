package donut.folkmedicine.world.level.block;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.world.item.ModCreativeModeTab;
import donut.folkmedicine.world.item.ModItems;
import donut.folkmedicine.world.level.block.grower.JuniperTreeGrower;
import donut.folkmedicine.world.level.block.grower.LindenTreeGrower;
import donut.folkmedicine.world.level.block.grower.SandalwoodTreeGrower;
import donut.folkmedicine.world.level.block.state.properties.ModWoodType;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FolkMedicine.MOD_ID);

    public static final RegistryObject<Block> CHAMOMILE = BLOCKS.register("chamomile", () -> new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS), () -> ModItems.chamomile_petals.get(), () -> ModItems.chamomile_seeds.get()));
    public static final RegistryObject<Block> NETTLE = BLOCKS.register("nettle", () -> new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS), () -> ModItems.nettle_leaves.get(), () -> ModItems.nettle_seeds.get()));
    public static final RegistryObject<Block> RIBLEAF = BLOCKS.register("ribleaf", () -> new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS), () -> ModItems.ribleaf_leaves.get(), () -> ModItems.ribleaf_seeds.get()));
    public static final RegistryObject<Block> SAGE = BLOCKS.register("sage", () -> new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS), () -> ModItems.sage_leaves.get(), () -> ModItems.sage_seeds.get()));
    public static final RegistryObject<Block> YARROW = BLOCKS.register("yarrow", () -> new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS), () -> ModItems.yarrow_petals.get(), () -> ModItems.yarrow_seeds.get()));
    public static final RegistryObject<Block> SWEETFLAG = BLOCKS.register("sweetflag", () -> new WaterHerbBlock(Block.Properties.of(Material.REPLACEABLE_WATER_PLANT).noCollission().sound(SoundType.WET_GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> TALL_SWEETFLAG = BLOCKS.register("tall_sweetflag", () -> new TallWaterHerbBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_WATER_PLANT).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> IVY = BLOCKS.register("ivy", () -> new VineHerbBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().randomTicks().destroyTime(0.2F).sound(SoundType.VINE)));

    //trees' stuff
    public static final RegistryObject<Block> LINDEN_SAPLING = BLOCKS.register("linden_sapling", () -> new SaplingBlock(new LindenTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> JUNIPER_SAPLING = BLOCKS.register("juniper_sapling", () -> new SaplingBlock(new JuniperTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SANDALWOOD_SAPLING = BLOCKS.register("sandalwood_sapling", () -> new SaplingBlock(new SandalwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> LINDEN_LEAVES = BLOCKS.register("linden_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> JUNIPER_LEAVES = BLOCKS.register("juniper_leaves", () ->  new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SANDALWOOD_LEAVES = BLOCKS.register("sandalwood_leaves", () ->  new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LINDEN_LOG = BLOCKS.register("linden_log", () -> modlog(MaterialColor.COLOR_BROWN, MaterialColor.COLOR_BROWN));
    public static final RegistryObject<Block> JUNIPER_LOG = BLOCKS.register("juniper_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SANDALWOOD_LOG = BLOCKS.register("sandalwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_LINDEN_LOG = BLOCKS.register("stripped_linden_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_JUNIPER_LOG = BLOCKS.register("stripped_juniper_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SANDALWOOD_LOG = BLOCKS.register("stripped_sandalwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> LINDEN_PLANKS = BLOCKS.register("linden_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> JUNIPER_PLANKS = BLOCKS.register("juniper_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SANDALWOOD_PLANKS = BLOCKS.register("sandalwood_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> LINDEN_WOOD = BLOCKS.register("linden_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> JUNIPER_WOOD = BLOCKS.register("juniper_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> SANDALWOOD_WOOD = BLOCKS.register("sandalwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_LINDEN_WOOD = BLOCKS.register("stripped_linden_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_JUNIPER_WOOD = BLOCKS.register("stripped_juniper_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SANDALWOOD_WOOD = BLOCKS.register("stripped_sandalwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> LINDEN_SLAB = BLOCKS.register("linden_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> JUNIPER_SLAB = BLOCKS.register("juniper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SANDALWOOD_SLAB = BLOCKS.register("sandalwood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> LINDEN_PRESSURE_PLATE = BLOCKS.register("linden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> JUNIPER_PRESSURE_PLATE = BLOCKS.register("juniper_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> SANDALWOOD_PRESSURE_PLATE = BLOCKS.register("sandalwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LINDEN_FENCE = BLOCKS.register("linden_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> JUNIPER_FENCE = BLOCKS.register("juniper_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SANDALWOOD_FENCE = BLOCKS.register("sandalwood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> LINDEN_TRAPDOOR = BLOCKS.register("linden_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> JUNIPER_TRAPDOOR = BLOCKS.register("juniper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> SANDALWOOD_TRAPDOOR = BLOCKS.register("sandalwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> LINDEN_FENCE_GATE = BLOCKS.register("linden_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> JUNIPER_FENCE_GATE = BLOCKS.register("juniper_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> SANDALWOOD_FENCE_GATE = BLOCKS.register("sandalwood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));

    public static final RegistryObject<Block> LINDEN_STAIRS = BLOCKS.register("linden_stairs", () -> new StairBlock(Blocks.OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> JUNIPER_STAIRS = BLOCKS.register("juniper_stairs", () -> new StairBlock(Blocks.OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SANDALWOOD_STAIRS = BLOCKS.register("sandalwood_stairs", () -> new StairBlock(Blocks.OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> LINDEN_BUTTON = BLOCKS.register("linden_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> JUNIPER_BUTTON = BLOCKS.register("juniper_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> SANDALWOOD_BUTTON = BLOCKS.register("sandalwood_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)));

    public static final RegistryObject<Block> LINDEN_DOOR = BLOCKS.register("linden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> JUNIPER_DOOR = BLOCKS.register("juniper_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> SANDALWOOD_DOOR = BLOCKS.register("sandalwood_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> LINDEN_SIGN = BLOCKS.register("linden_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodType.LINDEN));
    public static final RegistryObject<Block> JUNIPER_SIGN = BLOCKS.register("juniper_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodType.JUNIPER));
    public static final RegistryObject<Block> SANDALWOOD_SIGN = BLOCKS.register("sandalwood_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodType.SANDALWOOD));

    public static final RegistryObject<Block> LINDEN_WALL_SIGN = BLOCKS.register("linden_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodType.LINDEN));
    public static final RegistryObject<Block> JUNIPER_WALL_SIGN = BLOCKS.register("juniper_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodType.JUNIPER));
    public static final RegistryObject<Block> SANDALWOOD_WALL_SIGN = BLOCKS.register("sandalwood_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodType.SANDALWOOD));

    private static RotatedPillarBlock modlog(MaterialColor p_50789_, MaterialColor p_50790_) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? p_50789_ : p_50790_;
        }).strength(2.0F).sound(SoundType.WOOD));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
