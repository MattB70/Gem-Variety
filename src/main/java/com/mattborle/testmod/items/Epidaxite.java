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

 */

public class Epidaxite extends Item {

    public Epidaxite(Properties properties) {
        super(properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.epidaxite"));
        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && !InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_epidaxite"));
            // hold shift + ctrl
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift_and_ctrl"));
        }
        else if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift + ctrl text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_epidaxite"));
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_and_ctrl_epidaxite"));
        }
        else
        {
            // hold shift
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift"));
        }
    }
}
