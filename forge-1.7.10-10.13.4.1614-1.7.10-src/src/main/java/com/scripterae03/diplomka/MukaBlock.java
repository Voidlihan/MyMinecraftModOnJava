package com.scripterae03.diplomka;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MukaBlock extends Block {
	protected MukaBlock(Material wood, String name, String texture) {
		super(wood);
		//установка имени блока
		this.getLocalizedName();
		this.setBlockName(name);
		//установка прозрачности блока
		this.setLightOpacity(10);
		//установка взрывоустойчивости
		this.setResistance(10F);
		//установка звука
		this.setStepSound(soundTypeSand);
		//невозможность взаимодействия
		//this.setBlockUnbreakable();
		//установка названия текстуры блока
		this.setBlockTextureName(BaseDiplomka.MODID+":"+texture);
		GameRegistry.registerBlock(this, name);
	}
}
