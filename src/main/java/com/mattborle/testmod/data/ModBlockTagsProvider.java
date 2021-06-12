package com.mattborle.testmod.data;

import com.mattborle.testmod.TestMod;
import com.mattborle.testmod.setup.ModBlocks;
import com.mattborle.testmod.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, TestMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.ORES_EPIDAXITE).add(ModBlocks.EPIDAXITE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_EPIDAXITE);
        tag(ModTags.Blocks.ORES_NETHER_EPIDAXITE).add(ModBlocks.NETHER_EPIDAXITE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_NETHER_EPIDAXITE);
        tag(ModTags.Blocks.STORAGE_BLOCKS_EPIDAXITE).add(ModBlocks.EPIDAXITE_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_EPIDAXITE);

        tag(ModTags.Blocks.ORES_NEPENTINE).add(ModBlocks.END_NEPENTINE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_END_NEPENTINE);
        tag(ModTags.Blocks.ORES_END_NEPENTINE).add(ModBlocks.NEPENTINE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_NEPENTINE);
        tag(ModTags.Blocks.STORAGE_BLOCKS_NEPENTINE).add(ModBlocks.NEPENTINE_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_NEPENTINE);
    }
}
