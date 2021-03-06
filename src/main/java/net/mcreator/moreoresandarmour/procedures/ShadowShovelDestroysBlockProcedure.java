package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowShovelDestroysBlockProcedure extends MoreOresAndArmourModElements.ModElement {

	public ShadowShovelDestroysBlockProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 514);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ShadowShovelDestroysBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ShadowShovelDestroysBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ShadowShovelDestroysBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ShadowShovelDestroysBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ShadowShovelDestroysBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (((new ItemStack(ShadowAxeItem.block, (int) (1)).getItem()
				.canHarvestBlock((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))))) == (true))) {
			if ((!((world.getWorld().getRecipeManager().getRecipe(IRecipeType.SMELTING,
					new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))), world.getWorld())
					.isPresent()
							? world.getWorld().getRecipeManager()
									.getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											world.getWorld())
									.get().getRecipeOutput().copy()
							: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), (y + 0.5), (z + 0.5),
							(world.getWorld().getRecipeManager().getRecipe(IRecipeType.SMELTING,
									new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
									world.getWorld()).isPresent()
											? world.getWorld().getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory(
													(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
													world.getWorld()).get().getRecipeOutput().copy()
											: ItemStack.EMPTY));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.startTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.startTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((((entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MoreOresAndArmourModVariables.PlayerVariables())).startTimer) == (true))) {
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			} else {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world.getWorld(),
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}

	}

}
