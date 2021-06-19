package com.mattborle.testmod.data.client;

import com.mattborle.testmod.TestMod;
import com.mattborle.testmod.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TestMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ZEO_CORE.get());
        simpleBlock(ModBlocks.EPIDAXITE_BLOCK.get());
        simpleBlock(ModBlocks.EPIDAXITE_ORE.get());
        simpleBlock(ModBlocks.NETHER_EPIDAXITE_ORE.get());
        simpleBlock(ModBlocks.NEPENTINE_BLOCK.get());
        simpleBlock(ModBlocks.NEPENTINE_ORE.get());
        simpleBlock(ModBlocks.END_NEPENTINE_ORE.get());
        simpleBlock(ModBlocks.ZEOCITE_BLOCK.get());
        simpleBlock(ModBlocks.END_ZEOCITE_ORE.get());
        simpleBlock(ModBlocks.KAINDRITE_BLOCK.get());
        simpleBlock(ModBlocks.NETHER_KAINDRITE_ORE.get());
    }
}
