package net.fandziunia.fandexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fandziunia.fandexpansion.FandExpansion;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class fandItemGroups {

    public static final ItemGroup fandCustomItemGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FandExpansion.MOD_ID, "fandmodname"),
            FabricItemGroup.builder().displayName(Text.translatable("fanditemgroup.fandmodname"))
                    .icon(() -> new ItemStack(FandItems.SUPERIOR_INGOT)).entries((displayContext, entries) -> {
            entries.add(FandItems.SUPERIOR_NUGGET);
            entries.add(FandItems.SUPERIOR_INGOT);
            }).build());

    public static void registerItemGroups(){
        FandExpansion.LOGGER.info("Registering Item Groups for "+FandExpansion.MOD_ID);
    }
}
