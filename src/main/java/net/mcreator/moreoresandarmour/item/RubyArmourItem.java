
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class RubyArmourItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:ruby_armour_helmet")
	public static final Item helmet = null;

	@ObjectHolder("more_ores_and_armour:ruby_armour_chestplate")
	public static final Item body = null;

	@ObjectHolder("more_ores_and_armour:ruby_armour_leggings")
	public static final Item legs = null;

	@ObjectHolder("more_ores_and_armour:ruby_armour_boots")
	public static final Item boots = null;

	public RubyArmourItem(MoreOresAndArmourModElements instance) {
		super(instance, 137);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{6, 11, 8, 5}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 26;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "ruby_armour";
			}

			public float getToughness() {
				return 2.5f;
			}
		};

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedHead = new Modelruby_Helmet().capacete;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/rubyhelmettexture.png";
					}

				}.setRegistryName("ruby_armour_helmet"));

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/ruby2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

				}.setRegistryName("ruby_armour_chestplate"));

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/ruby2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

				}.setRegistryName("ruby_armour_leggings"));

		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "more_ores_and_armour:textures/models/armor/ruby2__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}

				}.setRegistryName("ruby_armour_boots"));
	}

	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	public static class Modelruby_Helmet extends EntityModel<Entity> {
		private final ModelRenderer capacete;

		public Modelruby_Helmet() {
			textureWidth = 64;
			textureHeight = 64;

			capacete = new ModelRenderer(this);
			capacete.setRotationPoint(0.0F, 24.0F, 0.0F);
			capacete.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(11, 0).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(22, 14).addBox(-4.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(22, 14).addBox(2.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(23, 15).addBox(1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(7, 13).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(21, 15).addBox(-2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(2, 13).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			capacete.setTextureOffset(0, 19).addBox(4.0F, -8.0F, -5.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
			capacete.setTextureOffset(0, 19).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
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
