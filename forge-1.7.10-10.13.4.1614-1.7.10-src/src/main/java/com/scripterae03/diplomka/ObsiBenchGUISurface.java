package com.scripterae03.diplomka;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ObsiBenchGUISurface extends GuiContainer{

	private ResourceLocation texture = new ResourceLocation(BaseDiplomka.MODID + ":" + "textures/gui/WorkSurface.png");
	
	public ObsiBenchGUISurface(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerWorkSurface(invPlayer, world, x, y, z));
		this.xSize = 176;
		this.ySize = 188;
		
	}

	protected void drawGuiContainerForegroundLayer(int i, int j) {	
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Obsidian Crafting Table(Обсидианоый Верстак)"), 100, 5, 0x4B0082);
	}
	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}
}
