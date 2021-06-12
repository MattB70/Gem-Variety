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

    }
}
