package com.mattborle.testmod.data.client;

import com.mattborle.testmod.TestMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TestMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        // EPIDAXITE ===================================================================================================
            // Block
        withExistingParent("epidaxite_block", modLoc("block/epidaxite_block"));
            // Ore
        withExistingParent("epidaxite_ore", modLoc("block/epidaxite_ore"));
        withExistingParent("nether_epidaxite_ore", modLoc("block/nether_epidaxite_ore"));
            // Tools
        builder(itemGenerated, "epidaxite");
        builder(itemGenerated, "epidaxite_pickaxe");
        builder(itemGenerated, "epidaxite_axe");
        builder(itemGenerated, "epidaxite_shovel");
        builder(itemGenerated, "epidaxite_hoe");
        builder(itemGenerated, "epidaxite_sword");

        // NEPENTINE ===================================================================================================
            // Block
        withExistingParent("nepentine_block", modLoc("block/nepentine_block"));
            // Ore
        withExistingParent("nepentine_ore", modLoc("block/nepentine_ore"));
        withExistingParent("end_nepentine_ore", modLoc("block/end_nepentine_ore"));
            // Tools
        builder(itemGenerated, "nepentine");
        builder(itemGenerated, "nepentine_pickaxe");
        builder(itemGenerated, "nepentine_axe");
        builder(itemGenerated, "nepentine_shovel");
        builder(itemGenerated, "nepentine_hoe");
        builder(itemGenerated, "nepentine_sword");
    }


    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
