package net.fandziunia.fandexpansion.world;

import net.fandziunia.fandexpansion.FandExpansion;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class FandConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_COAL_ORE_KEY = registerKey("dense_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_COAL_ORE_KEY = registerKey("dense_deepslate_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_COPPER_ORE_KEY = registerKey("dense_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_COPPER_ORE_KEY = registerKey("dense_deepslate_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_IRON_ORE_KEY = registerKey("dense_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_IRON_ORE_KEY = registerKey("dense_deepslate_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_GOLD_ORE_KEY = registerKey("dense_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_GOLD_ORE_KEY = registerKey("dense_deepslate_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_REDSTONE_ORE_KEY = registerKey("dense_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_REDSTONE_ORE_KEY = registerKey("dense_deepslate_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_LAPIS_ORE_KEY = registerKey("dense_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_LAPIS_ORE_KEY = registerKey("dense_deepslate_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DIAMOND_ORE_KEY = registerKey("dense_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_DIAMOND_ORE_KEY = registerKey("dense_deepslate_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_EMERALD_ORE_KEY = registerKey("dense_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_DEEPSLATE_EMERALD_ORE_KEY = registerKey("dense_deepslate_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_NETHER_QUARTZ_ORE_KEY = registerKey("dense_nether_quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_NETHER_GOLD_ORE_KEY = registerKey("dense_nether_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENSE_ANCIENT_DEBRIS_KEY = registerKey("dense_ancient_debris");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){
        RuleTest coalReplaceables = new BlockMatchRuleTest(Blocks.COAL_ORE);
        RuleTest ironReplaceables = new BlockMatchRuleTest(Blocks.IRON_ORE);
        RuleTest copperReplaceables = new BlockMatchRuleTest(Blocks.COPPER_ORE);
        RuleTest goldReplaceables = new BlockMatchRuleTest(Blocks.GOLD_ORE);
        RuleTest redstoneReplaceables = new BlockMatchRuleTest(Blocks.REDSTONE_ORE);
        RuleTest lapisReplaceables = new BlockMatchRuleTest(Blocks.LAPIS_ORE);
        RuleTest diamondReplaceables = new BlockMatchRuleTest(Blocks.DIAMOND_ORE);
        RuleTest emeraldReplaceables = new BlockMatchRuleTest(Blocks.EMERALD_ORE);

        RuleTest deepslatecoalReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_COAL_ORE);
        RuleTest deepslateironReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_IRON_ORE);
        RuleTest deepslatecopperReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_COPPER_ORE);
        RuleTest deepslategoldReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_GOLD_ORE);
        RuleTest deepslateredstoneReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_REDSTONE_ORE);
        RuleTest deepslatelapisReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_LAPIS_ORE);
        RuleTest deepslatediamondReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_DIAMOND_ORE);
        RuleTest deepslateemeraldReplaceables = new BlockMatchRuleTest(Blocks.DEEPSLATE_EMERALD_ORE);

        RuleTest quartzReplaceables = new BlockMatchRuleTest(Blocks.NETHER_QUARTZ_ORE);
        RuleTest nethergoldReplaceables = new BlockMatchRuleTest(Blocks.NETHER_GOLD_ORE);
        RuleTest ancientdebrisReplaceables = new BlockMatchRuleTest(Blocks.ANCIENT_DEBRIS);

        /*RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);*/

        List<OreFeatureConfig.Target> overworldDenseCoalOre =
                List.of(OreFeatureConfig.createTarget(coalReplaceables, FandBlocks.DENSE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseIronOre =
                List.of(OreFeatureConfig.createTarget(ironReplaceables, FandBlocks.DENSE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseCopperOre =
                List.of(OreFeatureConfig.createTarget(copperReplaceables, FandBlocks.DENSE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseGoldOre =
                List.of(OreFeatureConfig.createTarget(goldReplaceables, FandBlocks.DENSE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseRedstoneOre =
                List.of(OreFeatureConfig.createTarget(redstoneReplaceables, FandBlocks.DENSE_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseLapisOre =
                List.of(OreFeatureConfig.createTarget(lapisReplaceables, FandBlocks.DENSE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDiamondOre =
                List.of(OreFeatureConfig.createTarget(diamondReplaceables, FandBlocks.DENSE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseEmeraldOre =
                List.of(OreFeatureConfig.createTarget(emeraldReplaceables, FandBlocks.DENSE_EMERALD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDenseDeepslateCoalOre =
                List.of(OreFeatureConfig.createTarget(deepslatecoalReplaceables, FandBlocks.DENSE_DEEPSLATE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateIronOre =
                List.of(OreFeatureConfig.createTarget(deepslateironReplaceables, FandBlocks.DENSE_DEEPSLATE_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateCopperOre =
                List.of(OreFeatureConfig.createTarget(deepslatecopperReplaceables, FandBlocks.DENSE_DEEPSLATE_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateGoldOre =
                List.of(OreFeatureConfig.createTarget(deepslategoldReplaceables, FandBlocks.DENSE_DEEPSLATE_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateRedstoneOre =
                List.of(OreFeatureConfig.createTarget(deepslateredstoneReplaceables, FandBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateLapisOre =
                List.of(OreFeatureConfig.createTarget(deepslatelapisReplaceables, FandBlocks.DENSE_DEEPSLATE_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateDiamondOre =
                List.of(OreFeatureConfig.createTarget(deepslatediamondReplaceables, FandBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDenseDeepslateEmeraldOre =
                List.of(OreFeatureConfig.createTarget(deepslateemeraldReplaceables, FandBlocks.DENSE_DEEPSLATE_EMERALD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherDenseQuartzOre =
                List.of(OreFeatureConfig.createTarget(quartzReplaceables, FandBlocks.DENSE_NETHER_QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherDenseGoldOre =
                List.of(OreFeatureConfig.createTarget(nethergoldReplaceables, FandBlocks.DENSE_NETHER_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherDenseAncientDebris =
                List.of(OreFeatureConfig.createTarget(ancientdebrisReplaceables, FandBlocks.DENSE_ANCIENT_DEBRIS.getDefaultState()));

                        //OreFeatureConfig.createTarget(deepslateReplaceables, FandBlocks.DENSE_DEEPSLATE_COAL_ORE.getDefaultState()));

        register(context, DENSE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseCoalOre, 32));
        register(context, DENSE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseIronOre, 32));
        register(context, DENSE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseCopperOre, 32));
        register(context, DENSE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseGoldOre, 32));
        register(context, DENSE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseRedstoneOre, 32));
        register(context, DENSE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseLapisOre, 32));
        register(context, DENSE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDiamondOre, 32));
        register(context, DENSE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseEmeraldOre, 32));

        register(context, DENSE_DEEPSLATE_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateCoalOre, 32));
        register(context, DENSE_DEEPSLATE_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateIronOre, 32));
        register(context, DENSE_DEEPSLATE_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateCopperOre, 32));
        register(context, DENSE_DEEPSLATE_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateGoldOre, 32));
        register(context, DENSE_DEEPSLATE_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateRedstoneOre, 32));
        register(context, DENSE_DEEPSLATE_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateLapisOre, 32));
        register(context, DENSE_DEEPSLATE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateDiamondOre, 32));
        register(context, DENSE_DEEPSLATE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDenseDeepslateEmeraldOre, 32));

        register(context, DENSE_NETHER_QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherDenseQuartzOre, 32));
        register(context, DENSE_NETHER_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherDenseGoldOre, 32));
        register(context, DENSE_ANCIENT_DEBRIS_KEY, Feature.ORE, new OreFeatureConfig(netherDenseAncientDebris, 32));
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(FandExpansion.MOD_ID, name));
    }
    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
