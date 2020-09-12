package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class AmuletOfNightVisionItemInInventoryTickProcedure extends MoreOresAndArmourModElements.ModElement {

	public AmuletOfNightVisionItemInInventoryTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 77);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmuletOfNightVisionItemInInventoryTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 240000, (int) 0));

	}

}
