package com.mattborle.testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class ModShovelItem extends ShovelItem {

    int mix = -1; // mix number (example: 21 - Zeocite,Nepentine)
    String repairItem = "\u00A7c\u00A7oInvalid item mix, repair item unknown!\u00A7f";
    char one;

    public ModShovelItem(IItemTier tier, float damage, float readySpeed, Properties properties, int mix) {
        // runs once* on init.
        super(tier, damage, readySpeed, properties);
        this.mix = mix;
        one = Integer.toString(mix).charAt(0);
        // Set correct info item based on item's mix (always 1 material as a shovel has only 1 ingredient.
        if(one == '3'){ // if there is Kaindrite, overwrite. This is an exceptional state. Only a pure Kaindrite item should be repaired with Kaindrite.
            repairItem = "\u00A71\u00A7oKaindrite\u00A7f";
        }
        if(one == '0'){ // if there is Epidaxite
            repairItem = "\u00A7d\u00A7oEpidaxite\u00A7f";
        }
        if(one == '1'){ // if there is Nepentine, overwrite.
            repairItem = "\u00A7a\u00A7oNepentine\u00A7f";
        }
        if(one == '2'){ // if there is Zeocite, overwrite.
            repairItem = "\u00A76\u00A7oZeocite\u00A7f";
        }
    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)){
            tooltip.add(new TranslationTextComponent("Repair With: " + repairItem));
        }
        else
        {
            tooltip.add(new TranslationTextComponent("gemitem.testmod.tooltip.hold_shift"));
        }
    }
}
