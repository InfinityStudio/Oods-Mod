package oodmod.achievements;

import net.minecraft.item.ItemStack;
import oodmod.item.ItemClass;
import oodmod.main.MainClass;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class KroostylMineEventClass {
	
	@SubscribeEvent
	public void whenKroostylMined(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemClass.Kroostyl))){
			e.player.addStat(MainClass.achievementKroostyl, 1);
		}
	}

}
