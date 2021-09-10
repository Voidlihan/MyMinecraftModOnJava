package com.scripterae03.diplomka;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class ObsidianForgedDiamondBlock extends Block {
	Minecraft mc;
    EntityPlayer player;
    World world;
	protected ObsidianForgedDiamondBlock(Material m, String name, String texture) {
		super(m);
		this.setBlockName(name);
		this.getLocalizedName();
		//��������� �������� ����� � �����
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
	}
	//@SubscribeEvent
    //public void onRightClick(BlockEvent.BreakEvent e) {
    //    if(e.world.isRemote == false) {
    //  	EntityPlayer player = Minecraft.getMinecraft().thePlayer;
    //        BossEntity zombie = new BossEntity(e.world);
    //       int pX = player.serverPosX, pY = player.serverPosY, pZ = player.serverPosZ;
    //        zombie.setPosition(pX + 1, pY, pZ);
    //        e.world.spawnEntityInWorld(zombie);     
    //    }
    //}
}