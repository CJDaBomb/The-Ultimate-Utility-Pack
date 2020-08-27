package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

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
		Entity entity = (Entity) dependencies.get("entity");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			BleedingPotionStartedappliedProcedure.executeProcedure($_dependencies);
		}
		if (((entity.getPersistentData().getDouble("bleedingEffect")) > 80)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			entity.getPersistentData().putDouble("bleedingEffect", 0);
		} else if (((entity.getPersistentData().getDouble("bleedingEffect")) < 80)) {
			entity.getPersistentData().putDouble("bleedingEffect", ((entity.getPersistentData().getDouble("bleedingEffect")) + 1));
		}
	}
}
