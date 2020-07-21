package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilMobplayerCollidesBlockProcedure extends MoreOresAndArmourModElements.ModElement {
	public OilMobplayerCollidesBlockProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OilMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double PowerOfSlowness = 0;
		PowerOfSlowness = (double) (0.95 * (-1));
		entity.setMotion(((entity.getMotion().getX()) * (PowerOfSlowness)), ((entity.getMotion().getY()) * (PowerOfSlowness)),
				((entity.getMotion().getZ()) * (PowerOfSlowness)));
	}
}
