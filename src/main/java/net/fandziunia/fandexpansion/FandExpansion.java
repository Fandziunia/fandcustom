package net.fandziunia.fandexpansion;

import io.github.ladysnake.pal.AbilitySource;
import io.github.ladysnake.pal.Pal;
import io.github.ladysnake.pal.VanillaAbilities;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fandziunia.fandexpansion.block.FandBlocks;
import net.fandziunia.fandexpansion.item.FandItems;
import net.fandziunia.fandexpansion.item.FandItemGroups;
import net.fandziunia.fandexpansion.world.gen.FandWorldGeneration;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
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
		FandWorldGeneration.generateFandWorldGen();
		registerSuperiorChestplate();

		CustomPortalBuilder.beginPortal()
				.frameBlock(FandBlocks.INFINITY_CAVE_PORTAL_FRAME)
				.lightWithItem(EMERALD)
				.destDimID(new Identifier(FandExpansion.MOD_ID, "infinitycave"))
				.tintColor(0x0000ff).registerPortal();

		}
		private void registerSuperiorChestplate() {
			AbilitySource source = Pal.getAbilitySource("fandexpansion", "superior_chestplate");
			ServerTickEvents.START_SERVER_TICK.register(server -> {
				for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
					ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
					if (chestplate.getItem() == FandItems.SUPERIOR_CHESTPLATE) {
						source.grantTo(player, VanillaAbilities.ALLOW_FLYING);
						if (source.isActivelyGranting(player, VanillaAbilities.ALLOW_FLYING)) {
							break;
						}
					} else {
						source.revokeFrom(player, VanillaAbilities.ALLOW_FLYING);
					}
				}
			});



	}
}