
package net.mcreator.moreoresandarmour.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreoresandarmour.item.RubyItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class CustomOreModItemGroup extends MoreOresAndArmourModElements.ModElement {
	public CustomOreModItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 213);
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
