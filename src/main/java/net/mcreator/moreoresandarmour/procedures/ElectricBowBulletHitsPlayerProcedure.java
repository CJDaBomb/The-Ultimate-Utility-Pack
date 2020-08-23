package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class ElectricBowBulletHitsPlayerProcedure extends MoreOresAndArmourModElements.ModElement {
	public ElectricBowBulletHitsPlayerProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 312);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ElectricBowBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ElectricBowBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ElectricBowBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ElectricBowBulletHitsPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.getWorld().isRemote) {
			Entity entityToSpawn = new TNTEntity(EntityType.TNT, world.getWorld());
			entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (!world.getWorld().isRemote) {
			world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit_player")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			world.getWorld().playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit_player")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
