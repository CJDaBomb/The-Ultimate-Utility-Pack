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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.cabea.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.cabea.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.E1.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.D1.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.E2.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.D2.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.E3.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.D3.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}