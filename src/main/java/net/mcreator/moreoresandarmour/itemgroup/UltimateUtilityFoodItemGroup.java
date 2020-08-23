
package net.mcreator.moreoresandarmour.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreoresandarmour.item.RubyAppleItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtilityFoodItemGroup extends MoreOresAndArmourModElements.ModElement {
	public UltimateUtilityFoodItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 450);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabultimate_utility_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyAppleItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
