package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class WitherPotionPotionStartedappliedProcedure extends MoreOresAndArmourModElements.ModElement {

	public WitherPotionPotionStartedappliedProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 20);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WitherPotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WitherPotionPotionStartedapplied!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		MoreOresAndArmourModVariables.MapVariables
				.get(world).witherTicks = (double) ((MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks) + 1);
		MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
		if (((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WitherPotionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 0)) {
			if (((MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks) == 40)) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
				MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WitherPotionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 1)) {
			if (((MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks) == 20)) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
				MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WitherPotionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 2)) {
			if (((MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks) == 10)) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
				MoreOresAndArmourModVariables.MapVariables.get(world).witherTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		}

	}

}
