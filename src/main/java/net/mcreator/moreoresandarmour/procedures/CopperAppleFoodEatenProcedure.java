package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class CopperAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public CopperAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 502);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CopperAppleFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CopperAppleFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CopperAppleFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CopperAppleFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CopperAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		ItemStack copper = ItemStack.EMPTY;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 9999, (int) ((new java.util.Random()).nextInt((int) 3 + 1))));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 9999, (int) 2));
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
			entity.getPersistentData().putDouble("copper", ((new java.util.Random()).nextInt((int) 12 + 1)));
			if (((entity.getPersistentData().getDouble("copper")) >= 4)) {
				copper = new ItemStack(CopperIngotItem.block, (int) (1));
				((copper)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 4 + 1))));
			} else if (((entity.getPersistentData().getDouble("copper")) >= 3)) {
				copper = new ItemStack(ElectricArrowItem.block, (int) (1));
				((copper)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
			} else if (((entity.getPersistentData().getDouble("copper")) >= 2)) {
				copper = new ItemStack(CopperWireBlock.block, (int) (1));
				((copper)).setCount((int) 1);
			} else if (((entity.getPersistentData().getDouble("copper")) >= 1)) {
				copper = new ItemStack(BoltItem.block, (int) (1));
				((copper)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
			}
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (copper));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}

	}

}
