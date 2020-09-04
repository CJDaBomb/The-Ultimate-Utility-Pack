package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.moreoresandarmour.potion.WitherPotionPotion;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class LapisAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {
	public LapisAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 499);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LapisAppleFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LapisAppleFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LapisAppleFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LapisAppleFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LapisAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack item = ItemStack.EMPTY;
		double randomItem = 0;
		double randomEnchant = 0;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(WitherPotionPotion.potion, (int) 60, (int) 1));
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
			randomItem = (double) ((new java.util.Random()).nextInt((int) 20 + 1));
			if (((randomItem) >= 3)) {
				item = new ItemStack(Items.LAPIS_LAZULI, (int) (1));
				((item)).setCount((int) (10 + ((new java.util.Random()).nextInt((int) 20 + 1))));
			} else if (((randomItem) >= 0)) {
				item = new ItemStack(Items.ENCHANTED_BOOK, (int) (1));
				randomEnchant = (double) ((new java.util.Random()).nextInt((int) 8 + 1));
				if (((randomItem) == 0)) {
					((item)).addEnchantment(Enchantments.MENDING, (int) 1);
				} else if (((randomItem) == 1)) {
					((item)).addEnchantment(Enchantments.UNBREAKING, (int) (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
				} else if (((randomItem) == 2)) {
					((item)).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
				} else if (((randomItem) == 3)) {
					((item)).addEnchantment(Enchantments.FORTUNE, (int) (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
				} else if (((randomItem) == 4)) {
					((item)).addEnchantment(Enchantments.EFFICIENCY, (int) (1 + ((new java.util.Random()).nextInt((int) 4 + 1))));
				} else if (((randomItem) == 5)) {
					((item)).addEnchantment(Enchantments.SHARPNESS, (int) (1 + ((new java.util.Random()).nextInt((int) 4 + 1))));
				} else if (((randomItem) == 6)) {
					((item)).addEnchantment(Enchantments.PROTECTION, (int) (1 + ((new java.util.Random()).nextInt((int) 3 + 1))));
				} else if (((randomItem) == 7)) {
					((item)).addEnchantment(Enchantments.LOOTING, (int) (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
				} else if (((randomItem) == 8)) {
					((item)).addEnchantment(Enchantments.POWER, (int) (1 + ((new java.util.Random()).nextInt((int) 4 + 1))));
				}
			}
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, (item));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
