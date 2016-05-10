package com.renevo.rucksacks.item;

import com.renevo.rucksacks.Util;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public abstract class ItemMeta extends Item {

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        if(I18n.canTranslate(this.getUnlocalizedName(stack) + ".tooltip")) {
            tooltip.add(TextFormatting.GRAY.toString() + Util.translateRecursive(this.getUnlocalizedName(stack) + ".tooltip"));
        }
        else if(I18n.canTranslate(super.getUnlocalizedName(stack) + ".tooltip")) {
            tooltip.add(TextFormatting.GRAY.toString() + Util.translateRecursive(super.getUnlocalizedName(stack) + ".tooltip"));
        }
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
