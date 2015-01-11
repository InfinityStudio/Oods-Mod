package oodmod.block;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import oodmod.item.ItemRegistry;

public class CropClass extends BlockCrops
{
	
	@Override
	public int quantityDropped (Random random)
	{
		return 1;
	}
	
	@Override
	protected Item getSeed()
	{
		
		if (this == BlockRegistry.BroccoliCrop)
		{
			return ItemRegistry.BroccoliSeeds;
		}
		else if (this == BlockRegistry.OnionCrop)
		{
			return ItemRegistry.OnionSeeds;
		}
		else if (this == BlockRegistry.BeetrootCrop)
		{
			return ItemRegistry.BeetrootSeeds;
		}
		else if (this == BlockRegistry.CauliflowerCrop)
		{
			return ItemRegistry.CauliflowerSeeds;
		}
		else if (this == BlockRegistry.LeekCrop)
		{
			return ItemRegistry.LeekSeeds;
		}
		else if (this == BlockRegistry.GarlicCrop)
		{
			return ItemRegistry.GarlicSeeds;
		}
		else 
		{
			return null;
		}
		
	}
	
	@Override
	protected Item getCrop()
	{
		
		if (this == BlockRegistry.BroccoliCrop)
		{
			return ItemRegistry.Broccoli;
		}
		else if (this == BlockRegistry.OnionCrop)
		{
			return ItemRegistry.Onion;
		}
		else if (this == BlockRegistry.BeetrootCrop)
		{
			return ItemRegistry.Beetroot;
		}
		else if (this == BlockRegistry.CauliflowerCrop)
		{
			return ItemRegistry.Cauliflower;
		}
		else if (this == BlockRegistry.LeekCrop)
		{
			return ItemRegistry.Leek;
		}
		else if (this == BlockRegistry.GarlicCrop)
		{
			return ItemRegistry.Garlic;
		}
		else 
		{
			return null;
		}
		
	}

}