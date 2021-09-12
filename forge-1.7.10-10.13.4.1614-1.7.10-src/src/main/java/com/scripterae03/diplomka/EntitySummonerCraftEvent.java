package com.scripterae03.diplomka;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EntitySummonerCraftEvent {
	@SubscribeEvent
	public void obsibenchCrafted(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.getItem().equals(BaseDiplomka.entity_summoner)) {
			e.player.addStat(BaseDiplomka.ach2, 1);
		}
	}
}
