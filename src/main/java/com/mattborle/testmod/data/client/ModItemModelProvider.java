package com.mattborle.testmod.data.client;

import com.mattborle.testmod.TestMod;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;


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
        builder(itemGenerated, "epidaxite");
        // Block
        withExistingParent("epidaxite_block", modLoc("block/epidaxite_block"));
        // Ore
        withExistingParent("epidaxite_ore", modLoc("block/epidaxite_ore"));
        withExistingParent("nether_epidaxite_ore", modLoc("block/nether_epidaxite_ore"));
        // Tools
        builder(itemGenerated, "epidaxite_pickaxe");
        builder(itemGenerated, "epidaxite_axe");
        builder(itemGenerated, "epidaxite_shovel");
        builder(itemGenerated, "epidaxite_hoe");
        builder(itemGenerated, "epidaxite_sword");
        // Armor
        builder(itemGenerated, "epidaxite_helmet");
        builder(itemGenerated, "epidaxite_chestplate");
        builder(itemGenerated, "epidaxite_leggings");
        builder(itemGenerated, "epidaxite_boots");
        builder(itemGenerated, "epidaxite_layer_1");
        builder(itemGenerated, "epidaxite_layer_2");

        // NEPENTINE ===================================================================================================
        builder(itemGenerated, "nepentine");
        // Block
        withExistingParent("nepentine_block", modLoc("block/nepentine_block"));
        // Ore
        withExistingParent("nepentine_ore", modLoc("block/nepentine_ore"));
        withExistingParent("end_nepentine_ore", modLoc("block/end_nepentine_ore"));
        // Tools
        builder(itemGenerated, "nepentine_pickaxe");
        builder(itemGenerated, "nepentine_axe");
        builder(itemGenerated, "nepentine_shovel");
        builder(itemGenerated, "nepentine_hoe");
        builder(itemGenerated, "nepentine_sword");
        // Armor
        builder(itemGenerated, "nepentine_helmet");
        builder(itemGenerated, "nepentine_chestplate");
        builder(itemGenerated, "nepentine_leggings");
        builder(itemGenerated, "nepentine_boots");

        // ZEOCITE =====================================================================================================
        builder(itemGenerated, "zeocite");
        // Block
        withExistingParent("zeocite_block", modLoc("block/zeocite_block"));
        // Ore
        withExistingParent("end_zeocite_ore", modLoc("block/end_zeocite_ore"));
        // Tools
        builder(itemGenerated, "zeocite_pickaxe");
        builder(itemGenerated, "zeocite_axe");
        builder(itemGenerated, "zeocite_shovel");
        builder(itemGenerated, "zeocite_hoe");
        builder(itemGenerated, "zeocite_sword");
        // Armor
        builder(itemGenerated, "zeocite_helmet");
        builder(itemGenerated, "zeocite_chestplate");
        builder(itemGenerated, "zeocite_leggings");
        builder(itemGenerated, "zeocite_boots");

        // KAINDRITE ===================================================================================================
        builder(itemGenerated, "kaindrite");
        // Block
        withExistingParent("kaindrite_block", modLoc("block/kaindrite_block"));
        // Ore
        withExistingParent("nether_kaindrite_ore", modLoc("block/nether_kaindrite_ore"));
        // Tools
        builder(itemGenerated, "kaindrite_pickaxe");
        builder(itemGenerated, "kaindrite_axe");
        builder(itemGenerated, "kaindrite_shovel");
        builder(itemGenerated, "kaindrite_hoe");
        builder(itemGenerated, "kaindrite_sword");
        // Armor
        builder(itemGenerated, "kaindrite_helmet");
        builder(itemGenerated, "kaindrite_chestplate");
        builder(itemGenerated, "kaindrite_leggings");
        builder(itemGenerated, "kaindrite_boots");


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
        builder(itemGenerated, "10_hoe");
        builder(itemGenerated, "21_hoe");
        builder(itemGenerated, "20_hoe");
        builder(itemGenerated, "32_hoe");
        builder(itemGenerated, "31_hoe");
        builder(itemGenerated, "30_hoe");
        // sword
        builder(itemGenerated, "10_sword");
        builder(itemGenerated, "21_sword");
        builder(itemGenerated, "20_sword");
        builder(itemGenerated, "32_sword");
        builder(itemGenerated, "31_sword");
        builder(itemGenerated, "30_sword");


        /*
        // Programmatically build mixed

        private void buildMixed(String type) {
            for(int i = 0; i < 4; i++){
                for(int j = i; j >= 0; j--){
                    for(int k = j; k >= 0; k--){
                        if(!(i == j && j == k)){
                            String tool_name = Integer.toString(i) + Integer.toString(j) + Integer.toString(k) + "_" + type;
                            builder(itemGenerated, tool_name);
                        }
                    }
                }
            }
        }
        */
    }
}
