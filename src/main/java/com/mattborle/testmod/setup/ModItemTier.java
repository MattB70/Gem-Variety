package com.mattborle.testmod.setup;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
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


    /*  EPIDAXITE:
            HISTORY:
                Epidaxite is a rare pink gem native to the Overworld. It's extremely dense and heavy and as a result
                it's strong (+maxUses) and powerful (+attackDamage). Tools made from Epidaxite are often unwieldy
                (-efficiency).

            STATS:
                    Effect          value(*Diamond)
                PROS:
                    maxUses =       2342 (*1.50)
                    attackDamage =  4.5F (*1.50)
                CONS:
                    efficiency =    6.0F (*0.75)

                        3          1561           8.0F             3.0F              10 */
    EPIDAXITE(3, 2342, 6.0F, 4.5F, 10, () -> Ingredient.of(ModItems.EPIDAXITE.get())),
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -


    /*  NEPENTINE:
            HISTORY:
                Nepentine is a rare light-green gem native to the Overworld. It is less dense than diamond and as a result
                it's light (+efficiency). Tools made from Nepentine are often slightly brittle (-maxUses). Nepentine is
                often confused with Diamond.

            STATS:
                    Effect          value(*Diamond)
                PROS:
                    efficiency =    10.0F (*1.25)
                CONS:
                    maxUses =       1171 (*0.75)
                    attackDamage =  2.25 (*0.75)

                        3          1561           8.0F              3.0F               10 */
    NEPENTINE(3, 1171, 10.0F, 2.25F, 10, () -> Ingredient.of(ModItems.NEPENTINE.get()));
    // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -



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
