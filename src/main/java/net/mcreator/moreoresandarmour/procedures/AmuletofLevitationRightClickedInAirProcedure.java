package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.moreoresandarmour.item.AmuletofLevitationItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class AmuletofLevitationRightClickedInAirProcedure extends MoreOresAndArmourModElements.ModElement {
	public AmuletofLevitationRightClickedInAirProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 283);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmuletofLevitationRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AmuletofLevitationRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AmuletofLevitationRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AmuletofLevitationRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AmuletofLevitationRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
							world.getWorld().getServer(), null).withFeedbackDisabled(),
					"setblock ~ ~ ~ minecraft:chest{LootTable:\"more_ores_and_armour:lol\"}");
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 1200, (int) 1, (true), (true)));
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
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> new ItemStack(AmuletofLevitationItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		}
	}
}
