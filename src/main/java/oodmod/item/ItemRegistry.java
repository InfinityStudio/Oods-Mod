package oodmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import oodmod.block.BlockRegistry;
import oodmod.item.tools.KroostylAxeClass;
import oodmod.item.tools.KroostylHoeClass;
import oodmod.item.tools.KroostylPickaxeClass;
import oodmod.item.tools.KroostylShovelClass;
import oodmod.item.tools.KroostylSwordClass;
import oodmod.item.armour.KroostylArmour;
import oodmod.item.armour.ReinforcedKroostylArmour;
import oodmod.main.MainClass;

public class ItemRegistry
{
	
	public static void itemRegistry()
	{
		
    	initItems();
    	registerItems();
    	
	}

	//Armour IDs
	public static int helmetID;
	public static int chestplateID;
	public static int leggingsID;
	public static int bootsID;
	
	//Materials
	public static ToolMaterial KroostylMaterial = EnumHelper.addToolMaterial("Kroostyl", 4, 2000, 10.0F, 8.0F, 10);
	public static ArmorMaterial KroostylArmour = EnumHelper.addArmorMaterial("Kroostyl", MainClass.MODID + ":textures/models/armor/KroostylArmour", 66, new int[] {6, 16, 12, 6}, 10);
	public static ArmorMaterial ReinforcedKroostylArmour = EnumHelper.addArmorMaterial("ReinforcedKroostyl", MainClass.MODID + ":textures/models/armor/ReinforcedKroostylArmour", 264, new int[] {8, 18, 14, 8}, 10);

	//Seeds
	public static Item BroccoliSeeds;
	public static Item OnionSeeds;
	public static Item BeetrootSeeds;
	public static Item CauliflowerSeeds;
	public static Item LeekSeeds;
	public static Item GarlicSeeds;
		
	//Veg
	public static Item Broccoli;
	public static Item Onion;
	public static Item Beetroot;
	public static Item Cauliflower;
	public static Item Leek;
	public static Item Garlic;
	public static Item BoiledBroccoli;
		
	//Ingots & Gems
	public static Item Kroostyl;

	//Tools
	public static Item KroostylShovel;
	public static Item KroostylPickaxe;
	public static Item KroostylAxe;
	public static Item KroostylHoe;
	public static Item KroostylSword;
	
	//Armour
	public static Item KroostylHelmet;
	public static Item KroostylChestplate;
	public static Item KroostylLeggings;
	public static Item KroostylBoots;
	
	public static Item ReinforcedKroostylHelmet;
	public static Item ReinforcedKroostylChestplate;
	public static Item ReinforcedKroostylLeggings;
	public static Item ReinforcedKroostylBoots;
	
	//Records
	public static Item RecordCrispy;
	public static Item RecordSandstorm;
	public static Item RecordBangarang;
	public static Item RecordTryItOut;
	public static Item RecordGetLucky;
	public static Item RecordStayinAlive;
	public static Item RecordWatercolour;
	public static Item RecordMamboNo5;
	public static Item RecordImGonnaBe;
	
