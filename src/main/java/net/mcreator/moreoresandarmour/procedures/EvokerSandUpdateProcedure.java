package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class EvokerSandUpdateProcedure extends MoreOresAndArmourModElements.ModElement {
	public EvokerSandUpdateProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 340);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EvokerSandUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EvokerSandUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EvokerSandUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EvokerSandUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EvokerSandUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getDouble("evokerTimer")) >= 6000)) {
			if (!world.getWorld().isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("spawnMob3", Math.random());
				world.getWorld().notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "spawnMob3")) >= 0.9999999999999999)) {
				if (world instanceof World && !world.getWorld().isRemote) {
					Entity entityToSpawn = new EvokerEntity(EntityType.EVOKER, world.getWorld());
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn(world, world.getDifficultyForLocation(new BlockPos(entityToSpawn)),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		} else {
			entity.getPersistentData().putDouble("evokerTimer", ((entity.getPersistentData().getDouble("evokerTimer")) + 1));
		}
	}
}
