
package net.mcreator.moreoresandarmour.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.SlabType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.moreoresandarmour.itemgroup.UltimateUtlityDecorItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.List;
import java.util.Collections;

@MoreOresAndArmourModElements.ModElement.Tag
public class BluestoneBricksSlabBlock extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:bluestone_bricks_slab")
	public static final Block block = null;
	public BluestoneBricksSlabBlock(MoreOresAndArmourModElements instance) {
		super(instance, 142);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(UltimateUtlityDecorItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 6f).lightValue(0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("bluestone_bricks_slab");
		}

		@OnlyIn(Dist.CLIENT)
		public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
			return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
