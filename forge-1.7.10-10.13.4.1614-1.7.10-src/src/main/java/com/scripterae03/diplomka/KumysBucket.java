package com.scripterae03.diplomka;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class KumysBucket extends ItemFood {
	public KumysBucket(String name, String texture, int amount, float saturation, boolean isWrongFood) {
		super(amount, saturation, isWrongFood);
		this.setUnlocalizedName(name);
        this.setAlwaysEdible();
        this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.jump.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5000));
		player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5000));
	    super.onEaten(itemStack, world, player);
	    return new ItemStack(Items.bucket);
	}
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.drink;
    }
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean par4)
	{
		info.add("§bDrinking this, you will feel invincible.");
		info.add("§bВыпив это, вы почувствуете себя непобедимым");
	}
}
