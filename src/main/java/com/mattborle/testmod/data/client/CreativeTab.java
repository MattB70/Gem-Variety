package com.mattborle.testmod.data.client;

import com.mattborle.testmod.TestMod;
import com.mattborle.testmod.setup.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {

    public CreativeTab() {
        super(TestMod.MOD_ID);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.EPIDAXITE.get());
    }

}