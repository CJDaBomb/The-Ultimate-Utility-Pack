
package net.mcreator.moreoresandarmour.block;

import net.minecraft.block.material.Material;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowRockBrickSlabBlock extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:shadow_rock_brick_slab")
	public static final Block block = null;

	public ShadowRockBrickSlabBlock(MoreOresAndArmourModElements instance) {
		super(instance, 225);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CustomOreModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f, 6f).lightValue(0).harvestLevel(1)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("shadow_rock_brick_slab");
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
