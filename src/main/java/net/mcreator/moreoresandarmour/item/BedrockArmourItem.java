
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.moreoresandarmour.itemgroup.UltimateUtilityCombatItemGroup;
import net.mcreator.moreoresandarmour.block.ShadowRockBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MoreOresAndArmourModElements.ModElement.Tag
public class BedrockArmourItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:bedrock_armour_helmet")
	public static final Item helmet = null;
	@ObjectHolder("more_ores_and_armour:bedrock_armour_chestplate")
	public static final Item body = null;
	@ObjectHolder("more_ores_and_armour:bedrock_armour_leggings")
	public static final Item legs = null;
	@ObjectHolder("more_ores_and_armour:bedrock_armour_boots")
	public static final Item boots = null;
	public BedrockArmourItem(MoreOresAndArmourModElements instance) {
		super(instance, 221);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{17, 25, 30, 25}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 50;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowRockBlock.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "bedrock_armour";
			}

			public float getToughness() {
				return 5f;
			}
		};
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedHead = new Modelbedrock_Helmet().capacete;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/bedrock_helmet_texture.png";
					}
				}.setRegistryName("bedrock_armour_helmet"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/bedrock2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("bedrock_armour_chestplate"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/bedrock2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("bedrock_armour_leggings"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/bedrock2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("bedrock_armour_boots"));
	}
	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelbedrock_Helmet extends EntityModel<Entity> {
		private final ModelRenderer capacete;
		public Modelbedrock_Helmet() {
			textureWidth = 64;
			textureHeight = 64;
			capacete = new ModelRenderer(this);
			capacete.setRotationPoint(0.0F, 24.0F, 0.0F);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(10, 12).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(1, 12).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(11, 11).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(10, 11).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(8, 11).addBox(4.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(8, 11).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			capacete.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
