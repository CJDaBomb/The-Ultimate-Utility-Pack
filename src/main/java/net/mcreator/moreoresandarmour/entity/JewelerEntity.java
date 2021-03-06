
package net.mcreator.moreoresandarmour.entity;

import net.minecraft.block.material.Material;

@MoreOresAndArmourModElements.ModElement.Tag
public class JewelerEntity extends MoreOresAndArmourModElements.ModElement {

	public static EntityType entity = null;

	public JewelerEntity(MoreOresAndArmourModElements instance) {
		super(instance, 165);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 1f)).build("jeweler")
						.setRegistryName("jeweler");

		elements.entities.add(() -> entity);

		elements.items.add(
				() -> new SpawnEggItem(entity, -15089, -14869219, new Item.Properties().group(CustomOreModItemGroup.tab)).setRegistryName("jeweler"));

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

			biome.getSpawns(EntityClassification.CREATURE).add(new Biome.SpawnListEntry(entity, 20, 4, 4));
		}

		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.down()).getMaterial() == Material.ORGANIC && world.getLightSubtracted(pos, 0) > 8));

	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelOldMan(), 0.5f) {

				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("more_ores_and_armour:textures/oldman.png");
				}
			};
		});

	}

	public static class CustomEntity extends CreatureEntity {

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 2;
			setNoAI(false);

			enablePersistence();

		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();

			this.goalSelector.addGoal(1, new PanicGoal(this, 1));
			this.goalSelector.addGoal(2, new RestrictSunGoal(this));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.6));
			this.goalSelector.addGoal(4, new MoveTowardsVillageGoal(this, 0.5));
			this.goalSelector.addGoal(5, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(6, new OpenDoorGoal(this, false));
			this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(8, new AvoidEntityGoal(this, LootCreeperEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(9, new LookAtGoal(this, LootCreeperEntity.CustomEntity.class, (float) 8));
			this.goalSelector.addGoal(10, new LookAtGoal(this, ServerPlayerEntity.class, (float) 8));
			this.goalSelector.addGoal(11, new SwimGoal(this));

		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			boolean retval = true;

			super.processInteract(sourceentity, hand);

			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("sourceentity", sourceentity);
				$_dependencies.put("itemstack", itemstack);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);

				JewelerRightClickedOnEntity2Procedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public void baseTick() {
			super.baseTick();
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				JewelerOnEntityTickUpdateProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();

			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);

			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);

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

	public static class ModelOldMan extends EntityModel<Entity> {
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer Head;
		private final ModelRenderer bone6;
		private final ModelRenderer LeftArm;
		private final ModelRenderer bone5;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;

		public ModelOldMan() {
			textureWidth = 64;
			textureHeight = 64;

			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-3.0F, 15.0F, 0.0F);
			bone2.setTextureOffset(30, 13).addBox(-1.0F, -3.0F, -1.0F, 7.0F, 5.0F, 3.0F, 0.0F, false);

			bone = new ModelRenderer(this);
			bone.setRotationPoint(3.0F, -4.5F, -1.5F);
			bone2.addChild(bone);
			setRotationAngle(bone, 0.7854F, 0.0F, 0.0F);
			bone.setTextureOffset(0, 13).addBox(-5.0F, -0.5F, -2.5F, 9.0F, 4.0F, 4.0F, 0.0F, false);

			Head = new ModelRenderer(this);
			Head.setRotationPoint(3.0F, -5.0F, -1.0F);
			bone2.addChild(Head);
			Head.setTextureOffset(13, 23).addBox(-3.5F, -3.0F, -6.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(41, 22).addBox(-1.5F, 0.0F, -8.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(-3.0F, -3.0F, 1.0F);
			Head.addChild(bone6);
			bone6.setTextureOffset(23, 0).addBox(-2.0F, -1.0F, -9.0F, 9.0F, 1.0F, 10.0F, 0.0F, false);
			bone6.setTextureOffset(0, 0).addBox(0.0F, -7.0F, -7.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);

			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(8.5F, -1.5F, -3.5F);
			bone2.addChild(LeftArm);
			setRotationAngle(LeftArm, -0.829F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(0, 22).addBox(-1.5F, -4.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 6.8525F, 2.8352F);
			LeftArm.addChild(bone5);
			setRotationAngle(bone5, 0.829F, 0.0F, 0.0F);
			bone5.setTextureOffset(29, 0).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-2.0F, -4.0F, -1.5F);
			bone2.addChild(RightArm);
			RightArm.setTextureOffset(0, 22).addBox(-3.0F, -1.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(0.0F, 2.0F, 0.5F);
			bone2.addChild(RightLeg);
			RightLeg.setTextureOffset(0, 22).addBox(-1.0F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(5.0F, 2.0F, 0.5F);
			bone2.addChild(LeftLeg);
			LeftLeg.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(2.0F, -2.4167F, -3.5F);
			bone2.addChild(bone3);
			bone3.setTextureOffset(16, 0).addBox(-1.0F, 1.4167F, -0.8F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(16, 4).addBox(2.0F, 0.4167F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(29, 7).addBox(3.0F, -1.5833F, -0.8F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(29, 7).addBox(-3.0F, -1.5833F, -0.8F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(16, 4).addBox(-2.0F, 0.4167F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);

			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-2.5F, -2.5833F, 1.0F);
			bone3.addChild(bone4);
			setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
			bone4.setTextureOffset(29, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(23, 11).addBox(-0.5F, -3.0F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(29, 0).addBox(5.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
