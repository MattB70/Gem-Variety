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

    private ItemModelBuilder builder (ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
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

        // ZEOCITE =====================================================================================================
        // Block
        withExistingParent("zeocite_block", modLoc("block/zeocite_block"));
        // Ore
        withExistingParent("end_zeocite_ore", modLoc("block/end_zeocite_ore"));
        // Tools
        builder(itemGenerated, "zeocite");
        builder(itemGenerated, "zeocite_pickaxe");
        builder(itemGenerated, "zeocite_axe");
        builder(itemGenerated, "zeocite_shovel");
        builder(itemGenerated, "zeocite_hoe");
        builder(itemGenerated, "zeocite_sword");

        // KAINDRITE ===================================================================================================
        // Block
        withExistingParent("kaindrite_block", modLoc("block/kaindrite_block"));
        // Ore
        withExistingParent("nether_kaindrite_ore", modLoc("block/nether_kaindrite_ore"));
        // Tools
        builder(itemGenerated, "kaindrite");
        builder(itemGenerated, "kaindrite_pickaxe");
        builder(itemGenerated, "kaindrite_axe");
        builder(itemGenerated, "kaindrite_shovel");
        builder(itemGenerated, "kaindrite_hoe");
        builder(itemGenerated, "kaindrite_sword");


        // MIXED =======================================================================================================
        // pickaxe
        builder(itemGenerated, "110_pickaxe");
        builder(itemGenerated, "100_pickaxe");
        builder(itemGenerated, "221_pickaxe");
        builder(itemGenerated, "220_pickaxe");
        builder(itemGenerated, "211_pickaxe");
        builder(itemGenerated, "210_pickaxe");
        builder(itemGenerated, "200_pickaxe");
        builder(itemGenerated, "332_pickaxe");
        builder(itemGenerated, "331_pickaxe");
        builder(itemGenerated, "330_pickaxe");
        builder(itemGenerated, "322_pickaxe");
        builder(itemGenerated, "321_pickaxe");
        builder(itemGenerated, "320_pickaxe");
        builder(itemGenerated, "311_pickaxe");
        builder(itemGenerated, "310_pickaxe");
        builder(itemGenerated, "300_pickaxe");
        // axe
        builder(itemGenerated, "110_axe");
        builder(itemGenerated, "100_axe");
        builder(itemGenerated, "221_axe");
        builder(itemGenerated, "220_axe");
        builder(itemGenerated, "211_axe");
        builder(itemGenerated, "210_axe");
        builder(itemGenerated, "200_axe");
        builder(itemGenerated, "332_axe");
        builder(itemGenerated, "331_axe");
        builder(itemGenerated, "330_axe");
        builder(itemGenerated, "322_axe");
        builder(itemGenerated, "321_axe");
        builder(itemGenerated, "320_axe");
        builder(itemGenerated, "311_axe");
        builder(itemGenerated, "310_axe");
        builder(itemGenerated, "300_axe");
        // hoe
        builder(itemGenerated, "110_hoe");
        builder(itemGenerated, "100_hoe");
        builder(itemGenerated, "221_hoe");
        builder(itemGenerated, "220_hoe");
        builder(itemGenerated, "211_hoe");
        builder(itemGenerated, "210_hoe");
        builder(itemGenerated, "200_hoe");
        builder(itemGenerated, "332_hoe");
        builder(itemGenerated, "331_hoe");
        builder(itemGenerated, "330_hoe");
        builder(itemGenerated, "322_hoe");
        builder(itemGenerated, "321_hoe");
        builder(itemGenerated, "320_hoe");
        builder(itemGenerated, "311_hoe");
        builder(itemGenerated, "310_hoe");
        builder(itemGenerated, "300_hoe");
        // sword
        builder(itemGenerated, "110_sword");
        builder(itemGenerated, "100_sword");
        builder(itemGenerated, "221_sword");
        builder(itemGenerated, "220_sword");
        builder(itemGenerated, "211_sword");
        builder(itemGenerated, "210_sword");
        builder(itemGenerated, "200_sword");
        builder(itemGenerated, "332_sword");
        builder(itemGenerated, "331_sword");
        builder(itemGenerated, "330_sword");
        builder(itemGenerated, "322_sword");
        builder(itemGenerated, "321_sword");
        builder(itemGenerated, "320_sword");
        builder(itemGenerated, "311_sword");
        builder(itemGenerated, "310_sword");
        builder(itemGenerated, "300_sword");
    }
}
