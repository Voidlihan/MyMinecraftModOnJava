package com.scripterae03.diplomka;

import java.util.ArrayList;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class IspechennoeNechto extends Block {
	public IIcon[] textures = new IIcon[6];
	public IspechennoeNechto(Material cloth, String name, String texture) {
		super(cloth);
		this.setBlockName(name);
		this.setLightOpacity(10);
		this.setResistance(10F);
		this.getLocalizedName();
		this.setStepSound(soundTypeCloth);
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
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
		ret.clear();
		if(Math.random()>=0.5)
		    ret.add(new ItemStack(BaseDiplomka.ispechennoe_nechto));
		else
		    ret.add(new ItemStack(BaseDiplomka.testo));
		return ret;
	}
}
