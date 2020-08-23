package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.util.Direction;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.Collections;

@MoreOresAndArmourModElements.ModElement.Tag
public class AlexandriteSwordLivingEntityIsHitWithToolProcedure extends MoreOresAndArmourModElements.ModElement {
	public AlexandriteSwordLivingEntityIsHitWithToolProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 313);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AlexandriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AlexandriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AlexandriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AlexandriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(x, y, 6);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, 6, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
		}
		if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(6, y, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(6, y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
		}
		if (((entity.getHorizontalFacing()) == Direction.WEST)) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(x, y, 6);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, 6, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
		}
		if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(6, y, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(6, y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
		}
	}
}
