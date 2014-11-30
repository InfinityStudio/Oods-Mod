package oodmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import oodmod.main.MainClass;

public class KroostylBlocksClass extends Block
{

	public KroostylBlocksClass()
	{
		
		super(Material.rock);
		
		setCreativeTab(MainClass.OodModTab);
		setHardness(8.0F);
		setResistance(10.0F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 3);
		
	}

}