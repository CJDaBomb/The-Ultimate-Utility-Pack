
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@MoreOresAndArmourModElements.ModElement.Tag
public class CopperArmorItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:copper_armorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("more_ores_and_armour:copper_armorbody")
	public static final Item body = null;
	@ObjectHolder("more_ores_and_armour:copper_armorlegs")
	public static final Item legs = null;
	@ObjectHolder("more_ores_and_armour:copper_armorboots")
	public static final Item boots = null;
	public CopperArmorItem(MoreOresAndArmourModElements instance) {
		super(instance, 207);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "copper_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelCopper_Helmet().capacete;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "more_ores_and_armour:textures/copper_helmet_.png";
			}
		}.setRegistryName("copper_armorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "more_ores_and_armour:textures/models/armor/copper__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("copper_armorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "more_ores_and_armour:textures/models/armor/copper__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("copper_armorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "more_ores_and_armour:textures/models/armor/copper__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("copper_armorboots"));
	}
	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelCopper_Helmet extends EntityModel<Entity> {
		private final ModelRenderer capacete;
		public ModelCopper_Helmet() {
			textureWidth = 64;
			textureHeight = 64;
			capacete = new ModelRenderer(this);
			capacete.setRotationPoint(0.0F, 24.0F, 0.0F);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(10, 12).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(1, 12).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(11, 11).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(10, 11).addBox(1.0F, -6.0F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(11, 11).addBox(-4.0F, -6.0F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(17, 23).addBox(2.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(17, 24).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(3, 15).addBox(2.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(3, 16).addBox(-3.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
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