
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
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
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

import net.mcreator.moreoresandarmour.procedures.ChargedWitherSkeletonEntityDiesProcedure;
import net.mcreator.moreoresandarmour.itemgroup.CustomOreModItemGroup;
import net.mcreator.moreoresandarmour.item.RubySwordItem;
import net.mcreator.moreoresandarmour.item.RubyArmourItem;
import net.mcreator.moreoresandarmour.item.AlexandriteSwordItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChargedWitherSkeletonEntity extends MoreOresAndArmourModElements.ModElement {
	public static EntityType entity = null;
	public ChargedWitherSkeletonEntity(MoreOresAndArmourModElements instance) {
		super(instance, 27);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire().size(0.6f, 1.8f))
						.build("charged_wither_skeleton").setRegistryName("charged_wither_skeleton");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -13874064, new Item.Properties().group(CustomOreModItemGroup.tab))
				.setRegistryName("charged_wither_skeleton"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			boolean biomeCriteria = false;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("more_ores_and_armour:nightmare_woods")))
				biomeCriteria = true;
			if (ForgeRegistries.BIOMES.getKey(biome).equals(new ResourceLocation("more_ores_and_armour:blue_stone_biome")))
				biomeCriteria = true;
			if (!biomeCriteria)
				continue;
			biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(entity, 20, 4, 4));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
		DungeonHooks.addDungeonMob(entity, 180);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelskeletonwither(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("more_ores_and_armour:textures/wither_skeletonbuffed.png");
				}
			};
		});
	}
	public static class CustomEntity extends SkeletonEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(RubySwordItem.block, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(AlexandriteSwordItem.block, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(RubyArmourItem.helmet, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(RubyArmourItem.body, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(RubyArmourItem.legs, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(RubyArmourItem.boots, (int) (1)));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, LootCreeperEntity.CustomEntity.class, true, true));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, LootCreeperEntity.CustomEntity.class, true, true));
			this.goalSelector.addGoal(4, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(6, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEAD;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither_skeleton.ambient"));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither_skeleton.hurt")),
					0.15f, 1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither_skeleton.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither_skeleton.death"));
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
				ChargedWitherSkeletonEntityDiesProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.7);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(31);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}
	}

	// Made with Blockbench 3.6.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelskeletonwither extends EntityModel<Entity> {
		private final ModelRenderer waist;
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer capacete;
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightItem;
		private final ModelRenderer leftArm;
		private final ModelRenderer leftItem;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftLeg;
		public Modelskeletonwither() {
			textureWidth = 64;
			textureHeight = 64;
			waist = new ModelRenderer(this);
			waist.setRotationPoint(0.0F, 12.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -12.0F, 0.0F);
			waist.addChild(body);
			body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(head);
			head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			capacete = new ModelRenderer(this);
			capacete.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.addChild(capacete);
			capacete.setTextureOffset(0, 32).addBox(-5.0F, -32.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(11, 32).addBox(-4.0F, -31.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(14, 36).addBox(-1.0F, -28.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(11, 33).addBox(-4.0F, -31.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(42, 32).addBox(4.0F, -31.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(42, 32).addBox(-5.0F, -31.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(16, 44).addBox(4.0F, -34.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			capacete.setTextureOffset(12, 45).addBox(-6.0F, -34.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-4.0F, -11.5F, -3.0F);
			capacete.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.0F, 0.7854F);
			bone2.setTextureOffset(14, 44).addBox(-17.2635F, -17.7634F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(4.0F, -11.5F, -3.0F);
			capacete.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
			bone.setTextureOffset(14, 45).addBox(15.2635F, -17.7634F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			body.addChild(rightArm);
			rightArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			rightArm.setTextureOffset(2, 50).addBox(-0.5F, 7.5F, -13.0F, 1.0F, 3.0F, 11.0F, 0.0F, false);
			rightArm.setTextureOffset(11, 54).addBox(-0.5F, 8.5F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightArm.setTextureOffset(28, 59).addBox(-0.5F, 8.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			rightItem = new ModelRenderer(this);
			rightItem.setRotationPoint(0.0F, 7.0F, 1.0F);
			rightArm.addChild(rightItem);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			body.addChild(leftArm);
			leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			leftItem = new ModelRenderer(this);
			leftItem.setRotationPoint(1.0F, 7.0F, 1.0F);
			leftArm.addChild(leftItem);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			body.addChild(rightLeg);
			rightLeg.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			body.addChild(leftLeg);
			leftLeg.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			waist.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftArm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
