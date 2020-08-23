package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilMobplayerCollidesBlockProcedure extends MoreOresAndArmourModElements.ModElement {
	public OilMobplayerCollidesBlockProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 236);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OilMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vec3d(0.25D, (double) 0.05F, 0.25D));
	}
}
