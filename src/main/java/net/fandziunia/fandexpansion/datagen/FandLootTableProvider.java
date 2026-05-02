package net.fandziunia.fandexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.fandziunia.fandexpansion.item.FandItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

    public class FandLootTableProvider extends FabricBlockLootTableProvider {
    public FandLootTableProvider(FabricDataOutput dataOutput){
        super(dataOutput);
    }
    @Override
    public void generate(){
        addDrop(FandBlocks.SUPERIOR_BLOCK);
        addDrop(FandBlocks.SUPERIOR_FENCE);
        addDrop(FandBlocks.SUPERIOR_FENCE_GATE);
        addDrop(FandBlocks.SUPERIOR_STAIRS);
        addDrop(FandBlocks.SUPERIOR_WALL);
        addDrop(FandBlocks.SUPERIOR_BUTTON);
        addDrop(FandBlocks.SUPERIOR_PRESSURE_PLATE);
        addDrop(FandBlocks.INFINITY_CAVE_PORTAL_FRAME);
        addDrop(FandBlocks.SUPERIOR_DOOR, doorDrops(FandBlocks.SUPERIOR_DOOR));
        addDrop(FandBlocks.SUPERIOR_TRAPDOOR);
        addDrop(FandBlocks.SUPERIOR_SLAB, slabDrops(FandBlocks.SUPERIOR_SLAB));

        //addDrop(FandBlocks.DENSE_COAL_ORE, densecoaloredrops(FandBlocks.DENSE_COAL_ORE, Items.COAL));
    }

   /*public LootTable.Builder densecoaloredrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                    ItemEntry.builder(item)
                        .apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider
                                        .create(3.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }*/
}
