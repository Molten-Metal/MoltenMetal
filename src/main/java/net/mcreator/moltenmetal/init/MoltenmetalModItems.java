
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moltenmetal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moltenmetal.item.SwordBladeMouldItem;
import net.mcreator.moltenmetal.item.SmithingHammerItem;
import net.mcreator.moltenmetal.item.ShovelBladeMouldItem;
import net.mcreator.moltenmetal.item.PlateMouldItem;
import net.mcreator.moltenmetal.item.PickHeadMouldItem;
import net.mcreator.moltenmetal.item.MoltenIronItem;
import net.mcreator.moltenmetal.item.MoltenGoldItem;
import net.mcreator.moltenmetal.item.MoltenDiamondItem;
import net.mcreator.moltenmetal.item.IronSwordBladeItem;
import net.mcreator.moltenmetal.item.IronShovelBladeItem;
import net.mcreator.moltenmetal.item.IronPlateItem;
import net.mcreator.moltenmetal.item.IronPickItem;
import net.mcreator.moltenmetal.item.IronHandGuardItem;
import net.mcreator.moltenmetal.item.IronAxeBladeItem;
import net.mcreator.moltenmetal.item.HotIronSwordBladeItem;
import net.mcreator.moltenmetal.item.HotIronShovelBladeItem;
import net.mcreator.moltenmetal.item.HotIronPlateItem;
import net.mcreator.moltenmetal.item.HotIronPickHeadItem;
import net.mcreator.moltenmetal.item.HotIronHandGuardItem;
import net.mcreator.moltenmetal.item.HotIronAxeBladeItem;
import net.mcreator.moltenmetal.item.HotGoldenSwordBladeItem;
import net.mcreator.moltenmetal.item.HotGoldenShovelBladeItem;
import net.mcreator.moltenmetal.item.HotGoldenPlateItem;
import net.mcreator.moltenmetal.item.HotGoldenPickHeadItem;
import net.mcreator.moltenmetal.item.HotGoldenHandGuardItem;
import net.mcreator.moltenmetal.item.HotGoldenAxeBladeItem;
import net.mcreator.moltenmetal.item.HotDiamondSwordBladeItem;
import net.mcreator.moltenmetal.item.HotDiamondShovelBladeItem;
import net.mcreator.moltenmetal.item.HotDiamondPlateItem;
import net.mcreator.moltenmetal.item.HotDiamondPickHeadItem;
import net.mcreator.moltenmetal.item.HotDiamondHandGuardItem;
import net.mcreator.moltenmetal.item.HotDiamondAxeBladeItem;
import net.mcreator.moltenmetal.item.HeavyNetheriteArmorItem;
import net.mcreator.moltenmetal.item.HeavyIronArmorItem;
import net.mcreator.moltenmetal.item.HeavyGoldenArmorItem;
import net.mcreator.moltenmetal.item.HeavyDiamondArmorItem;
import net.mcreator.moltenmetal.item.HandguardMouldItem;
import net.mcreator.moltenmetal.item.GoldenSwordBladeItem;
import net.mcreator.moltenmetal.item.GoldenShovelBladeItem;
import net.mcreator.moltenmetal.item.GoldenPlateItem;
import net.mcreator.moltenmetal.item.GoldenPickItem;
import net.mcreator.moltenmetal.item.GoldenHandGuardItem;
import net.mcreator.moltenmetal.item.GoldenAxeBladeItem;
import net.mcreator.moltenmetal.item.DiamondSwordBladeItem;
import net.mcreator.moltenmetal.item.DiamondShovelBladeItem;
import net.mcreator.moltenmetal.item.DiamondPlateItem;
import net.mcreator.moltenmetal.item.DiamondPickItem;
import net.mcreator.moltenmetal.item.DiamondHandGuardItem;
import net.mcreator.moltenmetal.item.DiamondAxeBladeItem;
import net.mcreator.moltenmetal.item.AxeBladeMouldItem;
import net.mcreator.moltenmetal.MoltenmetalMod;

