package oodmod.achievements;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import oodmod.item.ItemRegistry;
import oodmod.main.MainClass;

public class KroostylCraftEventClass
{
	
	@SubscribeEvent
	public void whenKroostylPickaxeCrafted(PlayerEvent.ItemCraftedEvent e)
	{
		
		if(e.crafting.getItem().equals(ItemRegistry.KroostylPickaxe))
		{
			e.player.addStat(MainClass.achievementKroostylPick, 1);
		}
		
	}

}
