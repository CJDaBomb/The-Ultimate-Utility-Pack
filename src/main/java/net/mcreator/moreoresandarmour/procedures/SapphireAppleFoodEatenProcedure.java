package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class SapphireAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public SapphireAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 500);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SapphireAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3000, (int) ((new java.util.Random()).nextInt((int) 5 + 1))));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 3000, (int) 1));
		entity.getPersistentData().putBoolean("SapphireIncreased", (true));
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((((("Enjoy ") + "" + (20))) + "" + (" Seconds of Increased Strength"))),
					(false));
		}

	}

}
