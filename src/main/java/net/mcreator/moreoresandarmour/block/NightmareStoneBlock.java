
package net.mcreator.moreoresandarmour.block;

import net.minecraft.block.material.Material;

@MoreOresAndArmourModElements.ModElement.Tag
public class NightmareStoneBlock extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:nightmare_stone")
	public static final Block block = null;

	public NightmareStoneBlock(MoreOresAndArmourModElements instance) {
		super(instance, 120);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(UltimateUtilityBuildingBlocksItemGroup.tab))
				.setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0).harvestLevel(1)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("nightmare_stone");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;

					if (dimensionType == BedrockZoneDimension.type)
						dimensionCriteria = true;

					if (!dimensionCriteria)
						return false;

					return super.place(world, generator, rand, pos, config);
				}
			}.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("nightmare_stone", "nightmare_stone", blockAt -> {
				boolean blockCriteria = false;
				if (blockAt.getBlock() == BlueStoneBlock.block.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}), block.getDefaultState(), 16)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 64))));
		}
	}

}
