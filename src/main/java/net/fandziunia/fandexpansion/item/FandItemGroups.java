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

            entries.add(FandBlocks.DENSE_COAL_ORE);
            entries.add(FandBlocks.DENSE_COPPER_ORE);
            entries.add(FandBlocks.DENSE_IRON_ORE);
            entries.add(FandBlocks.DENSE_REDSTONE_ORE);
            entries.add(FandBlocks.DENSE_GOLD_ORE);
            entries.add(FandBlocks.DENSE_LAPIS_ORE);
            entries.add(FandBlocks.DENSE_DIAMOND_ORE);
            entries.add(FandBlocks.DENSE_EMERALD_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_COAL_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_COPPER_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_IRON_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_REDSTONE_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_GOLD_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_LAPIS_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_DIAMOND_ORE);
            entries.add(FandBlocks.DENSE_DEEPSLATE_EMERALD_ORE);
            entries.add(FandBlocks.DENSE_NETHER_QUARTZ_ORE);
            entries.add(FandBlocks.DENSE_NETHER_GOLD_ORE);
            entries.add(FandBlocks.DENSE_ANCIENT_DEBRIS);

            entries.add(FandBlocks.INFINITY_CAVE_PORTAL_FRAME);
            }).build());

    public static void registerItemGroups(){
        FandExpansion.LOGGER.info("Registering Item Groups for "+FandExpansion.MOD_ID);
    }
}
