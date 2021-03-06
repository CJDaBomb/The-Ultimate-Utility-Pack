
package net.mcreator.moreoresandarmour.world.biome;

import net.minecraft.block.material.Material;

@MoreOresAndArmourModElements.ModElement.Tag
public class EvokedDesertBiome extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:evoked_desert")
	public static final CustomBiome biome = null;

	public EvokedDesertBiome(MoreOresAndArmourModElements instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 1));
	}

	static class CustomBiome extends Biome {

		public CustomBiome() {
			super(new Biome.Builder().downfall(0.5f).depth(0.1f).scale(0.2f).temperature(0.5f).precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.DESERT).waterColor(-14329397).waterFogColor(-14329397)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(EvokerSandBlock.block.getDefaultState(),
							DarkStoneBlock.block.getDefaultState(), DarkStoneBlock.block.getDefaultState())));

			setRegistryName("evoked_desert");

			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);

			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.ZOMBIE, 15, 1, 15));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(ChargedWitherSkeletonEntity.entity, 15, 1, 15));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.ZOMBIE, 15, 1, 15));
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(double posX, double posZ) {
			return -13261999;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor() {
			return -13261999;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -5916161;
		}

	}

}
