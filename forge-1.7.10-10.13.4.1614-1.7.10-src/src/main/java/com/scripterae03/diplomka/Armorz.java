package com.scripterae03.diplomka;

import net.minecraft.client.renderer.texture.IIconRegister;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.entity.Entity;

import net.minecraft.item.ItemArmor;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;

import cpw.mods.fml.relauncher.SideOnly;

public class Armorz extends ItemArmor {
	private String texturePath = "diplomka:textures/models/armor/";
    private String iconPath = "diplomka:";
	public Armorz(int par1, ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String myArmorName) {
		super(BaseDiplomka.Obsidian_Forged_Diamond_ArmorMat, par3, par4);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
		this.SetArmorType(myArmorName, par4);
		// TODO Auto-generated constructor stub
	}
    private void SetArmorType(String myArmorName, int par4)
    {
        switch(par4)
        {
        case 0:
            this.setUnlocalizedName("obsidianForgedDiamondHelmet");
            this.texturePath += myArmorName + "_1.png";
            this.iconPath += "ObsidianForgedDiamondHelmet";
            break;
        case 1:
            this.setUnlocalizedName("obsidianForgedDiamondPlate");
            this.texturePath += myArmorName + "_1.png";
            this.iconPath += "ObsidianForgedDiamondPlate";
            break;
        case 2:
            this.setUnlocalizedName("obsidianForgedDiamondPants");
            this.texturePath += myArmorName + "_2.png";
            this.iconPath += "ObsidianForgedDiamondPants";
            break;
        case 3:
            this.setUnlocalizedName("obsidianForgedDiamondBoots");
            this.texturePath += myArmorName + "_1.png";
            this.iconPath += "ObsidianForgedDiamondBoots";
            break;
        }
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg)
    {
        this.itemIcon = reg.registerIcon(this.iconPath);
    }
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return this.texturePath;
    }
}