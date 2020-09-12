package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class CoalAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public CoalAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 494);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CoalAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 6000, (int) 1));

	}

}
