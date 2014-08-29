package oodmod.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import oodmod.block.BlockClass;
import oodmod.item.armour.KroostylArmour;
import oodmod.item.armour.ReinforcedKroostylArmour;
import oodmod.item.food.FruitClass;
import oodmod.item.food.VegClass;
import oodmod.item.tools.KroostylAxeClass;
import oodmod.item.tools.KroostylHoeClass;
import oodmod.item.tools.KroostylPickaxeClass;
import oodmod.item.tools.KroostylShovelClass;
import oodmod.item.tools.KroostylSwordClass;
import oodmod.main.MainClass;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemClass {
	
	//Armour IDs
	public static int helmetID;
	public static int chestplateID;
	public static int leggingsID;
	public static int bootsID;
	
	//Materials
	public static ToolMaterial KroostylMaterial = EnumHelper.addToolMaterial("Kroostyl", 4, 2000, 10.0F, 8.0F, 10);
	public static ArmorMaterial KroostylArmour = EnumHelper.addArmorMaterial("Kroostyl", 66, new int[] {6, 16, 12, 6}, 10);
	public static ArmorMaterial ReinforcedKroostylArmour = EnumHelper.addArmorMaterial("ReinforcedKroostyl", 264, new int[] {8, 18, 14, 8}, 10);
	
	public static void itemRegistry(){
    	initItems();
    	registerItems();
    }
	
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
		
		public static Item OrangeBroccoli;
		
		//Fruit
		public static Item Orange;
		public static Item Banana;
		public static Item Mango;
		
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
	
	public static void initItems(){
		
		//Seeds
		BroccoliSeeds = new SeedsClass(BlockClass.BroccoliCrop, Blocks.farmland).setUnlocalizedName("BroccoliSeeds").setTextureName(MainClass.MODID + ":BroccoliSeeds");
		OnionSeeds = new SeedsClass(BlockClass.OnionCrop, Blocks.farmland).setUnlocalizedName("OnionSeeds").setTextureName(MainClass.MODID + ":OnionSeeds");
		BeetrootSeeds = new SeedsClass(BlockClass.BeetrootCrop, Blocks.farmland).setUnlocalizedName("BeetrootSeeds").setTextureName(MainClass.MODID + ":BeetrootSeeds");
		CauliflowerSeeds = new SeedsClass(BlockClass.CauliflowerCrop, Blocks.farmland).setUnlocalizedName("CauliflowerSeeds").setTextureName(MainClass.MODID + ":CauliflowerSeeds");
		LeekSeeds = new SeedsClass(BlockClass.LeekCrop, Blocks.farmland).setUnlocalizedName("LeekSeeds").setTextureName(MainClass.MODID + ":LeekSeeds");
		GarlicSeeds = new SeedsClass(BlockClass.GarlicCrop, Blocks.farmland).setUnlocalizedName("GarlicSeeds").setTextureName(MainClass.MODID + ":GarlicSeeds");
			
		//Veg
		Broccoli = new VegClass(2, 0.3F, false).setUnlocalizedName("Broccoli").setTextureName(MainClass.MODID + ":Broccoli");
		Onion = new VegClass(2, 0.3F, false).setUnlocalizedName("Onion").setTextureName(MainClass.MODID + ":Onion");
		Beetroot = new VegClass(2, 0.3F, false).setUnlocalizedName("Beetroot").setTextureName(MainClass.MODID + ":Beetroot");
		Cauliflower = new VegClass(2, 0.3F, false).setUnlocalizedName("Cauliflower").setTextureName(MainClass.MODID + ":Cauliflower");
		Leek = new VegClass(2, 0.3F, false).setUnlocalizedName("Leek").setTextureName(MainClass.MODID + ":Leek");
		Garlic = new VegClass(2, 0.3F, false).setUnlocalizedName("Garlic").setTextureName(MainClass.MODID + ":Garlic");
			
		BoiledBroccoli = new VegClass(6, 1.2F, false).setUnlocalizedName("BoiledBroccoli").setTextureName(MainClass.MODID + ":BoiledBroccoli");
			
		OrangeBroccoli = new VegClass(20, 1.2F, false).setUnlocalizedName("OrangeBroccoli").setTextureName(MainClass.MODID + ":OrangeBroccoli");
			
		//Fruit
		Orange = new FruitClass(4, 0.8F, false).setUnlocalizedName("Orange").setTextureName(MainClass.MODID + ":Orange");
		Banana = new FruitClass(4, 0.8F, false).setUnlocalizedName("Banana").setTextureName(MainClass.MODID + ":Banana");
		Mango = new FruitClass(4, 0.8F, false).setUnlocalizedName("Mango").setTextureName(MainClass.MODID + ":Mango");
			
		//Ingots & Gems
		Kroostyl = new KroostylClass().setUnlocalizedName("Kroostyl");
			
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
		
	}
	
	
	public static void registerItems(){
		
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
		GameRegistry.registerItem(OrangeBroccoli, "OrangeBroccoli");
				
		//Fruit
		GameRegistry.registerItem(Orange, "Orange");
		GameRegistry.registerItem(Banana, "Banana");
		GameRegistry.registerItem(Mango, "Mango");
				
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
				
	}
	
}