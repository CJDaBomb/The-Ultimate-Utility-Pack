
package net.mcreator.moreoresandarmour.block;

import net.minecraft.block.material.Material;

@MoreOresAndArmourModElements.ModElement.Tag
public class GrapeTrapdoorBlock extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:grape_trapdoor")
	public static final Block block = null;

	public GrapeTrapdoorBlock(MoreOresAndArmourModElements instance) {
		super(instance, 273);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CustomOreModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}

	public static class CustomBlock extends TrapDoorBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(1)
							.harvestTool(ToolType.AXE).notSolid());

			setRegistryName("grape_trapdoor");
		}

		@Override
		public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return false;
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