	public static void initItems()
	{
		
		//Seeds
		BroccoliSeeds = new SeedsClass(BlockRegistry.BroccoliCrop, Blocks.farmland).setUnlocalizedName("BroccoliSeeds");
		OnionSeeds = new SeedsClass(BlockRegistry.OnionCrop, Blocks.farmland).setUnlocalizedName("OnionSeeds");
		BeetrootSeeds = new SeedsClass(BlockRegistry.BeetrootCrop, Blocks.farmland).setUnlocalizedName("BeetrootSeeds");
		CauliflowerSeeds = new SeedsClass(BlockRegistry.CauliflowerCrop, Blocks.farmland).setUnlocalizedName("CauliflowerSeeds");
		LeekSeeds = new SeedsClass(BlockRegistry.LeekCrop, Blocks.farmland).setUnlocalizedName("LeekSeeds");
		GarlicSeeds = new SeedsClass(BlockRegistry.GarlicCrop, Blocks.farmland).setUnlocalizedName("GarlicSeeds");
		
		//Veg
		Broccoli = new FoodClass(2, 0.3F, false).setUnlocalizedName("Broccoli");
		Onion = new FoodClass(2, 0.3F, false).setUnlocalizedName("Onion");
		Beetroot = new FoodClass(2, 0.3F, false).setUnlocalizedName("Beetroot");
		Cauliflower = new FoodClass(2, 0.3F, false).setUnlocalizedName("Cauliflower");
		Leek = new FoodClass(2, 0.3F, false).setUnlocalizedName("Leek");
		Garlic = new FoodClass(2, 0.3F, false).setUnlocalizedName("Garlic");
		BoiledBroccoli = new FoodClass(6, 1.2F, false).setUnlocalizedName("BoiledBroccoli");
		
		//Ingots & Gems
		Kroostyl = new ItemClass().setUnlocalizedName("Kroostyl");
		
		//Tools
		KroostylShovel = new KroostylShovelClass(KroostylMaterial).setUnlocalizedName("KroostylShovel");
		KroostylPickaxe = new KroostylPickaxeClass(KroostylMaterial).setUnlocalizedName("KroostylPickaxe");
		KroostylAxe = new KroostylAxeClass(KroostylMaterial).setUnlocalizedName("KroostylAxe");
		KroostylHoe = new KroostylHoeClass(KroostylMaterial).setUnlocalizedName("KroostylHoe");
		KroostylSword = new KroostylSwordClass(KroostylMaterial).setUnlocalizedName("KroostylSword");
		
		//Armour
		KroostylHelmet = new KroostylArmour(KroostylArmour, helmetID, 0).setUnlocalizedName("KroostylHelmet");
		KroostylChestplate = new KroostylArmour(KroostylArmour, chestplateID, 1).setUnlocalizedName("KroostylChestplate");
		KroostylLeggings = new KroostylArmour(KroostylArmour, leggingsID, 2).setUnlocalizedName("KroostylLeggings");
		KroostylBoots = new KroostylArmour(KroostylArmour, bootsID, 3).setUnlocalizedName("KroostylBoots");
		
		ReinforcedKroostylHelmet = new ReinforcedKroostylArmour(ReinforcedKroostylArmour, helmetID, 0).setUnlocalizedName("ReinforcedKroostylHelmet");
		ReinforcedKroostylChestplate = new ReinforcedKroostylArmour(ReinforcedKroostylArmour, chestplateID, 1).setUnlocalizedName("ReinforcedKroostylChestplate");
		ReinforcedKroostylLeggings = new ReinforcedKroostylArmour(ReinforcedKroostylArmour, leggingsID, 2).setUnlocalizedName("ReinforcedKroostylLeggings");
		ReinforcedKroostylBoots = new ReinforcedKroostylArmour(ReinforcedKroostylArmour, bootsID, 3).setUnlocalizedName("ReinforcedKroostylBoots");
		
		//Records
		RecordCrispy = new RecordClass("Crispy").setUnlocalizedName("RecordCrispy");
		RecordSandstorm = new RecordClass("Sandstorm").setUnlocalizedName("RecordSandstorm");
		RecordBangarang = new RecordClass("Bangarang").setUnlocalizedName("RecordBangarang");
		RecordTryItOut = new RecordClass("TryItOut").setUnlocalizedName("RecordTryItOut");
		RecordGetLucky = new RecordClass("GetLucky").setUnlocalizedName("RecordGetLucky");
		RecordStayinAlive = new RecordClass("StayinAlive").setUnlocalizedName("RecordStayinAlive");
		RecordWatercolour = new RecordClass("Watercolour").setUnlocalizedName("RecordWatercolour");
		RecordMamboNo5 = new RecordClass("MamboNo5").setUnlocalizedName("RecordMamboNo5");
		RecordImGonnaBe = new RecordClass("ImGonnaBe").setUnlocalizedName("RecordImGonnaBe");
		
	}
	
