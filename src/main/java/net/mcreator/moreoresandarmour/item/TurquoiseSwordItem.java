
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class TurquoiseSwordItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:turquoise_sword")
	public static final Item block = null;

	public TurquoiseSwordItem(MoreOresAndArmourModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2800;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 8.5f;
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
		}, 3, -2.4f, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {

		}.setRegistryName("turquoise_sword"));
	}

}
