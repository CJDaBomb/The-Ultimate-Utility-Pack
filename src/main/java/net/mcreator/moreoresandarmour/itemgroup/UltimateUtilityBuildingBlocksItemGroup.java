
package net.mcreator.moreoresandarmour.itemgroup;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtilityBuildingBlocksItemGroup extends MoreOresAndArmourModElements.ModElement {

	public UltimateUtilityBuildingBlocksItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 461);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabultimate_utility_building_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyoreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
