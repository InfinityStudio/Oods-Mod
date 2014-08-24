package oodmod.achievements;

import oodmod.item.ItemClass;
import oodmod.main.MainClass;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class KroostylCraftEventClass {
	
	@SubscribeEvent
	public void whenKroostylPickaxeCrafted(PlayerEvent.ItemCraftedEvent e){
		if(e.crafting.getItem().equals(ItemClass.KroostylPickaxe)){
			e.player.addStat(MainClass.achievementKroostylPick, 1);
		}
	}

}
