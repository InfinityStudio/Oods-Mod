package oodmod.item.armour;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import oodmod.item.ItemRegistry;
import oodmod.main.MainClass;

public class ReinforcedKroostylArmour extends ItemArmor 
{

	public ReinforcedKroostylArmour(ArmorMaterial material, int ID, int placement) 
	{
		
		super(material, ID, placement);
			
		setCreativeTab(MainClass.OodModTab);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		
		if (stack.getItem() == ItemRegistry.ReinforcedKroostylHelmet || stack.getItem() == ItemRegistry.ReinforcedKroostylChestplate || stack.getItem() == ItemRegistry.ReinforcedKroostylBoots) 
		{
			return MainClass.MODID + ":textures/models/armor/ReinforcedKroostylArmour_1.png";
		}
		else if (stack.getItem() == ItemRegistry.ReinforcedKroostylLeggings) 
		{
			return MainClass.MODID + ":textures/models/armor/ReinforcedKroostylArmour_2.png";
		}
		else 
		{
			return null;
		}
		
	}

}