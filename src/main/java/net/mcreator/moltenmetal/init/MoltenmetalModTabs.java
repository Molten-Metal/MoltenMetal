
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moltenmetal.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.moltenmetal.MoltenmetalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoltenmetalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoltenmetalMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MoltenmetalModItems.HEAVY_IRON_ARMOR_HELMET.get());
			tabData.accept(MoltenmetalModItems.HEAVY_IRON_ARMOR_CHESTPLATE.get());
			tabData.accept(MoltenmetalModItems.HEAVY_GOLDEN_ARMOR_HELMET.get());
			tabData.accept(MoltenmetalModItems.HEAVY_GOLDEN_ARMOR_CHESTPLATE.get());
			tabData.accept(MoltenmetalModItems.HEAVY_DIAMOND_ARMOR_HELMET.get());
			tabData.accept(MoltenmetalModItems.HEAVY_DIAMOND_ARMOR_CHESTPLATE.get());
			tabData.accept(MoltenmetalModItems.HEAVY_NETHERITE_ARMOR_HELMET.get());
			tabData.accept(MoltenmetalModItems.HEAVY_NETHERITE_ARMOR_CHESTPLATE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MoltenmetalModItems.IRON_SWORD_BLADE.get());
			tabData.accept(MoltenmetalModItems.GOLDEN_SWORD_BLADE.get());
			tabData.accept(MoltenmetalModItems.DIAMOND_SWORD_BLADE.get());
			tabData.accept(MoltenmetalModItems.IRON_HAND_GUARD.get());
			tabData.accept(MoltenmetalModItems.GOLDEN_HAND_GUARD.get());
			tabData.accept(MoltenmetalModItems.DIAMOND_HAND_GUARD.get());
			tabData.accept(MoltenmetalModItems.IRON_AXE_BLADE.get());
			tabData.accept(MoltenmetalModItems.GOLDEN_AXE_BLADE.get());
			tabData.accept(MoltenmetalModItems.DIAMOND_AXE_BLADE.get());
			tabData.accept(MoltenmetalModItems.IRON_SHOVEL_BLADE.get());
			tabData.accept(MoltenmetalModItems.GOLDEN_SHOVEL_BLADE.get());
			tabData.accept(MoltenmetalModItems.DIAMOND_SHOVEL_BLADE.get());
			tabData.accept(MoltenmetalModItems.IRON_PICK.get());
			tabData.accept(MoltenmetalModItems.GOLDEN_PICK.get());
			tabData.accept(MoltenmetalModItems.DIAMOND_PICK.get());
			tabData.accept(MoltenmetalModItems.IRON_PLATE.get());
			tabData.accept(MoltenmetalModItems.GOLDEN_PLATE.get());
			tabData.accept(MoltenmetalModItems.DIAMOND_PLATE.get());
			tabData.accept(MoltenmetalModItems.SWORD_BLADE_MOULD.get());
			tabData.accept(MoltenmetalModItems.HANDGUARD_MOULD.get());
			tabData.accept(MoltenmetalModItems.AXE_BLADE_MOULD.get());
			tabData.accept(MoltenmetalModItems.SHOVEL_BLADE_MOULD.get());
			tabData.accept(MoltenmetalModItems.PICK_HEAD_MOULD.get());
			tabData.accept(MoltenmetalModItems.PLATE_MOULD.get());
			tabData.accept(MoltenmetalModItems.MOLTEN_IRON.get());
			tabData.accept(MoltenmetalModItems.MOLTEN_GOLD.get());
			tabData.accept(MoltenmetalModItems.MOLTEN_DIAMOND.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MoltenmetalModItems.SMITHING_HAMMER.get());
		}
	}
}
