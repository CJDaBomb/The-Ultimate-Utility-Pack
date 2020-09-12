package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.moreoresandarmour.item.SapphireSwordItem;
import net.mcreator.moreoresandarmour.item.SapphireShovelItem;
import net.mcreator.moreoresandarmour.item.SapphirePickaxeItem;
import net.mcreator.moreoresandarmour.item.SapphireAxeItem;
import net.mcreator.moreoresandarmour.item.SapphireArmourItem;
import net.mcreator.moreoresandarmour.item.RubySwordItem;
import net.mcreator.moreoresandarmour.item.RubyShovelItem;
import net.mcreator.moreoresandarmour.item.RubyPickaxeItem;
import net.mcreator.moreoresandarmour.item.RubyAxeItem;
import net.mcreator.moreoresandarmour.item.RubyArmourItem;
import net.mcreator.moreoresandarmour.item.AluminumSwordItem;
import net.mcreator.moreoresandarmour.item.AluminumShovelItem;
import net.mcreator.moreoresandarmour.item.AluminumPickaxeItem;
import net.mcreator.moreoresandarmour.item.AluminumAxeItem;
import net.mcreator.moreoresandarmour.item.AluminumArmourItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChargedWitherSkeletonOnInitialEntitySpawnProcedure extends MoreOresAndArmourModElements.ModElement {
	public ChargedWitherSkeletonOnInitialEntitySpawnProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 509);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChargedWitherSkeletonOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ChargedWitherSkeletonOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		boolean swordOrBow = false;
		ItemStack enchantedBow = ItemStack.EMPTY;
		ItemStack swordItem = ItemStack.EMPTY;
		ItemStack helmet = ItemStack.EMPTY;
		ItemStack chestplate = ItemStack.EMPTY;
		ItemStack leggings = ItemStack.EMPTY;
		ItemStack boots = ItemStack.EMPTY;
		ItemStack axe = ItemStack.EMPTY;
		ItemStack shovel = ItemStack.EMPTY;
		ItemStack pickaxe = ItemStack.EMPTY;
		double randomSwordItem = 0;
		double randomHelemt = 0;
		double randomChestplate = 0;
		double randomLeggings = 0;
		double randomBoots = 0;
		double randomAxe = 0;
		double RandomShovel = 0;
		double randomPickaxe = 0;
		double randomHandItem = 0;
		double randomOffHandItem = 0;
		double randomTool = 0;
		randomHandItem = (double) (Math.random() * 20);
		randomOffHandItem = (double) (Math.random() * 20);
		swordOrBow = (boolean) ((new java.util.Random()).nextBoolean());
		randomTool = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomSwordItem = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomHelemt = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomChestplate = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomLeggings = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomBoots = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomAxe = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		RandomShovel = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		randomPickaxe = (double) ((new java.util.Random()).nextInt((int) 2 + 1));
		if (((randomSwordItem) == 0)) {
			swordItem = new ItemStack(RubySwordItem.block, (int) (1));
		} else if (((randomSwordItem) == 1)) {
			swordItem = new ItemStack(AluminumSwordItem.block, (int) (1));
		} else if (((randomSwordItem) == 2)) {
			swordItem = new ItemStack(SapphireSwordItem.block, (int) (1));
		}
		if (((randomHelemt) == 0)) {
			helmet = new ItemStack(RubyArmourItem.helmet, (int) (1));
		} else if (((randomHelemt) == 1)) {
			helmet = new ItemStack(AluminumArmourItem.helmet, (int) (1));
		} else if (((randomHelemt) == 2)) {
			helmet = new ItemStack(SapphireArmourItem.helmet, (int) (1));
		}
		if (((randomChestplate) == 0)) {
			chestplate = new ItemStack(RubyArmourItem.body, (int) (1));
		} else if (((randomChestplate) == 1)) {
			chestplate = new ItemStack(AluminumArmourItem.body, (int) (1));
		} else if (((randomChestplate) == 2)) {
			chestplate = new ItemStack(SapphireArmourItem.body, (int) (1));
		}
		if (((randomLeggings) == 0)) {
			leggings = new ItemStack(RubyArmourItem.legs, (int) (1));
		} else if (((randomLeggings) == 1)) {
			leggings = new ItemStack(AluminumArmourItem.legs, (int) (1));
		} else if (((randomLeggings) == 2)) {
			leggings = new ItemStack(SapphireArmourItem.legs, (int) (1));
		}
		if (((randomBoots) == 0)) {
			boots = new ItemStack(RubyArmourItem.boots, (int) (1));
		} else if (((randomBoots) == 1)) {
			boots = new ItemStack(AluminumArmourItem.boots, (int) (1));
		} else if (((randomBoots) == 2)) {
			boots = new ItemStack(SapphireArmourItem.boots, (int) (1));
		}
		if (((randomAxe) == 0)) {
			axe = new ItemStack(RubyAxeItem.block, (int) (1));
		} else if (((randomAxe) == 1)) {
			axe = new ItemStack(AluminumAxeItem.block, (int) (1));
		} else if (((randomAxe) == 2)) {
			axe = new ItemStack(SapphireAxeItem.block, (int) (1));
		}
		if (((RandomShovel) == 0)) {
			shovel = new ItemStack(RubyShovelItem.block, (int) (1));
		} else if (((RandomShovel) == 1)) {
			shovel = new ItemStack(AluminumShovelItem.block, (int) (1));
		} else if (((RandomShovel) == 2)) {
			shovel = new ItemStack(SapphireShovelItem.block, (int) (1));
		}
		if (((randomPickaxe) == 0)) {
			pickaxe = new ItemStack(RubyPickaxeItem.block, (int) (1));
		} else if (((randomPickaxe) == 1)) {
			pickaxe = new ItemStack(AluminumPickaxeItem.block, (int) (1));
		} else if (((randomPickaxe) == 2)) {
			pickaxe = new ItemStack(SapphirePickaxeItem.block, (int) (1));
		}
		if ((world.getDifficulty() == Difficulty.EASY)) {
			if ((Math.random() > 0.98)) {
				for (int index0 = 0; index0 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index0++) {
					entity.getPersistentData().putDouble("randomSwordEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 0)) {
						((swordItem)).addEnchantment(Enchantments.SHARPNESS, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 1)) {
						((swordItem)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 2)) {
						((swordItem)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 3)) {
						((swordItem)).addEnchantment(Enchantments.FIRE_ASPECT, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.98)) {
				for (int index1 = 0; index1 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index1++) {
					entity.getPersistentData().putDouble("randomBowEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 0)) {
						((enchantedBow)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 1)) {
						((enchantedBow)).addEnchantment(Enchantments.POWER, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 2)) {
						if ((Math.random() > 0.5)) {
							((enchantedBow)).addEnchantment(Enchantments.FLAME, (int) 1);
						} else {
							((enchantedBow)).addEnchantment(Enchantments.PUNCH, (int) 1);
						}
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 3)) {
						((enchantedBow)).addEnchantment(Enchantments.MENDING, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.98)) {
				for (int index2 = 0; index2 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index2++) {
					entity.getPersistentData().putDouble("randomAxeEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 0)) {
						((axe)).addEnchantment(Enchantments.SHARPNESS, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 1)) {
						((axe)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 2)) {
						((axe)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 3)) {
						((axe)).addEnchantment(Enchantments.EFFICIENCY, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.98)) {
				for (int index3 = 0; index3 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index3++) {
					entity.getPersistentData().putDouble("randomShovelEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 0)) {
						if ((Math.random() > 0.5)) {
							((shovel)).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
						} else {
							((shovel)).addEnchantment(Enchantments.FORTUNE, (int) 1);
						}
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 1)) {
						((shovel)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 2)) {
						((shovel)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 3)) {
						((shovel)).addEnchantment(Enchantments.EFFICIENCY, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.98)) {
				for (int index4 = 0; index4 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index4++) {
					entity.getPersistentData().putDouble("randomPickaxeEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 0)) {
						if ((Math.random() > 0.5)) {
							((pickaxe)).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
						} else {
							((pickaxe)).addEnchantment(Enchantments.FORTUNE, (int) 1);
						}
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 1)) {
						((pickaxe)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 2)) {
						((pickaxe)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 3)) {
						((pickaxe)).addEnchantment(Enchantments.EFFICIENCY, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.98)) {
				for (int index5 = 0; index5 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index5++) {
					entity.getPersistentData().putDouble("randomArmourEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 0)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 1)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 2)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 3)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					}
				}
			}
			if (((randomHandItem) >= 14)) {
				if (((swordOrBow) == (true))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (enchantedBow);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (swordItem);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			} else if (((randomHandItem) >= 8)) {
				if (((randomHandItem) == 0)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (axe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 1)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (shovel);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 2)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (pickaxe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if (((randomOffHandItem) >= 19.5)) {
				if (((swordOrBow) == (true))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (enchantedBow);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (swordItem);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			} else if (((randomOffHandItem) >= 19)) {
				if (((randomHandItem) == 0)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (axe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 1)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (shovel);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 2)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (pickaxe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((Math.random() > 0.95)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(0, (helmet));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.97)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(1, (chestplate));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.97)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(2, (leggings));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.96)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(3, (boots));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
			} ;
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2);
			} ;
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.2);
			} ;
		} else if ((world.getDifficulty() == Difficulty.NORMAL)) {
			if ((Math.random() > 0.93)) {
				for (int index6 = 0; index6 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index6++) {
					entity.getPersistentData().putDouble("randomSwordEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 0)) {
						((swordItem)).addEnchantment(Enchantments.SHARPNESS, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 1)) {
						((swordItem)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 2)) {
						((swordItem)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 3)) {
						((swordItem)).addEnchantment(Enchantments.FIRE_ASPECT, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.93)) {
				for (int index7 = 0; index7 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index7++) {
					entity.getPersistentData().putDouble("randomBowEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 0)) {
						((enchantedBow)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 1)) {
						((enchantedBow)).addEnchantment(Enchantments.POWER, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 2)) {
						if ((Math.random() > 0.5)) {
							((enchantedBow)).addEnchantment(Enchantments.FLAME, (int) 1);
						} else {
							((enchantedBow)).addEnchantment(Enchantments.PUNCH, (int) 1);
						}
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 3)) {
						((enchantedBow)).addEnchantment(Enchantments.MENDING, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.93)) {
				for (int index8 = 0; index8 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index8++) {
					entity.getPersistentData().putDouble("randomAxeEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 0)) {
						((axe)).addEnchantment(Enchantments.SHARPNESS, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 1)) {
						((axe)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 2)) {
						((axe)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 3)) {
						((axe)).addEnchantment(Enchantments.EFFICIENCY, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.93)) {
				for (int index9 = 0; index9 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index9++) {
					entity.getPersistentData().putDouble("randomShovelEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 0)) {
						if ((Math.random() > 0.5)) {
							((shovel)).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
						} else {
							((shovel)).addEnchantment(Enchantments.FORTUNE, (int) 1);
						}
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 1)) {
						((shovel)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 2)) {
						((shovel)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 3)) {
						((shovel)).addEnchantment(Enchantments.EFFICIENCY, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.93)) {
				for (int index10 = 0; index10 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index10++) {
					entity.getPersistentData().putDouble("randomPickaxeEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 0)) {
						if ((Math.random() > 0.5)) {
							((pickaxe)).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
						} else {
							((pickaxe)).addEnchantment(Enchantments.FORTUNE, (int) 1);
						}
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 1)) {
						((pickaxe)).addEnchantment(Enchantments.MENDING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 2)) {
						((pickaxe)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 3)) {
						((pickaxe)).addEnchantment(Enchantments.EFFICIENCY, (int) 1);
					}
				}
			}
			if ((Math.random() > 0.8)) {
				for (int index11 = 0; index11 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index11++) {
					entity.getPersistentData().putDouble("randomArmourEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 0)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 1)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 2)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 3)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
					}
				}
			}
			if (((randomHandItem) >= 13)) {
				if (((swordOrBow) == (true))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (enchantedBow);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (swordItem);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			} else if (((randomHandItem) >= 6)) {
				if (((randomHandItem) == 0)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (axe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 1)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (shovel);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 2)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (pickaxe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if (((randomOffHandItem) >= 18)) {
				if (((swordOrBow) == (true))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (enchantedBow);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (swordItem);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			} else if (((randomOffHandItem) >= 17)) {
				if (((randomHandItem) == 0)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (axe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 1)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (shovel);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 2)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (pickaxe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((Math.random() > 0.7)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(0, (helmet));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.7)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(1, (chestplate));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.7)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(2, (leggings));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.7)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(3, (boots));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
			} ;
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
			} ;
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8);
			} ;
		} else if ((world.getDifficulty() == Difficulty.HARD)) {
			if ((Math.random() > 0.8)) {
				for (int index12 = 0; index12 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index12++) {
					entity.getPersistentData().putDouble("randomSwordEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 0)) {
						((swordItem)).addEnchantment(Enchantments.SHARPNESS, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 1)) {
						((swordItem)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 2)) {
						((swordItem)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomSwordEnchant")) == 3)) {
						((swordItem)).addEnchantment(Enchantments.FIRE_ASPECT, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					}
				}
			}
			if ((Math.random() > 0.8)) {
				for (int index13 = 0; index13 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index13++) {
					entity.getPersistentData().putDouble("randomBowEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 0)) {
						((enchantedBow)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 1)) {
						((enchantedBow)).addEnchantment(Enchantments.POWER, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 2)) {
						if ((Math.random() > 0.5)) {
							((enchantedBow)).addEnchantment(Enchantments.FLAME, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						} else {
							((enchantedBow)).addEnchantment(Enchantments.PUNCH, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						}
					} else if (((entity.getPersistentData().getDouble("randomBowEnchant")) == 3)) {
						((enchantedBow)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					}
				}
			}
			if ((Math.random() > 0.8)) {
				for (int index14 = 0; index14 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index14++) {
					entity.getPersistentData().putDouble("randomAxeEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 0)) {
						((axe)).addEnchantment(Enchantments.SHARPNESS, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 1)) {
						((axe)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 2)) {
						((axe)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomAxeEnchant")) == 3)) {
						((axe)).addEnchantment(Enchantments.EFFICIENCY, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					}
				}
			}
			if ((Math.random() > 0.8)) {
				for (int index15 = 0; index15 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index15++) {
					entity.getPersistentData().putDouble("randomShovelEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 0)) {
						if ((Math.random() > 0.5)) {
							((shovel)).addEnchantment(Enchantments.SILK_TOUCH, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						} else {
							((shovel)).addEnchantment(Enchantments.FORTUNE, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						}
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 1)) {
						((shovel)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 2)) {
						((shovel)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomShovelEnchant")) == 3)) {
						((shovel)).addEnchantment(Enchantments.EFFICIENCY, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					}
				}
			}
			if ((Math.random() > 0.8)) {
				for (int index16 = 0; index16 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index16++) {
					entity.getPersistentData().putDouble("randomPickaxeEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 0)) {
						if ((Math.random() > 0.5)) {
							((pickaxe)).addEnchantment(Enchantments.SILK_TOUCH, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						} else {
							((pickaxe)).addEnchantment(Enchantments.FORTUNE, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						}
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 1)) {
						((pickaxe)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 2)) {
						((pickaxe)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomPickaxeEnchant")) == 3)) {
						((pickaxe)).addEnchantment(Enchantments.EFFICIENCY, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					}
				}
			}
			if ((Math.random() > 0.8)) {
				for (int index17 = 0; index17 < (int) ((1 + ((new java.util.Random()).nextInt((int) 1 + 1)))); index17++) {
					entity.getPersistentData().putDouble("randomArmourEnchant", ((new java.util.Random()).nextInt((int) 3 + 1)));
					if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 0)) {
						((helmet)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((chestplate)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((leggings)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((boots)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 1)) {
						((helmet)).addEnchantment(Enchantments.PROTECTION, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((chestplate)).addEnchantment(Enchantments.PROTECTION, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((leggings)).addEnchantment(Enchantments.PROTECTION, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((boots)).addEnchantment(Enchantments.PROTECTION, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 2)) {
						((helmet)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((chestplate)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((leggings)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((boots)).addEnchantment(Enchantments.MENDING, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					} else if (((entity.getPersistentData().getDouble("randomArmourEnchant")) == 3)) {
						((helmet)).addEnchantment(Enchantments.RESPIRATION, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((chestplate)).addEnchantment(Enchantments.THORNS, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((leggings)).addEnchantment(Enchantments.THORNS, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
						((boots)).addEnchantment(Enchantments.DEPTH_STRIDER, (int) (1 + ((new java.util.Random()).nextInt((int) 1 + 1))));
					}
				}
			}
			if (((randomHandItem) >= 12)) {
				if (((swordOrBow) == (true))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (enchantedBow);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (swordItem);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			} else if (((randomHandItem) >= 4)) {
				if (((randomHandItem) == 0)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (axe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 1)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (shovel);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 2)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (pickaxe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if (((randomOffHandItem) >= 18)) {
				if (((swordOrBow) == (true))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (enchantedBow);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (swordItem);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			} else if (((randomOffHandItem) >= 16)) {
				if (((randomHandItem) == 0)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (axe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 1)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (shovel);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else if (((randomHandItem) == 2)) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (pickaxe);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((Math.random() > 0.68)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(0, (helmet));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.68)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(1, (chestplate));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.68)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(2, (leggings));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if ((Math.random() > 0.68)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).inventory.armorInventory.set(3, (boots));
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				/* @ItemStack */}
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(55);
			} ;
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10);
			} ;
			if (entity instanceof LivingEntity) {
				LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
				livingEntity.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(2);
			} ;
		}
	}
}
