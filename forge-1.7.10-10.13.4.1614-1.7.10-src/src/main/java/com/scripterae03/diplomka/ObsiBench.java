package com.scripterae03.diplomka;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ObsiBench extends Block{
	@SideOnly(Side.CLIENT)
	private IIcon workSurfaceTop;
	
	public ObsiBench(Material m, String name) {
		super(m);
		this.setBlockName(name);
		this.getLocalizedName();
		this.setLightOpacity(5);
		this.setResistance(10F);
		this.setStepSound(soundTypeStone);
		GameRegistry.registerBlock(this, name);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		return side == 1 ? this.workSurfaceTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(BaseDiplomka.MODID + ":" + "ObsiBenchSide");
		this.workSurfaceTop = iconRegister.registerIcon(BaseDiplomka.MODID + ":" + "ObsiBench");
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (!player.isSneaking()) {
			player.openGui(BaseDiplomka.instance, 0, world, x, y, z);
			return true;
		}
		else {
			return false;
		}
	}
	
}
