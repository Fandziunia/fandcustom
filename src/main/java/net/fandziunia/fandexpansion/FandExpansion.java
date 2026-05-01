package net.fandziunia.fandexpansion;

import net.fabricmc.api.ModInitializer;

import net.fandziunia.fandexpansion.block.FandBlocks;
import net.fandziunia.fandexpansion.item.FandItems;
import net.fandziunia.fandexpansion.item.FandItemGroups;
import net.fandziunia.fandexpansion.item.superior.SuperiorArmor;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.DEEPSLATE_EMERALD_ORE;
import static net.minecraft.item.Items.EMERALD;

public class FandExpansion implements ModInitializer {
	public static final String MOD_ID = "fandexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FandItemGroups.registerItemGroups();
		FandBlocks.registerFandBlocks();
		FandItems.registerModItems();
		SuperiorArmor.register();

		CustomPortalBuilder.beginPortal()
				.frameBlock(DEEPSLATE_EMERALD_ORE)
				.lightWithItem(EMERALD)
				.destDimID(new Identifier(FandExpansion.MOD_ID, "infinitycave"))
				.tintColor(0x00ffff).registerPortal();
	}
}