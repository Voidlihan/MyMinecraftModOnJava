package com.scripterae03.diplomka;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		
		switch(ID) {
		case 0:
			return ID == 0 && world.getBlock(x, y, z) == BaseDiplomka.obsibench ? new ContainerWorkSurface(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		
		switch(ID) {
		case 0:
			return ID == 0 && world.getBlock(x, y, z) == BaseDiplomka.obsibench ? new ObsiBenchGUISurface(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

}