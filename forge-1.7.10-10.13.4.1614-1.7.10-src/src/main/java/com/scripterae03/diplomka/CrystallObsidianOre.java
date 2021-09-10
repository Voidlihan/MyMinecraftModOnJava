package com.scripterae03.diplomka;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CrystallObsidianOre extends Block {
	protected CrystallObsidianOre(Material p_i45394_1_, String name, String texture) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.getLocalizedName();
		this.setBlockName(name);
		//��������� ������������ �����
		this.setLightOpacity(10);
		//��������� ������������������
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 2);
		//��������� �����
		this.setStepSound(soundTypeStone);
		//������������� ��������������
		//this.setBlockUnbreakable();
		//��������� �������� �������� �����
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
	}
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
		ret.clear();
		ret.add(new ItemStack(BaseDiplomka.crystallizedobsidian, 2));
		return ret;
	}
}
