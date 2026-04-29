package net.fandziunia.fandexpansion;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.minecraft.client.render.RenderLayer;

public class FandExpansionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FandBlocks.SUPERIOR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FandBlocks.SUPERIOR_TRAPDOOR, RenderLayer.getCutout());
    }
}
