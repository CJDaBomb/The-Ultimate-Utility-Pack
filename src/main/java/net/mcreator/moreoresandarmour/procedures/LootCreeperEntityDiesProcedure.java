package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import net.mcreator.moreoresandarmour.item.TurquoiseAppleItem;
import net.mcreator.moreoresandarmour.item.SapphireAppleItem;
import net.mcreator.moreoresandarmour.item.RubyAppleItem;
import net.mcreator.moreoresandarmour.item.DiamondAppleItem;
import net.mcreator.moreoresandarmour.item.CopperAppleItem;
import net.mcreator.moreoresandarmour.item.AluminumAppleItem;
import net.mcreator.moreoresandarmour.item.AlexadriteAppleItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class LootCreeperEntityDiesProcedure extends MoreOresAndArmourModElements.ModElement {
	public LootCreeperEntityDiesProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 254);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LootCreeperEntityDies!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure LootCreeperEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LootCreeperEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LootCreeperEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LootCreeperEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LootCreeperEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack lootcreeperdrop1 = ItemStack.EMPTY;
		ItemStack lootcreeperdrop2 = ItemStack.EMPTY;
		ItemStack lootcreeperdrop3 = ItemStack.EMPTY;
		ItemStack lootcreeperdrop4 = ItemStack.EMPTY;
		ItemStack lootcreeperdrop5 = ItemStack.EMPTY;
		ItemStack lootcreeperdrop6 = ItemStack.EMPTY;
		ItemStack lootcreeperdrop7 = ItemStack.EMPTY;
		lootcreeperdrop1 = new ItemStack(DiamondAppleItem.block, (int) (1));
		((lootcreeperdrop1)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		lootcreeperdrop2 = new ItemStack(TurquoiseAppleItem.block, (int) (1));
		((lootcreeperdrop2)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		lootcreeperdrop3 = new ItemStack(RubyAppleItem.block, (int) (1));
		((lootcreeperdrop3)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		lootcreeperdrop4 = new ItemStack(AluminumAppleItem.block, (int) (1));
		((lootcreeperdrop4)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		lootcreeperdrop5 = new ItemStack(AlexadriteAppleItem.block, (int) (1));
		((lootcreeperdrop5)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		lootcreeperdrop6 = new ItemStack(CopperAppleItem.block, (int) (1));
		((lootcreeperdrop6)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		lootcreeperdrop7 = new ItemStack(SapphireAppleItem.block, (int) (1));
		((lootcreeperdrop7)).setCount((int) (((new java.util.Random()).nextInt((int) 1 + 1)) + 1));
		if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			for (int index0 = 0; index0 < (int) ((((new java.util.Random()).nextInt((int) 1 + 1)) + 1)); index0++) {
				entity.getPersistentData().putDouble("lootCreeperDrops2", ((new java.util.Random()).nextInt((int) 8 + 1)));
				if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop1));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 1)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop2));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop3));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 3)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop4));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 4)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop5));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop6));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 6)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop7));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 7)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 8)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
			for (int index1 = 0; index1 < (int) ((((new java.util.Random()).nextInt((int) 3 + 1)) + 1)); index1++) {
				entity.getPersistentData().putDouble("lootCreeperDrops2", ((new java.util.Random()).nextInt((int) 8 + 1)));
				if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop1));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 1)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop2));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop3));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 3)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop4));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 4)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop5));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop6));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 6)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop7));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 7)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 8)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.LOOTING,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
			for (int index2 = 0; index2 < (int) ((((new java.util.Random()).nextInt((int) 3 + 1)) + 2)); index2++) {
				entity.getPersistentData().putDouble("lootCreeperDrops2", ((new java.util.Random()).nextInt((int) 8 + 1)));
				if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop1));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 1)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop2));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop3));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 3)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop4));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 4)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop5));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop6));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 6)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop7));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 7)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 8)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else {
			for (int index3 = 0; index3 < (int) (1); index3++) {
				entity.getPersistentData().putDouble("lootCreeperDrops2", ((new java.util.Random()).nextInt((int) 8 + 1)));
				if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 0)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop1));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 1)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop2));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 2)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop3));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 3)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop4));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 4)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop5));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 5)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop6));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 6)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (lootcreeperdrop7));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 7)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity.getPersistentData().getDouble("lootCreeperDrops2")) == 8)) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
