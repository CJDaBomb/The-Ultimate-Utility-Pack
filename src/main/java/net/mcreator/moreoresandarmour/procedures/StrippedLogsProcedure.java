package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.ItemStack;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.block.StrippedNightmareLogBlock;
import net.mcreator.moreoresandarmour.block.StrippedLemonLogBlock;
import net.mcreator.moreoresandarmour.block.StrippedGrapeLogBlock;
import net.mcreator.moreoresandarmour.block.StrippedCherryLogBlock;
import net.mcreator.moreoresandarmour.block.StrippedBluestoneLogBlock;
import net.mcreator.moreoresandarmour.block.StrippedBlueberryLogBlock;
import net.mcreator.moreoresandarmour.block.NightmareLogBlock;
import net.mcreator.moreoresandarmour.block.LemonLogBlock;
import net.mcreator.moreoresandarmour.block.GrapeLogBlock;
import net.mcreator.moreoresandarmour.block.CherryLogBlock;
import net.mcreator.moreoresandarmour.block.BluestoneLogBlock;
import net.mcreator.moreoresandarmour.block.BlueberryLogBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@MoreOresAndArmourModElements.ModElement.Tag
public class StrippedLogsProcedure extends MoreOresAndArmourModElements.ModElement {
	public StrippedLogsProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 467);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StrippedLogs!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure StrippedLogs!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure StrippedLogs!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure StrippedLogs!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure StrippedLogs!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BluestoneLogBlock.block.getDefaultState().getBlock())) {
			if ((/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof AxeItem)) {
				if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedBluestoneLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedBluestoneLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedBluestoneLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
					} catch (Exception e) {
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == NightmareLogBlock.block.getDefaultState()
				.getBlock())) {
			if ((/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof AxeItem)) {
				if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedNightmareLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedNightmareLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedNightmareLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
					} catch (Exception e) {
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CherryLogBlock.block.getDefaultState().getBlock())) {
			if ((/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof AxeItem)) {
				if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedCherryLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedCherryLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedCherryLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
					} catch (Exception e) {
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == LemonLogBlock.block.getDefaultState().getBlock())) {
			if ((/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof AxeItem)) {
				if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedLemonLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedLemonLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedLemonLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
					} catch (Exception e) {
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlueberryLogBlock.block.getDefaultState()
				.getBlock())) {
			if ((/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof AxeItem)) {
				if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedBlueberryLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedBlueberryLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedBlueberryLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
					} catch (Exception e) {
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == GrapeLogBlock.block.getDefaultState().getBlock())) {
			if ((/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof AxeItem)) {
				if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedGrapeLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.NORTH), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedGrapeLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.WEST), 3);
					} catch (Exception e) {
					}
				} else if ((((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP) || ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), StrippedGrapeLogBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), Direction.UP), 3);
					} catch (Exception e) {
					}
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if ((new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayerEntity) {
							return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
						} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
							NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
									.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
							return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
				}
			}
		} else {
			return;
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		PlayerEntity entity = event.getPlayer();
		if (event.getHand() != entity.getActiveHand())
			return;
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
