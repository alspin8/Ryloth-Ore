package fr.alspin.rylothore.world.feature;

import com.google.common.base.Suppliers;
import fr.alspin.rylothore.RylothOre;
import fr.alspin.rylothore.block.RylothBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class RylothConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, RylothOre.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ALUMINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.ALUMINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_ALUMINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_ALUMINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_ALUMINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_ALUMINUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_ORE = CONFIGURED_FEATURE.register("aluminum_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINUM_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_ALUMINUM_ORE = CONFIGURED_FEATURE.register("end_aluminum_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_ALUMINUM_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_ALUMINUM_ORE = CONFIGURED_FEATURE.register("nether_aluminum_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_ALUMINUM_ORES.get(), 9)));

    
    
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LEAD_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.LEAD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_LEAD_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_LEAD_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_LEAD_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_LEAD_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE = CONFIGURED_FEATURE.register("lead_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_LEAD_ORE = CONFIGURED_FEATURE.register("end_lead_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_LEAD_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_LEAD_ORE = CONFIGURED_FEATURE.register("nether_lead_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_LEAD_ORES.get(), 9)));

    

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_NICKEL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.NICKEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_NICKEL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_NICKEL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_NICKEL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_NICKEL_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE = CONFIGURED_FEATURE.register("nickel_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_NICKEL_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_NICKEL_ORE = CONFIGURED_FEATURE.register("end_nickel_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_NICKEL_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_NICKEL_ORE = CONFIGURED_FEATURE.register("nether_nickel_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_NICKEL_ORES.get(), 9)));

    
    
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PLATINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.PLATINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_PLATINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_PLATINUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_PLATINUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_PLATINUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE = CONFIGURED_FEATURE.register("platinum_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PLATINUM_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_PLATINUM_ORE = CONFIGURED_FEATURE.register("end_platinum_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_PLATINUM_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_PLATINUM_ORE = CONFIGURED_FEATURE.register("nether_platinum_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_PLATINUM_ORES.get(), 9)));



    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_SILVER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE = CONFIGURED_FEATURE.register("silver_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_SILVER_ORE = CONFIGURED_FEATURE.register("end_silver_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_SILVER_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_SILVER_ORE = CONFIGURED_FEATURE.register("nether_silver_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_SILVER_ORES.get(), 9)));



    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_TIN_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE = CONFIGURED_FEATURE.register("tin_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_TIN_ORE = CONFIGURED_FEATURE.register("end_tin_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_TIN_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_TIN_ORE = CONFIGURED_FEATURE.register("nether_tin_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_TIN_ORES.get(), 9)));



    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ZINC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.ZINC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_ZINC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), RylothBlocks.ENDSTONE_ZINC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_ZINC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, RylothBlocks.NETHERRACK_ZINC_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE = CONFIGURED_FEATURE.register("zinc_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ZINC_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_ZINC_ORE = CONFIGURED_FEATURE.register("end_zinc_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ENDSTONE_ZINC_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_ZINC_ORE = CONFIGURED_FEATURE.register("nether_zinc_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_ZINC_ORES.get(), 9)));



    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE = CONFIGURED_FEATURE.register("ruby_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 7)));
    


    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SAPPHIRE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE = CONFIGURED_FEATURE.register("sapphire_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(), 7)));



    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PERIDOT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, RylothBlocks.PERIDOT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, RylothBlocks.DEEPSLATE_PERIDOT_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OVERWORLD_PERIDOT_ORE = CONFIGURED_FEATURE.register("peridot_ore_configured",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PERIDOT_ORES.get(), 7)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURE.register(eventBus);
    }
}
