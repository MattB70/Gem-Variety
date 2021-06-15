package com.mattborle.testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class MixedPickaxeItem extends PickaxeItem {

    int mix = -1; // mix number (example: 21 - Zeocite,Nepentine)
    String repairItem;

    public MixedPickaxeItem(IItemTier tier, int damage, float readySpeed, Properties properties, int mix) {
        super(tier, damage, readySpeed, properties);
        this.mix = mix;

        // Get correct repair item based on item's mix
        switch(mix){
            case 110: case 100: case 331: case 311: case 310:
                repairItem = "\u00A7aNepentine\u00A7f"; break;
            case 221: case 220: case 211: case 210: case 200: case 332: case 322: case 321: case 320:
                repairItem = "\u00A76Zeocite\u00A7f"; break;
            case 330: case 300:
                repairItem = "\u00A7dEpidaxite\u00A7f"; break;
            default: repairItem = "\u00A7cInvalid item mix, repair item unknown!\u00A7f"; break;
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)){
            // shift text
            tooltip.add(new TranslationTextComponent("Repair With: " + repairItem));
        }
        else
        {
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift"));
        }
    }
}
