package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ObsidianForgedDiamondSword extends ItemSword {

	public ObsidianForgedDiamondSword(String name, String texture, ToolMaterial p_i45356_1_) {
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
		info.add("§bDefeat the strongest enemies!");
		info.add("§bПобеждайте сильных врагов!");
	}
}
