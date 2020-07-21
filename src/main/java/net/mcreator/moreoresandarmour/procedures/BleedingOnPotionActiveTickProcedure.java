package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

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
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
	}
}
