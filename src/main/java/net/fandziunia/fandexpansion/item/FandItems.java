package net.fandziunia.fandexpansion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fandziunia.fandexpansion.FandExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FandItems {

    public static final Item SUPERIOR_INGOT = registerItem("superior_ingot", new Item(new FabricItemSettings()));
    public static final Item SUPERIOR_NUGGET = registerItem("superior_nugget", new Item(new FabricItemSettings()));

    /* Vanilla item group adding
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(SUPERIOR_INGOT);
        entries.add(SUPERIOR_NUGGET);
    }*/

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FandExpansion.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FandExpansion.LOGGER.info("Registering Modded items for: "+FandExpansion.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(FandItems::addItemsToIngredientItemGroup);
    }
}
