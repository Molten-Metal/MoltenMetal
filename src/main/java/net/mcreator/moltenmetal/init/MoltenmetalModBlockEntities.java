
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moltenmetal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.moltenmetal.block.entity.SwordBlockUnsmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.SwordBlockSmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotShovelUnsmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotShovelSmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotPlateUnsmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotPlateSmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotPickUnsmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotPickSmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotAxeUnsmithedBlockEntity;
import net.mcreator.moltenmetal.block.entity.HotAxeSmithedBlockEntity;
import net.mcreator.moltenmetal.MoltenmetalMod;

public class MoltenmetalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoltenmetalMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SWORD_BLOCK_UNSMITHED = register("sword_block_unsmithed", MoltenmetalModBlocks.SWORD_BLOCK_UNSMITHED, SwordBlockUnsmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SWORD_BLOCK_SMITHED = register("sword_block_smithed", MoltenmetalModBlocks.SWORD_BLOCK_SMITHED, SwordBlockSmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_PICK_UNSMITHED = register("hot_pick_unsmithed", MoltenmetalModBlocks.HOT_PICK_UNSMITHED, HotPickUnsmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_PICK_SMITHED = register("hot_pick_smithed", MoltenmetalModBlocks.HOT_PICK_SMITHED, HotPickSmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_AXE_UNSMITHED = register("hot_axe_unsmithed", MoltenmetalModBlocks.HOT_AXE_UNSMITHED, HotAxeUnsmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_AXE_SMITHED = register("hot_axe_smithed", MoltenmetalModBlocks.HOT_AXE_SMITHED, HotAxeSmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_SHOVEL_UNSMITHED = register("hot_shovel_unsmithed", MoltenmetalModBlocks.HOT_SHOVEL_UNSMITHED, HotShovelUnsmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_SHOVEL_SMITHED = register("hot_shovel_smithed", MoltenmetalModBlocks.HOT_SHOVEL_SMITHED, HotShovelSmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_PLATE_UNSMITHED = register("hot_plate_unsmithed", MoltenmetalModBlocks.HOT_PLATE_UNSMITHED, HotPlateUnsmithedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HOT_PLATE_SMITHED = register("hot_plate_smithed", MoltenmetalModBlocks.HOT_PLATE_SMITHED, HotPlateSmithedBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
