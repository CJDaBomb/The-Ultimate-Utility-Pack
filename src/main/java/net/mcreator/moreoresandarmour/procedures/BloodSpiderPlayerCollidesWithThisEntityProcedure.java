package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class BloodSpiderPlayerCollidesWithThisEntityProcedure extends MoreOresAndArmourModElements.ModElement {

	public BloodSpiderPlayerCollidesWithThisEntityProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 161);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure BloodSpiderPlayerCollidesWithThisEntity!");
			return;
		}

		Entity sourceentity = (Entity) dependencies.get("sourceentity");

		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(BleedingPotion.potion, (int) 20, (int) 1));

	}

}
