
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class AlexandriteAxeItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:alexandrite_axe")
	public static final Item block = null;

	public AlexandriteAxeItem(MoreOresAndArmourModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3400;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 1, -3f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {

		}.setRegistryName("alexandrite_axe"));
	}

}
