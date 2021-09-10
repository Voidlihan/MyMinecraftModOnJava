package com.scripterae03.diplomka;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

public class WorkSurfaceCraftingManager
{
    private static final WorkSurfaceCraftingManager instance = new WorkSurfaceCraftingManager();
    private List recipes = new ArrayList();
    private static final String __OBFID = "CL_00000090";
    public static final WorkSurfaceCraftingManager getInstance()
    {
        return instance;
    }

    private WorkSurfaceCraftingManager()
    {
        recipes = new ArrayList();
        
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_pants, 1), new Object[] {"SSSSS", "SSSSS", "SS SS", "SS SS", "SS SS", 'S', BaseDiplomka.obsidian_forged_diamond});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_boots, 1), new Object[] {"SS SS", "SS SS", "SS SS", 'S', BaseDiplomka.obsidian_forged_diamond});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_plate, 1), new Object[] {"S   S", "SS SS", "SSSSS", "SSSSS", "SSSSS", 'S', BaseDiplomka.obsidian_forged_diamond});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_helmet, 1), new Object[] {"SSSSS", "SS SS", "S   S", "SS SS", "SS SS", 'S', BaseDiplomka.obsidian_forged_diamond});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_sword, 1), new Object[] {"  S  ", "  S  ", " SSS ", "  T  ", "  T  ", 'S', BaseDiplomka.obsidian_forged_diamond, 'T', BaseDiplomka.forged_handle});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_pickaxe, 1), new Object[] {"  S  ", "SSSSS", "  T  ", "  T  ", "  T  ", 'S', BaseDiplomka.obsidian_forged_diamond, 'T', BaseDiplomka.forged_handle});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_hoe, 1), new Object[] {" SSS ", "S  T ", "   T ", "   T ", 'S', BaseDiplomka.obsidian_forged_diamond, 'T', BaseDiplomka.forged_handle});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_spade, 1), new Object[] {"  S  ", " SSS ", " STS ", "  T  ", "  T  ", 'S', BaseDiplomka.obsidian_forged_diamond, 'T', BaseDiplomka.forged_handle});
        this.addRecipe(new ItemStack(BaseDiplomka.obsidian_forged_diamond_axe, 1), new Object[] {"SSS  ", "SSS  ", "SST  ", "  T  ", "  T  ", 'S', BaseDiplomka.obsidian_forged_diamond, 'T', BaseDiplomka.forged_handle});
        this.addRecipe(new ItemStack(BaseDiplomka.spearblade, 1), new Object[] {"S    ", " S   ", "  S  ", "   S ", "    S", 'S', BaseDiplomka.crystallizedobsidian});
        this.addRecipe(new ItemStack(BaseDiplomka.handle_for_spear, 1), new Object[] {"  S  ", "  S  ", "  S  ", "  S  ", "  S  ", 'S', BaseDiplomka.forged_handle});
        this.addRecipe(new ItemStack(BaseDiplomka.spearofwaterandlava, 1), new Object[] {"QQ   ", "QQQ  ", " QS  ", "   S ", "    S", 'S', BaseDiplomka.handle_for_spear, 'Q', BaseDiplomka.spearblade});
        
        Collections.sort(this.recipes, new WorkSurfaceRecipeSorter(this));
    }

    public WorkSurfaceShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (par2ArrayOfObj[i] instanceof String[])
        {
            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (par2ArrayOfObj[i] instanceof String)
            {
                String s2 = (String)par2ArrayOfObj[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
        {
            Character character = (Character)par2ArrayOfObj[i];
            ItemStack itemstack1 = null;

            if (par2ArrayOfObj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
            }
            else if (par2ArrayOfObj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
            }
            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        WorkSurfaceShapedRecipes shapedrecipes = new WorkSurfaceShapedRecipes(j, k, aitemstack, par1ItemStack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = par2ArrayOfObj;
        int i = par2ArrayOfObj.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipe!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
        {
            Item item = itemstack.getItem();
            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int l = j1 + k + item.getMaxDamage() * 5 / 100;
            int i1 = item.getMaxDamage() - l;

            if (i1 < 0)
            {
                i1 = 0;
            }

            return new ItemStack(itemstack.getItem(), 1, i1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }
    public List getRecipeList()
    {
        return this.recipes;
    }
}