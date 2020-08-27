
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class AlexandriteCrystalItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:alexandrite_crystal")
	public static final Item block = null;

	public AlexandriteCrystalItem(MoreOresAndArmourModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(CustomOreModItemGroup.tab).maxStackSize(64));
			setRegistryName("alexandrite_crystal");
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
