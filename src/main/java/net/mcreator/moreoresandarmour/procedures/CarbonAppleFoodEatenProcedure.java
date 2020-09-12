package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class CarbonAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public CarbonAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 502);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CarbonAppleFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CarbonAppleFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CarbonAppleFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CarbonAppleFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CarbonAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		ItemStack carbon = ItemStack.EMPTY;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 1, (int) 3));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 3000, (int) 2));
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
			entity.getPersistentData().putDouble("carbon", ((new java.util.Random()).nextInt((int) 10 + 1)));
			if (((entity.getPersistentData().getDouble("tagName")) >= 2)) {
				carbon = new ItemStack(CarbonItem.block, (int) (1));
				((carbon)).setCount((int) (1 + ((new java.util.Random()).nextInt((int) 4 + 1))));
			} else if (((entity.getPersistentData().getDouble("tagName")) == 0)) {
				carbon = new ItemStack(CarbonBlockBlock.block, (int) (1));
				((carbon)).setCount((int) 1);
			}
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (carbon));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}

	}

}
