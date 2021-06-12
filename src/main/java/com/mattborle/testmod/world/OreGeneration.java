package com.mattborle.testmod.world;

import com.mattborle.testmod.setup.ModBlocks;
import com.mattborle.testmod.setup.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {

        // SPECIFIC WORLDS:
        // NETHER ======================================================================================================
        if(event.getCategory().equals(Biome.Category.NETHER))
        {
            // EPIDAXITE -----------------------------------------------------------------------------------------------
            // Generates between y=8 and y=120
            generateOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,   // Block to replace
                    ModBlocks.NETHER_EPIDAXITE_ORE.get().defaultBlockState(),   // Ore to take its place
                    4,        // Max ores per vein
                    8,      // Bottom of generation
                    120,    // Top of generation
                    4);   // Max veins per chunk
        }
        // THE END =====================================================================================================
        else if(event.getCategory().equals(Biome.Category.THEEND))
        {
            // NEPENTINE -----------------------------------------------------------------------------------------------
            // Generates between y=8 and y=120
            generateOre(event.getGeneration(),
                    new BlockMatchRuleTest(Blocks.END_STONE),               // Block to replace
                    ModBlocks.END_NEPENTINE_ORE.get().defaultBlockState(),  // Ore to take its place
                    4,        // Max ores per vein
                    8,      // Bottom of generation
                    120,    // Top of generation
                    4);   // Max veins per chunk
        }
        // OVERWORLD ===================================================================================================
        else if(!(event.getCategory().equals(Biome.Category.NETHER)) || event.getCategory().equals(Biome.Category.THEEND))
        {
            // EPIDAXITE -----------------------------------------------------------------------------------------------
            // Generates between y=2 and y=15 in stone
            generateOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,         // Block to replace
                    ModBlocks.EPIDAXITE_ORE.get().defaultBlockState(),      // Ore to take its place
                    4,       // Max ores per vein
                    2,     // Bottom of generation
                    15,    // Top of generation
                    2);  // Max veins per chunk
            // NEPENTINE -----------------------------------------------------------------------------------------------
            // Generates between y=10 and y=20 in stone
            generateOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,         // Block to replace
                    ModBlocks.NEPENTINE_ORE.get().defaultBlockState(),      // Ore to take its place
                    4,       // Max ores per vein
                    10,    // Bottom of generation
                    20,    // Top of generation
                    2);  // Max veins per chunk
        }
        // Other worlds can be added here with an else{}.
    }

    //Examples:
    //  replace block:
    //      new BlockMatchRuleTest(Blocks.END_STONE)
    //  replace tag:
    //      OreFeatureConfig.FillerBlockType.NETHERRACK

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int maxPerChunk) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(maxPerChunk));
    }
}
