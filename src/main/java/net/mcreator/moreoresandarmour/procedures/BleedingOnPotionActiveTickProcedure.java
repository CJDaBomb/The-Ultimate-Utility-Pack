package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingOnPotionActiveTickProcedure extends MoreOresAndArmourModElements.ModElement {

	public BleedingOnPotionActiveTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 200);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BleedingOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BleedingOnPotionActiveTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		MoreOresAndArmourModVariables.MapVariables
				.get(world).bleedingTicks = (double) ((MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks) + 1);
		MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
		if (((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == BleedingPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 0)) {
			if (((MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks) == 80)) {
				MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == BleedingPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 1)) {
			if (((MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks) == 40)) {
				MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == BleedingPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3)) {
			if (((MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks) == 20)) {
				MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		}

	}

}
