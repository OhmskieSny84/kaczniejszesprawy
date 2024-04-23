package net.mcreator.kaczka.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.kaczka.entity.PreludeManEntity;

public class PreludeManModel extends GeoModel<PreludeManEntity> {
	@Override
	public ResourceLocation getAnimationResource(PreludeManEntity entity) {
		return new ResourceLocation("kaczka", "animations/prelude_man.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PreludeManEntity entity) {
		return new ResourceLocation("kaczka", "geo/prelude_man.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PreludeManEntity entity) {
		return new ResourceLocation("kaczka", "textures/entities/" + entity.getTexture() + ".png");
	}

}
