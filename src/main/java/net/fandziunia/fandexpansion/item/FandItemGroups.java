package net.fandziunia.fandexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fandziunia.fandexpansion.FandExpansion;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FandItemGroups {

    public static final ItemGroup fandCustomItemGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FandExpansion.MOD_ID, "fandmodname"),
            FabricItemGroup.builder().displayName(Text.translatable("fanditemgroup.fandmodname"))
                    .icon(() -> new ItemStack(FandItems.SUPERIOR_INGOT)).entries((displayContext, entries) -> {
            entries.add(FandItems.SUPERIOR_NUGGET);
            entries.add(FandItems.SUPERIOR_INGOT);
            entries.add(FandItems.SUPERIOR_PARTICLE);
            entries.add(FandItems.SUPERIOR_APPLE);
            entries.add(FandItems.SUPERIOR_SWORD);
            entries.add(FandItems.SUPERIOR_PICKAXE);
            entries.add(FandItems.SUPERIOR_AXE);
            entries.add(FandItems.SUPERIOR_SHOVEL);
            entries.add(FandItems.SUPERIOR_HOE);
            entries.add(FandItems.SUPERIOR_HELMET);
            entries.add(FandItems.SUPERIOR_CHESTPLATE);
            entries.add(FandItems.SUPERIOR_LEGGINGS);
            entries.add(FandItems.SUPERIOR_BOOTS);

            entries.add(FandBlocks.SUPERIOR_BLOCK);
            entries.add(FandBlocks.SUPERIOR_SLAB);
            entries.add(FandBlocks.SUPERIOR_STAIRS);
            entries.add(FandBlocks.SUPERIOR_WALL);
            entries.add(FandBlocks.SUPERIOR_FENCE);
            entries.add(FandBlocks.SUPERIOR_FENCE_GATE);
            entries.add(FandBlocks.SUPERIOR_BUTTON);
            entries.add(FandBlocks.SUPERIOR_PRESSURE_PLATE);
            entries.add(FandBlocks.SUPERIOR_DOOR);
            entries.add(FandBlocks.SUPERIOR_TRAPDOOR);
            }).build());

    public static void registerItemGroups(){
        FandExpansion.LOGGER.info("Registering Item Groups for "+FandExpansion.MOD_ID);
    }
}
