package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.BooleanProperty;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class BatteryClientDisplayRandomTickProcedure extends MoreOresAndArmourModElements.ModElement {
	public BatteryClientDisplayRandomTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 477);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BatteryClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BatteryClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BatteryClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BatteryClientDisplayRandomTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "batteryTicks")) > 0)) {
			try {
				BlockState _state = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
						_state.with((BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered"), (true)), 3);
			} catch (Exception e) {
			}
			if (!world.getWorld().isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("batteryTicks", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "batteryTicks")) - 1));
				world.getWorld().notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			try {
				BlockState _state = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
						_state.with((IntegerProperty) _state.getBlock().getStateContainer().getProperty("age"), ((new Object() {
							public int getValue(BlockPos pos) {
								try {
									BlockState _state = world.getBlockState(pos);
									IntegerProperty property = (IntegerProperty) _state.getBlock().getStateContainer().getProperty("age");
									return _state.get(property);
								} catch (Exception e) {
									return -1;
								}
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z))) + 1)), 3);
			} catch (Exception e) {
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
			}
		}
	}
}
