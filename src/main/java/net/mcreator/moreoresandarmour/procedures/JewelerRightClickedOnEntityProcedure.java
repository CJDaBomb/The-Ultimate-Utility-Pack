package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.gui.JewelerGuiGui;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

import io.netty.buffer.Unpooled;

@MoreOresAndArmourModElements.ModElement.Tag
public class JewelerRightClickedOnEntityProcedure extends MoreOresAndArmourModElements.ModElement {
	public JewelerRightClickedOnEntityProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 331);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JewelerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure JewelerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure JewelerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JewelerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure JewelerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JewelerRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		sourceentity.getPersistentData().putDouble("playerTradeCount1", (entity.getPersistentData().getDouble("tradeCount1")));
		sourceentity.getPersistentData().putDouble("playerTradeCount2", (entity.getPersistentData().getDouble("tradeCount2")));
		sourceentity.getPersistentData().putDouble("playerTradeCount3", (entity.getPersistentData().getDouble("tradeCount3")));
		sourceentity.getPersistentData().putDouble("playerTradeCount4", (entity.getPersistentData().getDouble("tradeCount4")));
		sourceentity.getPersistentData().putDouble("playerTradeCount5", (entity.getPersistentData().getDouble("tradeCount5")));
		sourceentity.getPersistentData().putDouble("playerTradeCount6", (entity.getPersistentData().getDouble("tradeCount6")));
		sourceentity.getPersistentData().putDouble("playerTradeItem1", (entity.getPersistentData().getDouble("tradeItem1")));
		sourceentity.getPersistentData().putDouble("playerTradeItem2", (entity.getPersistentData().getDouble("tradeItem2")));
		sourceentity.getPersistentData().putDouble("playerTradeItem3", (entity.getPersistentData().getDouble("tradeItem3")));
		sourceentity.getPersistentData().putDouble("playerTradeItem4", (entity.getPersistentData().getDouble("tradeItem4")));
		sourceentity.getPersistentData().putDouble("playerTradeItem5", (entity.getPersistentData().getDouble("tradeItem5")));
		sourceentity.getPersistentData().putDouble("playerTradeItem6", (entity.getPersistentData().getDouble("tradeItem6")));
		sourceentity.getPersistentData().putDouble("playerTradesPage", 1);
		{
			Entity _ent = sourceentity;
			if (_ent instanceof ServerPlayerEntity) {
				BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
				NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
					@Override
					public ITextComponent getDisplayName() {
						return new StringTextComponent("JewelerGui");
					}

					@Override
					public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
						return new JewelerGuiGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
