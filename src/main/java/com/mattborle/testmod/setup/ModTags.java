package com.mattborle.testmod.setup;

import com.mattborle.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_EPIDAXITE = forge("ores/epidaxite");
        public static final ITag.INamedTag<Block> ORES_NETHER_EPIDAXITE = forge("ores/epidaxite");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_EPIDAXITE = forge("storage_blocks/epidaxite");
        public static final ITag.INamedTag<Block> ORES_NEPENTINE = forge("ores/nepentine");
        public static final ITag.INamedTag<Block> ORES_END_NEPENTINE = forge("ores/nepentine");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_NEPENTINE = forge("storage_blocks/nepentine");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(TestMod.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        // EPIDAXITE ===================================================================================================
            // ORE
        public static final ITag.INamedTag<Item> ORES_EPIDAXITE = forge("ores/epidaxite");
        public static final ITag.INamedTag<Item> ORES_NETHER_EPIDAXITE = forge("ores/epidaxite");
            // BLOCK
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_EPIDAXITE = forge("storage_blocks/epidaxite");
            // GEM
        public static final ITag.INamedTag<Item> EPIDAXITE = forge("gems/epidaxite");
            // TOOLS
        public static final ITag.INamedTag<Item> PICKAXE_EPIDAXITE = forge("pickaxe/epidaxite");
        public static final ITag.INamedTag<Item> AXE_EPIDAXITE = forge("axe/epidaxite");
        public static final ITag.INamedTag<Item> SHOVEL_EPIDAXITE = forge("shovel/epidaxite");
        public static final ITag.INamedTag<Item> HOE_EPIDAXITE = forge("hoe/epidaxite");
        public static final ITag.INamedTag<Item> SWORD_EPIDAXITE = forge("sword/epidaxite");

        // NEPENTINE ===================================================================================================
        // ORE
        public static final ITag.INamedTag<Item> ORES_NEPENTINE = forge("ores/nepentine");
        public static final ITag.INamedTag<Item> ORES_END_NEPENTINE = forge("ores/nepentine");
        // BLOCK
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_NEPENTINE = forge("storage_blocks/nepentine");
        // GEM
        public static final ITag.INamedTag<Item> NEPENTINE = forge("gems/nepentine");
        // TOOLS
        public static final ITag.INamedTag<Item> PICKAXE_NEPENTINE = forge("pickaxe/nepentine");
        public static final ITag.INamedTag<Item> AXE_NEPENTINE = forge("axe/nepentine");
        public static final ITag.INamedTag<Item> SHOVEL_NEPENTINE = forge("shovel/nepentine");
        public static final ITag.INamedTag<Item> HOE_NEPENTINE = forge("hoe/nepentine");
        public static final ITag.INamedTag<Item> SWORD_NEPENTINE = forge("sword/nepentine");


        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(TestMod.MOD_ID, path).toString());
        }
    }
}

