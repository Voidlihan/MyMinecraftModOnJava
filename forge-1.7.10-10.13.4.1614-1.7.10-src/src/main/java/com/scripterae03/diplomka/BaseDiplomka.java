package com.scripterae03.diplomka;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod (modid = BaseDiplomka.MODID, name=BaseDiplomka.MODNAME, version = BaseDiplomka.VERSION)
public class BaseDiplomka {
	public static final CreativeTabs tabDiplomkaItems = new CreativeTabs("tabDiplomkaItems") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.glowstone);
		}
	};
	public static final String MODID = "diplomka";
	public static final String MODNAME = "Diplomka";
	public static final String VERSION = "1.0";
	public static final ArmorMaterial Obsidian_Forged_Diamond_ArmorMat = EnumHelper.addArmorMaterial("Obsidian_Forged_Diamond_ArmorMat", 150, new int[] {6, 9, 7, 6}, 35);
	public static final ToolMaterial Obsidian_Forged_Diamond_Mat = EnumHelper.addToolMaterial("Obsidian_Forged_Diamond_Mat", 3, 2500, 16.0F, 9.0F, 20);
	public static final ToolMaterial CrystallizedObsidianMat = EnumHelper.addToolMaterial("CrysstalizedObsidianMat", 3, 1800, 12.0F, 6.0F, 16);
	public static Block blockwood;
	public static Block shagwood;
	public static Block ispechennoe_nechto;
	public static Block mukablock;
	public static Block obsidian_forged_diamond_block;
	public static Block obsidian_forged_diamond_bright_block;
	public static Block blockOfRandomItemFromMyModLevel1;
	public static Block blockOfRandomItemFromMyModLevel2;
	public static Block compressed_earth_block;
	public static Block second_compressed_earth_block;
	public static Block third_compressed_earth_block;
	public static Block crystallized_obsidian_block;
	public static BlockOre crystallobsidianore;
	public static Block obsibench;
	public static COOBlockGenerator cooblockgenerator = new COOBlockGenerator();
	public static Item big_bread;
	public static Item baursak;
	public static Item muka;
	public static Item milk_chocolate;
	public static Item milk_chocolate_pie;
	public static Item osnovabaursaka;
	public static Item testo;
	public static Item besh;
	public static Item kumysbucket;
	public static Item undone_ris;
	public static Item miska_ris;
	public static Item obsidian_forged_diamond;
	public static Item forged_handle;
	public static Item obsidian_forged_diamond_sword;
	public static Item obsidian_forged_diamond_pickaxe;
	public static Item obsidian_forged_diamond_axe;
	public static Item obsidian_forged_diamond_spade;
	public static Item obsidian_forged_diamond_hoe;
	public static Item obsidian_forged_diamond_helmet;
	public static Item obsidian_forged_diamond_plate;
	public static Item obsidian_forged_diamond_pants;
	public static Item obsidian_forged_diamond_boots;
	public static Item crystallizedobsidian;
	public static Item handle_for_spear;
	public static Item spearofwaterandlava;
	public static Item spearblade;
	public static Item entity_summoner;
	public static Achievement ach1;
	public static Achievement ach2;
	public static Achievement ach3;
	@Instance(MODID)
	public static BaseDiplomka instance;
	@SidedProxy(clientSide = "com.scripterae03.diplomka.ClientProxy", serverSide = "com.scripterae03.diplomka.CommonProxy")
	public static CommonProxy proxy;
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new EventsForge());
	}
	@EventHandler
	public void load(FMLInitializationEvent event) {
		ach1 = new Achievement("achievement.kumysget", "kumysget", 0, 0, new ItemStack(BaseDiplomka.kumysbucket), (Achievement)null).initIndependentStat().registerStat();
		ach2 = new Achievement("achievement.craftSummoner", "craftSummoner", 1, 1, BaseDiplomka.entity_summoner, (Achievement)null).initIndependentStat().registerStat();
		ach3 = new Achievement("achievement.craftHoe", "craftHoe", 2, 2, BaseDiplomka.obsidian_forged_diamond_hoe, (Achievement)null).initIndependentStat().registerStat();
		AchievementPage.registerAchievementPage(new AchievementPage("Custom Achievements", new Achievement[] {ach1, ach2, ach3}));
		FMLCommonHandler.instance().bus().register(new KumysAchievementEvent());
		FMLCommonHandler.instance().bus().register(new EntitySummonerCraftEvent());
		FMLCommonHandler.instance().bus().register(new HoeCraftEvent());
	}
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{   
		RecipeRemover.removeCraftingRecipe();
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		GameRegistry.registerWorldGenerator(cooblockgenerator, 0);
		registerEntity(BossEntity.class, "bossEntity", 0x000009C, 0x9400D3);
		obsidian_forged_diamond_hoe = new ObsidianForgedHoe("obsidian_forged_hoe", "ObsidianForgedDiamondHoeAnimated", BaseDiplomka.Obsidian_Forged_Diamond_Mat).setUnlocalizedName("obsidian_forged_hoe").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(obsidian_forged_diamond_hoe, "obsidian_forged_hoe");
		obsidian_forged_diamond_axe = new ObsidianForgedAxe("obsidian_forged_axe", "ObsidianForgedDiamondAxeAnimated", BaseDiplomka.Obsidian_Forged_Diamond_Mat).setUnlocalizedName("obsidian_forged_axe").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(obsidian_forged_diamond_axe, "obsidian_forged_axe");
		obsidian_forged_diamond_spade = new ObsidianForgedSpade("obsidian_forged_spade", "ObsidianForgedDiamondSpadeAnimated", BaseDiplomka.Obsidian_Forged_Diamond_Mat).setUnlocalizedName("obsidian_forged_spade").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(obsidian_forged_diamond_spade, "obsidian_forged_spade");
		obsidian_forged_diamond_pickaxe = new ObsidianForgedPickaxe("obsidian_forged_pickaxe", "ObsidianForgedDiamondPickaxeAnimated", BaseDiplomka.Obsidian_Forged_Diamond_Mat).setUnlocalizedName("obsidian_forged_pickaxe").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(obsidian_forged_diamond_pickaxe, "obsidian_forged_pickaxe");
		forged_handle = new ForgedHandle("forged_handle", "ForgedHandle").setUnlocalizedName("forged_handle").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(forged_handle, "forged_handle");
		obsidian_forged_diamond = new ObsidianForgedDiamond("obsidian_forged_diamond", "ObsidianForgedDiamond").setUnlocalizedName("obsidian_forged_diamond").setCreativeTab(tabDiplomkaItems);;
		GameRegistry.registerItem(obsidian_forged_diamond, "obsidian_forged_diamond");
		obsidian_forged_diamond_sword = new ObsidianForgedDiamondSword("obsidian_forged_diamond_sword", "ObsidianForgedDiamondSwordAnimated", BaseDiplomka.Obsidian_Forged_Diamond_Mat).setUnlocalizedName("obsidian_forged_diamond_sword").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(obsidian_forged_diamond_sword, "obsidian_forged_diamond_sword");
		undone_ris = new UndoneRis("undone_ris", "UndoneRis").setUnlocalizedName("undone_ris").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(undone_ris, "undone_ris");
		miska_ris = new MiskaRis("miska_ris", "MiskaRis", 8, 10.0f, false).setUnlocalizedName("miska_ris").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(miska_ris, "miska_ris");
		kumysbucket = new KumysBucket("kumysbucket", "KumysBucket", 20, 20.0f, false).setUnlocalizedName("kumysbucket").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(kumysbucket, "kumysbucket");
		baursak = new Baursak("baursak", "Baursak", 6, 8.0f, false).setUnlocalizedName("baursak").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(baursak, "baursak");
		muka = new Muka("muka", "Muka").setUnlocalizedName("muka").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(muka, "muka");
		entity_summoner = new EntitySummoner("entity_summoner", "EntitySummoner").setUnlocalizedName("entity_summoner").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(entity_summoner, "entity_summoner");
		milk_chocolate = new MilkChocolate("milk_chocolate", "MilkChocolate", 4, 6.0f, false).setUnlocalizedName("milk_chocolate").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(milk_chocolate, "milk_chocolate");
		milk_chocolate_pie = new MilkChocolatePie("milk_chocolate", "MilkChocolatePie", 7, 8.0f, false).setUnlocalizedName("milk_chocolate_pie").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(milk_chocolate_pie, "milk_chocolate_pie");
		osnovabaursaka = new OsnovaBaursaka("osnovaBaursaka", "OsnovaBaursaka").setUnlocalizedName("osnovabaursaka").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(osnovabaursaka, "osnovabaursaka");
		big_bread = new BigBread("bigbread", "BigBread", 16, 16.0f, false).setUnlocalizedName("big_bread").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(big_bread, "bigbread");
		testo = new Testo("testo", "Testo").setUnlocalizedName("testo").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(testo, "testo");
		besh = new Besh("besh", "Besh", 16, 16.0f, false).setUnlocalizedName("besh").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(besh, "besh");
		crystallizedobsidian = new CrystallizedObsidian("crystallizedobsdidan", "CrystallizedObsdidan").setUnlocalizedName("crystallizedobsidian").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(crystallizedobsidian, "crystallizedobsidian");
		spearofwaterandlava = new SpearOfWaterAndLava(BaseDiplomka.CrystallizedObsidianMat, "spearofwaterandlava", "SpareOfWaterAndLava").setUnlocalizedName("spearofwaterandlava").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(spearofwaterandlava, "spareofwaterandlava");
		handle_for_spear = new HandleForSpear("handleforspear", "HandleForSpear").setUnlocalizedName("handleforspear").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(handle_for_spear, "handleforspear");
		spearblade = new SpearBlade("spearblade", "SpearBlade").setUnlocalizedName("spearblade").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(spearblade, "spearblade");
		obsidian_forged_diamond_helmet = new Armorz(0, BaseDiplomka.Obsidian_Forged_Diamond_ArmorMat, 0, 0, "ObsidianArmor").setCreativeTab(tabDiplomkaItems);
		obsidian_forged_diamond_plate = new Armorz(0, BaseDiplomka.Obsidian_Forged_Diamond_ArmorMat, 0, 1, "ObsidianArmor").setCreativeTab(tabDiplomkaItems);
		obsidian_forged_diamond_pants = new Armorz(0, BaseDiplomka.Obsidian_Forged_Diamond_ArmorMat, 0, 2, "ObsidianArmor").setCreativeTab(tabDiplomkaItems);
		obsidian_forged_diamond_boots = new Armorz(0, BaseDiplomka.Obsidian_Forged_Diamond_ArmorMat, 0, 3, "ObsidianArmor").setCreativeTab(tabDiplomkaItems);
		GameRegistry.registerItem(obsidian_forged_diamond_helmet, "obsidian_forged_diamond_helmet");
		GameRegistry.registerItem(obsidian_forged_diamond_plate, "obsidian_forged_diamond_plate");
		GameRegistry.registerItem(obsidian_forged_diamond_pants, "obsidian_forged_diamond_pants");
		GameRegistry.registerItem(obsidian_forged_diamond_boots, "obsidian_forged_diamond_boots");
		blockwood = new BlockHere(Material.wood, "blockwood", "Wood").setCreativeTab(tabDiplomkaItems).setHardness(2.0F);
		crystallobsidianore = (BlockOre) new CrystallObsidianOre("crystallobsidianore", "CrystallizedOOre").setCreativeTab(tabDiplomkaItems).setHardness(6.0F);
		obsibench = new ObsiBench(Material.rock, "obsidianworkbench").setCreativeTab(tabDiplomkaItems).setHardness(8.0F);
		obsidian_forged_diamond_block = new ObsidianForgedDiamondBlock(Material.rock, "obsidian_forged_diamond_block", "ObsidianForgedDiamondBlock").setCreativeTab(tabDiplomkaItems).setHardness(8.0F);
		obsidian_forged_diamond_bright_block = new ObsidianForgedDiamondBrightBlock(Material.rock, "obsidian_forged_diamond_bright_block", "ObsidianForgedDiamondBlockAnimated").setCreativeTab(tabDiplomkaItems).setHardness(8.0F);
		mukablock = new MukaBlock(Material.sand, "mukablock", "MukaBlock").setCreativeTab(tabDiplomkaItems);
		ispechennoe_nechto = new IspechennoeNechto(Material.cloth, "ispechennoe_nechto", "IspechennoeNechtoS").setCreativeTab(tabDiplomkaItems).setHardness(2.0F);
		blockOfRandomItemFromMyModLevel1 = new BlockOfRandomItemFromMyModLevel1(Material.rock, "blockOfRandomItemFromMyModLevel1", "BlockOfRandomItemFromMyModLevel1").setHardness(1.0F).setCreativeTab(tabDiplomkaItems);
		blockOfRandomItemFromMyModLevel2 = new BlockOfRandomItemFromMyModLevel2(Material.rock, "blockOfRandomItemFromMyModLevel2", "BlockOfRandomItemFromMyModLevel2").setHardness(1.0F).setCreativeTab(tabDiplomkaItems);
		shagwood = new BlockHereSides(Material.wood, "sidedshagwood", "WoodS").setCreativeTab(tabDiplomkaItems).setHardness(2.0f);
		compressed_earth_block = new CompressedEarthBlock(Material.clay, "compressed_earth_block", "CompressedEarth").setCreativeTab(tabDiplomkaItems).setHardness(1.0f);
		second_compressed_earth_block = new SecondCompressedEarthBlock(Material.clay, "second_compressed_earth_block", "2ndCompressedEarth").setCreativeTab(tabDiplomkaItems).setHardness(1.0f);
		third_compressed_earth_block = new ThirdCompressedEarthBlock(Material.clay, "third_compressed_earth_block", "3rdCompressedEarth").setCreativeTab(tabDiplomkaItems).setHardness(1.0f);
		crystallized_obsidian_block = new CrystallizedObsidianBlock(Material.rock, "crystallizedobsidianblock", "CrystallizedObsidianBlock").setCreativeTab(tabDiplomkaItems).setHardness(6.0F);
		proxy.registerRenderers();
		GameRegistry.addShapelessRecipe(new ItemStack(entity_summoner, 1),
				  new Object[]{
					obsidian_forged_diamond_block,
					Items.water_bucket,
					Items.lava_bucket
				  }
				);
		GameRegistry.addRecipe(new ItemStack(obsibench, 1),
				  new Object[]{
				    "COC", "OOO", "COC",
				    ('C'), Blocks.crafting_table,
				    ('O'), Blocks.obsidian
				  }
				);
		GameRegistry.addRecipe(new ItemStack(crystallized_obsidian_block, 1),
				  new Object[]{
				    "QQQ", "QQQ", "QQQ",
				    ('Q'), crystallizedobsidian,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(compressed_earth_block, 1),
				  new Object[]{
				    "###", "###", "###",
				    ('#'), Blocks.dirt,
				  }
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 9),
				  new Object[]{
				    compressed_earth_block,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(second_compressed_earth_block, 1),
				  new Object[]{
				    "###", "###", "###",
				    ('#'), compressed_earth_block,
				  }
				);
		GameRegistry.addShapelessRecipe(new ItemStack(compressed_earth_block, 9),
				  new Object[]{
				    second_compressed_earth_block,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(third_compressed_earth_block, 1),
				  new Object[]{
				    "###", "###", "###",
				    ('#'), second_compressed_earth_block,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(second_compressed_earth_block, 9),
				  new Object[]{
				    "#",
				    ('#'), third_compressed_earth_block,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(milk_chocolate, 1),
				  new Object[]{
				    "###", " M ",
				    ('#'), new ItemStack(Items.dye, 1, 3),
				    ('M'), Items.milk_bucket
				  }
				);
		GameRegistry.addRecipe(new ItemStack(milk_chocolate_pie, 1),
				  new Object[]{
				    "###", "#C#", "###",
				    ('#'), testo,
				    ('C'), milk_chocolate,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(forged_handle, 1),
				  new Object[]{
				    "#  ", " D ", "  #",
				    ('#'), Blocks.obsidian,
				    ('D'), Items.stick,
				  }
				);
		GameRegistry.addShapelessRecipe(new ItemStack(obsidian_forged_diamond, 1),
				  new Object[]{
					Blocks.obsidian,
					Blocks.obsidian,
				    Items.diamond
				  }
				);
		GameRegistry.addShapelessRecipe(new ItemStack(obsidian_forged_diamond, 9),
				  new Object[]{
				    obsidian_forged_diamond_block,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(obsidian_forged_diamond_block, 1),
				  new Object[]{
				    "###", "###", "###",
				    ('#'), obsidian_forged_diamond,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(obsidian_forged_diamond_bright_block, 1),
				  new Object[]{
				    "###", "#D#", "###",
				    ('#'), Items.glowstone_dust,
				    ('D'), obsidian_forged_diamond_block,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(undone_ris, 3),
				  new Object[]{
				    "##",
				    ('#'), new ItemStack(Blocks.double_plant, 1, 1),
				  }
				);
		GameRegistry.addRecipe(new ItemStack(miska_ris, 1),
				  new Object[]{
				    "###", " A ",
				    ('#'), undone_ris,
				    ('A'), Items.bowl,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(muka, 4),
				  new Object[]{
				    "##", "##",
				    ('#'), Items.wheat,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(testo, 4),
				new Object[]{
						"###", "XYX", "###",
						('#'), muka,
						('Y'), Items.water_bucket,
						('X'), Items.egg,
		}
				);
		GameRegistry.addRecipe(new ItemStack(osnovabaursaka, 4),
				  new Object[]{
				    "##", "##",
				    ('#'), testo,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(besh, 1),
				  new Object[]{
				    "#Y#", "###", " X ",
				    ('#'), testo,
				    ('Y'), Items.beef,
				    ('X'), Items.bowl,
				  }
				);
		GameRegistry.addSmelting(osnovabaursaka, new ItemStack(baursak), 0.5f);
		GameRegistry.addSmelting(mukablock, new ItemStack(ispechennoe_nechto), 1f);
		GameRegistry.addShapelessRecipe(new ItemStack(blockwood, 1),
				  new Object[]{
				    Blocks.log,
				    new ItemStack(Items.dye, 1, 15),
				    new ItemStack(Items.glowstone_dust),
				  }
		);
		GameRegistry.addRecipe(new ItemStack(mukablock, 1),
				  new Object[]{
				    "###", "###", "###",
				    ('#'), muka,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(big_bread, 1),
				  new Object[]{
				    "#",
				    ('#'), ispechennoe_nechto,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(blockOfRandomItemFromMyModLevel1, 1),
				  new Object[]{
				    "XYX", "YXY", "XYX",
				    ('X'), Items.emerald,
				    ('Y'), new ItemStack(Items.dye, 1, 8)
				  }
				);
		GameRegistry.addRecipe(new ItemStack(blockOfRandomItemFromMyModLevel2, 1),
				  new Object[]{
				    "XAX", 
				    "YFY", 
				    "XCX",
				    ('X'), Items.gold_ingot,
				    ('Y'), new ItemStack(Items.dye, 1, 5),
				    ('F'), new ItemStack(Items.dye, 1, 14),
				    ('C'), new ItemStack(Items.dye, 1, 4),
				    ('A'), new ItemStack(Items.dye, 1, 8),
				  }
				);
	}
	public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor)
	{
	  int entityID = EntityRegistry.findGlobalUniqueEntityId();
	  long seed = name.hashCode();
	  EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
	  EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
	  EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
}