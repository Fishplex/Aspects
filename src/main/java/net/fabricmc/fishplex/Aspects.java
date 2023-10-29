package net.fabricmc.fishplex;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aspects implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Item ANEMO_FEATHER = new Item(new FabricItemSettings());
	public static final Item PYRO_FIRE = new Item(new FabricItemSettings());
	public static final Item HYDRO_KELP = new Item(new FabricItemSettings());
	public static final Item GEO_DIAMOND = new Item(new FabricItemSettings());
	public static final Item ORDO_STAR = new Item(new FabricItemSettings());
	public static final Item PERDITIO_BONE = new Item(new FabricItemSettings());
	public static final Logger LOGGER = LogManager.getLogger("aspects");
 
		@Override
		public void onInitialize() {
			Registry.register(Registries.ITEM, new Identifier("aspects", "anemo_feather"), ANEMO_FEATHER);
			Registry.register(Registries.ITEM, new Identifier("aspects", "pyro_fire"), PYRO_FIRE);
			Registry.register(Registries.ITEM, new Identifier("aspects", "hydro_kelp"), HYDRO_KELP);
			Registry.register(Registries.ITEM, new Identifier("aspects", "geo_diamond"), GEO_DIAMOND);
			Registry.register(Registries.ITEM, new Identifier("aspects", "ordo_star"), ORDO_STAR);
			Registry.register(Registries.ITEM, new Identifier("aspects", "perditio_bone"), PERDITIO_BONE);

	}
}
