package com.weaponsplus;

import com.weaponsplus.item.ModItems;
import com.weaponsplus.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponsPlus implements ModInitializer {
	public static final String MOD_ID = "weaponsplus";
    public static final Logger LOGGER = LoggerFactory.getLogger("weapons-plus");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModSounds.registerSounds();
		LOGGER.info("Hello Fabric world!");
	}
}