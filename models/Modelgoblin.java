// Made with Blockbench 3.6.1
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
		head.setRotationPoint(-1.3F, 11.0667F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-1.7F, -1.0667F, -4.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-1.7F, -2.0667F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(22, 0).addBox(-0.7F, -2.0667F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 14).addBox(-0.7F, -2.0667F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(14, 9).addBox(-0.7F, -3.0667F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 8).addBox(0.3F, -1.0667F, 4.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 11).addBox(0.3F, -0.0667F, 4.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(14, 14).addBox(0.3F, 0.9333F, 4.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(6, 0).addBox(0.3F, 1.9333F, 4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(14, 12).addBox(0.3F, -0.0667F, -7.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 14).addBox(0.3F, 0.9333F, -7.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.3F, 1.9333F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(0.3F, -1.0667F, -8.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 14).addBox(-0.7F, -4.0667F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-2.7F, 0.9333F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-1.0F, 16.5F, 3.0F);
		rightarm.setTextureOffset(16, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-1.0F, 16.5F, -3.0F);
		leftarm.setTextureOffset(8, 19).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.0F, 21.5F, 1.0F);
		rightleg.setTextureOffset(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(-1.0F, 21.5F, -1.0F);
		leftleg.setTextureOffset(0, 19).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.0F, 16.5F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);
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
	}
}