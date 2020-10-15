package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class RedstoneAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public RedstoneAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 497);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RedstoneAppleFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RedstoneAppleFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RedstoneAppleFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RedstoneAppleFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RedstoneAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		double randomItem = 0;
		ItemStack item = ItemStack.EMPTY;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 9999, (int) 1));
		if ((!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)))) {
			randomItem = (double) ((new java.util.Random()).nextInt((int) 5 + 1));
			if (((randomItem) == 0)) {
				item = new ItemStack(Items.REDSTONE, (int) (1));
				((item)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 15 + 1))));
			} else if (((randomItem) == 1)) {
				item = new ItemStack(Blocks.REDSTONE_TORCH, (int) (1));
				((item)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 10 + 1))));
			} else if (((randomItem) == 2)) {
				item = new ItemStack(Blocks.PISTON, (int) (1));
				((item)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 4 + 1))));
			} else if (((randomItem) == 3)) {
				item = new ItemStack(Blocks.STICKY_PISTON, (int) (1));
				((item)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 3 + 1))));
			} else if (((randomItem) == 4)) {
				item = new ItemStack(Items.REPEATER, (int) (1));
				((item)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 8 + 1))));
			} else if (((randomItem) == 5)) {
				item = new ItemStack(Items.COMPARATOR, (int) (1));
				((item)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 6 + 1))));
			}
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (item));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}

	}

}
