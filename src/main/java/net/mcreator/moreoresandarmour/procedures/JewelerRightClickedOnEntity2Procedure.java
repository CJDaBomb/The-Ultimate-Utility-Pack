package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class JewelerRightClickedOnEntity2Procedure extends MoreOresAndArmourModElements.ModElement {

	public JewelerRightClickedOnEntity2Procedure(MoreOresAndArmourModElements instance) {
		super(instance, 287);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JewelerRightClickedOnEntity2!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
			if (((entity.getPersistentData().getBoolean("jewlerCanTrade")) == (true))) {
				(itemstack).getOrCreateTag().putDouble("randomTrade", Math.round((Math.random() * 8)));
				if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletBraceletItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 1)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletNecklaceItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletEarringsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 3)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletRingItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 4)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletCrownItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletOfNightVisionItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 6)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletOfStrenthItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 7)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletofLevitationItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (sourceentity instanceof PlayerEntity)
						((PlayerEntity) sourceentity).inventory
								.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, 0, 1, 0);
				} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 8)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						world.getWorld().playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.playEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
				}
				entity.getPersistentData().putBoolean("jewelerHasTraded", (true));
				entity.getPersistentData().putBoolean("CanTrade", (false));
			} else {
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		}

	}

}
