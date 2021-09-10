package com.scripterae03.diplomka;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(BossEntity.class, new RenderBossEntity(new ModelBiped(), 0.5F));
	}
	public void init() {
	}
}
