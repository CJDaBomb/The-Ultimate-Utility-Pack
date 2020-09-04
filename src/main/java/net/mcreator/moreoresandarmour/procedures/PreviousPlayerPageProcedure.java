package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class PreviousPlayerPageProcedure extends MoreOresAndArmourModElements.ModElement {
	public PreviousPlayerPageProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 358);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PreviousPlayerPage!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getDouble("playerTradePage")) == 6)) {
			entity.getPersistentData().putDouble("playerTradePage", 5);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 5)) {
			entity.getPersistentData().putDouble("playerTradePage", 4);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 4)) {
			entity.getPersistentData().putDouble("playerTradePage", 3);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 3)) {
			entity.getPersistentData().putDouble("playerTradePage", 2);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 2)) {
			entity.getPersistentData().putDouble("playerTradePage", 1);
		}
	}
}
