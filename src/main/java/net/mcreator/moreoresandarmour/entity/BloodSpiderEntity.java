
package net.mcreator.moreoresandarmour.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.procedures.BloodSpiderPlayerCollidesWithThisEntityProcedure;
import net.mcreator.moreoresandarmour.procedures.BloodSpiderDiesProcedure;
import net.mcreator.moreoresandarmour.itemgroup.CustomOreModItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MoreOresAndArmourModElements.ModElement.Tag
public class BloodSpiderEntity extends MoreOresAndArmourModElements.ModElement {
	public static EntityType entity = null;
	public BloodSpiderEntity(MoreOresAndArmourModElements instance) {
		super(instance, 27);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 0.3f)).build("blood_spider")
						.setRegistryName("blood_spider");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -63480, -16777216, new Item.Properties().group(CustomOreModItemGroup.tab))
				.setRegistryName("blood_spider"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("more_ores_and_armour:nightmare_woods")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(entity, 36, 1, 9));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
		DungeonHooks.addDungeonMob(entity, 180);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("more_ores_and_armour:textures/blood_spider2.png");
				}
			};
		});
	}
	public static class CustomEntity extends SpiderEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 9;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, true));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, true));
			this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, (float) 1));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
			this.goalSelector.addGoal(6, new RandomWalkingGoal(this, 1));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.ARTHROPOD;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.ambient"));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.step")), 0.15f,
					1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.death"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity sourceentity = source.getTrueSource();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("sourceentity", sourceentity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				BloodSpiderDiesProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onCollideWithPlayer(PlayerEntity sourceentity) {
			super.onCollideWithPlayer(sourceentity);
			Entity entity = this;
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("sourceentity", sourceentity);
				BloodSpiderPlayerCollidesWithThisEntityProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4);
		}
	}

	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer D1;
		private final ModelRenderer D2;
		private final ModelRenderer D3;
		private final ModelRenderer E1;
		private final ModelRenderer E2;
		private final ModelRenderer E3;
		private final ModelRenderer cabea;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		public Modelcustom_model() {
			textureWidth = 30;
			textureHeight = 30;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 10).addBox(-0.5F, -3.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(1.0F, -4.0F, 2.0F);
			bone.addChild(bone2);
			setRotationAngle(bone2, 0.3054F, 0.0F, 0.0F);
			bone2.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			D1 = new ModelRenderer(this);
			D1.setRotationPoint(-0.5F, 22.5F, -2.5F);
			setRotationAngle(D1, 0.0F, -0.5236F, -0.2618F);
			D1.setTextureOffset(16, 2).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			D2 = new ModelRenderer(this);
			D2.setRotationPoint(-0.5F, 22.5F, -1.5F);
			setRotationAngle(D2, 0.0F, 0.0F, -0.1745F);
			D2.setTextureOffset(16, 2).addBox(-5.5F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			D3 = new ModelRenderer(this);
			D3.setRotationPoint(-0.5F, 22.5F, -0.5F);
			setRotationAngle(D3, 0.0F, 0.3927F, -0.2618F);
			D3.setTextureOffset(16, 2).addBox(-4.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			E1 = new ModelRenderer(this);
			E1.setRotationPoint(1.5F, 22.5F, -0.5F);
			setRotationAngle(E1, 0.0F, -0.5236F, 0.2182F);
			E1.setTextureOffset(16, 2).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			E2 = new ModelRenderer(this);
			E2.setRotationPoint(1.5F, 22.5F, -1.5F);
			setRotationAngle(E2, 0.0F, 0.0F, 0.1745F);
			E2.setTextureOffset(16, 2).addBox(-0.5F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			E3 = new ModelRenderer(this);
			E3.setRotationPoint(1.5F, 22.5F, -2.5F);
			setRotationAngle(E3, 0.0F, 0.5236F, 0.1745F);
			E3.setTextureOffset(16, 2).addBox(-0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			cabea = new ModelRenderer(this);
			cabea.setRotationPoint(0.0F, 21.0F, -3.0F);
			cabea.setTextureOffset(0, 24).addBox(-1.0F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 3.0F, 3.0F);
			cabea.addChild(bone3);
			bone3.setTextureOffset(11, 15).addBox(-1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(2.0F, 3.0F, 3.0F);
			cabea.addChild(bone4);
			bone4.setTextureOffset(11, 15).addBox(-1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			D1.render(matrixStack, buffer, packedLight, packedOverlay);
			D2.render(matrixStack, buffer, packedLight, packedOverlay);
			D3.render(matrixStack, buffer, packedLight, packedOverlay);
			E1.render(matrixStack, buffer, packedLight, packedOverlay);
			E2.render(matrixStack, buffer, packedLight, packedOverlay);
			E3.render(matrixStack, buffer, packedLight, packedOverlay);
			cabea.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.cabea.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cabea.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.E1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.D1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.E2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.D2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.E3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.D3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
