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
    // ready_speed = base + (base * 0.15)
    //                              0.25 for sword ***
    static float epidaxite_multiplier = 0.15f;
    static float epidaxite_multiplier_sword = 0.20f;
        // GEM
    public static final RegistryObject<Item> EPIDAXITE = Registration.ITEMS.register("epidaxite", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
        // TOOLS
    public static final RegistryObject<PickaxeItem> EPIDAXITE_PICKAXE = Registration.ITEMS.register("epidaxite_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.EPIDAXITE,
                    1,                                                                                          // DAMAGE   (see tier in ModItemTier)
                    ready_pickaxe_base + (ready_pickaxe_base*epidaxite_multiplier),                             // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> EPIDAXITE_AXE = Registration.ITEMS.register("epidaxite_axe", () ->
            new AxeItem(
                    ModItemTier.EPIDAXITE,
                    5.0f,                                                                                       // DAMAGE   (see tier in ModItemTier)
                    ready_axe_base + (ready_axe_base*epidaxite_multiplier),                                     // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> EPIDAXITE_SHOVEL = Registration.ITEMS.register("epidaxite_shovel", () ->
            new ShovelItem(
                    ModItemTier.EPIDAXITE,
                    1.5f,                                                                                       // DAMAGE   (see tier in ModItemTier)
                    ready_shovel_base + (ready_shovel_base*epidaxite_multiplier),                               // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> EPIDAXITE_HOE = Registration.ITEMS.register("epidaxite_hoe", () ->
            new HoeItem(
                    ModItemTier.EPIDAXITE,
                    -3,                                                                                         // DAMAGE   (see tier in ModItemTier)
                    ready_hoe_base + (ready_hoe_base*epidaxite_multiplier),                                     // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> EPIDAXITE_SWORD = Registration.ITEMS.register("epidaxite_sword", () ->
            new SwordItem(
                    ModItemTier.EPIDAXITE,
                    3,                                                                                          // DAMAGE   (see tier in ModItemTier)
                    ready_sword_base + (ready_sword_base*epidaxite_multiplier_sword),                           // READY SPEED **UNIQUE SEE ABOVE**
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));



    // NEPENTINE =======================================================================================================
    // Light
    // ready_speed = base - (base * 0.25)
    static float nepentine_multiplier = -0.25f;
    static float nepentine_multiplier_sword = -0.25f;
        // GEM
    public static final RegistryObject<Item> NEPENTINE = Registration.ITEMS.register("nepentine", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
        // TOOLS
    public static final RegistryObject<PickaxeItem> NEPENTINE_PICKAXE = Registration.ITEMS.register("nepentine_pickaxe", () ->
            new PickaxeItem(
                    ModItemTier.NEPENTINE,
                    1,                                                                                          // DAMAGE   (see tier in ModItemTier)
                    ready_sword_base + (ready_sword_base*nepentine_multiplier),                                 // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> NEPENTINE_AXE = Registration.ITEMS.register("nepentine_axe", () ->
            new AxeItem(
                    ModItemTier.NEPENTINE,
                    5.0f,                                                                                       // DAMAGE   (see tier in ModItemTier)
                    ready_sword_base + (ready_sword_base*nepentine_multiplier),                                 // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> NEPENTINE_SHOVEL = Registration.ITEMS.register("nepentine_shovel", () ->
            new ShovelItem(
                    ModItemTier.NEPENTINE,
                    1.5f,                                                                                       // DAMAGE   (see tier in ModItemTier)
                    ready_sword_base + (ready_sword_base*nepentine_multiplier),                                 // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> NEPENTINE_HOE = Registration.ITEMS.register("nepentine_hoe", () ->
            new HoeItem(
                    ModItemTier.NEPENTINE,
                    -3,                                                                                         // DAMAGE   (see tier in ModItemTier)
                    ready_hoe_base + (ready_hoe_base*nepentine_multiplier),                                     // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<SwordItem> NEPENTINE_SWORD = Registration.ITEMS.register("nepentine_sword", () ->
            new SwordItem(
                    ModItemTier.NEPENTINE,
                    3,                                                                                          // DAMAGE   (see tier in ModItemTier)
                    ready_sword_base + (ready_sword_base*nepentine_multiplier_sword),                           // READY SPEED
                    (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));


    static void register() {}
}
