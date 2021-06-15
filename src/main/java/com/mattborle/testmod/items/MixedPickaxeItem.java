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
    String repairItem = "\u00A7c\u00A7oInvalid item mix, repair item unknown!\u00A7f";
    char one;
    char two;
    char three;

    public MixedPickaxeItem(IItemTier tier, int damage, float readySpeed, Properties properties, int mix) {
        super(tier, damage, readySpeed, properties);
        this.mix = mix;
        one = Integer.toString(mix).charAt(0);
        two = Integer.toString(mix).charAt(1);
        three = Integer.toString(mix).charAt(2);

        // Set correct info item based on item's mix
        if(one == '0' || two == '0' || three == '0'){ // if there is Epidaxite
            repairItem = "\u00A7d\u00A7oEpidaxite\u00A7f";
        }
        if(one == '1' || two == '1' || three == '1'){ // if there is Nepentine, overwrite.
            repairItem = "\u00A7a\u00A7oNepentine\u00A7f";
        }
        if(one == '2' || two == '2' || three == '2'){ // if there is Zeocite, overwrite.
            repairItem = "\u00A76\u00A7oZeocite\u00A7f";
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
