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
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.EPIDAXITE_BLOCK.get())
                .define('#', ModItems.EPIDAXITE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get()))
                .save(consumer);

        // smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.EPIDAXITE_ORE.get()))
                .save(consumer, modId("epidaxite_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.EPIDAXITE_ORE.get()))
                .save(consumer, modId("epidaxite_blasting"));
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NETHER_EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.NETHER_EPIDAXITE_ORE.get()))
                .save(consumer, modId("nether_epidaxite_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NETHER_EPIDAXITE_ORE.get()), ModItems.EPIDAXITE.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.NETHER_EPIDAXITE_ORE.get()))
                .save(consumer, modId("nether_epidaxite_blasting"));

        // tools
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_PICKAXE.get(), 1) // pickaxe
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_AXE.get(), 1) // axe
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_SHOVEL.get(), 1) // shovel
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_HOE.get(), 1) // hoe
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.EPIDAXITE_SWORD.get(), 1) // sword
                .define('#', ModItems.EPIDAXITE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .unlockedBy("has_item", has(ModItems.EPIDAXITE.get())).save(consumer);


        // NEPENTINE ===================================================================================================
        // block
        ShapelessRecipeBuilder.shapeless(ModItems.NEPENTINE.get(), 9)
                .requires(ModBlocks.NEPENTINE_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPENTINE_BLOCK.get())
                .define('#', ModItems.NEPENTINE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get()))
                .save(consumer);

        // smelting
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.NEPENTINE_ORE.get()))
                .save(consumer, modId("nepentine_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.NEPENTINE_ORE.get()))
                .save(consumer, modId("nepentine_blasting"));
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.END_NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.END_NEPENTINE_ORE.get()))
                .save(consumer, modId("end_nepentine_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.END_NEPENTINE_ORE.get()), ModItems.NEPENTINE.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.END_NEPENTINE_ORE.get()))
                .save(consumer, modId("end_nepentine_blasting"));

        // tools
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_PICKAXE.get(), 1) // pickaxe
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_AXE.get(), 1) // axe
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_SHOVEL.get(), 1) // shovel
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_HOE.get(), 1) // hoe
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.NEPENTINE_SWORD.get(), 1) // sword
                .define('#', ModItems.NEPENTINE.get()).define('s', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .unlockedBy("has_item", has(ModItems.NEPENTINE.get())).save(consumer);
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(TestMod.MOD_ID, path);
    }
}