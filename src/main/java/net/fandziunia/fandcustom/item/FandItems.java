package net.fandziunia.fandcustom.item;

import net.fandziunia.fandcustom.FandCustom;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class FandItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FandCustom.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FandCustom.LOGGER.info("Registering Mod items for: "+FandCustom.MOD_ID);
    }
}
