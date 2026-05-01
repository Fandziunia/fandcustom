package net.fandziunia.fandexpansion.world.dimension;

import net.fandziunia.fandexpansion.FandExpansion;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class FandDimensions {
    public static final RegistryKey<DimensionOptions> FANDDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(FandExpansion.MOD_ID, "infinitycave"));
    public static final RegistryKey<World> FANDDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(FandExpansion.MOD_ID, "infinitycave"));
    public static final RegistryKey<DimensionType> FAND_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(FandExpansion.MOD_ID, "infinite_caves_type"));

    public static void bootstrapType(Registerable<DimensionType> context){
        context.register(FAND_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), //fixed time
                false, //has skylight
                true, //has Ceiling
                false, //Ultrawarm
                false, //natural
                1.0, //coords scale
                false, // bed works
                false, // anchor works
                -64, //min Y
                256, //height
                256, //logical height
                BlockTags.INFINIBURN_OVERWORLD, //infiniburn
                DimensionTypes.OVERWORLD_ID, //effects location
                0.0f, //ambient light
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
