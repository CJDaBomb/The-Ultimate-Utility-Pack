
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class TurquoisePickaxeItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:turquoise_pickaxe")
	public static final Item block = null;

	public TurquoisePickaxeItem(MoreOresAndArmourModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2800;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 29;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TurquoiseItem.block, (int) (1)));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {

		}.setRegistryName("turquoise_pickaxe"));
	}

}
