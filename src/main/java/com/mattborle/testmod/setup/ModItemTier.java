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


    // 2 GEM COMBOS
    /*  10  = ne    */  MIXED10(3,
            (NEPENTINE.nMaxUses + EPIDAXITE.eMaxUses)/2,
            (NEPENTINE.nEfficiency + EPIDAXITE.eEfficiency)/2,
            (NEPENTINE.nAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (int)((NEPENTINE.baseEnchantability + EPIDAXITE.baseEnchantability)/1.5), () -> Ingredient.of(ModItems.NEPENTINE.get())),
    /*  21  = zn    */  MIXED21(3,
            (ZEOCITE.zMaxUses + NEPENTINE.nMaxUses)/2,
            (ZEOCITE.zEfficiency + NEPENTINE.nEfficiency)/2,
            (ZEOCITE.eAttackDamage + NEPENTINE.nAttackDamage)/2,
            (int)((ZEOCITE.zEnchantability + NEPENTINE.baseEnchantability)/1.5), () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  20  = ze    */  MIXED20(3,
            (ZEOCITE.zMaxUses + EPIDAXITE.eMaxUses)/2,
            (ZEOCITE.zEfficiency + EPIDAXITE.eEfficiency)/2,
            (ZEOCITE.eAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (int)((ZEOCITE.zEnchantability + EPIDAXITE.baseEnchantability)/1.5), () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  32  = kz    */  MIXED32(3,
            (KAINDRITE.kMaxUses + ZEOCITE.zMaxUses)/2,
            (KAINDRITE.kEfficiency + ZEOCITE.zEfficiency)/2,
            (KAINDRITE.kAttackDamage + ZEOCITE.zAttackDamage)/2,
            (int)((KAINDRITE.kEnchantability + ZEOCITE.kEnchantability)/1.5), () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  31  = kn    */  MIXED31(3,
            (KAINDRITE.kMaxUses + NEPENTINE.nMaxUses)/2,
            (KAINDRITE.kEfficiency + NEPENTINE.nEfficiency)/2,
            (KAINDRITE.kAttackDamage + NEPENTINE.nAttackDamage)/2,
            (int)((KAINDRITE.kEnchantability + NEPENTINE.baseEnchantability)/1.5), () -> Ingredient.of(ModItems.NEPENTINE.get())),
    /*  30  = ke    */  MIXED30(3,
            (KAINDRITE.kMaxUses + EPIDAXITE.eMaxUses)/2,
            (KAINDRITE.kEfficiency + EPIDAXITE.eEfficiency)/2,
            (KAINDRITE.kAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (int)((KAINDRITE.kEnchantability + EPIDAXITE.baseEnchantability)/1.5), () -> Ingredient.of(ModItems.EPIDAXITE.get())),

    // 3 GEM COMBOS
    /*  110 = nne   */  MIXED110(3,
            (NEPENTINE.nMaxUses + NEPENTINE.nMaxUses + EPIDAXITE.eMaxUses)/3,
            (NEPENTINE.nEfficiency + NEPENTINE.nEfficiency + EPIDAXITE.eEfficiency)/3,
            (NEPENTINE.nAttackDamage + NEPENTINE.nAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (NEPENTINE.baseEnchantability + NEPENTINE.baseEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.KAINDRITE.get())),
    /*  100 = nee   */  MIXED100(3,
            (NEPENTINE.nMaxUses + EPIDAXITE.eMaxUses + EPIDAXITE.eMaxUses)/3,
            (NEPENTINE.nEfficiency + EPIDAXITE.eEfficiency + EPIDAXITE.eEfficiency)/3,
            (NEPENTINE.nAttackDamage + EPIDAXITE.eAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (NEPENTINE.baseEnchantability + EPIDAXITE.baseEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.KAINDRITE.get())),
    /*  221 = zzn   */  MIXED221(3,
            (ZEOCITE.zMaxUses + ZEOCITE.zMaxUses + NEPENTINE.nMaxUses)/3,
            (ZEOCITE.zEfficiency + ZEOCITE.zEfficiency + NEPENTINE.nEfficiency)/3,
            (ZEOCITE.zAttackDamage + ZEOCITE.zAttackDamage + NEPENTINE.nAttackDamage)/2,
            (ZEOCITE.kEnchantability + ZEOCITE.kEnchantability + NEPENTINE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  220 = zze   */  MIXED220(3,
            (ZEOCITE.zMaxUses + ZEOCITE.zMaxUses + EPIDAXITE.eMaxUses)/3,
            (ZEOCITE.zEfficiency + ZEOCITE.zEfficiency + EPIDAXITE.eEfficiency)/3,
            (ZEOCITE.zAttackDamage + ZEOCITE.zAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (ZEOCITE.kEnchantability + ZEOCITE.kEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  211 = znn   */  MIXED211(3,
            (ZEOCITE.zMaxUses + NEPENTINE.nMaxUses + NEPENTINE.nMaxUses)/3,
            (ZEOCITE.zEfficiency + NEPENTINE.nEfficiency + NEPENTINE.nEfficiency)/3,
            (ZEOCITE.zAttackDamage + NEPENTINE.nAttackDamage + NEPENTINE.nAttackDamage)/2,
            (ZEOCITE.kEnchantability + NEPENTINE.baseEnchantability + NEPENTINE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  210 = zne   */  MIXED210(3,
            (ZEOCITE.zMaxUses + NEPENTINE.nMaxUses + EPIDAXITE.eMaxUses)/3,
            (ZEOCITE.zEfficiency + NEPENTINE.nEfficiency + EPIDAXITE.eEfficiency)/3,
            (ZEOCITE.zAttackDamage + NEPENTINE.nAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (ZEOCITE.kEnchantability + NEPENTINE.baseEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  200 = zee   */  MIXED200(3,
            (ZEOCITE.zMaxUses + EPIDAXITE.eMaxUses + EPIDAXITE.eMaxUses)/3,
            (ZEOCITE.zEfficiency + EPIDAXITE.eEfficiency + EPIDAXITE.eEfficiency)/3,
            (ZEOCITE.zAttackDamage + EPIDAXITE.eAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (ZEOCITE.kEnchantability + EPIDAXITE.baseEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  332 = kkz   */  MIXED332(3,
            (KAINDRITE.kMaxUses + KAINDRITE.kMaxUses + ZEOCITE.zMaxUses)/3,
            (KAINDRITE.kEfficiency + KAINDRITE.kEfficiency + ZEOCITE.zEfficiency)/3,
            (KAINDRITE.kAttackDamage + KAINDRITE.kAttackDamage + ZEOCITE.zAttackDamage)/2,
            (KAINDRITE.kEnchantability + KAINDRITE.kEnchantability + ZEOCITE.kEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  331 = kkn   */  MIXED331(3,
            (KAINDRITE.kMaxUses + KAINDRITE.kMaxUses + NEPENTINE.nMaxUses)/3,
            (KAINDRITE.kEfficiency + KAINDRITE.kEfficiency + NEPENTINE.nEfficiency)/3,
            (KAINDRITE.kAttackDamage + KAINDRITE.kAttackDamage + NEPENTINE.nAttackDamage)/2,
            (KAINDRITE.kEnchantability + KAINDRITE.kEnchantability + NEPENTINE.baseEnchantability)/2, () -> Ingredient.of(ModItems.NEPENTINE.get())),
    /*  330 = kke   */  MIXED330(3,
            (KAINDRITE.kMaxUses + KAINDRITE.kMaxUses + EPIDAXITE.eMaxUses)/3,
            (KAINDRITE.kEfficiency + KAINDRITE.kEfficiency + EPIDAXITE.eEfficiency)/3,
            (KAINDRITE.kAttackDamage + KAINDRITE.kAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (KAINDRITE.kEnchantability + KAINDRITE.kEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.EPIDAXITE.get())),
    /*  322 = kzz   */  MIXED322(3,
            (KAINDRITE.kMaxUses + ZEOCITE.zMaxUses + ZEOCITE.zMaxUses)/3,
            (KAINDRITE.kEfficiency + ZEOCITE.zEfficiency + ZEOCITE.zEfficiency)/3,
            (KAINDRITE.kAttackDamage + ZEOCITE.zAttackDamage + ZEOCITE.zAttackDamage)/2,
            (KAINDRITE.kEnchantability + ZEOCITE.kEnchantability + ZEOCITE.kEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  321 = kzn   */  MIXED321(3,
            (KAINDRITE.kMaxUses + ZEOCITE.zMaxUses + NEPENTINE.nMaxUses)/3,
            (KAINDRITE.kEfficiency + ZEOCITE.zEfficiency + NEPENTINE.nEfficiency)/3,
            (KAINDRITE.kAttackDamage + ZEOCITE.zAttackDamage + NEPENTINE.nAttackDamage)/2,
            (KAINDRITE.kEnchantability + ZEOCITE.kEnchantability + NEPENTINE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  320 = kze   */  MIXED320(3,
            (KAINDRITE.kMaxUses + ZEOCITE.zMaxUses + EPIDAXITE.eMaxUses)/3,
            (KAINDRITE.kEfficiency + ZEOCITE.zEfficiency + EPIDAXITE.eEfficiency)/3,
            (KAINDRITE.kAttackDamage + ZEOCITE.zAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (KAINDRITE.kEnchantability + ZEOCITE.kEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.ZEOCITE.get())),
    /*  311 = knn   */  MIXED311(3,
            (KAINDRITE.kMaxUses + NEPENTINE.nMaxUses + NEPENTINE.nMaxUses)/3,
            (KAINDRITE.kEfficiency + NEPENTINE.nEfficiency + NEPENTINE.nEfficiency)/3,
            (KAINDRITE.kAttackDamage + NEPENTINE.nAttackDamage + NEPENTINE.nAttackDamage)/2,
            (KAINDRITE.kEnchantability + NEPENTINE.baseEnchantability + NEPENTINE.baseEnchantability)/2, () -> Ingredient.of(ModItems.NEPENTINE.get())),
    /*  310 = kne   */  MIXED310(3,
            (KAINDRITE.kMaxUses + NEPENTINE.nMaxUses + EPIDAXITE.eMaxUses)/3,
            (KAINDRITE.kEfficiency + NEPENTINE.nEfficiency + EPIDAXITE.eEfficiency)/3,
            (KAINDRITE.kAttackDamage + NEPENTINE.nAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (KAINDRITE.kEnchantability + NEPENTINE.baseEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.NEPENTINE.get())),
    /*  300 = kee   */  MIXED300(3,
            (KAINDRITE.kMaxUses + EPIDAXITE.eMaxUses + EPIDAXITE.eMaxUses)/3,
            (KAINDRITE.kEfficiency + EPIDAXITE.eEfficiency + EPIDAXITE.eEfficiency)/3,
            (KAINDRITE.kAttackDamage + EPIDAXITE.eAttackDamage + EPIDAXITE.eAttackDamage)/2,
            (KAINDRITE.kEnchantability + EPIDAXITE.baseEnchantability + EPIDAXITE.baseEnchantability)/2, () -> Ingredient.of(ModItems.EPIDAXITE.get()))

    ; // floating closure

    // STATS REFERENCE:
    /* EPIDAXITE STATS:                           */ int baseEnchantability = 10; /*
                        Effect     | value(*Diamond)
                PROS:--------------|----------------
                    maxUses        | 2342 (*1.50) */ int eMaxUses = 2341; /*
                    attackDamage   | 4.5F (*1.50) */ float eAttackDamage = 4.5F; /*
                CONS:--------------|----------------
                    efficiency     | 6.0F (*0.75) */ float eEfficiency = 6.0F; /*

       NEPENTINE STATS:
                        Effect     | value(*Diamond)
                PROS:--------------|----------------
                    efficiency     | 10.0F (*1.25) */ float nEfficiency = 10.0F; /*
                CONS:--------------|----------------
                    maxUses        | 1171 (*0.75) */  int nMaxUses = 1171; /*
                    attackDamage   | 2.25 (*0.75) */  float nAttackDamage = 2.25F; /*
       ZEOCITE STATS:
                        Effect     | value(*Diamond)
                PROS:--------------|----------------
                    efficiency     | 16.0F (*2.00) */ float zEfficiency = 16.0F; /*
                    echantability  | 20    (*2.00) */ int zEnchantability = 20; /*
                CONS:--------------|----------------
                    maxUses        | 781  (*0.50) */  int zMaxUses = 781; /*
                    attackDamage   | 2.00 (*0.66) */  float zAttackDamage = 2.00F; /*
       KAINDRITE STATS:
                        Effect     | value(*Diamond)
                PROS:--------------|----------------
                    maxUses        | 3122  (*2.00) */ int kMaxUses = 3122; /*
                    echantability  | 20    (*2.00) */ int kEnchantability = 20; /*
                CONS:--------------|----------------
                    efficiency     | 5.28  (*0.66) */ float kEfficiency = 5.28F; /*
                    attackDamage   | 2.4   (*0.80) */ float kAttackDamage = 2.4F; /*
     -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
     */

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
