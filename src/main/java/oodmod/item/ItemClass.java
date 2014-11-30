package oodmod.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import oodmod.block.BlockClass;
import oodmod.item.tools.KroostylAxeClass;
import oodmod.item.tools.KroostylHoeClass;
import oodmod.item.tools.KroostylPickaxeClass;
import oodmod.item.tools.KroostylShovelClass;
import oodmod.item.tools.KroostylSwordClass;

public class ItemClass
{
	
	public static void itemRegistry()
	{
		
    	initItems();
    	registerItems();
    	
	}
	
	//Materials
	public static ToolMaterial KroostylMaterial = EnumHelper.addToolMaterial("Kroostyl", 4, 2000, 10.0F, 8.0F, 10);
	
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
		
	//Ingots & Gems
	public static Item Kroostyl;

	//Tools
	public static Item KroostylShovel;
	public static Item KroostylPickaxe;
	public static Item KroostylAxe;
	public static Item KroostylHoe;
	public static Item KroostylSword;
	
	public static void initItems()
	{
		
		//Seeds
		BroccoliSeeds = new SeedsClass(BlockClass.BroccoliCrop, Blocks.farmland).setUnlocalizedName("BroccoliSeeds");
		OnionSeeds = new SeedsClass(BlockClass.OnionCrop, Blocks.farmland).setUnlocalizedName("OnionSeeds");
		BeetrootSeeds = new SeedsClass(BlockClass.BeetrootCrop, Blocks.farmland).setUnlocalizedName("BeetrootSeeds");
		CauliflowerSeeds = new SeedsClass(BlockClass.CauliflowerCrop, Blocks.farmland).setUnlocalizedName("CauliflowerSeeds");
		LeekSeeds = new SeedsClass(BlockClass.LeekCrop, Blocks.farmland).setUnlocalizedName("LeekSeeds");
		GarlicSeeds = new SeedsClass(BlockClass.GarlicCrop, Blocks.farmland).setUnlocalizedName("GarlicSeeds");
		
		//Veg
		Broccoli = new FoodClass(2, 0.3F, false).setUnlocalizedName("Broccoli");
		Onion = new FoodClass(2, 0.3F, false).setUnlocalizedName("Onion");
		Beetroot = new FoodClass(2, 0.3F, false).setUnlocalizedName("Beetroot");
		Cauliflower = new FoodClass(2, 0.3F, false).setUnlocalizedName("Cauliflower");
		Leek = new FoodClass(2, 0.3F, false).setUnlocalizedName("Leek");
		Garlic = new FoodClass(2, 0.3F, false).setUnlocalizedName("Garlic");
		BoiledBroccoli = new FoodClass(6, 1.2F, false).setUnlocalizedName("BoiledBroccoli");
		OrangeBroccoli = new FoodClass(20, 1.2F, false).setUnlocalizedName("OrangeBroccoli");
		
		//Ingots & Gems
		Kroostyl = new KroostylClass().setUnlocalizedName("Kroostyl");
		
		//Tools
		KroostylShovel = new KroostylShovelClass(KroostylMaterial).setUnlocalizedName("KroostylShovel");
		KroostylPickaxe = new KroostylPickaxeClass(KroostylMaterial).setUnlocalizedName("KroostylPickaxe");
		KroostylAxe = new KroostylAxeClass(KroostylMaterial).setUnlocalizedName("KroostylAxe");
		KroostylHoe = new KroostylHoeClass(KroostylMaterial).setUnlocalizedName("KroostylHoe");
		KroostylSword = new KroostylSwordClass(KroostylMaterial).setUnlocalizedName("KroostylSword");
		
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
		GameRegistry.registerItem(OrangeBroccoli, "OrangeBroccoli");
				
		//Ingots & Gems
		GameRegistry.registerItem(Kroostyl, "Kroostyl");
				
		//Tools
		GameRegistry.registerItem(KroostylShovel, "KroostylShovel");
		GameRegistry.registerItem(KroostylPickaxe, "KroostylPickaxe");
		GameRegistry.registerItem(KroostylAxe, "KroostylAxe");
		GameRegistry.registerItem(KroostylHoe, "KroostylHoe");
		GameRegistry.registerItem(KroostylSword, "KroostylSword");
				
	}
	
}