
package net.mcreator.moreoresandarmour.itemgroup;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtilityToolsItemGroup extends MoreOresAndArmourModElements.ModElement {

	public UltimateUtilityToolsItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 447);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabultimate_utility_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyPickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
