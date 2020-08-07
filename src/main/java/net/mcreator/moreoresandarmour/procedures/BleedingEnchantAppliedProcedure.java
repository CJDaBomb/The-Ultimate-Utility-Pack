package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.moreoresandarmour.potion.BleedingPotion;
import net.mcreator.moreoresandarmour.enchantment.BleedingEnchantEnchantment;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingEnchantAppliedProcedure extends MoreOresAndArmourModElements.ModElement {
	public BleedingEnchantAppliedProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 307);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BleedingEnchantApplied!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure BleedingEnchantApplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((EnchantmentHelper.getEnchantmentLevel(BleedingEnchantEnchantment.enchantment,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			sourceentity.getPersistentData().putDouble("bleedingEffectRandomChance", Math.round((Math.random() * 4)));
			if (((sourceentity.getPersistentData().getDouble("bleedingEffectRandomChance")) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(BleedingPotion.potion, (int) 60, (int) 1));
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(BleedingEnchantEnchantment.enchantment,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
			sourceentity.getPersistentData().putDouble("bleedingEffectRandomChance", Math.round((Math.random() * 3)));
			if (((sourceentity.getPersistentData().getDouble("bleedingEffectRandomChance")) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(BleedingPotion.potion, (int) 60, (int) 1));
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(BleedingEnchantEnchantment.enchantment,
				((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
			sourceentity.getPersistentData().putDouble("bleedingEffectRandomChance", Math.round((Math.random() * 2)));
			if (((sourceentity.getPersistentData().getDouble("bleedingEffectRandomChance")) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(BleedingPotion.potion, (int) 60, (int) 1));
			}
		}
	}

	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			Entity sourceentity = event.getSource().getTrueSource();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			double amount = event.getAmount();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("amount", amount);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
