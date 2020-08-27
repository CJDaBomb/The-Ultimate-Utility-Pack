package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.moreoresandarmour.item.RubyItem;
import net.mcreator.moreoresandarmour.block.RubyoreBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class RubyoreBlockDestroyedByPlayerProcedure extends MoreOresAndArmourModElements.ModElement {
	public RubyoreBlockDestroyedByPlayerProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 427);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RubyoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RubyoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RubyoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RubyoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RubyoreBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 0)
				&& (!((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
						((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)))) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
			if ((Math.random() < 0.33)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
			if ((Math.random() < 0.5)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else {
				if ((Math.random() < 0.25)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if ((Math.random() < 0.25)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
			if ((Math.random() < 0.4)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else {
				if ((Math.random() < 0.2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if ((Math.random() < 0.2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if ((Math.random() < 0.2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyoreBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
