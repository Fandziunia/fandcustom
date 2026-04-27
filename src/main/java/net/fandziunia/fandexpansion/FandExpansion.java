package net.fandziunia.fandexpansion;

import net.fabricmc.api.ModInitializer;

import net.fandziunia.fandexpansion.item.FandItems;
import net.fandziunia.fandexpansion.item.fandItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FandExpansion implements ModInitializer {
	public static final String MOD_ID = "fandexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		fandItemGroups.registerItemGroups();
		FandItems.registerModItems();
	}
}