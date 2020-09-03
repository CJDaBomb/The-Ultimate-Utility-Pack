package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModVariables;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilBarrelOnUpdateTickProcedure extends MoreOresAndArmourModElements.ModElement {
	public OilBarrelOnUpdateTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 481);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OilBarrelOnUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OilBarrelOnUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OilBarrelOnUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OilBarrelOnUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		MoreOresAndArmourModVariables.MapVariables
				.get(world).oilBarrelTicks = (double) ((MoreOresAndArmourModVariables.MapVariables.get(world).oilBarrelTicks) + 1);
		MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
		if (!world.getWorld().isRemote) {
			world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			world.getWorld().playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (((MoreOresAndArmourModVariables.MapVariables.get(world).oilBarrelTicks) == 100)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().createExplosion(null, (int) x, (int) y, (int) z, (float) (4 + ((new java.util.Random()).nextInt((int) 2 + 1))),
						Explosion.Mode.BREAK);
			}
			MoreOresAndArmourModVariables.MapVariables.get(world).oilBarrelTicks = (double) 0;
			MoreOresAndArmourModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
