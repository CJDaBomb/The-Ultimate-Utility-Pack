
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.itemgroup.CustomOreModItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class IronRodItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:iron_rod")
	public static final Item block = null;
	public IronRodItem(MoreOresAndArmourModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CustomOreModItemGroup.tab).maxStackSize(64));
			setRegistryName("iron_rod");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
