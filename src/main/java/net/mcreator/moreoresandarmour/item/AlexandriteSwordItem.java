
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class AlexandriteSwordItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:alexandrite_sword")
	public static final Item block = null;

	public AlexandriteSwordItem(MoreOresAndArmourModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3400;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 33;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlexandriteItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

		}.setRegistryName("alexandrite_sword"));
	}

}
