package com.scripterae03.diplomka;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockOfRandomItemFromMyModLevel2 extends Block {
	protected BlockOfRandomItemFromMyModLevel2(Material p_i45394_1_, String name, String texture) {
		super(p_i45394_1_);
		this.setBlockName(name);
		this.setLightOpacity(5);
		this.setResistance(10F);
		this.getLocalizedName();
		this.setStepSound(soundTypeStone);
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
		ret.clear();
		if(Math.random()>=0.85)
		    ret.add(new ItemStack(BaseDiplomka.mukablock, 2));
		else if(Math.random()>=0.45)
		    ret.add(new ItemStack(BaseDiplomka.besh));
		else if(Math.random()>=0.45)
		    ret.add(new ItemStack(BaseDiplomka.baursak));
		else
		    ret.add(new ItemStack(BaseDiplomka.kumysbucket));
		return ret;
	}
}
