package donut.folkmedicine.world.level.block.entity;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.world.level.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FolkMedicine.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN =
            BLOCK_ENTITY_TYPES.register("sign",
                    () -> BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.LINDEN_SIGN.get(),
                            ModBlocks.LINDEN_WALL_SIGN.get(),
                            ModBlocks.JUNIPER_SIGN.get(),
                            ModBlocks.JUNIPER_WALL_SIGN.get(),
                            ModBlocks.SANDALWOOD_SIGN.get(),
                            ModBlocks.SANDALWOOD_WALL_SIGN.get())
                            .build(null));
}
