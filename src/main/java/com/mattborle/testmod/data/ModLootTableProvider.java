package com.mattborle.testmod.data;

import com.google.common.collect.ImmutableList;
import com.mattborle.testmod.setup.ModBlocks;
import com.mattborle.testmod.setup.ModItems;
import com.mattborle.testmod.setup.Registration;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationTracker) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationTracker, p_218436_2_, p_218436_3_));
    }

    public static class ModBlockLootTables extends BlockLootTables {
        @Override
        protected void addTables (){
            // ORES ====================================================================================================
            dropOther(ModBlocks.EPIDAXITE_ORE.get(), ModItems.EPIDAXITE.get());
            dropOther(ModBlocks.NETHER_EPIDAXITE_ORE.get(), ModItems.EPIDAXITE.get());

            dropOther(ModBlocks.NEPENTINE_ORE.get(), ModItems.NEPENTINE.get());
            dropOther(ModBlocks.END_NEPENTINE_ORE.get(), ModItems.NEPENTINE.get());

            dropOther(ModBlocks.END_ZEOCITE_ORE.get(), ModItems.ZEOCITE.get());

            dropOther(ModBlocks.NETHER_KAINDRITE_ORE.get(), ModItems.KAINDRITE.get());
            // BLOCKS ==================================================================================================
            dropSelf(ModBlocks.EPIDAXITE_BLOCK.get());

            dropSelf(ModBlocks.NEPENTINE_BLOCK.get());

            dropSelf(ModBlocks.ZEOCITE_BLOCK.get());

            dropSelf(ModBlocks.KAINDRITE_BLOCK.get());

        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }
}
