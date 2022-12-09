package fr.alspin.rylothore;

import com.mojang.logging.LogUtils;
import fr.alspin.rylothore.block.RylothBlocks;
import fr.alspin.rylothore.item.RylothItems;
import fr.alspin.rylothore.world.feature.RylothConfiguredFeatures;
import fr.alspin.rylothore.world.feature.RylothPlacedFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RylothOre.MOD_ID)
public class RylothOre {
    public static final String MOD_ID = "rylothore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RylothOre() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        RylothItems.register(bus);
        RylothBlocks.register(bus);
        RylothConfiguredFeatures.register(bus);
        RylothPlacedFeatures.register(bus);

        bus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
