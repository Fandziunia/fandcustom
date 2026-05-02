package net.fandziunia.fandexpansion.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fandziunia.fandexpansion.FandExpansion;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class FandBlocks {

    public static final Block SUPERIOR_BLOCK = registerBlock("superior_block", new Block(FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.IRON_XYLOPHONE).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static final Block INFINITY_CAVE_PORTAL_FRAME = registerBlock("infinity_cave_portal_frame", new Block(FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BASS).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    //new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK); copying iron block attributes
    /* copying ore registriation
    public static final Block EXAMPLE_ORE = registerBlock("example_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.5f), UniformIntProvider.create(2, 5)));
    */

    public static final Block SUPERIOR_STAIRS = registerBlock("superior_stairs",
            new StairsBlock(FandBlocks.SUPERIOR_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SUPERIOR_SLAB = registerBlock("superior_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SUPERIOR_BUTTON = registerBlock("superior_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, false));

    public static final Block SUPERIOR_PRESSURE_PLATE = registerBlock("superior_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));

    public static final Block SUPERIOR_FENCE = registerBlock("superior_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SUPERIOR_FENCE_GATE = registerBlock("superior_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.ACACIA));

    public static final Block SUPERIOR_WALL = registerBlock("superior_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SUPERIOR_DOOR = registerBlock("superior_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque() ,BlockSetType.IRON));

    public static final Block SUPERIOR_TRAPDOOR = registerBlock("superior_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque() ,BlockSetType.IRON));

    public static final Block DENSE_COAL_ORE = registerBlock("dense_coal_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(1, 4)));
    public static final Block DENSE_COPPER_ORE = registerBlock("dense_copper_ore", new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F)));
    public static final Block DENSE_IRON_ORE = registerBlock("dense_iron_ore", new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F)));
    public static final Block DENSE_GOLD_ORE = registerBlock("dense_gold_ore", new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F)));
    public static final Block DENSE_REDSTONE_ORE = registerBlock("dense_redstone_ore", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().ticksRandomly().luminance(state -> state.get(RedstoneOreBlock.LIT) ? 9 : 0).emissiveLighting((state, world, pos) -> state.get(RedstoneOreBlock.LIT)).strength(3.0F, 3.0F)));
    public static final Block DENSE_LAPIS_ORE = registerBlock("dense_lapis_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(4, 7)));
    public static final Block DENSE_DIAMOND_ORE = registerBlock("dense_diamond_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(5, 9)));
    public static final Block DENSE_EMERALD_ORE = registerBlock("dense_emerald_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(5, 9)));

    public static final Block DENSE_DEEPSLATE_COAL_ORE = registerBlock("dense_deepslate_coal_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(DENSE_COAL_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(1, 4)));
    public static final Block DENSE_DEEPSLATE_COPPER_ORE = registerBlock("dense_deepslate_copper_ore", new Block(FabricBlockSettings.copy(DENSE_COPPER_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DENSE_DEEPSLATE_IRON_ORE = registerBlock("dense_deepslate_iron_ore", new Block(FabricBlockSettings.copy(DENSE_IRON_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DENSE_DEEPSLATE_GOLD_ORE = registerBlock("dense_deepslate_gold_ore", new Block(FabricBlockSettings.copy(DENSE_GOLD_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DENSE_DEEPSLATE_REDSTONE_ORE = registerBlock("dense_deepslate_redstone_ore", new RedstoneOreBlock(FabricBlockSettings.copy(DENSE_REDSTONE_ORE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DENSE_DEEPSLATE_LAPIS_ORE = registerBlock("dense_deepslate_lapis_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(DENSE_LAPIS_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(4, 7)));
    public static final Block DENSE_DEEPSLATE_DIAMOND_ORE = registerBlock("dense_deepslate_diamond_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(DENSE_DIAMOND_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(5, 9)));
    public static final Block DENSE_DEEPSLATE_EMERALD_ORE = registerBlock("dense_deepslate_emerald_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(DENSE_EMERALD_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(5, 9)));

    public static final Block DENSE_NETHER_QUARTZ_ORE = registerBlock("dense_nether_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(4, 7)));
    public static final Block DENSE_NETHER_GOLD_ORE = registerBlock("dense_nether_gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.NETHER_GOLD_ORE), UniformIntProvider.create(1, 3)));
    public static final Block DENSE_ANCIENT_DEBRIS = registerBlock("dense_ancient_debris", new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.BLACK).requiresTool().strength(30.0F, 1200.0F).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FandExpansion.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(FandExpansion.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerFandBlocks() {
        FandExpansion.LOGGER.info("Registering Blocks for "+FandExpansion.MOD_ID);
    }
}
