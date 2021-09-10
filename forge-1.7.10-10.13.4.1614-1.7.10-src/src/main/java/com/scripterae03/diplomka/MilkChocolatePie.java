package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MilkChocolatePie extends ItemFood {

	public MilkChocolatePie(String name, String texture, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setUnlocalizedName(name);
        this.setAlwaysEdible();
        this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
		// TODO Auto-generated constructor stub
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
	    return super.onEaten(itemStack, world, player);
	}
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean par4)
	{
		info.add("§bSweet tooth dream");
		info.add("§bМечта сладкоежки.");
	}
}
