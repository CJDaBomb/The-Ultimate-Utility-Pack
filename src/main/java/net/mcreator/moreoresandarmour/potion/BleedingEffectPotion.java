
package net.mcreator.moreoresandarmour.potion;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingEffectPotion extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:bleeding_effect")
	public static final Effect potion = null;

	@ObjectHolder("more_ores_and_armour:bleeding_effect")
	public static final Potion potionType = null;

	public BleedingEffectPotion(MoreOresAndArmourModElements instance) {
		super(instance, 200);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("bleeding_effect");
		}

	}

	public static class EffectCustom extends Effect {

		private final ResourceLocation potionIcon;

		public EffectCustom() {
			super(EffectType.HARMFUL, -1);
			setRegistryName("bleeding_effect");
			potionIcon = new ResourceLocation("more_ores_and_armour:textures/wither.png");
		}

		@Override
		public String getName() {
			return "effect.bleeding_effect";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}

	}

}
