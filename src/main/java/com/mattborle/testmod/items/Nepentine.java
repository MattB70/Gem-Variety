package com.mattborle.testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class Nepentine extends Item {

    public Nepentine(Properties properties) {
        super(properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip_nepentine"));
        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && !InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_nepentine"));
            // hold shift + ctrl
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift_and_ctrl"));
        }
        else if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT) && InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_CONTROL))
        {
            // shift + ctrl text
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_nepentine"));
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.test_tooltip_shift_and_ctrl_nepentine"));
        }
        else
        {
            // hold shift
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift"));
        }
    }
}