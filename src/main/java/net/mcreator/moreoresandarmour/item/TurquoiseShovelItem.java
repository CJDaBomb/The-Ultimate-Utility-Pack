
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
public class TurquoiseShovelItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:turquoise_shovel")
	public static final Item block = null;
	public TurquoiseShovelItem(MoreOresAndArmourModElements instance) {
		super(instance, 209);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2800;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 29;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TurquoiseItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {
		}.setRegistryName("turquoise_shovel"));
	}
}
