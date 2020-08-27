package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.common.MinecraftForge;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChorusSaladFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {
	public ChorusSaladFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 111);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ChorusSaladFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ChorusSaladFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ChorusSaladFoodEaten!");
			return;
  		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ChorusSaladFoodEaten!");
			return;
		}
	}
}	