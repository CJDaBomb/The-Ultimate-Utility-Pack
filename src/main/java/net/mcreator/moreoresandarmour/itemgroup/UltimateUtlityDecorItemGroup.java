
package net.mcreator.moreoresandarmour.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreoresandarmour.block.RubyBlockBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtlityDecorItemGroup extends MoreOresAndArmourModElements.ModElement {
	public UltimateUtlityDecorItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 449);
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
