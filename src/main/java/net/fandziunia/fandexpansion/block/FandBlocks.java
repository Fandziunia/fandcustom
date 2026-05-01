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
