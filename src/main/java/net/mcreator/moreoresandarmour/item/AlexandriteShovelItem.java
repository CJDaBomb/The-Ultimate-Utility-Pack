
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreoresandarmour.itemgroup.UltimateUtilityToolsItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class AlexandriteShovelItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:alexandrite_shovel")
	public static final Item block = null;
	public AlexandriteShovelItem(MoreOresAndArmourModElements instance) {
		super(instance, 195);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3400;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 33;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlexandriteItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {
		}.setRegistryName("alexandrite_shovel"));
	}
}
