
package net.mcreator.moreoresandarmour.itemgroup;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtilityCombatItemGroup extends MoreOresAndArmourModElements.ModElement {

	public UltimateUtilityCombatItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 448);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabultimate_utility_combat") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubySwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
