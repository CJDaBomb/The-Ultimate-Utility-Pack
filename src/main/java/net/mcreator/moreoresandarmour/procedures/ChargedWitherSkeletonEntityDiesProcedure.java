package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import net.mcreator.moreoresandarmour.item.ChargedWitherBonesItem;
import net.mcreator.moreoresandarmour.item.ChargedCoalItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChargedWitherSkeletonEntityDiesProcedure extends MoreOresAndArmourModElements.ModElement {
	public ChargedWitherSkeletonEntityDiesProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 429);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChargedWitherSkeletonEntityDies!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure ChargedWitherSkeletonEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ChargedWitherSkeletonEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ChargedWitherSkeletonEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ChargedWitherSkeletonEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ChargedWitherSkeletonEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 0)) {
			for (int index0 = 0; index0 < (int) ((Math.round(Math.random()) + 1)); index0++) {
				entity.getPersistentData().putDouble("chargedWitherSkellyDrops", Math.random());
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.67)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.33)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.9)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.9)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
									new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			for (int index1 = 0; index1 < (int) ((Math.round(Math.random()) + 1)); index1++) {
				entity.getPersistentData().putDouble("chargedWitherSkellyDrops", Math.random());
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.75)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.39)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.8)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.8)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
									new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
			for (int index2 = 0; index2 < (int) ((Math.round(Math.random()) + 1)); index2++) {
				entity.getPersistentData().putDouble("chargedWitherSkellyDrops", Math.random());
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.75)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.39)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.65)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.65)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
									new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
			for (int index3 = 0; index3 < (int) ((Math.round(Math.random()) + 2)); index3++) {
				entity.getPersistentData().putDouble("chargedWitherSkellyDrops", Math.random());
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.8)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0.4)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.5)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedCoalItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyDrops")) >= 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() > 0.5)) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
									new ItemStack(ChargedWitherBonesItem.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
