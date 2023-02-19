package donut.folkmedicine.world.level.feature;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.world.level.block.ModBlocks;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, FolkMedicine.MOD_ID);

    public static final RegistryObject<PlacedFeature> LINDEN_CHECKED = PLACED_FEATURES.register("linden_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.LINDEN.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.LINDEN_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> LINDEN_PLACED = PLACED_FEATURES.register("linden_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LINDEN_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
