package com.weaponsplus.datagen;

import com.weaponsplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NRITE_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUSTY_SAW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUSTY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBVI_SWORD, Models.HANDHELD);
    }
}
