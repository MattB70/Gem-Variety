package com.mattborle.testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class MixedSwordItem extends SwordItem {

    int mix = -1; // mix number (example: 21 - Zeocite,Nepentine)
    String repairItem;

    public MixedSwordItem(IItemTier tier, int damage, float readySpeed, Properties properties, int mix) {
        super(tier, damage, readySpeed, properties);
        this.mix = mix;

        // Get correct repair item based on item's mix
        switch(mix){
            case 10: case 31:
                repairItem = "\u00A7aNepentine\u00A7f"; break;
            case 21: case 20: case 32:
                repairItem = "\u00A76Zeocite\u00A7f"; break;
            case 30: repairItem = "\u00A7dEpidaxite\u00A7f"; break;
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
