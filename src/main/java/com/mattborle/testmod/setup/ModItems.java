package com.mattborle.testmod.setup;

import com.mattborle.testmod.items.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;


public class ModItems {

    // HELPERS: ========================================================================================================
    private static float readySpeed(String tool, float multiplier) {
        /*  Diamond Tool reference:
                    damage  ready_speed
        Pickaxe:    1,      -2.8f
        Axe:        5.0f,   -3.0f
        Shovel:     1.5f,   -3.0f
        Hoe:        -3,     0.0f
        Sword:      3,      -2.4f
    */
        float ready_pickaxe_base = -2.8f;
        float ready_axe_base = -3.0f;
        float ready_shovel_base = -3.0f;
        float ready_hoe_base = -2.0f;
        float ready_sword_base = -2.4f;

        switch(tool){
            case "pickaxe": return ready_pickaxe_base - (ready_pickaxe_base *multiplier);
            case "axe":     return ready_axe_base - (ready_axe_base *multiplier);
            case "shovel":  return ready_shovel_base - (ready_shovel_base *multiplier);
            case "hoe":     return ready_hoe_base - (ready_hoe_base *multiplier);
            case "sword":   return ready_sword_base - (ready_sword_base *multiplier);
            default:        return 0.0f;
        }
    }
    static void register() {}



