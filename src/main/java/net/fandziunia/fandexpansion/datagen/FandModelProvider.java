package net.fandziunia.fandexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.fandziunia.fandexpansion.item.FandItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class FandModelProvider extends FabricModelProvider {
    public FandModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(FandBlocks.SUPERIOR_BLOCK); generate block models
        BlockStateModelGenerator.BlockTexturePool superiorPool = blockStateModelGenerator.registerCubeAllModelTexturePool(FandBlocks.SUPERIOR_BLOCK);
        superiorPool.stairs(FandBlocks.SUPERIOR_STAIRS);
        superiorPool.slab(FandBlocks.SUPERIOR_SLAB);
        superiorPool.fence(FandBlocks.SUPERIOR_FENCE);
        superiorPool.fenceGate(FandBlocks.SUPERIOR_FENCE_GATE);
        superiorPool.button(FandBlocks.SUPERIOR_BUTTON);
        superiorPool.pressurePlate(FandBlocks.SUPERIOR_PRESSURE_PLATE);
        superiorPool.wall(FandBlocks.SUPERIOR_WALL);

        blockStateModelGenerator.registerDoor(FandBlocks.SUPERIOR_DOOR);
        blockStateModelGenerator.registerTrapdoor(FandBlocks.SUPERIOR_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(FandItems.SUPERIOR_SWORD, Models.HANDHELD);
        itemModelGenerator.register(FandItems.SUPERIOR_AXE, Models.HANDHELD);
        itemModelGenerator.register(FandItems.SUPERIOR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(FandItems.SUPERIOR_HOE, Models.HANDHELD);
        itemModelGenerator.register(FandItems.SUPERIOR_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(FandItems.SUPERIOR_APPLE, Models.GENERATED);
        itemModelGenerator.register(FandItems.SUPERIOR_INGOT, Models.GENERATED);
        itemModelGenerator.register(FandItems.SUPERIOR_NUGGET, Models.GENERATED);
        itemModelGenerator.register(FandItems.SUPERIOR_PARTICLE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) FandItems.SUPERIOR_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) FandItems.SUPERIOR_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) FandItems.SUPERIOR_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) FandItems.SUPERIOR_BOOTS));
    }
}
