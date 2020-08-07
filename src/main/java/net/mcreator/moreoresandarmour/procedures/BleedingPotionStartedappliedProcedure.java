package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingPotionStartedappliedProcedure extends MoreOresAndArmourModElements.ModElement {
	public BleedingPotionStartedappliedProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 303);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BleedingPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("bleedingEffect", 0);
	}
}
