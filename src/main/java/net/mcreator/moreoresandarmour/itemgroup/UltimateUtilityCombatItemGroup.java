
package net.mcreator.moreoresandarmour.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreoresandarmour.item.RubySwordItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtilityCombatItemGroup extends MoreOresAndArmourModElements.ModElement {
	public UltimateUtilityCombatItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 462);
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
