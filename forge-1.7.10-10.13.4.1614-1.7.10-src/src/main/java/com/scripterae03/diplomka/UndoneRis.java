package com.scripterae03.diplomka;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UndoneRis extends Item {
	public UndoneRis(String name, String texture) {
		this.setUnlocalizedName(name);
		this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
