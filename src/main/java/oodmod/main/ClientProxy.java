package oodmod.main;

import oodmod.block.BlockClass;
import oodmod.item.ItemClass;

public class ClientProxy extends CommonProxy
{
	
	public static void render()
	{
		
	}
	
	@Override
	public void registerRenders()
	{

	    BlockClass.registerRenders();
	    ItemClass.registerRenders();
	    
	}
	
}
