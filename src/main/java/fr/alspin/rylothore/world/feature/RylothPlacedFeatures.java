package fr.alspin.rylothore.world.feature;

import fr.alspin.rylothore.RylothOre;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class RylothPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, RylothOre.MOD_ID);

    public static final RegistryObject<PlacedFeature> OVERWORLD_ALUMINUM_ORE_PLACED = PLACED_FEATURE.register("overworld_aluminum_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_ALUMINUM_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_ALUMINUM_ORE_PLACED = PLACED_FEATURE.register("endstone_aluminum_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_ALUMINUM_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_ALUMINUM_ORE_PLACED = PLACED_FEATURE.register("netherrack_aluminum_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_ALUMINUM_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_LEAD_ORE_PLACED = PLACED_FEATURE.register("overworld_lead_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_LEAD_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_LEAD_ORE_PLACED = PLACED_FEATURE.register("endstone_lead_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_LEAD_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_LEAD_ORE_PLACED = PLACED_FEATURE.register("netherrack_lead_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_LEAD_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_NICKEL_ORE_PLACED = PLACED_FEATURE.register("overworld_nickel_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_NICKEL_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_NICKEL_ORE_PLACED = PLACED_FEATURE.register("endstone_nickel_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_NICKEL_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_NICKEL_ORE_PLACED = PLACED_FEATURE.register("netherrack_nickel_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_NICKEL_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    


    public static final RegistryObject<PlacedFeature> OVERWORLD_PLATINUM_ORE_PLACED = PLACED_FEATURE.register("overworld_platinum_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_PLATINUM_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_PLATINUM_ORE_PLACED = PLACED_FEATURE.register("endstone_platinum_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_PLATINUM_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_PLATINUM_ORE_PLACED = PLACED_FEATURE.register("netherrack_platinum_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_PLATINUM_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_SILVER_ORE_PLACED = PLACED_FEATURE.register("overworld_silver_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_SILVER_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_SILVER_ORE_PLACED = PLACED_FEATURE.register("endstone_silver_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_SILVER_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_SILVER_ORE_PLACED = PLACED_FEATURE.register("netherrack_silver_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_SILVER_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_TIN_ORE_PLACED = PLACED_FEATURE.register("overworld_tin_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_TIN_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_TIN_ORE_PLACED = PLACED_FEATURE.register("endstone_tin_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_TIN_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_TIN_ORE_PLACED = PLACED_FEATURE.register("netherrack_tin_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_TIN_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_ZINC_ORE_PLACED = PLACED_FEATURE.register("overworld_zinc_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_ZINC_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_ZINC_ORE_PLACED = PLACED_FEATURE.register("endstone_zinc_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.ENDSTONE_ZINC_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_ZINC_ORE_PLACED = PLACED_FEATURE.register("netherrack_zinc_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.NETHERRACK_ZINC_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_RUBY_ORE_PLACED = PLACED_FEATURE.register("overworld_ruby_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_RUBY_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_SAPPHIRE_ORE_PLACED = PLACED_FEATURE.register("overworld_sapphire_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));



    public static final RegistryObject<PlacedFeature> OVERWORLD_PERIDOT_ORE_PLACED = PLACED_FEATURE.register("overworld_peridot_ore_placed",
            () -> new PlacedFeature(RylothConfiguredFeatures.OVERWORLD_PERIDOT_ORE.getHolder().orElseThrow(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80)))));

    
    
    
    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURE.register(eventBus);
    }

}
