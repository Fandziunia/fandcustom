package net.fandziunia.fandexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fandziunia.fandexpansion.item.FandItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class FandItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public FandItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(FandItems.SUPERIOR_HELMET, FandItems.SUPERIOR_CHESTPLATE, FandItems.SUPERIOR_LEGGINGS, FandItems.SUPERIOR_BOOTS);

    }
}
