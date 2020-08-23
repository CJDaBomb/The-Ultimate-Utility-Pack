
package net.mcreator.moreoresandarmour.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreoresandarmour.block.RubyoreBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class UltimateUtilityBuildingBlocksItemGroup extends MoreOresAndArmourModElements.ModElement {
	public UltimateUtilityBuildingBlocksItemGroup(MoreOresAndArmourModElements instance) {
		super(instance, 451);
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
