package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SpearOfWaterAndLava extends ItemSword{
	public SpearOfWaterAndLava(ToolMaterial m, String name, String texture) {
		super(BaseDiplomka.CrystallizedObsidianMat);
		this.setUnlocalizedName(name);
		this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
	}
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean par4)
	{
		info.add("§bDanger of mobs.");
		info.add("§bГроза мобов.");
	}
}
