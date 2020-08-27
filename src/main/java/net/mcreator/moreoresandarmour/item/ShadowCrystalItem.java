
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowCrystalItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:shadow_crystal")
	public static final Item block = null;

	public ShadowCrystalItem(MoreOresAndArmourModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(CustomOreModItemGroup.tab).maxStackSize(64));
			setRegistryName("shadow_crystal");
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
