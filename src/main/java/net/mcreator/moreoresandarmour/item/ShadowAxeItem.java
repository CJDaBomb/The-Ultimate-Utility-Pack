
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.moreoresandarmour.itemgroup.UltimateUtilityToolsItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowAxeItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:shadow_axe")
	public static final Item block = null;
	public ShadowAxeItem(MoreOresAndArmourModElements instance) {
		super(instance, 510);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6000;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 11.2f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 52;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ShadowIngotItem.block, (int) (1)));
			}
		}, 1, -2.2f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {
		}.setRegistryName("shadow_axe"));
	}
}
