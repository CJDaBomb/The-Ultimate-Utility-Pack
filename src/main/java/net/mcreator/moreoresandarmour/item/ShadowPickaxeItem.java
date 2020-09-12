
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowPickaxeItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:shadow_pickaxe")
	public static final Item block = null;

	public ShadowPickaxeItem(MoreOresAndArmourModElements instance) {
		super(instance, 510);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 2.3f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 52;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowIngotItem.block, (int) (1)));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {

		}.setRegistryName("shadow_pickaxe"));
	}

}
