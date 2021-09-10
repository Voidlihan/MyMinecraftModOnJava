package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CrystallizedObsidian extends Item {
	public CrystallizedObsidian(String name, String texture) {
		this.setUnlocalizedName(name);
		this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean par4)
	{
		info.add("§bObsidian was crystallized. Who would have thought?");
		info.add("§bОбсидиан кристаллизовался. Кто бы мог подумать?");
	}
}
