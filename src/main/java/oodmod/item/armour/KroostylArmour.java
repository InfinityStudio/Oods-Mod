package oodmod.item.armour;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import oodmod.item.ItemRegistry;
import oodmod.main.MainClass;

public class KroostylArmour extends ItemArmor 
{

	public KroostylArmour(ArmorMaterial material, int ID, int placement) 
	{
		
		super(material, ID, placement);
			
		setCreativeTab(MainClass.OodModTab);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		
		if (stack.getItem() == ItemRegistry.KroostylHelmet || stack.getItem() == ItemRegistry.KroostylChestplate || stack.getItem() == ItemRegistry.KroostylBoots) 
		{
			return MainClass.MODID + ":textures/models/armor/KroostylArmour_1.png";
		}
		else if (stack.getItem() == ItemRegistry.KroostylLeggings) 
		{
			return MainClass.MODID + ":textures/models/armor/KroostylArmour_2.png";
		}
		else 
		{
			return null;
		}
		
	}

}