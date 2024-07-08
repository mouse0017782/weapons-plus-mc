package com.weaponsplus.item;

import com.weaponsplus.WeaponsPlus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUSTY_SAW = registerItem("rustysaw",
            new SwordItem(ModToolMaterial.SAW,
                    new Item.Settings().attributeModifiers(
                            SwordItem.createAttributeModifiers(
                                    ModToolMaterial.SAW,
                                    1, 2))));

    public static final Item NRITE_BATTLE_AXE = registerItem("nbaxe",
            new SwordItem(ModToolMaterial.BATTLEAXE,
                    new Item.Settings().attributeModifiers(
                            SwordItem.createAttributeModifiers(
                                    ModToolMaterial.BATTLEAXE,
                                    3, -1.8f))));

    public static final Item OBVI_SWORD = registerItem("obvisword",
            new SwordItem(ModToolMaterial.OBVI,
                    new Item.Settings().attributeModifiers(
                            SwordItem.createAttributeModifiers(
                                    ModToolMaterial.OBVI,
                                    1, -1.8f))));

    public static final Item RUSTY_INGOT = registerItem("rustyingot", new Item (new Settings()));

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUSTY_SAW);
        entries.add(NRITE_BATTLE_AXE);
        entries.add(OBVI_SWORD);
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
