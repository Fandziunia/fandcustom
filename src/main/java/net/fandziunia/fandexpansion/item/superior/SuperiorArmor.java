package net.fandziunia.fandexpansion.item.superior;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fandziunia.fandexpansion.item.FandItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.server.network.ServerPlayerEntity;

public class SuperiorArmor {
        public static void register() {
            ServerTickEvents.START_SERVER_TICK.register(server -> {
                for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                    // Check if the player is wearing your custom item
                    if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() == FandItems.SUPERIOR_CHESTPLATE) {
                        player.getAbilities().allowFlying = true;
                    } else {
                        // Only disable flight if they are not in creative/spectator mode
                        if (!player.isCreative() && !player.isSpectator()) {
                            player.getAbilities().allowFlying = false;
                            player.getAbilities().flying = false;
                        }
                    }
                    player.sendAbilitiesUpdate(); // Synchronize with client
                }
            });
        }
    }