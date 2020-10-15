package net.mcreator.moreoresandarmour.procedures;

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

		entity.setMotionMultiplier(null, new Vec3d(0.25D, (double) 0.05F, 0.25D));

	}

}
