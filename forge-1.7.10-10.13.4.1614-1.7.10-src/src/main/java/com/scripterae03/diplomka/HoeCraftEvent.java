package com.scripterae03.diplomka;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class HoeCraftEvent {
	@SubscribeEvent
	public void obsibenchCrafted(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.getItem().equals(BaseDiplomka.obsidian_forged_diamond_hoe)) {
			e.player.addStat(BaseDiplomka.ach3, 1);
		}
	}
}
