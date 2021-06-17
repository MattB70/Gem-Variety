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
*/

public class Kaindrite extends Item {

    public Kaindrite(Properties properties) {
        super(properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.kaindrite"));
        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && !InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_kaindrite"));
            // hold shift + ctrl
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift_and_ctrl"));
        }
        else if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift + ctrl text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_kaindrite"));
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_and_ctrl_kaindrite"));
        }
        else
        {
            // hold shift
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift"));
        }
    }
}