	public static void registerItems()
	{
		
		//Seeds
		GameRegistry.registerItem(BroccoliSeeds, "BroccoliSeeds");
		GameRegistry.registerItem(OnionSeeds, "OnionSeeds");
		GameRegistry.registerItem(BeetrootSeeds, "BeetrootSeeds");
		GameRegistry.registerItem(CauliflowerSeeds, "CauliflowerSeeds");
		GameRegistry.registerItem(LeekSeeds, "LeekSeeds");
		GameRegistry.registerItem(GarlicSeeds, "GarlicSeeds");
				
		//Veg
		GameRegistry.registerItem(Broccoli, "Broccoli");
		GameRegistry.registerItem(Onion, "Onion");
		GameRegistry.registerItem(Beetroot, "Beetroot");
		GameRegistry.registerItem(Cauliflower, "Cauliflower");
		GameRegistry.registerItem(Leek, "Leek");
		GameRegistry.registerItem(Garlic, "Garlic");
		GameRegistry.registerItem(BoiledBroccoli, "BoiledBroccoli");
				
		//Ingots & Gems
		GameRegistry.registerItem(Kroostyl, "Kroostyl");
				
		//Tools
		GameRegistry.registerItem(KroostylShovel, "KroostylShovel");
		GameRegistry.registerItem(KroostylPickaxe, "KroostylPickaxe");
		GameRegistry.registerItem(KroostylAxe, "KroostylAxe");
		GameRegistry.registerItem(KroostylHoe, "KroostylHoe");
		GameRegistry.registerItem(KroostylSword, "KroostylSword");
		
		//Armour
		GameRegistry.registerItem(KroostylHelmet, "KroostylHelmet");
		GameRegistry.registerItem(KroostylChestplate, "KroostylChestplate");
		GameRegistry.registerItem(KroostylLeggings, "KroostylLeggings");
		GameRegistry.registerItem(KroostylBoots, "KroostylBoots");
		
		GameRegistry.registerItem(ReinforcedKroostylHelmet, "ReinforcedKroostylHelmet");
		GameRegistry.registerItem(ReinforcedKroostylChestplate, "ReinforcedKroostylChestplate");
		GameRegistry.registerItem(ReinforcedKroostylLeggings, "ReinforcedKroostylLeggings");
		GameRegistry.registerItem(ReinforcedKroostylBoots, "ReinforcedKroostylBoots");
		
		//Records
		GameRegistry.registerItem(RecordCrispy, "RecordCrispy");
		GameRegistry.registerItem(RecordSandstorm, "RecordSandstorm");
		GameRegistry.registerItem(RecordBangarang, "RecordBangarang");
		GameRegistry.registerItem(RecordTryItOut, "RecordTryItOut");
		GameRegistry.registerItem(RecordGetLucky, "RecordGetLucky");
		GameRegistry.registerItem(RecordStayinAlive, "RecordStayinAlive");
		GameRegistry.registerItem(RecordWatercolour, "RecordWatercolour");
		GameRegistry.registerItem(RecordMamboNo5, "RecordMamboNo5");
		GameRegistry.registerItem(RecordImGonnaBe, "RecordImGonnaBe");
				
	}
	
	public static void registerRenders()
	{

		//Seeds
		registerRender(BroccoliSeeds);
		registerRender(OnionSeeds);
		registerRender(BeetrootSeeds);
		registerRender(CauliflowerSeeds);
		registerRender(LeekSeeds);
		registerRender(GarlicSeeds);
		
		//Veg
		registerRender(Broccoli);
		registerRender(Onion);
		registerRender(Beetroot);
		registerRender(Cauliflower);
		registerRender(Leek);
		registerRender(Garlic);
		registerRender(BoiledBroccoli);
		
		//Ingots & Gems
		registerRender(Kroostyl);
		
		//Tools
		registerRender(KroostylShovel);
		registerRender(KroostylPickaxe);
		registerRender(KroostylAxe);
		registerRender(KroostylHoe);
		registerRender(KroostylSword);
		
		//Armour
		registerRender(KroostylHelmet);
		registerRender(KroostylChestplate);
		registerRender(KroostylLeggings);
		registerRender(KroostylBoots);
		
		registerRender(ReinforcedKroostylHelmet);
		registerRender(ReinforcedKroostylChestplate);
		registerRender(ReinforcedKroostylLeggings);
		registerRender(ReinforcedKroostylBoots);
		
		//Records
		registerRender(RecordCrispy);
		registerRender(RecordSandstorm);
		registerRender(RecordBangarang);
		registerRender(RecordTryItOut);
		registerRender(RecordGetLucky);
		registerRender(RecordStayinAlive);
		registerRender(RecordWatercolour);
		registerRender(RecordMamboNo5);
		registerRender(RecordImGonnaBe);
		
	}
	
	public static void registerRender(Item item)
	{
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MainClass.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}