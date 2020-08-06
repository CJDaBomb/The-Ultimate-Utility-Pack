package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.effect.LightningBoltEntity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class ElectricArrowLivingEntityIsHitWithItemProcedure extends MoreOresAndArmourModElements.ModElement {
	public ElectricArrowLivingEntityIsHitWithItemProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 74);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean Hi = false;
		double Yo = 0;
		Yo = (double) (Math.random() * 2);
		if (((Yo) == 0)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, (int) 5, 3, 3, 3, 1);
			}
		} else if (((Yo) == 1)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.BREAK);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, (int) 5, 3, 3, 3, 1);
			}
		} else if (((Yo) == 2)) {
			if (world instanceof ServerWorld)
				((ServerWorld) world).addLightningBolt(new LightningBoltEntity(world.getWorld(), (int) x, (int) y, (int) z, false));
		}
		if (!world.getWorld().isRemote) {
			world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			world.getWorld().playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
