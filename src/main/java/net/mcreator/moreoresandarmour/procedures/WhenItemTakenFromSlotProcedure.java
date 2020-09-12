package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class WhenItemTakenFromSlotProcedure extends MoreOresAndArmourModElements.ModElement {

	public WhenItemTakenFromSlotProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 67);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WhenItemTakenFromSlot!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WhenItemTakenFromSlot!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WhenItemTakenFromSlot!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WhenItemTakenFromSlot!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof World && !world.getWorld().isRemote) {
			world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 10));
		}

	}

}
