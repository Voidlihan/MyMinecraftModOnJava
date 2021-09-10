package com.scripterae03.diplomka;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockOfRandomItemFromMyModLevel1 extends Block {
	protected BlockOfRandomItemFromMyModLevel1(Material p_i45394_1_, String name, String texture) {
		super(p_i45394_1_);
		this.setBlockName(name);
		this.getLocalizedName();
		this.setLightOpacity(5);
		this.setResistance(10F);
		this.setStepSound(soundTypeStone);
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
		ret.clear();
		if(Math.random()>=0.75)
		    ret.add(new ItemStack(BaseDiplomka.testo));
		else if(Math.random()>=0.3)
		    ret.add(new ItemStack(BaseDiplomka.muka, 2));
		else if(Math.random()>=0.4)
		    ret.add(new ItemStack(BaseDiplomka.osnovabaursaka));
		else
		    ret.add(new ItemStack(BaseDiplomka.blockwood));
		return ret;
	}
}
