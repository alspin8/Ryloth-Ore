package fr.alspin.rylothore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CreativeTab {
    public static final CreativeModeTab RYLOTHORE_TAB = new CreativeModeTab("rylothore_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(RylothItems.RAW_ALUMINIUM.get());
        }
    };
}
