package com.mattborle.testmod.setup;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorTier implements IArmorMaterial {

    /*  Reference:
                    durability      slotProtections      enchantment     toughness       knockbackResist
                    (0-4)                                (0-inf)         (0F-infF)       (0F-infF)
        Diamond:    33              {3, 6, 8, 3}         10              2.0F            0.0F
        Gold:       7               {1, 3, 5, 2}         25              0.0F            0.0F
        Netherite:  37              {3, 6, 8, 3}         15              3.0F            0.1F
        Chain:      15              {1, 4, 5, 2}         12              0.0F            0.0F
        Iron:       15              {2, 5, 6, 2}         9               0.0F            0.0F
        Leather:    5               {1, 2, 3, 1}         15              0.0F            0.0F
    */

    // GEMS ============================================================================================================


        /*  PURE EPIDAXITE:
                HISTORY:
                    Epidaxite is a rare pink gem native to the Overworld. It's very dense and heavy and as a result
                    it's strong (+toughness)(+durability) and heavy (+knockbackResist). Tools made from Epidaxite are often unwieldy
                    (-speed).

                    Epidaxite is considered to be identical to diamond, but with a more densely packed crystal structure.
                    It's density attributes to it's incredible weight as well as it's dazzling pink color.

                STATS:
                        Effect         | value(*Diamond)
                    PROS:--------------|----------------
                        toughness      | 2.5F  (*1.25)
                        knockbackResist| 0.05F (+0.05)
                        durability     | 36    (*1.10)
                    CONS:--------------|----------------
                        TODO: slow the player down****   (0.9x maybe?)

                                                33           {3, 6, 8, 3}                10                                            2.0F                  0.0F */
    EPIDAXITE("epidaxite", 36, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.05F, () -> Ingredient.of(ModItems.EPIDAXITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


        /*  PURE NEPENTINE:
                HISTORY:
                    Nepentine is a rare light-green gem native to the Overworld. It is less dense than Diamond and as a result
                    it's light (+speed)(-toughness). Tools made from Nepentine are often slightly brittle (-durability).

                    Nepentine is often confused with Diamond. It's color and feel can be very similar, but Nepentine cleaves
                    much easier due to its brittle nature. Some claim that Nepentine pre-dates the pure Diamond deposits.
                    Claims of its origin are sometimes fantastical. In reality, we know very little about Nepentine.

                STATS:
                        Effect         | value(*Diamond)
                    PROS:--------------|----------------
                        TODO: speed up the player slightly****  (1.1x maybe?)
                    CONS:--------------|----------------
                        toughness      | 1.0F (*0.5)
                        durability     | 25   (*0.75)

                                                33           {3, 6, 8, 3}                10                                            2.0F                  0.0F */
    NEPENTINE("nepentine", 25, new int[]{2, 5, 7, 2}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModItems.NEPENTINE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


        /*  PURE ZEOCITE:
                HISTORY:
                    Zeocite is a rare orange gem native to the End. It is less dense than Diamond and as a result
                    it's very light (+speed*)(--toughness). Tools made from Zeocite are quite brittle (--durability).
                    Zeocite is best suited for applications where efficiency is more important than longevity.

                    Being native to the End, not much is known about Zeocite. Some claim it's the natural state of the
                    Overworld's Nepentine. Perhaps our world has leaked into the End just as much as their world has
                    into ours?

                    Additional:
                        Alien (++echantability)(++speed)

                STATS:
                        Effect         | value(*Diamond)
                    PROS:--------------|----------------
                        TODO: speed up the player quite a bit****  (1.3x maybe?)
                        echantability  | 20    (*2.00)
                    CONS:--------------|----------------
                        toughness      | 0.0F  (negate)
                        durability     | 17   (*0.50)

                                            33           {3, 6, 8, 3}                10                                         2.0F                  0.0F */
    ZEOCITE("zeocite", 17, new int[]{2, 4, 5, 2}, 20, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


        /*  PURE KAINDRITE:
                HISTORY:
                    Kaindrite is a rare blue-violet gem native to the Nether. It is extremely hard and as a result it's very
                    strong (++durability)(+toughness)(+knockbackResist). Kaindrite would best suited for applications where longevity is more
                    important than efficiency. Pure Kaindrite is much too heavy for most users.

                    Being native to the Nether, not much is known about Kaindrite. Some claim it's the natural state of the
                    Overworld's Epidaxite. Perhaps our world has leaked into the Nether just as much as their world has
                    into ours?

                    Additional:
                        Arcane (++echantability)(+fireResist)

                STATS:
                    PROS:--------------|----------------
                        durability     | 66    (*2.00)
                        enchantability | 20    (*2.00)
                        toughness      | 2.8F  (*1.4)
                        knockbackResist| 0.2F
                    CONS:--------------|----------------
                        TODO: slow down the player quite a bit****  (0.7x maybe?)

                                                33           {3, 6, 8, 3}                10                                            2.0F                  0.0F */
    KAINDRITE("kaindrite", 66, new int[]{4, 7, 9, 4}, 10, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.8F, 0.2F, () -> Ingredient.of(ModItems.KAINDRITE.get()));
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -




    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    private ModArmorTier(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.slotProtections[slot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
