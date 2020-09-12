
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class AluminumAxeItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:aluminum_axe")
	public static final Item block = null;

	public AluminumAxeItem(MoreOresAndArmourModElements instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AluminumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {

		}.setRegistryName("aluminum_axe"));
	}

}
