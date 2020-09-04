package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class EmeraldAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {
	public EmeraldAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 494);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(
					new EffectInstance(Effects.HERO_OF_THE_VILLAGE, (int) 999999, (int) ((new java.util.Random()).nextInt((int) 5 + 1))));
	}
}
