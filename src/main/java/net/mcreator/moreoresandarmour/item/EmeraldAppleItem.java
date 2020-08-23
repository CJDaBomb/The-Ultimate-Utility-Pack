
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class EmeraldAppleItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:emerald_apple")
	public static final Item block = null;

	public EmeraldAppleItem(MoreOresAndArmourModElements instance) {
		super(instance, 202);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(UltimateUtilityFoodItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).setAlwaysEdible()

							.build()));
			setRegistryName("emerald_apple");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
