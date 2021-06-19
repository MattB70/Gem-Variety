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
        public static final ITag.INamedTag<Block> ZEO_CORE = forge("blocks/zeo_core");

        public static final ITag.INamedTag<Block> ORES_EPIDAXITE = forge("ores/epidaxite");
        public static final ITag.INamedTag<Block> ORES_NETHER_EPIDAXITE = forge("ores/epidaxite");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_EPIDAXITE = forge("storage_blocks/epidaxite");
        public static final ITag.INamedTag<Block> ORES_NEPENTINE = forge("ores/nepentine");
        public static final ITag.INamedTag<Block> ORES_END_NEPENTINE = forge("ores/nepentine");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_NEPENTINE = forge("storage_blocks/nepentine");
        public static final ITag.INamedTag<Block> ORES_END_ZEOCITE = forge("ores/zeocite");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_ZEOCITE = forge("storage_blocks/zeocite");
        public static final ITag.INamedTag<Block> ORES_NETHER_KAINDRITE = forge("ores/kaindrite");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_KAINDRITE = forge("storage_blocks/kaindrite");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(TestMod.MOD_ID, path).toString());
        }
    }

    public static final class Items {

        // CRAFTED =====================================================================================================
        public static final ITag.INamedTag<Item> ZEO_CORE = forge("blocks/zeo_core");


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
            // ARMOR
        public static final ITag.INamedTag<Item> HELMET_EPIDAXITE = forge("helmet/epidaxite");
        public static final ITag.INamedTag<Item> CHESTPLATE_EPIDAXITE = forge("chestplate/epidaxite");
        public static final ITag.INamedTag<Item> LEGGINGS_EPIDAXITE = forge("leggings/epidaxite");
        public static final ITag.INamedTag<Item> BOOTS_EPIDAXITE = forge("boots/epidaxite");

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
        // ARMOR
        public static final ITag.INamedTag<Item> HELMET_NEPENTINE = forge("helmet/nepentine");
        public static final ITag.INamedTag<Item> CHESTPLATE_NEPENTINE = forge("chestplate/nepentine");
        public static final ITag.INamedTag<Item> LEGGINGS_NEPENTINE = forge("leggings/nepentine");
        public static final ITag.INamedTag<Item> BOOTS_NEPENTINE = forge("boots/nepentine");

        // ZEOCITE ===================================================================================================
        // ORE
        //public static final ITag.INamedTag<Item> ORES_ZEOCITE = forge("ores/zeocite");    // no overworld zeocite
        public static final ITag.INamedTag<Item> ORES_END_ZEOCITE = forge("ores/zeocite");
        // BLOCK
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_ZEOCITE = forge("storage_blocks/zeocite");
        // GEM
        public static final ITag.INamedTag<Item> ZEOCITE = forge("gems/zeocite");
        // TOOLS
        public static final ITag.INamedTag<Item> PICKAXE_ZEOCITE = forge("pickaxe/zeocite");
        public static final ITag.INamedTag<Item> AXE_ZEOCITE = forge("axe/zeocite");
        public static final ITag.INamedTag<Item> SHOVEL_ZEOCITE = forge("shovel/zeocite");
        public static final ITag.INamedTag<Item> HOE_ZEOCITE = forge("hoe/zeocite");
        public static final ITag.INamedTag<Item> SWORD_ZEOCITE = forge("sword/zeocite");
        // ARMOR
        public static final ITag.INamedTag<Item> HELMET_ZEOCITE = forge("helmet/zeocite");
        public static final ITag.INamedTag<Item> CHESTPLATE_ZEOCITE = forge("chestplate/zeocite");
        public static final ITag.INamedTag<Item> LEGGINGS_ZEOCITE = forge("leggings/zeocite");
        public static final ITag.INamedTag<Item> BOOTS_ZEOCITE = forge("boots/zeocite");

        // KAINDRITE ===================================================================================================
        // ORE
        //public static final ITag.INamedTag<Item> ORES_KAINDRITE = forge("ores/kaindrite");    // no overworld kaindrite
        public static final ITag.INamedTag<Item> ORES_NETHER_KAINDRITE = forge("ores/kaindrite");
        // BLOCK
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_KAINDRITE = forge("storage_blocks/kaindrite");
        // GEM
        public static final ITag.INamedTag<Item> KAINDRITE = forge("gems/kaindrite");
        // TOOLS
        public static final ITag.INamedTag<Item> PICKAXE_KAINDRITE = forge("pickaxe/kaindrite");
        public static final ITag.INamedTag<Item> AXE_KAINDRITE = forge("axe/kaindrite");
        public static final ITag.INamedTag<Item> SHOVEL_KAINDRITE = forge("shovel/kaindrite");
        public static final ITag.INamedTag<Item> HOE_KAINDRITE = forge("hoe/kaindrite");
        public static final ITag.INamedTag<Item> SWORD_KAINDRITE = forge("sword/kaindrite");
        // ARMOR
        public static final ITag.INamedTag<Item> HELMET_KAINDRITE = forge("helmet/kaindrite");
        public static final ITag.INamedTag<Item> CHESTPLATE_KAINDRITE = forge("chestplate/kaindrite");
        public static final ITag.INamedTag<Item> LEGGINGS_KAINDRITE = forge("leggings/kaindrite");
        public static final ITag.INamedTag<Item> BOOTS_KAINDRITE = forge("boots/kaindrite");




        // MIXED =======================================================================================================
        // PICKAXE
        public static final ITag.INamedTag<Item> PICKAXE_110 = forge("pickaxe/110"); // NEPENTINE, NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_100 = forge("pickaxe/100"); // NEPENTINE, EPIDAXITE, EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_221 = forge("pickaxe/221"); // ZEOCITE,   ZEOCITE,   NEPENTINE
        public static final ITag.INamedTag<Item> PICKAXE_220 = forge("pickaxe/220"); // ZEOCITE,   ZEOCITE,   EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_211 = forge("pickaxe/211"); // ZEOCITE,   NEPENTINE, NEPENTINE
        public static final ITag.INamedTag<Item> PICKAXE_210 = forge("pickaxe/210"); // ZEOCITE,   NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_200 = forge("pickaxe/200"); // ZEOCITE,   EPIDAXITE, EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_332 = forge("pickaxe/332"); // KAINDRITE, KAINDRITE, ZEOCITE
        public static final ITag.INamedTag<Item> PICKAXE_331 = forge("pickaxe/331"); // KAINDRITE, KAINDRITE, NEPENTINE
        public static final ITag.INamedTag<Item> PICKAXE_330 = forge("pickaxe/330"); // KAINDRITE, KAINDRITE, EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_322 = forge("pickaxe/322"); // KAINDRITE, ZEOCITE,   ZEOCITE
        public static final ITag.INamedTag<Item> PICKAXE_321 = forge("pickaxe/321"); // KAINDRITE, ZEOCITE,   NEPENTINE
        public static final ITag.INamedTag<Item> PICKAXE_320 = forge("pickaxe/320"); // KAINDRITE, ZEOCITE,   EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_311 = forge("pickaxe/311"); // KAINDRITE, NEPENTINE, NEPENTINE
        public static final ITag.INamedTag<Item> PICKAXE_310 = forge("pickaxe/310"); // KAINDRITE, NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> PICKAXE_300 = forge("pickaxe/300"); // KAINDRITE, EPIDAXITE, EPIDAXITE
        // AXE
        public static final ITag.INamedTag<Item> AXE_110 = forge("axe/110"); // NEPENTINE, NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_100 = forge("axe/100"); // NEPENTINE, EPIDAXITE, EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_221 = forge("axe/221"); // ZEOCITE,   ZEOCITE,   NEPENTINE
        public static final ITag.INamedTag<Item> AXE_220 = forge("axe/220"); // ZEOCITE,   ZEOCITE,   EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_211 = forge("axe/211"); // ZEOCITE,   NEPENTINE, NEPENTINE
        public static final ITag.INamedTag<Item> AXE_210 = forge("axe/210"); // ZEOCITE,   NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_200 = forge("axe/200"); // ZEOCITE,   EPIDAXITE, EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_332 = forge("axe/332"); // KAINDRITE, KAINDRITE, ZEOCITE
        public static final ITag.INamedTag<Item> AXE_331 = forge("axe/331"); // KAINDRITE, KAINDRITE, NEPENTINE
        public static final ITag.INamedTag<Item> AXE_330 = forge("axe/330"); // KAINDRITE, KAINDRITE, EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_322 = forge("axe/322"); // KAINDRITE, ZEOCITE,   ZEOCITE
        public static final ITag.INamedTag<Item> AXE_321 = forge("axe/321"); // KAINDRITE, ZEOCITE,   NEPENTINE
        public static final ITag.INamedTag<Item> AXE_320 = forge("axe/320"); // KAINDRITE, ZEOCITE,   EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_311 = forge("axe/311"); // KAINDRITE, NEPENTINE, NEPENTINE
        public static final ITag.INamedTag<Item> AXE_310 = forge("axe/310"); // KAINDRITE, NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> AXE_300 = forge("axe/300"); // KAINDRITE, EPIDAXITE, EPIDAXITE
        // HOE
        public static final ITag.INamedTag<Item> HOE_10 = forge("hoe/10"); // NEPENTINE, NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> HOE_21 = forge("hoe/21"); // NEPENTINE, EPIDAXITE, EPIDAXITE
        public static final ITag.INamedTag<Item> HOE_20 = forge("hoe/20"); // ZEOCITE,   ZEOCITE,   NEPENTINE
        public static final ITag.INamedTag<Item> HOE_32 = forge("hoe/32"); // ZEOCITE,   ZEOCITE,   EPIDAXITE
        public static final ITag.INamedTag<Item> HOE_31 = forge("hoe/31"); // ZEOCITE,   NEPENTINE, NEPENTINE
        public static final ITag.INamedTag<Item> HOE_30 = forge("hoe/30"); // ZEOCITE,   NEPENTINE, EPIDAXITE
        // SWORD
        public static final ITag.INamedTag<Item> SWORD_10 = forge("sword/10"); // NEPENTINE, NEPENTINE, EPIDAXITE
        public static final ITag.INamedTag<Item> SWORD_21 = forge("sword/21"); // NEPENTINE, EPIDAXITE, EPIDAXITE
        public static final ITag.INamedTag<Item> SWORD_20 = forge("sword/20"); // ZEOCITE,   ZEOCITE,   NEPENTINE
        public static final ITag.INamedTag<Item> SWORD_32 = forge("sword/32"); // ZEOCITE,   ZEOCITE,   EPIDAXITE
        public static final ITag.INamedTag<Item> SWORD_31 = forge("sword/31"); // ZEOCITE,   NEPENTINE, NEPENTINE
        public static final ITag.INamedTag<Item> SWORD_30 = forge("sword/30"); // ZEOCITE,   NEPENTINE, EPIDAXITE




        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(TestMod.MOD_ID, path).toString());
        }
    }
}

