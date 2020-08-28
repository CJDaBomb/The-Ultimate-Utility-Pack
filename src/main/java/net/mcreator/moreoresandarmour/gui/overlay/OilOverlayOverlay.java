
package net.mcreator.moreoresandarmour.gui.overlay;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilOverlayOverlay extends MoreOresAndArmourModElements.ModElement {

	public OilOverlayOverlay(MoreOresAndArmourModElements instance) {
		super(instance, 459);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {

			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;

			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			if (

			OilOverlayDisplayOverlayIngameProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
				RenderSystem.disableDepthTest();
				RenderSystem.depthMask(false);
				RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
						GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
				RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.disableAlphaTest();

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("more_ores_and_armour:textures/oil_overlay.png"));
				Minecraft.getInstance().ingameGUI.blit(0, 0, 0, 0, 1920, 1080, event.getWindow().getScaledWidth(),
						event.getWindow().getScaledHeight());

				RenderSystem.depthMask(true);
				RenderSystem.enableDepthTest();
				RenderSystem.enableAlphaTest();
				RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);

			}
		}
	}

}
