package com.mattborle.testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class ModArmorItem extends ArmorItem {

    int mix = -1; // mix number (example: 21 - Zeocite,Nepentine)
    String repairItem = "\u00A7c\u00A7oInvalid item mix, repair item unknown!\u00A7f";
    char one = 'n';
    char two = 'n';
    char thr = 'n';
    char fou = 'n';
    char fiv = 'n';
    char six = 'n';
    char sev = 'n';
    char eig = 'n';

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties, int mix) {
        // runs once* on init.
        super(material, slot, properties);
        this.mix = mix;

        // GET REPAIR MATERIAL:
        try{
            one = Integer.toString(mix).charAt(0);
            if(Integer.toString(mix).length() > 1) two = Integer.toString(mix).charAt(1);
            if(Integer.toString(mix).length() > 2) thr = Integer.toString(mix).charAt(2);
            if(Integer.toString(mix).length() > 3) fou = Integer.toString(mix).charAt(3);
            if(Integer.toString(mix).length() > 4) fiv = Integer.toString(mix).charAt(4);
            if(Integer.toString(mix).length() > 5) six = Integer.toString(mix).charAt(5);
            if(Integer.toString(mix).length() > 6) sev = Integer.toString(mix).charAt(6);
            if(Integer.toString(mix).length() > 7) eig = Integer.toString(mix).charAt(7);
        }
        catch(Exception e){}
        try{
            // MIXED MATERIALS:
            // Set correct info item based on item's mix
            if(one == '3' || two == '3' || thr == '3' || fou == '3' || fiv == '3' || six == '3' || sev == '3' || eig == '3'){
                // if there is Kaindrite, overwrite. This is an exceptional state. Only a pure Kaindrite item should be repaired with Kaindrite.
                repairItem = "\u00A71\u00A7oKaindrite\u00A7f";
            }
            if(one == '0' || two == '0' || thr == '0' || fou == '0' || fiv == '0' || six == '0' || sev == '0' || eig == '0'){
                // if there is Epidaxite
                repairItem = "\u00A7d\u00A7oEpidaxite\u00A7f";
            }
            if(one == '1' || two == '1' || thr == '1' || fou == '1' || fiv == '1' || six == '1' || sev == '1' || eig == '1'){
                // if there is Nepentine, overwrite.
                repairItem = "\u00A7a\u00A7oNepentine\u00A7f";
            }
            if(one == '2' || two == '2' || thr == '2' || fou == '2' || fiv == '2' || six == '2' || sev == '2' || eig == '2'){
                // if there is Zeocite, overwrite.
                repairItem = "\u00A76\u00A7oZeocite\u00A7f";
            }
        }
        catch(Exception e){
            System.out.println(e);
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
