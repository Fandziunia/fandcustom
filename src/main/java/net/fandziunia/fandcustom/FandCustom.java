package net.fandziunia.fandcustom;

import net.fabricmc.api.ModInitializer;

import net.fandziunia.fandcustom.item.FandItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FandCustom implements ModInitializer {
	public static final String MOD_ID = "fandcustom";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FandItems.registerModItems();
	}
}