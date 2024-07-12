package com.weaponsplus.sound;

import com.weaponsplus.WeaponsPlus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent OBOMNA = registerSountEvent("obomma");

    private static SoundEvent registerSountEvent(String name) {
        Identifier id = new Identifier(WeaponsPlus.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }



    public static void registerSounds() {
        WeaponsPlus.LOGGER.info("Regestering Sounds for " + WeaponsPlus.MOD_ID);


    }

}
