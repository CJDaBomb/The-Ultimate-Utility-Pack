package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class EmeraldAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public EmeraldAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 494);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(
					new EffectInstance(Effects.HERO_OF_THE_VILLAGE, (int) 999999, (int) ((new java.util.Random()).nextInt((int) 5 + 1))));

	}

}
