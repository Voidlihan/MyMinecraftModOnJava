package com.scripterae03.diplomka;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianForgedDiamondBrightBlock extends Block {

	protected ObsidianForgedDiamondBrightBlock(Material p_i45394_1_, String name, String texture) {
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
		this.setHarvestLevel("pickaxe", 3);
		//��������� �����
		this.setStepSound(soundTypeStone);
		//������������� ��������������
		//this.setBlockUnbreakable();
		//��������� �������� �������� �����
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
		// TODO Auto-generated constructor stub
	}

}
