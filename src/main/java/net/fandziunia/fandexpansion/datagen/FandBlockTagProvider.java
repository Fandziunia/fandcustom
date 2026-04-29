package net.fandziunia.fandexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class FandBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FandBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        /*getOrCreateTagBuilder()
                .add(FandBlocks.SUPERIOR_BLOCK) Custom Tag for Custom blocks
                .forceAddTag(BlockTags.GOLD_ORES);*/
        /*getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4"))) Blocks with netherite mining requirement
                .add(FandBlocks.SUPERIOR_BLOCK);*/
        /*getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(FandBlocks.SUPERIOR_BLOCK);*/

        /*getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5"))) Blocks with superior or other level 5 mining requirement
                .add(FandBlocks.SUPERIOR_BLOCK);*/

        getOrCreateTagBuilder(BlockTags.FENCES).add(FandBlocks.SUPERIOR_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(FandBlocks.SUPERIOR_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(FandBlocks.SUPERIOR_WALL);
    }
}
