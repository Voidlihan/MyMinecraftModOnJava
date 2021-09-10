package com.scripterae03.diplomka;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBossEntity extends RenderBiped {
	private static final ResourceLocation textureLocation = new ResourceLocation("diplomka:textures/models/entity/steve.png");
	public RenderBossEntity(ModelBiped p_i1257_1_, float p_i1257_2_) {
		super(p_i1257_1_, p_i1257_2_);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
	  return textureLocation;
	}

}
