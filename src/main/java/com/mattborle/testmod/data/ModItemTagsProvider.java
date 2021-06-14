package com.mattborle.testmod.data;

import com.mattborle.testmod.TestMod;
import com.mattborle.testmod.setup.ModItems;
import com.mattborle.testmod.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, TestMod.MOD_ID, existingFileHelper);
    }

    protected void registerTags() {

        // EPIDAXITE ===================================================================================================
            // ORE
        copy(ModTags.Blocks.ORES_EPIDAXITE, ModTags.Items.ORES_EPIDAXITE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.ORES_NETHER_EPIDAXITE, ModTags.Items.ORES_NETHER_EPIDAXITE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
            // BLOCK
        copy(ModTags.Blocks.STORAGE_BLOCKS_EPIDAXITE, ModTags.Items.STORAGE_BLOCKS_EPIDAXITE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
            // GEM
        tag(ModTags.Items.EPIDAXITE).add(ModItems.EPIDAXITE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.EPIDAXITE);
            // TOOLS
        tag(ModTags.Items.PICKAXE_EPIDAXITE).add(ModItems.EPIDAXITE_PICKAXE.get());
        tag(ModTags.Items.AXE_EPIDAXITE).add(ModItems.EPIDAXITE_AXE.get());
        tag(ModTags.Items.SHOVEL_EPIDAXITE).add(ModItems.EPIDAXITE_SHOVEL.get());
        tag(ModTags.Items.HOE_EPIDAXITE).add(ModItems.EPIDAXITE_HOE.get());
        tag(ModTags.Items.SWORD_EPIDAXITE).add(ModItems.EPIDAXITE_SWORD.get());

        // NEPENTINE ===================================================================================================
            // ORE
        copy(ModTags.Blocks.ORES_NEPENTINE, ModTags.Items.ORES_NEPENTINE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.ORES_END_NEPENTINE, ModTags.Items.ORES_END_NEPENTINE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
            // BLOCK
        copy(ModTags.Blocks.STORAGE_BLOCKS_NEPENTINE, ModTags.Items.STORAGE_BLOCKS_NEPENTINE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
            // GEM
        tag(ModTags.Items.NEPENTINE).add(ModItems.NEPENTINE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.NEPENTINE);
            // TOOLS
        tag(ModTags.Items.PICKAXE_NEPENTINE).add(ModItems.NEPENTINE_PICKAXE.get());
        tag(ModTags.Items.AXE_NEPENTINE).add(ModItems.NEPENTINE_AXE.get());
        tag(ModTags.Items.SHOVEL_NEPENTINE).add(ModItems.NEPENTINE_SHOVEL.get());
        tag(ModTags.Items.HOE_NEPENTINE).add(ModItems.NEPENTINE_HOE.get());
        tag(ModTags.Items.SWORD_NEPENTINE).add(ModItems.NEPENTINE_SWORD.get());

        // ZEOCITE =====================================================================================================
        // ORE
        copy(ModTags.Blocks.ORES_END_ZEOCITE, ModTags.Items.ORES_END_ZEOCITE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        // BLOCK
        copy(ModTags.Blocks.STORAGE_BLOCKS_ZEOCITE, ModTags.Items.STORAGE_BLOCKS_ZEOCITE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        // GEM
        tag(ModTags.Items.ZEOCITE).add(ModItems.ZEOCITE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.ZEOCITE);
        // TOOLS
        tag(ModTags.Items.PICKAXE_ZEOCITE).add(ModItems.ZEOCITE_PICKAXE.get());
        tag(ModTags.Items.AXE_ZEOCITE).add(ModItems.ZEOCITE_AXE.get());
        tag(ModTags.Items.SHOVEL_ZEOCITE).add(ModItems.ZEOCITE_SHOVEL.get());
        tag(ModTags.Items.HOE_ZEOCITE).add(ModItems.ZEOCITE_HOE.get());
        tag(ModTags.Items.SWORD_ZEOCITE).add(ModItems.ZEOCITE_SWORD.get());

        // KAINDRITE ===================================================================================================
        // ORE
        copy(ModTags.Blocks.ORES_NETHER_KAINDRITE, ModTags.Items.ORES_NETHER_KAINDRITE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        // BLOCK
        copy(ModTags.Blocks.STORAGE_BLOCKS_KAINDRITE, ModTags.Items.STORAGE_BLOCKS_KAINDRITE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        // GEM
        tag(ModTags.Items.KAINDRITE).add(ModItems.KAINDRITE.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.KAINDRITE);
        // TOOLS
        tag(ModTags.Items.PICKAXE_KAINDRITE).add(ModItems.KAINDRITE_PICKAXE.get());
        tag(ModTags.Items.AXE_KAINDRITE).add(ModItems.KAINDRITE_AXE.get());
        tag(ModTags.Items.SHOVEL_KAINDRITE).add(ModItems.KAINDRITE_SHOVEL.get());
        tag(ModTags.Items.HOE_KAINDRITE).add(ModItems.KAINDRITE_HOE.get());
        tag(ModTags.Items.SWORD_KAINDRITE).add(ModItems.KAINDRITE_SWORD.get());



        // MIXED =======================================================================================================
        // PICKAXE
        tag(ModTags.Items.PICKAXE_110).add(ModItems.MIXED110_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_100).add(ModItems.MIXED100_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_221).add(ModItems.MIXED221_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_220).add(ModItems.MIXED220_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_211).add(ModItems.MIXED211_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_210).add(ModItems.MIXED210_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_200).add(ModItems.MIXED200_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_332).add(ModItems.MIXED332_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_331).add(ModItems.MIXED331_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_330).add(ModItems.MIXED330_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_322).add(ModItems.MIXED322_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_321).add(ModItems.MIXED321_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_320).add(ModItems.MIXED320_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_311).add(ModItems.MIXED311_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_310).add(ModItems.MIXED310_PICKAXE.get());
        tag(ModTags.Items.PICKAXE_300).add(ModItems.MIXED300_PICKAXE.get());
        // AXE
        tag(ModTags.Items.AXE_110).add(ModItems.MIXED110_AXE.get());
        tag(ModTags.Items.AXE_100).add(ModItems.MIXED100_AXE.get());
        tag(ModTags.Items.AXE_221).add(ModItems.MIXED221_AXE.get());
        tag(ModTags.Items.AXE_220).add(ModItems.MIXED220_AXE.get());
        tag(ModTags.Items.AXE_211).add(ModItems.MIXED211_AXE.get());
        tag(ModTags.Items.AXE_210).add(ModItems.MIXED210_AXE.get());
        tag(ModTags.Items.AXE_200).add(ModItems.MIXED200_AXE.get());
        tag(ModTags.Items.AXE_332).add(ModItems.MIXED332_AXE.get());
        tag(ModTags.Items.AXE_331).add(ModItems.MIXED331_AXE.get());
        tag(ModTags.Items.AXE_330).add(ModItems.MIXED330_AXE.get());
        tag(ModTags.Items.AXE_322).add(ModItems.MIXED322_AXE.get());
        tag(ModTags.Items.AXE_321).add(ModItems.MIXED321_AXE.get());
        tag(ModTags.Items.AXE_320).add(ModItems.MIXED320_AXE.get());
        tag(ModTags.Items.AXE_311).add(ModItems.MIXED311_AXE.get());
        tag(ModTags.Items.AXE_310).add(ModItems.MIXED310_AXE.get());
        tag(ModTags.Items.AXE_300).add(ModItems.MIXED300_AXE.get());
        // HOE
        tag(ModTags.Items.HOE_110).add(ModItems.MIXED110_HOE.get());
        tag(ModTags.Items.HOE_100).add(ModItems.MIXED100_HOE.get());
        tag(ModTags.Items.HOE_221).add(ModItems.MIXED221_HOE.get());
        tag(ModTags.Items.HOE_220).add(ModItems.MIXED220_HOE.get());
        tag(ModTags.Items.HOE_211).add(ModItems.MIXED211_HOE.get());
        tag(ModTags.Items.HOE_210).add(ModItems.MIXED210_HOE.get());
        tag(ModTags.Items.HOE_200).add(ModItems.MIXED200_HOE.get());
        tag(ModTags.Items.HOE_332).add(ModItems.MIXED332_HOE.get());
        tag(ModTags.Items.HOE_331).add(ModItems.MIXED331_HOE.get());
        tag(ModTags.Items.HOE_330).add(ModItems.MIXED330_HOE.get());
        tag(ModTags.Items.HOE_322).add(ModItems.MIXED322_HOE.get());
        tag(ModTags.Items.HOE_321).add(ModItems.MIXED321_HOE.get());
        tag(ModTags.Items.HOE_320).add(ModItems.MIXED320_HOE.get());
        tag(ModTags.Items.HOE_311).add(ModItems.MIXED311_HOE.get());
        tag(ModTags.Items.HOE_310).add(ModItems.MIXED310_HOE.get());
        tag(ModTags.Items.HOE_300).add(ModItems.MIXED300_HOE.get());
        // PICKAXE
        tag(ModTags.Items.SWORD_110).add(ModItems.MIXED110_SWORD.get());
        tag(ModTags.Items.SWORD_100).add(ModItems.MIXED100_SWORD.get());
        tag(ModTags.Items.SWORD_221).add(ModItems.MIXED221_SWORD.get());
        tag(ModTags.Items.SWORD_220).add(ModItems.MIXED220_SWORD.get());
        tag(ModTags.Items.SWORD_211).add(ModItems.MIXED211_SWORD.get());
        tag(ModTags.Items.SWORD_210).add(ModItems.MIXED210_SWORD.get());
        tag(ModTags.Items.SWORD_200).add(ModItems.MIXED200_SWORD.get());
        tag(ModTags.Items.SWORD_332).add(ModItems.MIXED332_SWORD.get());
        tag(ModTags.Items.SWORD_331).add(ModItems.MIXED331_SWORD.get());
        tag(ModTags.Items.SWORD_330).add(ModItems.MIXED330_SWORD.get());
        tag(ModTags.Items.SWORD_322).add(ModItems.MIXED322_SWORD.get());
        tag(ModTags.Items.SWORD_321).add(ModItems.MIXED321_SWORD.get());
        tag(ModTags.Items.SWORD_320).add(ModItems.MIXED320_SWORD.get());
        tag(ModTags.Items.SWORD_311).add(ModItems.MIXED311_SWORD.get());
        tag(ModTags.Items.SWORD_310).add(ModItems.MIXED310_SWORD.get());
        tag(ModTags.Items.SWORD_300).add(ModItems.MIXED300_SWORD.get());

    }
}
