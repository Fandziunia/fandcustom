package net.fandziunia.fandexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.fandziunia.fandexpansion.item.FandItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class FandRecipeProvider extends FabricRecipeProvider {
    //private static final List<ItemConvertible> SUPERIOR_SMELTABLES = List.of(FandItems.SUPERIOR_INGOT, FandItems.SUPERIOR_NUGGET);
    public FandRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerSmelting(exporter, SUPERIOR_SMELTABLES, RecipeCategory.MISC, FandItems.SUPERIOR_INGOT, 0.7f, 200, "superior");
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, FandItems.SUPERIOR_INGOT, RecipeCategory.DECORATIONS, FandBlocks.SUPERIOR_BLOCK); datagen crafting items from blocks to items

    }
}
