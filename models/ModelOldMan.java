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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}