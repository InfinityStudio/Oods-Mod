package oodmod.item;

import net.minecraft.item.ItemFood;
import oodmod.main.MainClass;

public class FoodClass extends ItemFood
{

	public FoodClass(int hunger, float saturation, boolean isWolfFood)
	{
		
		super(hunger, saturation, isWolfFood);
		
		setCreativeTab(MainClass.OodModTab);
		
	}

}
