package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModVariables;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class SapphireAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {
	public SapphireAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 500);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SapphireAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3000, (int) ((new java.util.Random()).nextInt((int) 5 + 1))));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 3000, (int) 1));
		entity.getPersistentData().putBoolean("SapphireIncreased", (true));
		{
			double _setval = (double) 0;
			entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.attack = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((((("Enjoy ") + "" + (20))) + "" + (" Seconds of Increased Strength"))),
					(false));
		}
		if (entity instanceof LivingEntity) {
			LivingEntity livingEntity = (LivingEntity) dependencies.get("entity");
			livingEntity.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue((1 + ((new java.util.Random()).nextInt((int) 7 + 1))));
		} ;
	}
}
