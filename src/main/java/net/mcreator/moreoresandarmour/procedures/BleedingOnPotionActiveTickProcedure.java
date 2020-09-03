package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.potion.BleedingPotion;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModVariables;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.Collection;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingOnPotionActiveTickProcedure extends MoreOresAndArmourModElements.ModElement {
	public BleedingOnPotionActiveTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 359);
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
				if (entity instanceof LivingEntity) {
					DamageSource a = new DamageSource("cursed_blood").setDamageBypassesArmor();
					((LivingEntity) entity).attackEntityFrom(a, (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
				}
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
				if (entity instanceof LivingEntity) {
					DamageSource a = new DamageSource("cursed_blood").setDamageBypassesArmor();
					((LivingEntity) entity).attackEntityFrom(a, (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
				}
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
				if (entity instanceof LivingEntity) {
					DamageSource a = new DamageSource("cursed_blood").setDamageBypassesArmor();
					((LivingEntity) entity).attackEntityFrom(a, (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
				}
				MoreOresAndArmourModVariables.MapVariables.get(world).bleedingTicks = (double) 0;
				MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
