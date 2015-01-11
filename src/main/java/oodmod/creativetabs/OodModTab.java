package oodmod.creativetabs;

import oodmod.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OodModTab extends CreativeTabs
{

	public OodModTab(int integer, String arg)
	{
		super(integer, arg);
	}

	@Override
	public Item getTabIconItem()
	{
		return ItemRegistry.BoiledBroccoli;
	}

}
