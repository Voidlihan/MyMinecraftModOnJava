package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ObsidianForgedPickaxe extends ItemPickaxe {

	protected ObsidianForgedPickaxe(String name, String texture, ToolMaterial p_i45347_1_) {
		super(BaseDiplomka.Obsidian_Forged_Diamond_Mat);
		this.setUnlocalizedName(name);
		this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean par4)
	{
		info.add("§bDig deeper and longer!");
		info.add("§bКопайте глубже и дольше!");
	}
}
