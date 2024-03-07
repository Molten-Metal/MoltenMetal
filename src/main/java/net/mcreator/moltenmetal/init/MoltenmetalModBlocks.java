
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moltenmetal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moltenmetal.block.SwordBlockUnsmithedBlock;
import net.mcreator.moltenmetal.block.SwordBlockSmithedBlock;
import net.mcreator.moltenmetal.block.HotShovelUnsmithedBlock;
import net.mcreator.moltenmetal.block.HotShovelSmithedBlock;
import net.mcreator.moltenmetal.block.HotPlateUnsmithedBlock;
import net.mcreator.moltenmetal.block.HotPlateSmithedBlock;
import net.mcreator.moltenmetal.block.HotPickUnsmithedBlock;
import net.mcreator.moltenmetal.block.HotPickSmithedBlock;
import net.mcreator.moltenmetal.block.HotAxeUnsmithedBlock;
import net.mcreator.moltenmetal.block.HotAxeSmithedBlock;
import net.mcreator.moltenmetal.MoltenmetalMod;

public class MoltenmetalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoltenmetalMod.MODID);
	public static final RegistryObject<Block> SWORD_BLOCK_UNSMITHED = REGISTRY.register("sword_block_unsmithed", () -> new SwordBlockUnsmithedBlock());
	public static final RegistryObject<Block> SWORD_BLOCK_SMITHED = REGISTRY.register("sword_block_smithed", () -> new SwordBlockSmithedBlock());
	public static final RegistryObject<Block> HOT_PICK_UNSMITHED = REGISTRY.register("hot_pick_unsmithed", () -> new HotPickUnsmithedBlock());
	public static final RegistryObject<Block> HOT_PICK_SMITHED = REGISTRY.register("hot_pick_smithed", () -> new HotPickSmithedBlock());
	public static final RegistryObject<Block> HOT_AXE_UNSMITHED = REGISTRY.register("hot_axe_unsmithed", () -> new HotAxeUnsmithedBlock());
	public static final RegistryObject<Block> HOT_AXE_SMITHED = REGISTRY.register("hot_axe_smithed", () -> new HotAxeSmithedBlock());
	public static final RegistryObject<Block> HOT_SHOVEL_UNSMITHED = REGISTRY.register("hot_shovel_unsmithed", () -> new HotShovelUnsmithedBlock());
	public static final RegistryObject<Block> HOT_SHOVEL_SMITHED = REGISTRY.register("hot_shovel_smithed", () -> new HotShovelSmithedBlock());
	public static final RegistryObject<Block> HOT_PLATE_UNSMITHED = REGISTRY.register("hot_plate_unsmithed", () -> new HotPlateUnsmithedBlock());
	public static final RegistryObject<Block> HOT_PLATE_SMITHED = REGISTRY.register("hot_plate_smithed", () -> new HotPlateSmithedBlock());
}
