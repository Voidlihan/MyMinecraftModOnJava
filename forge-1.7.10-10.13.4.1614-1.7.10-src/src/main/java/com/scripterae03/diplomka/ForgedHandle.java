package com.scripterae03.diplomka;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ForgedHandle extends Item {
	public ForgedHandle(String name, String texture) {
		this.setUnlocalizedName(name);
		this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
