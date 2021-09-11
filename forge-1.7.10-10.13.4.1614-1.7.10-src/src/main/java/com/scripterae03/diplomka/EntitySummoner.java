package com.scripterae03.diplomka;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntitySummoner extends Item{
	public EntitySummoner(String name, String texture) {
		this.setUnlocalizedName(name);
        this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        BossEntity b = new BossEntity(worldIn);
        b.setPosition(playerIn.posX, playerIn.posY, playerIn.posZ);
        worldIn.spawnEntityInWorld(b);
        ItemStack current = playerIn.getCurrentEquippedItem();
        current.stackSize--;
        if(current.stackSize==0)
            playerIn.destroyCurrentEquippedItem();
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }
}
