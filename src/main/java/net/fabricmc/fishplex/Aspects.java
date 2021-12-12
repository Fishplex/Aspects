package net.fabricmc.fishplex;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aspects implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Item ANEMO_FEATHER = new Item(new FabricItemSettings());
	public static final Item PYRO_FIRE = new Item(new FabricItemSettings());
	public static final Item HYDRO_KELP = new Item(new FabricItemSettings());
	public static final Logger LOGGER = LogManager.getLogger("aspects");
 
		@Override
		public void onInitialize() {
			Registry.register(Registry.ITEM, new Identifier("aspects", "anemo_feather"), ANEMO_FEATHER);
			Registry.register(Registry.ITEM, new Identifier("aspects", "pyro_fire"), PYRO_FIRE);
			Registry.register(Registry.ITEM, new Identifier("aspects", "hydro_kelp"), HYDRO_KELP);
			LOGGER.info("Hello from Aspects :D");
	}

}
