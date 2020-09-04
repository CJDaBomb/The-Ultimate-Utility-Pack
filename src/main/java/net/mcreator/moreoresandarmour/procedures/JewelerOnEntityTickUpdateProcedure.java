package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class JewelerOnEntityTickUpdateProcedure extends MoreOresAndArmourModElements.ModElement {
	public JewelerOnEntityTickUpdateProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 493);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JewelerOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("jewelerHasTraded")) == (true))) {
			entity.getPersistentData().putDouble("jewlerTicks", ((entity.getPersistentData().getDouble("jewlerTicks")) + 0));
			if (((entity.getPersistentData().getDouble("jewlerTicks")) == 100)) {
				entity.getPersistentData().putDouble("jewlerTicks", 0);
				entity.getPersistentData().putBoolean("jewlerhasTraded", (false));
				entity.getPersistentData().putBoolean("jewlerCanTrade", (true));
			}
		}
	}
}
