package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModVariables;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

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
			double _setval = (double) (((entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MoreOresAndArmourModVariables.PlayerVariables())).bleedingTicks) + 1);
			entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bleedingTicks = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((((entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MoreOresAndArmourModVariables.PlayerVariables())).bleedingTicks) == 80)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			{
				double _setval = (double) 0;
				entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bleedingTicks = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
