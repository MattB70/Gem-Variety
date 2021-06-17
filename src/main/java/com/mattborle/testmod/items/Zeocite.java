package com.mattborle.testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

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
 */

public class Zeocite extends Item {

    public Zeocite(Properties properties) {
        super(properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.zeocite"));
        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && !InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_zeocite"));
            // hold shift + ctrl
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift_and_ctrl"));
        }
        else if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift + ctrl text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_zeocite"));
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_and_ctrl_zeocite"));
        }
        else
        {
            // hold shift
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift"));
        }
    }
}
