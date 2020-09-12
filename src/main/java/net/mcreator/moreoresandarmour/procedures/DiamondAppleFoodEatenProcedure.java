package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class DiamondAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public DiamondAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 496);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DiamondAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3000, (int) ((new java.util.Random()).nextInt((int) 2 + 1))));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 3000, (int) ((new java.util.Random()).nextInt((int) 2 + 1))));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 3000, (int) ((new java.util.Random()).nextInt((int) 3 + 1))));

	}

}
