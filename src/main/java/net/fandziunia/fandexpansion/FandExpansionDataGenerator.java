package net.fandziunia.fandexpansion;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fandziunia.fandexpansion.datagen.*;
import net.fandziunia.fandexpansion.world.dimension.FandDimensions;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryBuilder;


public class FandExpansionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FandBlockTagProvider::new);
		pack.addProvider(FandItemTagProvider::new);
		pack.addProvider(FandModelProvider::new);
		pack.addProvider(FandRecipeProvider::new);
		pack.addProvider(FandLootTableProvider::new);
	}
		@Override
		public void buildRegistry(RegistryBuilder registryBuilder){
			registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, FandDimensions::bootstrapType);

	}
}
