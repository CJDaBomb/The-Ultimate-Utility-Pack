// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelalexandrite_Helmet extends EntityModel<Entity> {
	private final ModelRenderer capacete;

	public Modelalexandrite_Helmet() {
		textureWidth = 64;
		textureHeight = 64;

		capacete = new ModelRenderer(this);
		capacete.setRotationPoint(0.0F, 24.0F, 0.0F);
		capacete.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		capacete.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		capacete.setTextureOffset(11, 0).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(20, 15).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(9, 14).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(20, 15).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(10, 13).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(17, 23).addBox(2.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(17, 24).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(13, 14).addBox(2.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(14, 15).addBox(-3.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		capacete.setTextureOffset(0, 19).addBox(4.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		capacete.setTextureOffset(0, 19).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		capacete.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}