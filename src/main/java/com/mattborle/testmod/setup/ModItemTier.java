package com.mattborle.testmod.setup;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;


@MethodsReturnNonnullByDefault
public enum ModItemTier implements IItemTier {

    /*  Reference:
                    harvestLevel    maxUses     efficiency  attackDamage    echantability
                    (0-4)           (0-inf)     (0F-infF)   (0F-infF)       (0F-infF)
        Diamond:    3               1561        8.0F        3.0F            10
        Gold:       0               32          12.0F       0.0F            22
        Netherite:  4               2031        9.0F        4.0F            15
        Stone:      1               31          4.0F        1.0F            5
        Iron:       2               250         6.0F        2.0F            14
        Wood:       0               59          2.0F        0.0F            15
     */



    // GEMS ============================================================================================================


    /*  PURE EPIDAXITE:
            HISTORY:
                Epidaxite is a rare pink gem native to the Overworld. It's very dense and heavy and as a result
                it's strong (+maxUses) and powerful (+attackDamage). Tools made from Epidaxite are often unwieldy
                (-efficiency).

                Epidaxite is considered to be identical to diamond, but with a more densely packed crystal structure.
                It's density attributes to it's incredible weight as well as it's dazzling pink color.

            STATS:
                    Effect         | value(*Diamond)
                PROS:--------------|----------------
                    maxUses        | 2342 (*1.50)
                    attackDamage   | 4.5F (*1.50)
                CONS:--------------|----------------
                    efficiency     | 6.0F (*0.75)

                        3          1561           8.0F             3.0F              10 */
    EPIDAXITE(3, 2342, 6.0F, 4.5F, 10, () -> Ingredient.of(ModItems.EPIDAXITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


    /*  PURE NEPENTINE:
            HISTORY:
                Nepentine is a rare light-green gem native to the Overworld. It is less dense than Diamond and as a result
                it's light (+efficiency)(-attackDamage). Tools made from Nepentine are often slightly brittle (-maxUses).

                Nepentine is often confused with Diamond. It's color and feel can be very similar, but Nepentine cleaves
                much easier due to its brittle nature. Some claim that Nepentine pre-dates the pure Diamond deposits.
                Claims of its origin are sometimes fantastical. In reality, we know very little about Nepentine.

            STATS:
                    Effect         | value(*Diamond)
                PROS:--------------|----------------
                    efficiency     | 10.0F (*1.25)
                CONS:--------------|----------------
                    maxUses        | 1171 (*0.75)
                    attackDamage   | 2.25 (*0.75)

                        3          1561           8.0F              3.0F               10 */
    NEPENTINE(3, 1171, 10.0F, 2.25F, 10, () -> Ingredient.of(ModItems.NEPENTINE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


    /*  PURE ZEOCITE:
            HISTORY:
                Zeocite is a rare orange gem native to the End. It is less dense than Diamond and as a result
                it's very light (++efficiency)(--attackDamage). Tools made from Zeocite are quite brittle (--maxUses).
                Zeocite is best suited for applications where efficiency is more important than longevity.

                Being native to the End, not much is known about Zeocite. Some claim it's the natural state of the
                Overworld's Nepentine. Perhaps our world has leaked into the End just as much as their world has
                into ours?

                Additional:
                    Alien (++echantability)

            STATS:
                    Effect         | value(*Diamond)
                PROS:--------------|----------------
                    efficiency     | 16.0F (*2.00)
                    echantability  | 20    (*2.00)
                CONS:--------------|----------------
                    maxUses        | 781  (*0.50)
                    attackDamage   | 2.00 (*0.66)

                      3          1561          8.0F              3.0F              10 */
    ZEOCITE(3, 781, 16.0F, 2.0F, 20, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


    /*  PURE KAINDRITE:
            HISTORY:
                Kaindrite is a rare blue-violet gem native to the Nether. It is extremely hard and as a result it's very
                strong (++maxUses). Tools made from Kaindrite rarely break, but are otherwise unremarkable
                (-efficiency)(-attackDamage). Kaindrite would best suited for applications where longevity is more
                important than efficiency. Pure Kaindrite is much too heavy for most users.

                Being native to the Nether, not much is known about Kaindrite. Some claim it's the natural state of the
                Overworld's Epidaxite. Perhaps our world has leaked into the Nether just as much as their world has
                into ours?

                Additional:
                    Arcane (++echantability)

            STATS:
                    Effect         | value(*Diamond)
                PROS:--------------|----------------
                    maxUses        | 3122  (*2.00)
                    echantability  | 20    (*2.00)
                CONS:--------------|----------------
                    efficiency     | 5.28  (*0.66)
                    attackDamage   | 2.4   (*0.80)

                        3          1561           8.0F              3.0F              10 */
    KAINDRITE(3, 3122, 5.28F, 2.4F, 20, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -




    // MIXED ===========================================================================================================
    // MIXED ===========================================================================================================
    // MIXED ===========================================================================================================

    /*  PLACEHOLDER:    STATS:
                            Effect         | value(*Diamond)
                        PROS:--------------|----------------
                            maxUses        | 3122  (*2.00)
                            echantability  | 20    (*2.00)
                        CONS:--------------|----------------
                            efficiency     | 5.28  (*0.66)
                            attackDamage   | 2.4   (*0.80)
                          3          1561           8.0F              3.0F              10 */
    PLACEHOLDER(3, 3122, 5.28F, 2.4F, 20, () -> Ingredient.of(ModItems.EPIDAXITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


    ; // floating closure as I keep forgetting this is a list.

    private final Supplier<Ingredient> repairmaterial;
    private final int enchantability;
    private final float attackDamage;
    private final float efficiency;
    private final int maxUses;
    private final int harvestLevel;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairmaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairmaterial = repairmaterial;
    }
    @Override
    public int getUses() {
        return this.maxUses;
    }
    @Override
    public float getSpeed() {
        return this.efficiency;
    }
    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }
    @Override
    public int getLevel() {
        return this.harvestLevel;
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairmaterial.get();
    }
}
