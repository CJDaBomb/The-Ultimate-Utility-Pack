package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class ElectricArrowLivingEntityIsHitWithItemProcedure extends MoreOresAndArmourModElements.ModElement {
	public ElectricArrowLivingEntityIsHitWithItemProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 74);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ElectricArrowLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean Hi = false;
		double Yo = 0;
		entity.getPersistentData().putDouble("electricArrowRandomEvent", (Math.random() * 2));
		if (((entity.getPersistentData().getDouble("electricArrowRandomEvent")) == 0)) {
			if (world instanceof ServerWorld)
				((ServerWorld) world).addLightningBolt(new LightningBoltEntity(world.getWorld(), (int) x, (int) y, (int) z, false));
		}
	}
}
