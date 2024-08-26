package com.dokko.optium;

import com.dokko.optium.config.OptiumConfig;
import lombok.Getter;
import net.fabricmc.api.ClientModInitializer;

import net.uku3lig.ukulib.config.ConfigManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Optium implements ClientModInitializer {
	public static final String MOD_ID = "optium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Getter
	private static final ConfigManager<OptiumConfig> manager = ConfigManager.createDefault(OptiumConfig.class, MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Loaded Optium");
	}
}