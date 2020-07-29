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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		waist.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}