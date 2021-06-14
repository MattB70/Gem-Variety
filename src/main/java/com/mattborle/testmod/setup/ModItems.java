package com.mattborle.testmod.setup;

import com.mattborle.testmod.items.Epidaxite;
import com.mattborle.testmod.items.Kaindrite;
import com.mattborle.testmod.items.Nepentine;
import com.mattborle.testmod.items.Zeocite;
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

    public void addInformation() {

    }

    static void register() {}




    // EPIDAXITE =======================================================================================================
    // Heavy
    static float epidaxite_ready = -0.18f;
    static float epidaxite_ready_sword = -0.22f;
    // GEM
    public static final RegistryObject<Epidaxite> EPIDAXITE = Registration.ITEMS.register("epidaxite", () ->
            new Epidaxite(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<PickaxeItem> EPIDAXITE_PICKAXE = Registration.ITEMS.register("epidaxite_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.EPIDAXITE,
                    1,                                   // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", epidaxite_ready),   // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> EPIDAXITE_AXE = Registration.ITEMS.register("epidaxite_axe", () ->
            new AxeItem(
                    ModItemTier.EPIDAXITE,
                    5.0f,                                // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", epidaxite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> EPIDAXITE_SHOVEL = Registration.ITEMS.register("epidaxite_shovel", () ->
            new ShovelItem(
                    ModItemTier.EPIDAXITE,
                    1.5f,                                // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", epidaxite_ready),    // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> EPIDAXITE_HOE = Registration.ITEMS.register("epidaxite_hoe", () ->
            new HoeItem(
                    ModItemTier.EPIDAXITE,
                    -3,                                 // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", epidaxite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> EPIDAXITE_SWORD = Registration.ITEMS.register("epidaxite_sword", () ->
            new SwordItem(
                    ModItemTier.EPIDAXITE,
                    3,                                    // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", epidaxite_ready_sword),// READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));



    // NEPENTINE =======================================================================================================
    // Light
    static float nepentine_ready = 0.25f;
    static float nepentine_ready_sword = 0.35f;
    // GEM
    public static final RegistryObject<Nepentine> NEPENTINE = Registration.ITEMS.register("nepentine", () ->
            new Nepentine(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<PickaxeItem> NEPENTINE_PICKAXE = Registration.ITEMS.register("nepentine_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.NEPENTINE,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", nepentine_ready),     // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> NEPENTINE_AXE = Registration.ITEMS.register("nepentine_axe", () ->
            new AxeItem(
                    ModItemTier.NEPENTINE,
                    5.0f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", nepentine_ready),         // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> NEPENTINE_SHOVEL = Registration.ITEMS.register("nepentine_shovel", () ->
            new ShovelItem(
                    ModItemTier.NEPENTINE,
                    1.5f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", nepentine_ready),      // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> NEPENTINE_HOE = Registration.ITEMS.register("nepentine_hoe", () ->
            new HoeItem(
                    ModItemTier.NEPENTINE,
                    -3,                                   // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", nepentine_ready),         // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> NEPENTINE_SWORD = Registration.ITEMS.register("nepentine_sword", () ->
            new SwordItem(
                    ModItemTier.NEPENTINE,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", nepentine_ready_sword), // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));



    // ZEOCITE =========================================================================================================
    // Very Light
    static float zeocite_ready = 0.65f;
    static float zeocite_ready_sword = 0.80f;
    // GEM
    public static final RegistryObject<Zeocite> ZEOCITE = Registration.ITEMS.register("zeocite", () ->
            new Zeocite(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<PickaxeItem> ZEOCITE_PICKAXE = Registration.ITEMS.register("zeocite_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.ZEOCITE,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", zeocite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> ZEOCITE_AXE = Registration.ITEMS.register("zeocite_axe", () ->
            new AxeItem(
                    ModItemTier.ZEOCITE,
                    5.0f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", zeocite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> ZEOCITE_SHOVEL = Registration.ITEMS.register("zeocite_shovel", () ->
            new ShovelItem(
                    ModItemTier.ZEOCITE,
                    1.5f,                                  // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", zeocite_ready),        // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> ZEOCITE_HOE = Registration.ITEMS.register("zeocite_hoe", () ->
            new HoeItem(
                    ModItemTier.ZEOCITE,
                    -3,                                   // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", zeocite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> ZEOCITE_SWORD = Registration.ITEMS.register("zeocite_sword", () ->
            new SwordItem(
                    ModItemTier.ZEOCITE,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", zeocite_ready_sword),   // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));



    // KAINDRITE =======================================================================================================
    // Heavy
    static float kaindrite_ready = -0.20f;
    static float kaindrite_ready_sword = -0.28f;
    // GEM
    public static final RegistryObject<Kaindrite> KAINDRITE = Registration.ITEMS.register("kaindrite", () ->
            new Kaindrite(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    // TOOLS
    public static final RegistryObject<PickaxeItem> KAINDRITE_PICKAXE = Registration.ITEMS.register("kaindrite_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.KAINDRITE,
                    1,                                       // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", kaindrite_ready),       // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> KAINDRITE_AXE = Registration.ITEMS.register("kaindrite_axe", () ->
            new AxeItem(
                    ModItemTier.KAINDRITE,
                    5.0f,                                    // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", kaindrite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> KAINDRITE_SHOVEL = Registration.ITEMS.register("kaindrite_shovel", () ->
            new ShovelItem(
                    ModItemTier.KAINDRITE,
                    1.5f,                                    // DAMAGE   (see tier in ModItemTier)
                    readySpeed("shovel", kaindrite_ready),        // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> KAINDRITE_HOE = Registration.ITEMS.register("kaindrite_hoe", () ->
            new HoeItem(
                    ModItemTier.KAINDRITE,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", kaindrite_ready),           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> KAINDRITE_SWORD = Registration.ITEMS.register("kaindrite_sword", () ->
            new SwordItem(
                    ModItemTier.KAINDRITE,
                    3,                                       // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", kaindrite_ready_sword),   // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));




    // MIXED ===========================================================================================================
    // MIXED ===========================================================================================================
    // MIXED ===========================================================================================================

    // Pickaxe
    public static final RegistryObject<PickaxeItem> MIXED110_PICKAXE = Registration.ITEMS.register("110_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED100_PICKAXE = Registration.ITEMS.register("100_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED221_PICKAXE = Registration.ITEMS.register("221_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED220_PICKAXE = Registration.ITEMS.register("220_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED211_PICKAXE = Registration.ITEMS.register("211_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED210_PICKAXE = Registration.ITEMS.register("210_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED200_PICKAXE = Registration.ITEMS.register("200_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED332_PICKAXE = Registration.ITEMS.register("332_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED331_PICKAXE = Registration.ITEMS.register("331_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED330_PICKAXE = Registration.ITEMS.register("330_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED322_PICKAXE = Registration.ITEMS.register("322_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED321_PICKAXE = Registration.ITEMS.register("321_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED320_PICKAXE = Registration.ITEMS.register("320_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED311_PICKAXE = Registration.ITEMS.register("311_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED310_PICKAXE = Registration.ITEMS.register("310_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> MIXED300_PICKAXE = Registration.ITEMS.register("300_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.PLACEHOLDER,
                    1,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("pickaxe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));

    
    // Axe
    public static final RegistryObject<AxeItem> MIXED110_AXE = Registration.ITEMS.register("110_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED100_AXE = Registration.ITEMS.register("100_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED221_AXE = Registration.ITEMS.register("221_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED220_AXE = Registration.ITEMS.register("220_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED211_AXE = Registration.ITEMS.register("211_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED210_AXE = Registration.ITEMS.register("210_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED200_AXE = Registration.ITEMS.register("200_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED332_AXE = Registration.ITEMS.register("332_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED331_AXE = Registration.ITEMS.register("331_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED330_AXE = Registration.ITEMS.register("330_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED322_AXE = Registration.ITEMS.register("322_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED321_AXE = Registration.ITEMS.register("321_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED320_AXE = Registration.ITEMS.register("320_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED311_AXE = Registration.ITEMS.register("311_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED310_AXE = Registration.ITEMS.register("310_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> MIXED300_AXE = Registration.ITEMS.register("300_axe", () ->
            new AxeItem(
                    ModItemTier.PLACEHOLDER,
                    5.0f,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("axe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));


    // Hoe
    public static final RegistryObject<HoeItem> MIXED110_HOE = Registration.ITEMS.register("110_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED100_HOE = Registration.ITEMS.register("100_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED221_HOE = Registration.ITEMS.register("221_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED220_HOE = Registration.ITEMS.register("220_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED211_HOE = Registration.ITEMS.register("211_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED210_HOE = Registration.ITEMS.register("210_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED200_HOE = Registration.ITEMS.register("200_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED332_HOE = Registration.ITEMS.register("332_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED331_HOE = Registration.ITEMS.register("331_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED330_HOE = Registration.ITEMS.register("330_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED322_HOE = Registration.ITEMS.register("322_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED321_HOE = Registration.ITEMS.register("321_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED320_HOE = Registration.ITEMS.register("320_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED311_HOE = Registration.ITEMS.register("311_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED310_HOE = Registration.ITEMS.register("310_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> MIXED300_HOE = Registration.ITEMS.register("300_hoe", () ->
            new HoeItem(
                    ModItemTier.PLACEHOLDER,
                    -3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("hoe", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));


    // Sword
    public static final RegistryObject<SwordItem> MIXED110_SWORD = Registration.ITEMS.register("110_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED100_SWORD = Registration.ITEMS.register("100_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED221_SWORD = Registration.ITEMS.register("221_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED220_SWORD = Registration.ITEMS.register("220_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED211_SWORD = Registration.ITEMS.register("211_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED210_SWORD = Registration.ITEMS.register("210_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED200_SWORD = Registration.ITEMS.register("200_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED332_SWORD = Registration.ITEMS.register("332_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED331_SWORD = Registration.ITEMS.register("331_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED330_SWORD = Registration.ITEMS.register("330_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED322_SWORD = Registration.ITEMS.register("322_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED321_SWORD = Registration.ITEMS.register("321_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED320_SWORD = Registration.ITEMS.register("320_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED311_SWORD = Registration.ITEMS.register("311_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED310_SWORD = Registration.ITEMS.register("310_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> MIXED300_SWORD = Registration.ITEMS.register("300_sword", () ->
            new SwordItem(
                    ModItemTier.PLACEHOLDER,
                    3,                                     // DAMAGE   (see tier in ModItemTier)
                    readySpeed("sword", 0),           // READY SPEED TODO:(replace with dynamic value)
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
}
