package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.potion.BleedingPotion;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class BloodSpiderPlayerCollidesWithThisEntityProcedure extends MoreOresAndArmourModElements.ModElement {
	public BloodSpiderPlayerCollidesWithThisEntityProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 350);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure BloodSpiderPlayerCollidesWithThisEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(BleedingPotion.potion, (int) Double.POSITIVE_INFINITY, (int) 1));
	}
}
