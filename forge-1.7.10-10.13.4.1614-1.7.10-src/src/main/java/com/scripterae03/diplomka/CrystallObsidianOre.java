package com.scripterae03.diplomka;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CrystallObsidianOre extends BlockOre {
	protected CrystallObsidianOre(String name, String texture) {
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
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return BaseDiplomka.crystallizedobsidian;
	}
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return 5;
	}
}
