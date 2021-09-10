package com.scripterae03.diplomka;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MiskaRis extends ItemFood {
	public MiskaRis(String name, String texture, int amount, float saturation, boolean isWrongFood) {
		super(amount, saturation, isWrongFood);
        this.setUnlocalizedName(name);
        this.setAlwaysEdible();
        this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
		// TODO Auto-generated constructor stub
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 500));
	    super.onEaten(itemStack, world, player);
	    return new ItemStack(Items.bowl);
	}
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean par4)
	{
		info.add("§bNothing is more invigorating than one bowl of rice.");
		info.add("§bНичто так не бодрит, как одна миска риса.");
	}
}
