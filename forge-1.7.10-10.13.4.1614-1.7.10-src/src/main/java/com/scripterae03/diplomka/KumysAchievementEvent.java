package com.scripterae03.diplomka;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class KumysAchievementEvent {
	@SubscribeEvent
	public void getKumys(PlayerEvent.ItemPickupEvent e) {
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(BaseDiplomka.kumysbucket, 1))) {
			e.player.addStat(BaseDiplomka.ach1, 1);
		}
	}
}
