package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MilkChocolate extends ItemFood {
	public MilkChocolate(String name, String texture, int amount, float saturation, boolean isWrongFood) {
		super(amount, saturation, isWrongFood);
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
		info.add("§bQuite a lot of fun with just one piece");
		info.add("§bДовольно много удовольствия от одного лишь кусочка.");
	}
}
