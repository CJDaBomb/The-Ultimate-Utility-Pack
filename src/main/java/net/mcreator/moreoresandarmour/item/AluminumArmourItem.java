
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class AluminumArmourItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:aluminum_armour_helmet")
	public static final Item helmet = null;

	@ObjectHolder("more_ores_and_armour:aluminum_armour_chestplate")
	public static final Item body = null;

	@ObjectHolder("more_ores_and_armour:aluminum_armour_leggings")
	public static final Item legs = null;

	@ObjectHolder("more_ores_and_armour:aluminum_armour_boots")
	public static final Item boots = null;

	public AluminumArmourItem(MoreOresAndArmourModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 16;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 7, 3}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AluminumIngotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "aluminum_armour";
			}

			public float getToughness() {
				return 0.5f;
			}
		};

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedHead = new ModelAluminium_Helmet().capacete;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/aluminiumhelmetttttt.png";
					}

				}.setRegistryName("aluminum_armour_helmet"));

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/aluminium22__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
								+ ".png";
					}

				}.setRegistryName("aluminum_armour_chestplate"));

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/aluminium22__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
								+ ".png";
					}

				}.setRegistryName("aluminum_armour_leggings"));

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/aluminium22__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
								+ ".png";
					}

				}.setRegistryName("aluminum_armour_boots"));
	}

	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	public static class ModelAluminium_Helmet extends EntityModel<Entity> {
		private final ModelRenderer capacete;
		private final ModelRenderer bone;

		public ModelAluminium_Helmet() {
			textureWidth = 64;
			textureHeight = 64;

			capacete = new ModelRenderer(this);
			capacete.setRotationPoint(0.0F, 24.0F, 0.0F);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(11, 1).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(0, 19).addBox(4.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(0, 19).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);

			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -8.5F, -5.2778F);
			capacete.addChild(bone);
			setRotationAngle(bone, -0.6545F, 0.0F, 0.0F);
			bone.setTextureOffset(4, 13).addBox(-6.0F, -2.5F, -0.7222F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 14).addBox(-6.0F, 1.5F, -0.7222F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(15, 12).addBox(-4.0F, -1.5F, -0.7222F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(4, 14).addBox(3.0F, -1.5F, -0.7222F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(16, 13).addBox(-2.0F, -1.5F, -0.7222F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 13).addBox(1.0F, -1.5F, -0.7222F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(16, 11).addBox(5.0F, -1.5F, -0.7222F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(16, 11).addBox(-6.0F, -1.5F, -0.7222F, 1.0F, 3.0F, 5.0F, 0.0F, false);
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
