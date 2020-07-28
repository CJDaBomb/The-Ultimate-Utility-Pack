
package net.mcreator.moreoresandarmour.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.moreoresandarmour.itemgroup.CustomOreModItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.entity.ILivingEntityData;
import java.util.List;
import java.util.ArrayList;
import net.minecraft.command.ICommandSource;
import net.minecraft.world.IWorld;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.LivingEntity;
import java.util.Collections;

@MoreOresAndArmourModElements.ModElement.Tag
public class GoblinEntity extends MoreOresAndArmourModElements.ModElement {
	public static EntityType entity = null;
	public GoblinEntity(MoreOresAndArmourModElements instance) {
		super(instance, 157);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.95f)).build("goblin")
						.setRegistryName("goblin");
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -12553162, -10832837, new Item.Properties().group(CustomOreModItemGroup.tab))
				.setRegistryName("goblin"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			biome.getSpawns(EntityClassification.CREATURE).add(new Biome.SpawnListEntry(entity, 20, 4, 4));
		}
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				AnimalEntity::canAnimalSpawn);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new Modelgoblin(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("more_ores_and_armour:textures/goblin.png");
				}
			};
		});
	}
	public static class CustomEntity extends VillagerEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(3, new SwimGoal(this));
			this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(5, new OpenDoorGoal(this, false));
			this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, (float) 6));
		}
		@Override 
		public ILivingEntityData onInitialSpawn(IWorld world, DifficultyInstance difficulty, SpawnReason reason, ILivingEntityData livingdata,
                CompoundNBT tag) {
            ILivingEntityData retval = super.onInitialSpawn(world, difficulty, reason, livingdata, tag);
            int x = (int) this.getPosition().getX();
            int y = (int) this.getPosition().getY();
            int z = (int) this.getPosition().getZ();
            Entity entity = this;
            LivingEntity e = CustomEntity.this;
            int tradeCount = 0;
            String buy1a = "";
            int buy1ad = 0;
            int buy1ac = 0;
            String buy1b = "";
            int buy1bd = 0;
            int buy1bc = 0;
            String sell1 = "";
            int sell1c = 0;
            int sell1e = 0;
            String buy2a = "";
            int buy2ad = 0;
            int buy2ac = 0;
            String buy2b = "";
            int buy2bd = 0;
            int buy2bc = 0;
            String sell2 = "";
            int sell2c = 0;
            int sell2e = 0;
            String buy3a = "";
            int buy3ad = 0;
            int buy3ac = 0;
            String buy3b = "";
            int buy3bd = 0;
            int buy3bc = 0;
            String sell3 = "";
            int sell3c = 0;
            int sell3e = 0;
            String buy4a = "";
            int buy4ad = 0;
            int buy4ac = 0;
            String buy4b = "";
            int buy4bd = 0;
            int buy4bc = 0;
            String sell4 = "";
            int sell4c = 0;
            int sell4e = 0;
            String buy5a = "";
            int buy5ad = 0;
            int buy5ac = 0;
            String buy5b = "";
            int buy5bd = 0;
            int buy5bc = 0;
            String sell5 = "";
            int sell5c = 0;
            int sell5e = 0;
            String buy6a = "";
            int buy6ad = 0;
            int buy6ac = 0;
            String buy6b = "";
            int buy6bd = 0;
            int buy6bc = 0;
            String sell6 = "";
            int sell6c = 0;
            int sell6e = 0;
            String buy7a = "";
            int buy7ad = 0;
            int buy7ac = 0;
            String buy7b = "";
            int buy7bd = 0;
            int buy7bc = 0;
            String sell7 = "";
            int sell7c = 0;
            int sell7e = 0;
            String buy8a = "";
            int buy8ad = 0;
            int buy8ac = 0;
            String buy8b = "";
            int buy8bd = 0;
            int buy8bc = 0;
            String sell8 = "";
            int sell8c = 0;
            int sell8e = 0;
            String buy9a = "";
            int buy9ad = 0;
            int buy9ac = 0;
            String buy9b = "";
            int buy9bd = 0;
            int buy9bc = 0;
            String sell9 = "";
            int sell9c = 0;
            int sell9e = 0;
            String buy10a = "";
            int buy10ad = 0;
            int buy10ac = 0;
            String buy10b = "";
            int buy10bd = 0;
            int buy10bc = 0;
            String sell10 = "";
            int sell10c = 0;
            int sell10e = 0;
            String tradeA = "";
            int tradeAd = 0;
            int tradeAc = 0;
            String tradeB = "";
            int tradeBd = 0;
            int tradeBc = 0;
            String sell = "";
            int sellC = 0;
            String sellE = "";
            boolean used1 = false;
            boolean used2 = false;
            boolean used3 = false;
            boolean used4 = false;
            boolean used5 = false;
            boolean used6 = false;
            boolean used7 = false;
            boolean used8 = false;
            boolean used9 = false;
            boolean used10 = false;
            int chosenNum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                if (used1 == false)
                    list.add(1);
                if (used2 == false)
                    list.add(2);
                if (used3 == false)
                    list.add(3);
                if (used4 == false)
                    list.add(4);
                if (used5 == false)
                    list.add(5);
                if (used6 == false)
                    list.add(6);
                if (used7 == false)
                    list.add(7);
                if (used8 == false)
                    list.add(8);
                if (used9 == false)
                    list.add(9);
                if (used10 == false)
                    list.add(10);
                Collections.shuffle(list);
                if (list.get(0) == 1) {
                    tradeA = "minecraft:seeds";
                    tradeAc = 20;
                    tradeAd = 0;
                    tradeB = "minecraft:gold_ingot";
                    tradeBc = 7;
                    tradeBd = 0;
                    sell = "minecraft:bread";
                    sellC = (int) (Math.random() * 3 + 4);
                    used1 = true;
                } else if (list.get(0) == 2) {
                    tradeA = "minecraft:emerald";
                    tradeAc = 5;
                    tradeAd = 0;
                    tradeB = "minecraft:wheat";
                    tradeBc = 10;
                    tradeBd = 0;
                    sell = "minecraft:cake";
                    sellC = 1;
                    used2 = true;
                } else if (list.get(0) == 3) {
                    tradeA = "minecraft:wheat";
                    tradeAc = 6;
                    tradeAd = 0;
                    tradeB = "minecraft:air";
                    tradeBc = 1;
                    tradeBd = 0;
                    sell = "minecraft:emerald";
                    sellC = 5;
                    used3 = true;
                } else if (list.get(0) == 4) {
                    tradeA = "minecraft:emerald";
                    tradeAc = 6;
                    tradeAd = 0;
                    tradeB = "minecraft:air";
                    tradeBc = 1;
                    tradeBd = 0;
                    sell = "minecraft:diamond";
                    sellC = 5;
                    used4 = true;
                } else if (list.get(0) == 5) {
                    tradeA = "minecraft:emerald";
                    tradeAc = 6;
                    tradeAd = 0;
                    tradeB = "minecraft:air";
                    tradeBc = 1;
                    tradeBd = 0;
                    sell = "minecraft:golden_apple";
                    sellC = 5;
                    used5 = true;
                } else if (list.get(0) == 6) {
                    tradeA = "minecraft:emerald";
                    tradeAc = 6;
                    tradeAd = 0;
                    tradeB = "minecraft:air";
                    tradeBc = 1;
                    tradeBd = 0;
                    sell = "minecraft:elytra";
                    sellC = 5;
                    used6 = true;
                } else if (list.get(0) == 7) {
                    tradeA = "minecraft:emerald";
                    tradeAc = 6;
                    tradeAd = 0;
                    tradeB = "minecraft:air";
                    tradeBc = 1;
                    tradeBd = 0;
                    sell = "minecraft:dragon_egg";
                    sellC = 5;
                    used7 = true;
                } else if (list.get(0) == 8) {
                    tradeA = "minecraft:emerald";
                    tradeAc = 6;
                    tradeAd = 0;
                    tradeB = "minecraft:air";
                    tradeBc = 1;
                    tradeBd = 0;
                    sell = "minecraft:gold_block";
                    sellC = 5;
                    used8 = true;
                }
                tradeCount++;
                list.removeAll(list);
                if (tradeCount == 1) {
                    buy1a = tradeA;
                    buy1ac = tradeAc;
                    buy1ad = tradeAd;
                    buy1b = tradeB;
                    buy1bc = tradeBc;
                    buy1bd = tradeBd;
                    sell1 = sell;
                    sell1c = sellC;
                } else if (tradeCount == 2) {
                    buy2a = tradeA;
                    buy2ac = tradeAc;
                    buy2ad = tradeAd;
                    buy2b = tradeB;
                    buy2bc = tradeBc;
                    buy2bd = tradeBd;
                    sell2 = sell;
                    sell2c = sellC;
                } else if (tradeCount == 3) {
                    buy3a = tradeA;
                    buy3ac = tradeAc;
                    buy3ad = tradeAd;
                    buy3b = tradeB;
                    buy3bc = tradeBc;
                    buy3bd = tradeBd;
                    sell3 = sell;
                    sell3c = sellC;
                } else if (tradeCount == 4) {
                    buy4a = tradeA;
                    buy4ac = tradeAc;
                    buy4ad = tradeAd;
                    buy4b = tradeB;
                    buy4bc = tradeBc;
                    buy4bd = tradeBd;
                    sell4 = sell;
                    sell4c = sellC;
                } else if (tradeCount == 5) {
                    buy5a = tradeA;
                    buy5ac = tradeAc;
                    buy5ad = tradeAd;
                    buy5b = tradeB;
                    buy5bc = tradeBc;
                    buy5bd = tradeBd;
                    sell5 = sell;
                    sell5c = sellC;
                } else if (tradeCount == 6) {
                    buy6a = tradeA;
                    buy6ac = tradeAc;
                    buy6ad = tradeAd;
                    buy6b = tradeB;
                    buy6bc = tradeBc;
                    buy6bd = tradeBd;
                    sell6 = sell;
                    sell6c = sellC;
                } else if (tradeCount == 7) {
                    buy7a = tradeA;
                    buy7ac = tradeAc;
                    buy7ad = tradeAd;
                    buy7b = tradeB;
                    buy7bc = tradeBc;
                    buy7bd = tradeBd;
                    sell7 = sell;
                    sell7c = sellC;
                } else if (tradeCount == 8) {
                    buy8a = tradeA;
                    buy8ac = tradeAc;
                    buy8ad = tradeAd;
                    buy8b = tradeB;
                    buy8bc = tradeBc;
                    buy8bd = tradeBd;
                    sell8 = sell;
                    sell8c = sellC;
                } else if (tradeCount == 9) {
                    buy9a = tradeA;
                    buy9ac = tradeAc;
                    buy9ad = tradeAd;
                    buy9b = tradeB;
                    buy9bc = tradeBc;
                    buy9bd = tradeBd;
                    sell9 = sell;
                    sell9c = sellC;
                } else if (tradeCount == 10) {
                    buy10a = tradeA;
                    buy10ac = tradeAc;
                    buy10ad = tradeAd;
                    buy10b = tradeB;
                    buy10bc = tradeBc;
                    buy10bd = tradeBd;
                    sell10 = sell;
                    sell10c = sellC;
                }
            }
            entity.world.getServer().getCommandManager().handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
                    "data merge entity @s {VillagerData:{profession:farmer,level:2,type:plains},Offers:{Recipes:[" + "{buy:{id:" + "\"" + buy1a + "\""
                            + ",Count:" + buy1ac + ",Damage:" + buy1ad + "}," + "buyB:{id:" + "\"" + buy1b + "\"" + ",Count:" + buy1bc + ",Damage:"
                            + buy1bd + "}," + "sell:{id:" + "\"" + sell1 + "\"" + ",Count:" + sell1c + "},maxUses:9999999}," + "{buy:{id:" + "\""
                            + buy2a + "\"" + ",Count:" + buy2ac + ",Damage:" + buy2ad + "}," + "buyB:{id:" + "\"" + buy2b + "\"" + ",Count:" + buy2bc
                            + ",Damage:" + buy2bd + "}," + "sell:{id:" + "\"" + sell2 + "\"" + ",Count:" + sell2c + "},maxUses:9999999},"
                            + "{buy:{id:" + "\"" + buy3a + "\"" + ",Count:" + buy3ac + ",Damage:" + buy3ad + "}," + "buyB:{id:" + "\"" + buy3b + "\""
                            + ",Count:" + buy3bc + ",Damage:" + buy3bd + "}," + "sell:{id:" + "\"" + sell3 + "\"" + ",Count:" + sell3c
                            + "},maxUses:9999999}," + "{buy:{id:" + "\"" + buy4a + "\"" + ",Count:" + buy4ac + ",Damage:" + buy4ad + "},"
                            + "buyB:{id:" + "\"" + buy4b + "\"" + ",Count:" + buy4bc + ",Damage:" + buy4bd + "}," + "sell:{id:" + "\"" + sell4 + "\""
                            + ",Count:" + sell4c + "},maxUses:9999999}," + "{buy:{id:" + "\"" + buy5a + "\"" + ",Count:" + buy5ac + ",Damage:"
                            + buy5ad + "}," + "buyB:{id:" + "\"" + buy5b + "\"" + ",Count:" + buy5bc + ",Damage:" + buy5bd + "}," + "sell:{id:" + "\""
                            + sell5 + "\"" + ",Count:" + sell5c + "},maxUses:9999999}," + "]}}");
            return retval;
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
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelgoblin extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer body;
		public Modelgoblin() {
			textureWidth = 32;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, 12.0F, -7.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, 3.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 12).addBox(-4.0F, -3.0F, 4.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(22, 0).addBox(-3.0F, -3.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 14).addBox(-3.0F, -3.0F, 10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 9).addBox(-3.0F, -4.0F, 5.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(14, 8).addBox(-2.0F, -2.0F, 11.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(14, 11).addBox(-2.0F, -1.0F, 11.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(14, 14).addBox(-2.0F, 0.0F, 11.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(6, 0).addBox(-2.0F, 1.0F, 11.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 12).addBox(-2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, 2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(-2.0F, -2.0F, -1.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(14, 14).addBox(-3.0F, -5.0F, 6.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 12).addBox(-5.0F, 0.0F, 6.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(0.0F, 24.0F, 0.0F);
			rightarm.setTextureOffset(16, 0).addBox(-2.0F, -10.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(0.0F, 24.0F, 0.0F);
			leftarm.setTextureOffset(8, 19).addBox(-2.0F, -10.0F, -4.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			rightleg.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			leftleg.setTextureOffset(0, 19).addBox(-2.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(16, 16).addBox(-2.0F, -10.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
