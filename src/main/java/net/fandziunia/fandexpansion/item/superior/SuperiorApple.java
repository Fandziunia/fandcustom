package net.fandziunia.fandexpansion.item.superior;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class SuperiorApple extends Item {
    public SuperiorApple(Item.Settings settings) {
        super(settings);
    }

    public static final FoodComponent SUPERIOR_APPLE = new FoodComponent.Builder().hunger(20).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 72000, 4), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 72000, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 72000, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 72000, 9), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 72000, 4), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 72000, 9), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 72000, 9), 1f)
            .build();

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.fandexpansion.superior_apple.tooltip").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
