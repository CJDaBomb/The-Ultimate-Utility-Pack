
package net.mcreator.moreoresandarmour.itemgroup;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtlityDecorItemGroup extends MoreOresAndArmourModElements.ModElement {

	public UltimateUtlityDecorItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 458);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabultimate_utlity_decor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
