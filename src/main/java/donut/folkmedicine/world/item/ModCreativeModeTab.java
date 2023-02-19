package donut.folkmedicine.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab FOLK_MEDICINE = new CreativeModeTab("folkmedicine") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.OAK_SAPLING);
        }
    };

    public static final CreativeModeTab FOLK_MEDICINE_MISC = new CreativeModeTab("folkmedicinemisc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.OAK_SAPLING);
        }
    };
}
