package oodmod.main;

import oodmod.block.BlockRegistry;
import oodmod.item.ItemRegistry;

public class ClientProxy extends CommonProxy
{
	
	public static void render()
	{
		
	}
	
	@Override
	public void registerRenders()
	{

	    BlockRegistry.registerRenders();
	    ItemRegistry.registerRenders();
	    
	}
	
}
