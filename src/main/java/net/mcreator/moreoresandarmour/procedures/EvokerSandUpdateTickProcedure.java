package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class EvokerSandUpdateTickProcedure extends MoreOresAndArmourModElements.ModElement {

	public EvokerSandUpdateTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 175);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EvokerSandUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EvokerSandUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EvokerSandUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EvokerSandUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EvokerSandUpdateTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if ((!(world.getWorld().isRemote))) {
			entity.getPersistentData().putDouble("spawnMob1", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob1")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new LootCreeperEntity.CustomEntity(LootCreeperEntity.entity, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob2", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob2")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new BloodSpiderEntity.CustomEntity(BloodSpiderEntity.entity, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob3", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob3")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new PillagerEntity(EntityType.PILLAGER, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob4", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob4")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new WitherSkeletonEntity(EntityType.WITHER_SKELETON, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob5", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob5")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new VindicatorEntity(EntityType.VINDICATOR, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob6", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob6")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new VexEntity(EntityType.VEX, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob7", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob7")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new IllusionerEntity(EntityType.ILLUSIONER, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("spawnMob8", Math.random());
			if (((entity.getPersistentData().getDouble("spanwMob8")) <= (1e-20))) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new EvokerEntity(EntityType.EVOKER, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);

					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

					world.addEntity(entityToSpawn);
				}
			}
		}

	}

}
