package com.weaponsplus.item;

import com.weaponsplus.WeaponsPlus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUSTY_SAW = registerItem("rustysaw", new Item(new Item.Settings()));
    public static final Item RUSTY_INGOT = registerItem("rustyingot", new Item(new Item.Settings()));

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUSTY_SAW);
    }

    private static void addItemsToFunctionalTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUSTY_INGOT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WeaponsPlus.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        WeaponsPlus.LOGGER.info("Regestering Mod Items" + WeaponsPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalTabItemGroup);
    }
}
