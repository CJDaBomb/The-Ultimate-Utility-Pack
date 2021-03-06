
package net.mcreator.moreoresandarmour.itemgroup;

@MoreOresAndArmourModElements.ModElement.Tag
public class CustomOreModItemGroup extends MoreOresAndArmourModElements.ModElement {

	public CustomOreModItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcustom_ore_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
