package com.weaponsplus.datagen;

import com.weaponsplus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {





        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUSTY_SAW, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.RUSTY_INGOT)
                .input('S', Items.OAK_SLAB)
                .criterion(hasItem(ModItems.RUSTY_INGOT), conditionsFromItem(ModItems.RUSTY_INGOT))
                .criterion(hasItem(Items.OAK_SLAB), conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUSTY_SAW)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_BATTLE_AXE, 1)
                .pattern(" ##")
                .pattern(" S#")
                .pattern(" S ")
                .input('#', Items.IRON_BLOCK)
                .input('S', Items.STICK)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_BATTLE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_BATTLE_AXE, 1)
                .pattern(" ##")
                .pattern(" S#")
                .pattern(" S ")
                .input('#', Items.GOLD_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_BATTLE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_BATTLE_AXE, 1)
                .pattern(" ##")
                .pattern(" S#")
                .pattern(" S ")
                .input('#', Items.DIAMOND_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_BATTLE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBVI_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', Items.OBSIDIAN)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBVI_SWORD)));
    }
}
