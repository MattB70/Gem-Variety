package com.mattborle.testmod.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;

public class ModArmorItem extends ArmorItem {

    int mix = -1; // mix number (example: 21 - Zeocite,Nepentine)

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties, int mix) {
        // runs once* on init.
        super(material, slot, properties);
    }
}
