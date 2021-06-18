package com.mattborle.testmod.data;

import com.mattborle.testmod.TestMod;
import com.mattborle.testmod.setup.ModBlocks;
import com.mattborle.testmod.setup.ModItems;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {


        // EPIDAXITE ===================================================================================================
        // block
        ShapelessRecipeBuilder.shapeless(ModItems.EPIDAXITE.get(), 9)
                .requires(ModBlocks.EPIDAXITE_BLOCK.get())
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.EPIDAXITE_BLOCK.get())
                .define('#', ModItems.EPIDAXITE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get()))
                .save(consumer);

        // smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 200)
                .unlockedBy("has_epidaxite", has(ModBlocks.EPIDAXITE_ORE.get()))
                .save(consumer, modId("epidaxite_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 100)
                .unlockedBy("has_epidaxite", has(ModBlocks.EPIDAXITE_ORE.get()))
                .save(consumer, modId("epidaxite_blasting"));
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NETHER_EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 200)
                .unlockedBy("has_epidaxite", has(ModBlocks.NETHER_EPIDAXITE_ORE.get()))
                .save(consumer, modId("nether_epidaxite_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NETHER_EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 100)
                .unlockedBy("has_epidaxite", has(ModBlocks.NETHER_EPIDAXITE_ORE.get()))
                .save(consumer, modId("nether_epidaxite_blasting"));

        // tools
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_PICKAXE.get(), 1) // pickaxe
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_AXE.get(), 1) // axe
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_SHOVEL.get(), 1) // shovel
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_HOE.get(), 1) // hoe
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_SWORD.get(), 1) // sword
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);


        // NEPENTINE ===================================================================================================
        // block
        ShapelessRecipeBuilder.shapeless(ModItems.NEPENTINE.get(), 9)
                .requires(ModBlocks.NEPENTINE_BLOCK.get())
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPENTINE_BLOCK.get())
                .define('#', ModItems.NEPENTINE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get()))
                .save(consumer);

        // smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 200)
                .unlockedBy("has_nepentine", has(ModBlocks.NEPENTINE_ORE.get()))
                .save(consumer, modId("nepentine_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 100)
                .unlockedBy("has_nepentine", has(ModBlocks.NEPENTINE_ORE.get()))
                .save(consumer, modId("nepentine_blasting"));
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.END_NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 200)
                .unlockedBy("has_nepentine", has(ModBlocks.END_NEPENTINE_ORE.get()))
                .save(consumer, modId("end_nepentine_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.END_NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 100)
                .unlockedBy("has_nepentine", has(ModBlocks.END_NEPENTINE_ORE.get()))
                .save(consumer, modId("end_nepentine_blasting"));

        // tools
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_PICKAXE.get(), 1) // pickaxe
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_AXE.get(), 1) // axe
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_SHOVEL.get(), 1) // shovel
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_HOE.get(), 1) // hoe
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_SWORD.get(), 1) // sword
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .unlockedBy("has_nepentine", has(ModItems.NEPENTINE.get())).save(consumer);


        // ZEOCITE =====================================================================================================
        // block
        ShapelessRecipeBuilder.shapeless(ModItems.ZEOCITE.get(), 9)
                .requires(ModBlocks.ZEOCITE_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.ZEOCITE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ZEOCITE_BLOCK.get())
                .define('#', ModItems.ZEOCITE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get()))
                .save(consumer);

        // smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.END_ZEOCITE_ORE.get()), ModItems.ZEOCITE.get(), 0.7f, 200)
                .unlockedBy("has_zeocite", has(ModBlocks.END_ZEOCITE_ORE.get()))
                .save(consumer, modId("end_zeocite_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.END_ZEOCITE_ORE.get()), ModItems.ZEOCITE.get(), 0.7f, 100)
                .unlockedBy("has_zeocite", has(ModBlocks.END_ZEOCITE_ORE.get()))
                .save(consumer, modId("end_zeocite_blasting"));

        // tools
        ShapedRecipeBuilder.shaped(ModItems.ZEOCITE_PICKAXE.get(), 1) // pickaxe
                .define('#', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.ZEOCITE_AXE.get(), 1) // axe
                .define('#', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.ZEOCITE_SHOVEL.get(), 1) // shovel
                .define('#', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.ZEOCITE_HOE.get(), 1) // hoe
                .define('#', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.ZEOCITE_SWORD.get(), 1) // sword
                .define('#', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);


        // KAINDRITE ===================================================================================================
        // block
        ShapelessRecipeBuilder.shapeless(ModItems.KAINDRITE.get(), 9)
                .requires(ModBlocks.KAINDRITE_BLOCK.get())
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.KAINDRITE_BLOCK.get())
                .define('#', ModItems.KAINDRITE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get()))
                .save(consumer);

        // smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NETHER_KAINDRITE_ORE.get()), ModItems.KAINDRITE.get(), 0.7f, 200)
                .unlockedBy("has_kaindrite", has(ModBlocks.NETHER_KAINDRITE_ORE.get()))
                .save(consumer, modId("nether_kaindrite_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NETHER_KAINDRITE_ORE.get()), ModItems.KAINDRITE.get(), 0.7f, 100)
                .unlockedBy("has_kaindrite", has(ModBlocks.NETHER_KAINDRITE_ORE.get()))
                .save(consumer, modId("nether_kaindrite_blasting"));

        // tools
        ShapedRecipeBuilder.shaped(ModItems.KAINDRITE_PICKAXE.get(), 1) // pickaxe
                .define('#', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.KAINDRITE_AXE.get(), 1) // axe
                .define('#', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.KAINDRITE_SHOVEL.get(), 1) // shovel
                .define('#', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.KAINDRITE_HOE.get(), 1) // hoe
                .define('#', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.KAINDRITE_SWORD.get(), 1) // sword
                .define('#', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);




        // MIXED =======================================================================================================

        // Pickaxe
        // 110
        ShapedRecipeBuilder.shaped(ModItems.MIXED110_PICKAXE.get(), 1) // pickaxe
                .define('E', ModItems.EPIDAXITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("NNE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        // 100
        ShapedRecipeBuilder.shaped(ModItems.MIXED100_PICKAXE.get(), 1) // pickaxe
                .define('E', ModItems.EPIDAXITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("NEE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        // 221
        ShapedRecipeBuilder.shaped(ModItems.MIXED221_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("ZZN")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 220
        ShapedRecipeBuilder.shaped(ModItems.MIXED220_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZZE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 211
        ShapedRecipeBuilder.shaped(ModItems.MIXED211_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("ZNN")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 210
        ShapedRecipeBuilder.shaped(ModItems.MIXED210_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('N', ModItems.NEPENTINE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZNE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 200
        ShapedRecipeBuilder.shaped(ModItems.MIXED200_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZEE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 332
        ShapedRecipeBuilder.shaped(ModItems.MIXED332_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KKZ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 331
        ShapedRecipeBuilder.shaped(ModItems.MIXED331_PICKAXE.get(), 1) // pickaxe
                .define('N', ModItems.NEPENTINE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KKN")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 330
        ShapedRecipeBuilder.shaped(ModItems.MIXED330_PICKAXE.get(), 1) // pickaxe
                .define('E', ModItems.EPIDAXITE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KKE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 322
        ShapedRecipeBuilder.shaped(ModItems.MIXED322_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KZZ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 321
        ShapedRecipeBuilder.shaped(ModItems.MIXED321_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("KZN")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 320
        ShapedRecipeBuilder.shaped(ModItems.MIXED320_PICKAXE.get(), 1) // pickaxe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("KZE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 311
        ShapedRecipeBuilder.shaped(ModItems.MIXED311_PICKAXE.get(), 1) // pickaxe
                .define('N', ModItems.NEPENTINE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KNN")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 310
        ShapedRecipeBuilder.shaped(ModItems.MIXED310_PICKAXE.get(), 1) // pickaxe
                .define('N', ModItems.NEPENTINE.get()).define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("KNE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 300
        ShapedRecipeBuilder.shaped(ModItems.MIXED300_PICKAXE.get(), 1) // pickaxe
                .define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("KEE")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);



        // Axe
        // 110
        ShapedRecipeBuilder.shaped(ModItems.MIXED110_AXE.get(), 1) // axe
                .define('E', ModItems.EPIDAXITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("NN ")
                .pattern("Es ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        // 100
        ShapedRecipeBuilder.shaped(ModItems.MIXED100_AXE.get(), 1) // axe
                .define('E', ModItems.EPIDAXITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("NE ")
                .pattern("Es ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        // 221
        ShapedRecipeBuilder.shaped(ModItems.MIXED221_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("ZZ ")
                .pattern("Ns ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 220
        ShapedRecipeBuilder.shaped(ModItems.MIXED220_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZZ ")
                .pattern("Es ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 211
        ShapedRecipeBuilder.shaped(ModItems.MIXED211_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("ZN ")
                .pattern("Ns ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 210
        ShapedRecipeBuilder.shaped(ModItems.MIXED210_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('N', ModItems.NEPENTINE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZN ")
                .pattern("Es ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 200
        ShapedRecipeBuilder.shaped(ModItems.MIXED200_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZE ")
                .pattern("Es ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 332
        ShapedRecipeBuilder.shaped(ModItems.MIXED332_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KZ ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 331
        ShapedRecipeBuilder.shaped(ModItems.MIXED331_AXE.get(), 1) // axe
                .define('N', ModItems.NEPENTINE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KN ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 330
        ShapedRecipeBuilder.shaped(ModItems.MIXED330_AXE.get(), 1) // axe
                .define('E', ModItems.EPIDAXITE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("KE ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 322
        ShapedRecipeBuilder.shaped(ModItems.MIXED322_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("ZZ ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 321
        ShapedRecipeBuilder.shaped(ModItems.MIXED321_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("ZN ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 320
        ShapedRecipeBuilder.shaped(ModItems.MIXED320_AXE.get(), 1) // axe
                .define('Z', ModItems.ZEOCITE.get()).define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("ZE ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 311
        ShapedRecipeBuilder.shaped(ModItems.MIXED311_AXE.get(), 1) // axe
                .define('N', ModItems.NEPENTINE.get()).define('K', ModItems.KAINDRITE.get()).define('s', Items.STICK)
                .pattern("NN ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 310
        ShapedRecipeBuilder.shaped(ModItems.MIXED310_AXE.get(), 1) // axe
                .define('N', ModItems.NEPENTINE.get()).define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("NE ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 300
        ShapedRecipeBuilder.shaped(ModItems.MIXED300_AXE.get(), 1) // axe
                .define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("EE ")
                .pattern("Ks ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        
        
        
        

        // Hoe
        // 10
        ShapedRecipeBuilder.shaped(ModItems.MIXED10_HOE.get(), 1) // hoe
                .define('N', ModItems.NEPENTINE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("NE ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        // 21
        ShapedRecipeBuilder.shaped(ModItems.MIXED21_HOE.get(), 1) // hoe
                .define('N', ModItems.NEPENTINE.get()).define('Z', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("ZN ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 20
        ShapedRecipeBuilder.shaped(ModItems.MIXED20_HOE.get(), 1) // hoe
                .define('E', ModItems.EPIDAXITE.get()).define('Z', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("ZE ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 32
        ShapedRecipeBuilder.shaped(ModItems.MIXED32_HOE.get(), 1) // hoe
                .define('K', ModItems.KAINDRITE.get()).define('Z', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern("KZ ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 31
        ShapedRecipeBuilder.shaped(ModItems.MIXED31_HOE.get(), 1) // hoe
                .define('K', ModItems.KAINDRITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("KN ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 30
        ShapedRecipeBuilder.shaped(ModItems.MIXED30_HOE.get(), 1) // hoe
                .define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("KE ")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);




        // Sword
        // 10
        ShapedRecipeBuilder.shaped(ModItems.MIXED10_SWORD.get(), 1) // sword
                .define('N', ModItems.NEPENTINE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern(" N ")
                .pattern(" E ")
                .pattern(" s ")
                .unlockedBy("has_epidaxite", has(ModItems.EPIDAXITE.get())).save(consumer);
        // 21
        ShapedRecipeBuilder.shaped(ModItems.MIXED21_SWORD.get(), 1) // sword
                .define('N', ModItems.NEPENTINE.get()).define('Z', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern(" Z ")
                .pattern(" N ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 20
        ShapedRecipeBuilder.shaped(ModItems.MIXED20_SWORD.get(), 1) // sword
                .define('E', ModItems.EPIDAXITE.get()).define('Z', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern(" Z ")
                .pattern(" E ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 32
        ShapedRecipeBuilder.shaped(ModItems.MIXED32_SWORD.get(), 1) // sword
                .define('K', ModItems.KAINDRITE.get()).define('Z', ModItems.ZEOCITE.get()).define('s', Items.STICK)
                .pattern(" Z ")
                .pattern(" K ")
                .pattern(" s ")
                .unlockedBy("has_zeocite", has(ModItems.ZEOCITE.get())).save(consumer);
        // 31
        ShapedRecipeBuilder.shaped(ModItems.MIXED31_SWORD.get(), 1) // sword
                .define('K', ModItems.KAINDRITE.get()).define('N', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern(" N ")
                .pattern(" K ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
        // 30
        ShapedRecipeBuilder.shaped(ModItems.MIXED30_SWORD.get(), 1) // sword
                .define('K', ModItems.KAINDRITE.get()).define('E', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern(" E ")
                .pattern(" K ")
                .pattern(" s ")
                .unlockedBy("has_kaindrite", has(ModItems.KAINDRITE.get())).save(consumer);
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(TestMod.MOD_ID, path);
    }
}
