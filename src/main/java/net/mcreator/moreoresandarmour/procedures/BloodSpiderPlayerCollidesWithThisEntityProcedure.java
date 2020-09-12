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
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BloodSpiderPlayerCollidesWithThisEntity!");
			return;
		}

		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");

		if ((world.getDifficulty() == Difficulty.EASY)) {
			if ((Math.random() <= 0.6)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(BleedingPotion.potion,
							(int) (999999 + ((new java.util.Random()).nextInt((int) 999999 + 1))), (int) 1));
			}
		} else if ((world.getDifficulty() == Difficulty.NORMAL)) {
			if ((Math.random() == 0.2)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(
							new EffectInstance(BleedingPotion.potion, (int) (999999 + ((new java.util.Random()).nextInt((int) 999999 + 1))),
									(int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1)))));
			}
		} else if ((world.getDifficulty() == Difficulty.HARD)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(
						new EffectInstance(BleedingPotion.potion, (int) (999999 + ((new java.util.Random()).nextInt((int) 999999 + 1))),
								(int) (1 + ((new java.util.Random()).nextInt((int) 2 + 1)))));
		}

	}

}
