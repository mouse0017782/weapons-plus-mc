package com.weaponsplus.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial
{
SAW(BlockTags.INCORRECT_FOR_STONE_TOOL, 32, 5f, 8f, 27,
        () -> Ingredient.ofItems(ModItems.RUSTY_INGOT));
    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient)
    {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability()
    {
        return itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag()
    {
        return inverseTag;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return repairIngredient.get();
    }
}