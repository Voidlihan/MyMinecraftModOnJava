package com.scripterae03.diplomka;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OsnovaBaursaka extends Item {
	public OsnovaBaursaka(String name, String texture) {
		this.setUnlocalizedName(name);
		this.setTextureName(BaseDiplomka.MODID+":"+texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
}
