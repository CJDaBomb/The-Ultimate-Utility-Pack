package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class EnchantedTotemRightClickedInAirProcedure extends MoreOresAndArmourModElements.ModElement {
	public EnchantedTotemRightClickedInAirProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 503);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EnchantedTotemRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Minecraft.getInstance().gameRenderer.displayItemActivation(
				/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY));
	}
}
