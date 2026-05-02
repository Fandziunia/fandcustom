package net.fandziunia.fandexpansion.world;

import net.fandziunia.fandexpansion.FandExpansion;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class FandPlacedFeatures {
    public static final RegistryKey<PlacedFeature> DENSE_COAL_ORE_PLACED_KEY = registerKey("dense_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_IRON_ORE_PLACED_KEY = registerKey("dense_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_COPPER_ORE_PLACED_KEY = registerKey("dense_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_GOLD_ORE_PLACED_KEY = registerKey("dense_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_REDSTONE_ORE_PLACED_KEY = registerKey("dense_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_LAPIS_ORE_PLACED_KEY = registerKey("dense_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DIAMOND_ORE_PLACED_KEY = registerKey("dense_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_EMERALD_ORE_PLACED_KEY = registerKey("dense_emerald_ore_placed");

    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_COAL_ORE_PLACED_KEY = registerKey("dense_deepslate_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_IRON_ORE_PLACED_KEY = registerKey("dense_deepslate_iron_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_COPPER_ORE_PLACED_KEY = registerKey("dense_deepslate_copper_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_GOLD_ORE_PLACED_KEY = registerKey("dense_deepslate_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_REDSTONE_ORE_PLACED_KEY = registerKey("dense_deepslate_redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_LAPIS_ORE_PLACED_KEY = registerKey("dense_deepslate_lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_DIAMOND_ORE_PLACED_KEY = registerKey("dense_deepslate_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_DEEPSLATE_EMERALD_ORE_PLACED_KEY = registerKey("dense_deepslate_emerald_ore_placed");

    public static final RegistryKey<PlacedFeature> DENSE_NETHER_QUARTZ_ORE_PLACED_KEY = registerKey("dense_nether_quartz_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_NETHER_GOLD_ORE_PLACED_KEY = registerKey("dense_nether_gold_ore_placed");
    public static final RegistryKey<PlacedFeature> DENSE_ANCIENT_DEBRIS_PLACED_KEY = registerKey("dense_ancient_debris_placed");

    public static void boostrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, DENSE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_COAL_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(256))));
        register(context, DENSE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_IRON_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(320))));
        register(context, DENSE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_COPPER_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(112))));
        register(context, DENSE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_GOLD_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_REDSTONE_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));

        register(context, DENSE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_LAPIS_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));

        register(context, DENSE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DIAMOND_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_EMERALD_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(320))));

        register(context, DENSE_DEEPSLATE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_COAL_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_DEEPSLATE_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_IRON_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_DEEPSLATE_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_COPPER_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_DEEPSLATE_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_GOLD_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_DEEPSLATE_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_REDSTONE_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));

        register(context, DENSE_DEEPSLATE_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_LAPIS_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));

        register(context, DENSE_DEEPSLATE_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_DIAMOND_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));
        register(context, DENSE_DEEPSLATE_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_DEEPSLATE_EMERALD_ORE_KEY),
                FandOrePlacement.modifiersWithCount(64, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-63), YOffset.fixed(100))));

        register(context, DENSE_NETHER_QUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_NETHER_QUARTZ_ORE_KEY),
                FandOrePlacement.modifiersWithCount(32, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(2), YOffset.fixed(125))));
        register(context, DENSE_NETHER_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_NETHER_GOLD_ORE_KEY),
                FandOrePlacement.modifiersWithCount(32, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(2), YOffset.fixed(125))));
        register(context, DENSE_ANCIENT_DEBRIS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(FandConfiguredFeatures.DENSE_ANCIENT_DEBRIS_KEY),
                FandOrePlacement.modifiersWithCount(32, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(2), YOffset.fixed(125))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(FandExpansion.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