public class MoltenmetalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoltenmetalMod.MODID);
	public static final RegistryObject<Item> IRON_SWORD_BLADE = REGISTRY.register("iron_sword_blade", () -> new IronSwordBladeItem());
	public static final RegistryObject<Item> GOLDEN_SWORD_BLADE = REGISTRY.register("golden_sword_blade", () -> new GoldenSwordBladeItem());
	public static final RegistryObject<Item> DIAMOND_SWORD_BLADE = REGISTRY.register("diamond_sword_blade", () -> new DiamondSwordBladeItem());
	public static final RegistryObject<Item> IRON_HAND_GUARD = REGISTRY.register("iron_hand_guard", () -> new IronHandGuardItem());
	public static final RegistryObject<Item> GOLDEN_HAND_GUARD = REGISTRY.register("golden_hand_guard", () -> new GoldenHandGuardItem());
	public static final RegistryObject<Item> DIAMOND_HAND_GUARD = REGISTRY.register("diamond_hand_guard", () -> new DiamondHandGuardItem());
	public static final RegistryObject<Item> IRON_AXE_BLADE = REGISTRY.register("iron_axe_blade", () -> new IronAxeBladeItem());
	public static final RegistryObject<Item> GOLDEN_AXE_BLADE = REGISTRY.register("golden_axe_blade", () -> new GoldenAxeBladeItem());
	public static final RegistryObject<Item> DIAMOND_AXE_BLADE = REGISTRY.register("diamond_axe_blade", () -> new DiamondAxeBladeItem());
	public static final RegistryObject<Item> IRON_SHOVEL_BLADE = REGISTRY.register("iron_shovel_blade", () -> new IronShovelBladeItem());
	public static final RegistryObject<Item> GOLDEN_SHOVEL_BLADE = REGISTRY.register("golden_shovel_blade", () -> new GoldenShovelBladeItem());
	public static final RegistryObject<Item> DIAMOND_SHOVEL_BLADE = REGISTRY.register("diamond_shovel_blade", () -> new DiamondShovelBladeItem());
	public static final RegistryObject<Item> IRON_PICK = REGISTRY.register("iron_pick", () -> new IronPickItem());
	public static final RegistryObject<Item> GOLDEN_PICK = REGISTRY.register("golden_pick", () -> new GoldenPickItem());
	public static final RegistryObject<Item> DIAMOND_PICK = REGISTRY.register("diamond_pick", () -> new DiamondPickItem());
	public static final RegistryObject<Item> IRON_PLATE = REGISTRY.register("iron_plate", () -> new IronPlateItem());
	public static final RegistryObject<Item> GOLDEN_PLATE = REGISTRY.register("golden_plate", () -> new GoldenPlateItem());
	public static final RegistryObject<Item> DIAMOND_PLATE = REGISTRY.register("diamond_plate", () -> new DiamondPlateItem());
	public static final RegistryObject<Item> SWORD_BLADE_MOULD = REGISTRY.register("sword_blade_mould", () -> new SwordBladeMouldItem());
	public static final RegistryObject<Item> HANDGUARD_MOULD = REGISTRY.register("handguard_mould", () -> new HandguardMouldItem());
	public static final RegistryObject<Item> AXE_BLADE_MOULD = REGISTRY.register("axe_blade_mould", () -> new AxeBladeMouldItem());
	public static final RegistryObject<Item> SHOVEL_BLADE_MOULD = REGISTRY.register("shovel_blade_mould", () -> new ShovelBladeMouldItem());
	public static final RegistryObject<Item> PICK_HEAD_MOULD = REGISTRY.register("pick_head_mould", () -> new PickHeadMouldItem());
	public static final RegistryObject<Item> PLATE_MOULD = REGISTRY.register("plate_mould", () -> new PlateMouldItem());
	public static final RegistryObject<Item> SMITHING_HAMMER = REGISTRY.register("smithing_hammer", () -> new SmithingHammerItem());
	public static final RegistryObject<Item> HEAVY_IRON_ARMOR_HELMET = REGISTRY.register("heavy_iron_armor_helmet", () -> new HeavyIronArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVY_IRON_ARMOR_CHESTPLATE = REGISTRY.register("heavy_iron_armor_chestplate", () -> new HeavyIronArmorItem.Chestplate());
	public static final RegistryObject<Item> HEAVY_GOLDEN_ARMOR_HELMET = REGISTRY.register("heavy_golden_armor_helmet", () -> new HeavyGoldenArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVY_GOLDEN_ARMOR_CHESTPLATE = REGISTRY.register("heavy_golden_armor_chestplate", () -> new HeavyGoldenArmorItem.Chestplate());
	public static final RegistryObject<Item> HEAVY_DIAMOND_ARMOR_HELMET = REGISTRY.register("heavy_diamond_armor_helmet", () -> new HeavyDiamondArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVY_DIAMOND_ARMOR_CHESTPLATE = REGISTRY.register("heavy_diamond_armor_chestplate", () -> new HeavyDiamondArmorItem.Chestplate());
	public static final RegistryObject<Item> HEAVY_NETHERITE_ARMOR_HELMET = REGISTRY.register("heavy_netherite_armor_helmet", () -> new HeavyNetheriteArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVY_NETHERITE_ARMOR_CHESTPLATE = REGISTRY.register("heavy_netherite_armor_chestplate", () -> new HeavyNetheriteArmorItem.Chestplate());
	public static final RegistryObject<Item> HOT_IRON_SWORD_BLADE = REGISTRY.register("hot_iron_sword_blade", () -> new HotIronSwordBladeItem());
	public static final RegistryObject<Item> HOT_GOLDEN_SWORD_BLADE = REGISTRY.register("hot_golden_sword_blade", () -> new HotGoldenSwordBladeItem());
	public static final RegistryObject<Item> HOT_DIAMOND_SWORD_BLADE = REGISTRY.register("hot_diamond_sword_blade", () -> new HotDiamondSwordBladeItem());
	public static final RegistryObject<Item> SWORD_BLOCK_UNSMITHED = block(MoltenmetalModBlocks.SWORD_BLOCK_UNSMITHED);
	public static final RegistryObject<Item> SWORD_BLOCK_SMITHED = block(MoltenmetalModBlocks.SWORD_BLOCK_SMITHED);
	public static final RegistryObject<Item> HOT_IRON_HAND_GUARD = REGISTRY.register("hot_iron_hand_guard", () -> new HotIronHandGuardItem());
	public static final RegistryObject<Item> HOT_GOLDEN_HAND_GUARD = REGISTRY.register("hot_golden_hand_guard", () -> new HotGoldenHandGuardItem());
	public static final RegistryObject<Item> HOT_DIAMOND_HAND_GUARD = REGISTRY.register("hot_diamond_hand_guard", () -> new HotDiamondHandGuardItem());
	public static final RegistryObject<Item> HOT_IRON_PICK_HEAD = REGISTRY.register("hot_iron_pick_head", () -> new HotIronPickHeadItem());
	public static final RegistryObject<Item> HOT_GOLDEN_PICK_HEAD = REGISTRY.register("hot_golden_pick_head", () -> new HotGoldenPickHeadItem());
	public static final RegistryObject<Item> HOT_DIAMOND_PICK_HEAD = REGISTRY.register("hot_diamond_pick_head", () -> new HotDiamondPickHeadItem());
	public static final RegistryObject<Item> HOT_PICK_UNSMITHED = block(MoltenmetalModBlocks.HOT_PICK_UNSMITHED);
	public static final RegistryObject<Item> HOT_PICK_SMITHED = block(MoltenmetalModBlocks.HOT_PICK_SMITHED);
	public static final RegistryObject<Item> HOT_IRON_AXE_BLADE = REGISTRY.register("hot_iron_axe_blade", () -> new HotIronAxeBladeItem());
	public static final RegistryObject<Item> HOT_GOLDEN_AXE_BLADE = REGISTRY.register("hot_golden_axe_blade", () -> new HotGoldenAxeBladeItem());
	public static final RegistryObject<Item> HOT_DIAMOND_AXE_BLADE = REGISTRY.register("hot_diamond_axe_blade", () -> new HotDiamondAxeBladeItem());
	public static final RegistryObject<Item> HOT_AXE_UNSMITHED = block(MoltenmetalModBlocks.HOT_AXE_UNSMITHED);
	public static final RegistryObject<Item> HOT_AXE_SMITHED = block(MoltenmetalModBlocks.HOT_AXE_SMITHED);
	public static final RegistryObject<Item> HOT_IRON_SHOVEL_BLADE = REGISTRY.register("hot_iron_shovel_blade", () -> new HotIronShovelBladeItem());
	public static final RegistryObject<Item> HOT_GOLDEN_SHOVEL_BLADE = REGISTRY.register("hot_golden_shovel_blade", () -> new HotGoldenShovelBladeItem());
	public static final RegistryObject<Item> HOT_DIAMOND_SHOVEL_BLADE = REGISTRY.register("hot_diamond_shovel_blade", () -> new HotDiamondShovelBladeItem());
	public static final RegistryObject<Item> HOT_SHOVEL_UNSMITHED = block(MoltenmetalModBlocks.HOT_SHOVEL_UNSMITHED);
	public static final RegistryObject<Item> HOT_SHOVEL_SMITHED = block(MoltenmetalModBlocks.HOT_SHOVEL_SMITHED);
	public static final RegistryObject<Item> HOT_IRON_PLATE = REGISTRY.register("hot_iron_plate", () -> new HotIronPlateItem());
	public static final RegistryObject<Item> HOT_GOLDEN_PLATE = REGISTRY.register("hot_golden_plate", () -> new HotGoldenPlateItem());
	public static final RegistryObject<Item> HOT_DIAMOND_PLATE = REGISTRY.register("hot_diamond_plate", () -> new HotDiamondPlateItem());
	public static final RegistryObject<Item> HOT_PLATE_UNSMITHED = block(MoltenmetalModBlocks.HOT_PLATE_UNSMITHED);
	public static final RegistryObject<Item> HOT_PLATE_SMITHED = block(MoltenmetalModBlocks.HOT_PLATE_SMITHED);
	public static final RegistryObject<Item> MOLTEN_IRON = REGISTRY.register("molten_iron", () -> new MoltenIronItem());
	public static final RegistryObject<Item> MOLTEN_GOLD = REGISTRY.register("molten_gold", () -> new MoltenGoldItem());
	public static final RegistryObject<Item> MOLTEN_DIAMOND = REGISTRY.register("molten_diamond", () -> new MoltenDiamondItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
