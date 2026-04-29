package net.fandziunia.fandexpansion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fandziunia.fandexpansion.FandExpansion;
import net.fandziunia.fandexpansion.item.superior.SuperiorApple;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FandItems {

    public static final Item SUPERIOR_INGOT = registerItem("superior_ingot", new Item(new FabricItemSettings()));
    public static final Item SUPERIOR_NUGGET = registerItem("superior_nugget", new Item(new FabricItemSettings()));
    public static final Item SUPERIOR_PARTICLE = registerItem("superior_particle", new Item(new FabricItemSettings()));
    public static final Item SUPERIOR_APPLE = registerItem("superior_apple", new Item(new FabricItemSettings().food(SuperiorApple.SUPERIOR_APPLE)));
    public static final Item SUPERIOR_SWORD = registerItem("superior_sword", new SwordItem(FandToolMaterials.SUPERIOR, 3, 4f,new FabricItemSettings()));
    public static final Item SUPERIOR_AXE = registerItem("superior_axe", new AxeItem(FandToolMaterials.SUPERIOR, 4, 3f,new FabricItemSettings()));
    public static final Item SUPERIOR_PICKAXE = registerItem("superior_pickaxe", new PickaxeItem(FandToolMaterials.SUPERIOR, 2, 2f,new FabricItemSettings()));
    public static final Item SUPERIOR_SHOVEL = registerItem("superior_shovel", new ShovelItem(FandToolMaterials.SUPERIOR, 1, 2f,new FabricItemSettings()));
    public static final Item SUPERIOR_HOE = registerItem("superior_hoe", new HoeItem(FandToolMaterials.SUPERIOR, 0, 4f,new FabricItemSettings()));
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
