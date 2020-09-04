package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.item.BleedingEnchantItemItem;
import net.mcreator.moreoresandarmour.enchantment.BleedingEnchantEnchantment;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingEnchantItemItemIsCraftedsmeltedProcedure extends MoreOresAndArmourModElements.ModElement {
	public BleedingEnchantItemItemIsCraftedsmeltedProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 456);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BleedingEnchantItemItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack enchant = ItemStack.EMPTY;
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory
					.clearMatchingItems(p -> new ItemStack(BleedingEnchantItemItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		enchant = new ItemStack(Items.ENCHANTED_BOOK, (int) (1));
		((enchant)).addEnchantment(BleedingEnchantEnchantment.enchantment, (int) (1 + ((new java.util.Random()).nextInt((int) 2 + 1))));
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = (enchant);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
