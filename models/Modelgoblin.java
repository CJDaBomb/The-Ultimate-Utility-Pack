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
	}
}