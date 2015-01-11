package oodmod.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import oodmod.block.BlockRegistry;
import oodmod.item.ItemRegistry;

public class CraftingClass
{
	
	public static void craftingManager()
	{
	
		addCraftingRecipes();
		addSmeltingRecipes();
		
	}
	
	public static void addCraftingRecipes()
	{
		
		//Shaped Recipes
		
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CompressedBroccoli, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Broccoli});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CompressedOnion, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Onion});				
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CompressedBeetroot, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Beetroot});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CompressedCauliflower, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Cauliflower});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CompressedLeek, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Leek});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CompressedGarlic, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Garlic});
				
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.KroostylBlock, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemRegistry.Kroostyl});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.KroostylBricks, 8), new Object[] {"YYY", "YXY", "YYY", 'X', ItemRegistry.Kroostyl, 'Y', Blocks.stonebrick});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.KroostylBricks, 64), new Object[] {"YYY", "YXY", "YYY", 'X', BlockRegistry.KroostylBlock, 'Y', Blocks.stonebrick});
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.KroostylBrickStairs, 4), new Object[] {"  X", " XX", "XXX", 'X', BlockRegistry.KroostylBricks});
				
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.KroostylAxe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ItemRegistry.Kroostyl, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.KroostylPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ItemRegistry.Kroostyl, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.KroostylShovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ItemRegistry.Kroostyl, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.KroostylHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ItemRegistry.Kroostyl, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.KroostylSword, 1), new Object[] {" X ", " X ", " Y ", 'X', ItemRegistry.Kroostyl, 'Y', Items.stick});
				
				
		//Shapeless Recipes
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Broccoli, 9), BlockRegistry.CompressedBroccoli);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.BroccoliSeeds, 1), ItemRegistry.Broccoli);
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Onion, 9), BlockRegistry.CompressedOnion);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.OnionSeeds, 1), ItemRegistry.Onion);
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Beetroot, 9), BlockRegistry.CompressedBeetroot);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.BeetrootSeeds, 1), ItemRegistry.Beetroot);
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Cauliflower, 9), BlockRegistry.CompressedCauliflower);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.CauliflowerSeeds, 1), ItemRegistry.Cauliflower);
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Leek, 9), BlockRegistry.CompressedLeek);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.LeekSeeds, 1), ItemRegistry.Leek);
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Garlic, 9), BlockRegistry.CompressedGarlic);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.GarlicSeeds, 1), ItemRegistry.Garlic);
				
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.Kroostyl, 9), BlockRegistry.KroostylBlock);

		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.KroostylChiseledBricks, 1), BlockRegistry.KroostylBricks);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.KroostylBricks, 1), BlockRegistry.KroostylChiseledBricks);
						
	}
	
	public static void addSmeltingRecipes()
	{
		
		GameRegistry.addSmelting(ItemRegistry.Broccoli, new ItemStack(ItemRegistry.BoiledBroccoli, 1), 0.00F);
		GameRegistry.addSmelting(BlockRegistry.KroostylOre, new ItemStack(ItemRegistry.Kroostyl, 1), 2.50F);
		
	}

}