package oodmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import oodmod.main.MainClass;

public class CompressedVegClass extends Block
{

	public CompressedVegClass()
	{
		
		super(Material.grass);
		
		setCreativeTab(MainClass.OodModTab);
		setHardness(0.5F);
		setResistance(1.0F);
		setStepSound(soundTypeGrass);
		
	}

}
