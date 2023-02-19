package donut.folkmedicine.world.level.block.state.properties;

import donut.folkmedicine.FolkMedicine;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Set;

public class ModWoodType {
    public static final Set<WoodType> VALUES = new ObjectArraySet<>();
    public static final WoodType LINDEN = register(WoodType.create(new ResourceLocation(FolkMedicine.MOD_ID, "linden").toString()));
    public static final WoodType JUNIPER = register(WoodType.create(new ResourceLocation(FolkMedicine.MOD_ID, "juniper").toString()));
    public static final WoodType SANDALWOOD = register(WoodType.create(new ResourceLocation(FolkMedicine.MOD_ID, "sandalwood").toString()));

    private static WoodType register(WoodType woodType)
    {
        VALUES.add(woodType);
        WoodType.register(woodType);
        return woodType;
    }
}
