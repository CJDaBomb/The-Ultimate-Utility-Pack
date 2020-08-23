package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.moreoresandarmour.item.SapphireItem;
import net.mcreator.moreoresandarmour.item.RubyAppleItem;
import net.mcreator.moreoresandarmour.item.EnchantedTotemItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class LootCreeperThisEntityKillsAnotherOneProcedure extends MoreOresAndArmourModElements.ModElement {
	public LootCreeperThisEntityKillsAnotherOneProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 243);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LootCreeperThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LootCreeperThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LootCreeperThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LootCreeperThisEntityKillsAnotherOne!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Hi = 0;
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CHEST.getDefaultState(), 3);
		for (int index0 = 0; index0 < (int) (Math.round((Math.random() * 2))); index0++) {
			Hi = (double) Math.round((Math.random() * 5));
			if (((Hi) == 0)) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final ItemStack _setstack = new ItemStack(Blocks.SPAWNER, (int) (1));
						_setstack.setCount((int) Math.round((Math.random() * 2)));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (((Hi) == 1)) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (1);
						final ItemStack _setstack = new ItemStack(EnchantedTotemItem.block, (int) (1));
						_setstack.setCount((int) Math.round((Math.random() * 2)));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (((Hi) == 2)) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (2);
						final ItemStack _setstack = new ItemStack(SapphireItem.block, (int) (1));
						_setstack.setCount((int) (Math.round((Math.random() * 3)) + 2));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (((Hi) == 3)) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (3);
						final ItemStack _setstack = new ItemStack(RubyAppleItem.block, (int) (1));
						_setstack.setCount((int) Math.round((Math.random() * 2)));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (((Hi) == 5)) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (4);
						final ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE, (int) (1));
						_setstack.setCount((int) (Math.round((Math.random() * 30)) + 10));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (((Hi) == 5)) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = (int) (5);
						final ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1));
						_setstack.setCount((int) Math.round((Math.random() * 2)));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
		}
	}
}
