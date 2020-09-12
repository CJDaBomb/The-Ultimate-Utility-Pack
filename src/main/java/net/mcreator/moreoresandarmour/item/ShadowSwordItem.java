
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreoresandarmour.itemgroup.UltimateUtilityCombatItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowSwordItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:shadow_sword")
	public static final Item block = null;
	public ShadowSwordItem(MoreOresAndArmourModElements instance) {
		super(instance, 510);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 13.4f;
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
		}, 3, -2.2999999999999998f, new Item.Properties().group(UltimateUtilityCombatItemGroup.tab)) {
		}.setRegistryName("shadow_sword"));
	}
}