    // EPIDAXITE =======================================================================================================
    // Heavy
    static float epidaxite_ready = -0.18f;
    static float epidaxite_ready_sword = -0.22f;
    // GEM
    public static final RegistryObject<Epidaxite> EPIDAXITE = Registration.ITEMS.register("epidaxite", () -> new Epidaxite(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<ModPickaxeItem> EPIDAXITE_PICKAXE = Registration.ITEMS.register("epidaxite_pickaxe", () -> new ModPickaxeItem(ModItemTier.EPIDAXITE,
                    1,                                   // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", epidaxite_ready),   // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),0));
    public static final RegistryObject<ModAxeItem> EPIDAXITE_AXE = Registration.ITEMS.register("epidaxite_axe", () -> new ModAxeItem(ModItemTier.EPIDAXITE,
                    5.0f,                                // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", epidaxite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),0));
    public static final RegistryObject<ModShovelItem> EPIDAXITE_SHOVEL = Registration.ITEMS.register("epidaxite_shovel", () -> new ModShovelItem(ModItemTier.EPIDAXITE,
                    1.5f,                                // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", epidaxite_ready),    // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),0));
    public static final RegistryObject<ModHoeItem> EPIDAXITE_HOE = Registration.ITEMS.register("epidaxite_hoe", () -> new ModHoeItem(ModItemTier.EPIDAXITE,
                    -3,                                 // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", epidaxite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),0));
    public static final RegistryObject<ModSwordItem> EPIDAXITE_SWORD = Registration.ITEMS.register("epidaxite_sword", () -> new ModSwordItem(ModItemTier.EPIDAXITE,
                    3,                                    // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", epidaxite_ready_sword),// READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),0));



    // NEPENTINE =======================================================================================================
    // Light
    static float nepentine_ready = 0.25f;
    static float nepentine_ready_sword = 0.35f;
    // GEM
    public static final RegistryObject<Nepentine> NEPENTINE = Registration.ITEMS.register("nepentine", () -> new Nepentine(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<ModPickaxeItem> NEPENTINE_PICKAXE = Registration.ITEMS.register("nepentine_pickaxe", () -> new ModPickaxeItem(ModItemTier.NEPENTINE,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", nepentine_ready),     // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),1));
    public static final RegistryObject<ModAxeItem> NEPENTINE_AXE = Registration.ITEMS.register("nepentine_axe", () -> new ModAxeItem(ModItemTier.NEPENTINE,
                    5.0f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", nepentine_ready),         // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),1));
    public static final RegistryObject<ModShovelItem> NEPENTINE_SHOVEL = Registration.ITEMS.register("nepentine_shovel", () -> new ModShovelItem(ModItemTier.NEPENTINE,
                    1.5f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", nepentine_ready),      // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),1));
    public static final RegistryObject<ModHoeItem> NEPENTINE_HOE = Registration.ITEMS.register("nepentine_hoe", () -> new ModHoeItem(ModItemTier.NEPENTINE,
                    -3,                                   // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", nepentine_ready),         // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),1));
    public static final RegistryObject<ModSwordItem> NEPENTINE_SWORD = Registration.ITEMS.register("nepentine_sword", () -> new ModSwordItem(ModItemTier.NEPENTINE,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", nepentine_ready_sword), // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),1));



    // ZEOCITE =========================================================================================================
    // Very Light
    static float zeocite_ready = 0.65f;
    static float zeocite_ready_sword = 0.80f;
    // GEM
    public static final RegistryObject<Zeocite> ZEOCITE = Registration.ITEMS.register("zeocite", () -> new Zeocite(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<ModPickaxeItem> ZEOCITE_PICKAXE = Registration.ITEMS.register("zeocite_pickaxe", () -> new ModPickaxeItem(ModItemTier.ZEOCITE,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", zeocite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),2));
    public static final RegistryObject<ModAxeItem> ZEOCITE_AXE = Registration.ITEMS.register("zeocite_axe", () -> new ModAxeItem(ModItemTier.ZEOCITE,
                    5.0f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", zeocite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),2));
    public static final RegistryObject<ModShovelItem> ZEOCITE_SHOVEL = Registration.ITEMS.register("zeocite_shovel", () -> new ModShovelItem(ModItemTier.ZEOCITE,
                    1.5f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", zeocite_ready),        // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),2));
    public static final RegistryObject<ModHoeItem> ZEOCITE_HOE = Registration.ITEMS.register("zeocite_hoe", () -> new ModHoeItem(ModItemTier.ZEOCITE,
                    -3,                                   // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", zeocite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),2));
    public static final RegistryObject<ModSwordItem> ZEOCITE_SWORD = Registration.ITEMS.register("zeocite_sword", () -> new ModSwordItem(ModItemTier.ZEOCITE,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", zeocite_ready_sword),   // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),2));



    // KAINDRITE =======================================================================================================
    // Heavy
    static float kaindrite_ready = -0.20f;
    static float kaindrite_ready_sword = -0.28f;
    // GEM
    public static final RegistryObject<Kaindrite> KAINDRITE = Registration.ITEMS.register("kaindrite", () -> new Kaindrite(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<ModPickaxeItem> KAINDRITE_PICKAXE = Registration.ITEMS.register("kaindrite_pickaxe", () -> new ModPickaxeItem(ModItemTier.KAINDRITE,
                    1,                                       // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", kaindrite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),3));
    public static final RegistryObject<ModAxeItem> KAINDRITE_AXE = Registration.ITEMS.register("kaindrite_axe", () -> new ModAxeItem(ModItemTier.KAINDRITE,
                    5.0f,                                    // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", kaindrite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),3));
    public static final RegistryObject<ModShovelItem> KAINDRITE_SHOVEL = Registration.ITEMS.register("kaindrite_shovel", () -> new ModShovelItem(ModItemTier.KAINDRITE,
                    1.5f,                                    // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", kaindrite_ready),        // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),3));
    public static final RegistryObject<ModHoeItem> KAINDRITE_HOE = Registration.ITEMS.register("kaindrite_hoe", () -> new ModHoeItem(ModItemTier.KAINDRITE,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", kaindrite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),3));
    public static final RegistryObject<ModSwordItem> KAINDRITE_SWORD = Registration.ITEMS.register("kaindrite_sword", () -> new ModSwordItem(ModItemTier.KAINDRITE,
                    3,                                       // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", kaindrite_ready_sword),   // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),3));




    // MIXED ===========================================================================================================
    // MIXED ===========================================================================================================
    // MIXED ===========================================================================================================
    // Mixed ready speeds:
    static float ready10 = (nepentine_ready + epidaxite_ready)/2;
    static float ready21 = (zeocite_ready + nepentine_ready)/2;
    static float ready20 = (zeocite_ready + epidaxite_ready)/2;
    static float ready32 = (kaindrite_ready + zeocite_ready)/2;
    static float ready31 = (kaindrite_ready + nepentine_ready)/2;
    static float ready30 = (kaindrite_ready + epidaxite_ready)/2;
    static float ready110 = (nepentine_ready+ nepentine_ready + epidaxite_ready)/3;
    static float ready100 = (nepentine_ready + epidaxite_ready + epidaxite_ready)/3;
    static float ready221 = (zeocite_ready + zeocite_ready + nepentine_ready)/3;
    static float ready220 = (zeocite_ready + zeocite_ready + epidaxite_ready)/3;
    static float ready211 = (zeocite_ready + nepentine_ready + nepentine_ready)/3;
    static float ready210 = (zeocite_ready + nepentine_ready + epidaxite_ready)/3;
    static float ready200 = (zeocite_ready + epidaxite_ready + epidaxite_ready)/3;
    static float ready332 = (kaindrite_ready + kaindrite_ready + zeocite_ready)/3;
    static float ready331 = (kaindrite_ready + kaindrite_ready + nepentine_ready)/3;
    static float ready330 = (kaindrite_ready + kaindrite_ready + epidaxite_ready)/3;
    static float ready322 = (kaindrite_ready + zeocite_ready + zeocite_ready)/3;
    static float ready321 = (kaindrite_ready + zeocite_ready + nepentine_ready)/3;
    static float ready320 = (kaindrite_ready + zeocite_ready + epidaxite_ready)/3;
    static float ready311 = (kaindrite_ready + nepentine_ready + nepentine_ready)/3;
    static float ready310 = (kaindrite_ready + nepentine_ready + epidaxite_ready)/3;
    static float ready300 = (kaindrite_ready + epidaxite_ready + epidaxite_ready)/3;

    // Pickaxe
    public static final RegistryObject<ModPickaxeItem> MIXED110_PICKAXE = Registration.ITEMS.register("110_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED110,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready110),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),110));
    public static final RegistryObject<ModPickaxeItem> MIXED100_PICKAXE = Registration.ITEMS.register("100_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED100,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready100),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),100));
    public static final RegistryObject<ModPickaxeItem> MIXED221_PICKAXE = Registration.ITEMS.register("221_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED221,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready221),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),221));
    public static final RegistryObject<ModPickaxeItem> MIXED220_PICKAXE = Registration.ITEMS.register("220_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED220,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready220),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),220));
    public static final RegistryObject<ModPickaxeItem> MIXED211_PICKAXE = Registration.ITEMS.register("211_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED211,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready211),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),211));
    public static final RegistryObject<ModPickaxeItem> MIXED210_PICKAXE = Registration.ITEMS.register("210_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED210,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready210),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),210));
    public static final RegistryObject<ModPickaxeItem> MIXED200_PICKAXE = Registration.ITEMS.register("200_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED200,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready200),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),200));
    public static final RegistryObject<ModPickaxeItem> MIXED332_PICKAXE = Registration.ITEMS.register("332_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED332,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready332),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),322));
    public static final RegistryObject<ModPickaxeItem> MIXED331_PICKAXE = Registration.ITEMS.register("331_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED331,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready331),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),331));
    public static final RegistryObject<ModPickaxeItem> MIXED330_PICKAXE = Registration.ITEMS.register("330_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED330,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready330),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),330));
    public static final RegistryObject<ModPickaxeItem> MIXED322_PICKAXE = Registration.ITEMS.register("322_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED322,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready322),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),322));
    public static final RegistryObject<ModPickaxeItem> MIXED321_PICKAXE = Registration.ITEMS.register("321_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED321,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready321),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),321));
    public static final RegistryObject<ModPickaxeItem> MIXED320_PICKAXE = Registration.ITEMS.register("320_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED320,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready320),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),320));
    public static final RegistryObject<ModPickaxeItem> MIXED311_PICKAXE = Registration.ITEMS.register("311_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED311,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready311),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),311));
    public static final RegistryObject<ModPickaxeItem> MIXED310_PICKAXE = Registration.ITEMS.register("310_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED310,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready310),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),310));
    public static final RegistryObject<ModPickaxeItem> MIXED300_PICKAXE = Registration.ITEMS.register("300_pickaxe", () -> new ModPickaxeItem(ModItemTier.MIXED300,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", ready300),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),300));

    
    // Axe
    public static final RegistryObject<ModAxeItem> MIXED110_AXE = Registration.ITEMS.register("110_axe", () -> new ModAxeItem(ModItemTier.MIXED110,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready110),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),110));
    public static final RegistryObject<ModAxeItem> MIXED100_AXE = Registration.ITEMS.register("100_axe", () -> new ModAxeItem(ModItemTier.MIXED100,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready100),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),100));
    public static final RegistryObject<ModAxeItem> MIXED221_AXE = Registration.ITEMS.register("221_axe", () -> new ModAxeItem(ModItemTier.MIXED221,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready221),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),221));
    public static final RegistryObject<ModAxeItem> MIXED220_AXE = Registration.ITEMS.register("220_axe", () -> new ModAxeItem(ModItemTier.MIXED220,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready220),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),220));
    public static final RegistryObject<ModAxeItem> MIXED211_AXE = Registration.ITEMS.register("211_axe", () -> new ModAxeItem(ModItemTier.MIXED211,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready211),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),211));
    public static final RegistryObject<ModAxeItem> MIXED210_AXE = Registration.ITEMS.register("210_axe", () -> new ModAxeItem(ModItemTier.MIXED210,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready210),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),210));
    public static final RegistryObject<ModAxeItem> MIXED200_AXE = Registration.ITEMS.register("200_axe", () -> new ModAxeItem(ModItemTier.MIXED200,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready200),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),200));
    public static final RegistryObject<ModAxeItem> MIXED332_AXE = Registration.ITEMS.register("332_axe", () -> new ModAxeItem(ModItemTier.MIXED332,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready332),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),322));
    public static final RegistryObject<ModAxeItem> MIXED331_AXE = Registration.ITEMS.register("331_axe", () -> new ModAxeItem(ModItemTier.MIXED331,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready331),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),331));
    public static final RegistryObject<ModAxeItem> MIXED330_AXE = Registration.ITEMS.register("330_axe", () -> new ModAxeItem(ModItemTier.MIXED330,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready330),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),330));
    public static final RegistryObject<ModAxeItem> MIXED322_AXE = Registration.ITEMS.register("322_axe", () -> new ModAxeItem(ModItemTier.MIXED322,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready322),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),322));
    public static final RegistryObject<ModAxeItem> MIXED321_AXE = Registration.ITEMS.register("321_axe", () -> new ModAxeItem(ModItemTier.MIXED321,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready321),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),321));
    public static final RegistryObject<ModAxeItem> MIXED320_AXE = Registration.ITEMS.register("320_axe", () -> new ModAxeItem(ModItemTier.MIXED320,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready320),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),320));
    public static final RegistryObject<ModAxeItem> MIXED311_AXE = Registration.ITEMS.register("311_axe", () -> new ModAxeItem(ModItemTier.MIXED311,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready311),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),311));
    public static final RegistryObject<ModAxeItem> MIXED310_AXE = Registration.ITEMS.register("310_axe", () -> new ModAxeItem(ModItemTier.MIXED310,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready310),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),310));
    public static final RegistryObject<ModAxeItem> MIXED300_AXE = Registration.ITEMS.register("300_axe", () -> new ModAxeItem(ModItemTier.MIXED300,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", ready300),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),300));


    // Hoe
    public static final RegistryObject<ModHoeItem> MIXED10_HOE = Registration.ITEMS.register("10_hoe", () -> new ModHoeItem(ModItemTier.MIXED10,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", ready10),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),10));
    public static final RegistryObject<ModHoeItem> MIXED21_HOE = Registration.ITEMS.register("21_hoe", () -> new ModHoeItem(ModItemTier.MIXED21,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", ready21),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),21));
    public static final RegistryObject<ModHoeItem> MIXED20_HOE = Registration.ITEMS.register("20_hoe", () -> new ModHoeItem(ModItemTier.MIXED20,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", ready20),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),20));
    public static final RegistryObject<ModHoeItem> MIXED32_HOE = Registration.ITEMS.register("32_hoe", () -> new ModHoeItem(ModItemTier.MIXED32,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", ready32),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),32));
    public static final RegistryObject<ModHoeItem> MIXED31_HOE = Registration.ITEMS.register("31_hoe", () -> new ModHoeItem(ModItemTier.MIXED31,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", ready31),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),31));
    public static final RegistryObject<ModHoeItem> MIXED30_HOE = Registration.ITEMS.register("30_hoe", () -> new ModHoeItem(ModItemTier.MIXED30,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", ready30),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS),30));



    // Sword
    public static final RegistryObject<ModSwordItem> MIXED10_SWORD = Registration.ITEMS.register("10_sword", () -> new ModSwordItem(ModItemTier.MIXED10,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", ready10),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),10));
    public static final RegistryObject<ModSwordItem> MIXED21_SWORD = Registration.ITEMS.register("21_sword", () -> new ModSwordItem(ModItemTier.MIXED21,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", ready21),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),21));
    public static final RegistryObject<ModSwordItem> MIXED20_SWORD = Registration.ITEMS.register("20_sword", () -> new ModSwordItem(ModItemTier.MIXED20,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", ready20),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),20));
    public static final RegistryObject<ModSwordItem> MIXED32_SWORD = Registration.ITEMS.register("32_sword", () -> new ModSwordItem(ModItemTier.MIXED32,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", ready31),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),32));
    public static final RegistryObject<ModSwordItem> MIXED31_SWORD = Registration.ITEMS.register("31_sword", () -> new ModSwordItem(ModItemTier.MIXED31,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", ready32),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),31));
    public static final RegistryObject<ModSwordItem> MIXED30_SWORD = Registration.ITEMS.register("30_sword", () -> new ModSwordItem(ModItemTier.MIXED30,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", ready30),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT),30));
}
