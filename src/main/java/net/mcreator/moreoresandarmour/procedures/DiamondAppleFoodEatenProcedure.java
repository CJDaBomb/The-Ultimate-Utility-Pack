package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

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
