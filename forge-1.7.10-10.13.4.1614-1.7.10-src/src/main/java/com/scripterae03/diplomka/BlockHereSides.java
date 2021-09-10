package com.scripterae03.diplomka;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockHereSides extends Block {
	public IIcon[] textures = new IIcon[6];
	protected BlockHereSides(Material p_i45394_1_, String name, String texture) {
		super(p_i45394_1_);
		this.setBlockName(name);
		this.getLocalizedName();
		//��������� �������� ����� � �����
		this.setLightLevel(1F);
		//��������� ������������ �����
		this.setLightOpacity(10);
		//��������� ������������������
		this.setResistance(10F);
		//��������� �����������, � ������� �������� ���������� ����
		this.setHarvestLevel("axe", 3);
		//��������� �����
		this.setStepSound(soundTypeWood);
		//������������� ��������������
		//this.setBlockUnbreakable();
		//��������� �������� �������� �����
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
		// TODO Auto-generated constructor stub
	}
	public void registerBlockIcons(IIconRegister reg) {
		for(int cnt = 0; cnt < 6; cnt++) {
			this.textures[cnt] = reg.registerIcon(this.textureName+"_"+cnt);
		}
	}
	public IIcon getIcon(int side, int meta) {
		return this.textures[side];
	}
}
