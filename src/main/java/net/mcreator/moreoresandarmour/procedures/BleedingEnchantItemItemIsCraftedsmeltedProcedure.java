package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class BleedingEnchantItemItemIsCraftedsmeltedProcedure extends MoreOresAndArmourModElements.ModElement {

	public BleedingEnchantItemItemIsCraftedsmeltedProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 306);

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
