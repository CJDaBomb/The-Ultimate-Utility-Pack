// Made with Blockbench 3.6.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeljeweler extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer body;

	public Modeljeweler() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -12.0F, 2.0F);
		setRotationAngle(head, 0.0F, 3.1416F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 24.0F, 4.0F);
		setRotationAngle(rightarm, 0.0F, 3.1416F, 0.0F);
		rightarm.setTextureOffset(28, 0).addBox(4.0F, -23.0F, 0.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(leftarm, 0.0F, 3.1416F, 0.0F);
		leftarm.setTextureOffset(36, 36).addBox(-8.0F, -23.0F, -4.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(rightleg, 0.0F, 3.1416F, 0.0F);
		rightleg.setTextureOffset(20, 24).addBox(0.0F, -13.0F, -4.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(leftleg, 0.0F, 3.1416F, 0.0F);
		leftleg.setTextureOffset(0, 28).addBox(-4.0F, -13.0F, -4.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, -12.0F);
		setRotationAngle(body, 0.0F, 3.1416F, 0.0F);
		body.setTextureOffset(0, 14).addBox(-4.0F, -23.0F, -16.0F, 8.0F, 10.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}