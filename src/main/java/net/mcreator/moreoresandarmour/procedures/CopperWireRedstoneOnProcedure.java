package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.block.CopperWireBlock;
import net.mcreator.moreoresandarmour.block.BatteryBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class CopperWireRedstoneOnProcedure extends MoreOresAndArmourModElements.ModElement {
	public CopperWireRedstoneOnProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 479);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CopperWireRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CopperWireRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CopperWireRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CopperWireRedstoneOn!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CopperWireBlock.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BatteryBlock.block.getDefaultState()
						.getBlock()))
				&& ((new Object() {
					public boolean getValue(BlockPos pos) {
						try {
							BlockState _state = world.getBlockState(pos);
							BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
							return _state.get(property);
						} catch (Exception e) {
							return false;
						}
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true)))
				|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == CopperWireBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BatteryBlock.block.getDefaultState()
								.getBlock()))
						&& ((new Object() {
							public boolean getValue(BlockPos pos) {
								try {
									BlockState _state = world.getBlockState(pos);
									BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
									return _state.get(property);
								} catch (Exception e) {
									return false;
								}
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true))))
				|| (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == CopperWireBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BatteryBlock.block.getDefaultState()
								.getBlock()))
						&& ((new Object() {
							public boolean getValue(BlockPos pos) {
								try {
									BlockState _state = world.getBlockState(pos);
									BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
									return _state.get(property);
								} catch (Exception e) {
									return false;
								}
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true)))
						|| ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == CopperWireBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BatteryBlock.block
										.getDefaultState().getBlock()))
								&& ((new Object() {
									public boolean getValue(BlockPos pos) {
										try {
											BlockState _state = world.getBlockState(pos);
											BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
											return _state.get(property);
										} catch (Exception e) {
											return false;
										}
									}
								}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true)))))
				|| (((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == CopperWireBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BatteryBlock.block.getDefaultState()
								.getBlock()))
						&& ((new Object() {
							public boolean getValue(BlockPos pos) {
								try {
									BlockState _state = world.getBlockState(pos);
									BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
									return _state.get(property);
								} catch (Exception e) {
									return false;
								}
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true)))
						|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == CopperWireBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BatteryBlock.block
										.getDefaultState().getBlock()))
								&& ((new Object() {
									public boolean getValue(BlockPos pos) {
										try {
											BlockState _state = world.getBlockState(pos);
											BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
											return _state.get(property);
										} catch (Exception e) {
											return false;
										}
									}
								}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true)))))) {
			try {
				BlockState _state = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
						_state.with((BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered"), (true)), 3);
			} catch (Exception e) {
			}
		}
		if (((new Object() {
			public boolean getValue(BlockPos pos) {
				try {
					BlockState _state = world.getBlockState(pos);
					BooleanProperty property = (BooleanProperty) _state.getBlock().getStateContainer().getProperty("powered");
					return _state.get(property);
				} catch (Exception e) {
					return false;
				}
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z))) == (true))) {
			if (!world.getWorld().isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putBoolean("copperWireIsPowered", (true));
				world.getWorld().notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
			}
		}
	}
}
