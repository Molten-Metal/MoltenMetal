
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moltenmetal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.moltenmetal.client.model.Modelheavyarmor;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MoltenmetalModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelheavyarmor.LAYER_LOCATION, Modelheavyarmor::createBodyLayer);
	}
}
