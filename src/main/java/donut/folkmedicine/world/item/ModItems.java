package donut.folkmedicine.world.item;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.world.level.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FolkMedicine.MOD_ID);

    public static RegistryObject<Item> linden_sapling = ITEMS.register("linden_sapling", () -> new BlockItem(ModBlocks.LINDEN_SAPLING.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_sapling = ITEMS.register("juniper_sapling", () -> new BlockItem(ModBlocks.JUNIPER_SAPLING.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_sapling = ITEMS.register("sandalwood_sapling", () -> new BlockItem(ModBlocks.SANDALWOOD_SAPLING.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_leaves = ITEMS.register("linden_leaves", () -> new BlockItem(ModBlocks.LINDEN_LEAVES.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_leaves = ITEMS.register("juniper_leaves", () -> new BlockItem(ModBlocks.JUNIPER_LEAVES.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_leaves = ITEMS.register("sandalwood_leaves", () -> new BlockItem(ModBlocks.SANDALWOOD_LEAVES.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_log = ITEMS.register("linden_log", () -> new BlockItem(ModBlocks.LINDEN_LOG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_log = ITEMS.register("juniper_log", () -> new BlockItem(ModBlocks.JUNIPER_LOG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_log = ITEMS.register("sandalwood_log", () -> new BlockItem(ModBlocks.SANDALWOOD_LOG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> stripped_linden_log = ITEMS.register("stripped_linden_log", () -> new BlockItem(ModBlocks.STRIPPED_LINDEN_LOG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> stripped_juniper_log = ITEMS.register("stripped_juniper_log", () -> new BlockItem(ModBlocks.STRIPPED_JUNIPER_LOG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> stripped_sandalwood_log = ITEMS.register("stripped_sandalwood_log", () -> new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_planks = ITEMS.register("linden_planks", () -> new BlockItem(ModBlocks.LINDEN_PLANKS.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_planks = ITEMS.register("juniper_planks", () -> new BlockItem(ModBlocks.JUNIPER_PLANKS.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_planks = ITEMS.register("sandalwood_planks", () -> new BlockItem(ModBlocks.SANDALWOOD_PLANKS.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_wood = ITEMS.register("linden_wood", () -> new BlockItem(ModBlocks.LINDEN_WOOD.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_wood = ITEMS.register("juniper_wood", () -> new BlockItem(ModBlocks.JUNIPER_WOOD.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_wood = ITEMS.register("sandalwood_wood", () -> new BlockItem(ModBlocks.SANDALWOOD_WOOD.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> stripped_linden_wood = ITEMS.register("stripped_linden_wood", () -> new BlockItem(ModBlocks.STRIPPED_LINDEN_WOOD.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> stripped_juniper_wood = ITEMS.register("stripped_juniper_wood", () -> new BlockItem(ModBlocks.STRIPPED_JUNIPER_WOOD.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> stripped_sandalwood_wood = ITEMS.register("stripped_sandalwood_wood", () -> new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_WOOD.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_slab = ITEMS.register("linden_slab", () -> new BlockItem(ModBlocks.LINDEN_SLAB.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_slab = ITEMS.register("juniper_slab", () -> new BlockItem(ModBlocks.JUNIPER_SLAB.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_slab = ITEMS.register("sandalwood_slab", () -> new BlockItem(ModBlocks.SANDALWOOD_SLAB.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_pressure_plate = ITEMS.register("linden_pressure_plate", () -> new BlockItem(ModBlocks.LINDEN_PRESSURE_PLATE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_pressure_plate = ITEMS.register("juniper_pressure_plate", () -> new BlockItem(ModBlocks.JUNIPER_PRESSURE_PLATE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_pressure_plate = ITEMS.register("sandalwood_pressure_plate", () -> new BlockItem(ModBlocks.SANDALWOOD_PRESSURE_PLATE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_fence = ITEMS.register("linden_fence", () -> new BlockItem(ModBlocks.LINDEN_FENCE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_fence = ITEMS.register("juniper_fence", () -> new BlockItem(ModBlocks.JUNIPER_FENCE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_fence = ITEMS.register("sandalwood_fence", () -> new BlockItem(ModBlocks.SANDALWOOD_FENCE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_trapdoor = ITEMS.register("linden_trapdoor", () -> new BlockItem(ModBlocks.LINDEN_TRAPDOOR.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_trapdoor = ITEMS.register("juniper_trapdoor", () -> new BlockItem(ModBlocks.JUNIPER_TRAPDOOR.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_trapdoor = ITEMS.register("sandalwood_trapdoor", () -> new BlockItem(ModBlocks.SANDALWOOD_TRAPDOOR.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_fence_gate = ITEMS.register("linden_fence_gate", () -> new BlockItem(ModBlocks.LINDEN_FENCE_GATE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_fence_gate = ITEMS.register("juniper_fence_gate", () -> new BlockItem(ModBlocks.JUNIPER_FENCE_GATE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_fence_gate = ITEMS.register("sandalwood_fence_gate", () -> new BlockItem(ModBlocks.SANDALWOOD_FENCE_GATE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_stairs = ITEMS.register("linden_stairs", () -> new BlockItem(ModBlocks.LINDEN_STAIRS.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_stairs = ITEMS.register("juniper_stairs", () -> new BlockItem(ModBlocks.JUNIPER_STAIRS.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_stairs = ITEMS.register("sandalwood_stairs", () -> new BlockItem(ModBlocks.SANDALWOOD_STAIRS.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_button = ITEMS.register("linden_button", () -> new BlockItem(ModBlocks.LINDEN_BUTTON.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_button = ITEMS.register("juniper_button", () -> new BlockItem(ModBlocks.JUNIPER_BUTTON.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_button = ITEMS.register("sandalwood_button", () -> new BlockItem(ModBlocks.SANDALWOOD_BUTTON.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_door = ITEMS.register("linden_door", () -> new BlockItem(ModBlocks.LINDEN_DOOR.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_door = ITEMS.register("juniper_door", () -> new BlockItem(ModBlocks.JUNIPER_DOOR.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_door = ITEMS.register("sandalwood_door", () -> new BlockItem(ModBlocks.SANDALWOOD_DOOR.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_sign = ITEMS.register("linden_sign", () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE), ModBlocks.LINDEN_SIGN.get(), ModBlocks.LINDEN_WALL_SIGN.get()));
    public static RegistryObject<Item> juniper_sign = ITEMS.register("juniper_sign", () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE), ModBlocks.JUNIPER_SIGN.get(), ModBlocks.JUNIPER_WALL_SIGN.get()));
    public static RegistryObject<Item> sandalwood_sign = ITEMS.register("sandalwood_sign", () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE), ModBlocks.SANDALWOOD_SIGN.get(), ModBlocks.SANDALWOOD_WALL_SIGN.get()));

    //ingredients
    public static RegistryObject<Item> chamomile_petals = ITEMS.register("chamomile_petals", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> nettle_leaves = ITEMS.register("nettle_leaves", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> ribleaf_leaves = ITEMS.register("ribleaf_leaves", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sage_leaves = ITEMS.register("sage_leaves", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> yarrow_petals = ITEMS.register("yarrow_petals", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sweetflag_rhizomes = ITEMS.register("sweetflag_rhizomes", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> ivy_leaves = ITEMS.register("ivy_leaves", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    public static RegistryObject<Item> linden_petals = ITEMS.register("linden_petals", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> juniper_berries = ITEMS.register("juniper_berries", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sandalwood_resin = ITEMS.register("sandalwood_resin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));

    //seeds
    public static RegistryObject<Item> chamomile_seeds = ITEMS.register("chamomile_seeds", () -> new ItemNameBlockItem(ModBlocks.CHAMOMILE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> nettle_seeds = ITEMS.register("nettle_seeds", () -> new ItemNameBlockItem(ModBlocks.NETTLE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> ribleaf_seeds = ITEMS.register("ribleaf_seeds", () -> new ItemNameBlockItem(ModBlocks.RIBLEAF.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sage_seeds = ITEMS.register("sage_seeds", () -> new ItemNameBlockItem(ModBlocks.SAGE.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> yarrow_seeds = ITEMS.register("yarrow_seeds", () -> new ItemNameBlockItem(ModBlocks.YARROW.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> sweetflag_seeds = ITEMS.register("sweetflag_seeds", () -> new ItemNameBlockItem(ModBlocks.SWEETFLAG.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));
    public static RegistryObject<Item> ivy_seeds = ITEMS.register("ivy_seeds", () -> new ItemNameBlockItem(ModBlocks.IVY.get(), new Item.Properties().tab(ModCreativeModeTab.FOLK_MEDICINE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
