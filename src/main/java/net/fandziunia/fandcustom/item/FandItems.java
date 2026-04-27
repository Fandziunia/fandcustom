package net.fandziunia.fandcustom.item;

import net.fandziunia.fandcustom.FandCustom;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FandItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FandCustom.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FandCustom.LOGGER.info("Registering Mod items for: "+FandCustom.MOD_ID);
    }
}
