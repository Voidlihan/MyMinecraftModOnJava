package com.scripterae03.diplomka;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MukaBlock extends Block {
	protected MukaBlock(Material wood, String name, String texture) {
		super(wood);
		//��������� ����� �����
		this.getLocalizedName();
		this.setBlockName(name);
		//��������� ������������ �����
		this.setLightOpacity(10);
		//��������� ������������������
		this.setResistance(10F);
		//��������� �����
		this.setStepSound(soundTypeSand);
		//������������� ��������������
		//this.setBlockUnbreakable();
		//��������� �������� �������� �����
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
	}
}
