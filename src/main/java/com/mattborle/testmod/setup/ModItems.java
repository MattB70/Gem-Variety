package com.mattborle.testmod.setup;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;


public class ModItems {
    /*  Diamond Tool reference:
                    damage  ready_speed
        Pickaxe:    1,      -2.8f
        Axe:        5.0f,   -3.0f
        Shovel:     1.5f,   -3.0f
        Hoe:        -3,     0.0f
        Sword:      3,      -2.4f
    */
    private static float ready_pickaxe_base = -2.8f;
    private static float ready_axe_base = -3.0f;
    private static float ready_shovel_base = -3.0f;
    private static float ready_hoe_base = -2.0f;
    private static float ready_sword_base = -2.4f;

    // EPIDAXITE =======================================================================================================
    // Heavy
    static float epidaxite_ready = -0.18f;
    static float epidaxite_ready_sword = -0.22f;
        // GEM
    public static final RegistryObject<Item> EPIDAXITE = Registration.ITEMS.register("epidaxite", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
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
    public static final RegistryObject<Item> NEPENTINE = Registration.ITEMS.register("nepentine", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
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
    public static final RegistryObject<Item> ZEOCITE = Registration.ITEMS.register("zeocite", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
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



    // KAINDRITE =========================================================================================================
    // Heavy
    static float kaindrite_ready = -0.20f;
    static float kaindrite_ready_sword = -0.28f;
    // GEM
    public static final RegistryObject<Item> KAINDRITE = Registration.ITEMS.register("kaindrite", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
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



    //helper
    private static float readySpeed(String tool, float multiplier) {
        switch(tool){
            case "pickaxe": return ready_pickaxe_base - (ready_pickaxe_base*multiplier);
            case "axe":     return ready_axe_base - (ready_axe_base*multiplier);
            case "shovel":  return ready_shovel_base - (ready_shovel_base*multiplier);
            case "hoe":     return ready_hoe_base - (ready_hoe_base*multiplier);
            case "sword":   return ready_sword_base - (ready_sword_base*multiplier);
            default:        return 0.0f;
        }
    }

    static void register() {}
}
