package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class BlueStoneBlockDestroyedByPlayerProcedure extends MoreOresAndArmourModElements.ModElement {

	public BlueStoneBlockDestroyedByPlayerProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 452);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlueStoneBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlueStoneBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlueStoneBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlueStoneBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlueStoneBlockDestroyedByPlayer!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlueStoneBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlueCobbleStoneBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}

	}

}
