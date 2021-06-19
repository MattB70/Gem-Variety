package com.mattborle.testmod.setup;

import com.mattborle.testmod.blocks.ZeoCoreBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    // CRAFTED =========================================================================================================
    public static final RegistryObject<ZeoCoreBlock> ZEO_CORE = register("zeo_core", () ->
            new ZeoCoreBlock(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .sound(SoundType.METAL)));


    // EPIDAXITE =======================================================================================================
    public static final RegistryObject<Block> EPIDAXITE_ORE = register("epidaxite_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .requiresCorrectToolForDrops()          // requires a pickaxe to get drop
                    .harvestLevel(2)                        // requires a level 2 (iron) pickaxe to get drop
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHER_EPIDAXITE_ORE = register("nether_epidaxite_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .requiresCorrectToolForDrops()          // requires a pickaxe to get drop
                    .harvestLevel(2)                        // requires a level 2 (iron) pickaxe to get drop
                    .sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> EPIDAXITE_BLOCK = register("epidaxite_block", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3, 10)
                    .sound(SoundType.METAL)));

    // NEPENTINE =======================================================================================================
    public static final RegistryObject<Block> NEPENTINE_ORE = register("nepentine_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .requiresCorrectToolForDrops()          // requires a pickaxe to get drop
                    .harvestLevel(2)                        // requires a level 2 (iron) pickaxe to get drop
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_NEPENTINE_ORE = register("end_nepentine_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .requiresCorrectToolForDrops()          // requires a pickaxe to get drop
                    .harvestLevel(2)                        // requires a level 2 (iron) pickaxe to get drop
                    .sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> NEPENTINE_BLOCK = register("nepentine_block", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3, 10)
                    .sound(SoundType.METAL)));

    // ZEOCITE =========================================================================================================
    public static final RegistryObject<Block> END_ZEOCITE_ORE = register("end_zeocite_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .requiresCorrectToolForDrops()          // requires a pickaxe to get drop
                    .harvestLevel(2)                        // requires a level 2 (iron) pickaxe to get drop
                    .sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> ZEOCITE_BLOCK = register("zeocite_block", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3, 10)
                    .sound(SoundType.METAL)));

    // KAINDRITE =======================================================================================================
    public static final RegistryObject<Block> NETHER_KAINDRITE_ORE = register("nether_kaindrite_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestTool(ToolType.PICKAXE)          // pickaxe tool
                    .requiresCorrectToolForDrops()          // requires a pickaxe to get drop
                    .harvestLevel(2)                        // requires a level 2 (iron) pickaxe to get drop
                    .sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> KAINDRITE_BLOCK = register("kaindrite_block", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3, 10)
                    .sound(SoundType.METAL)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}
