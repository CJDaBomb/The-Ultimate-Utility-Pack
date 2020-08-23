
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class CarbonAppleItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:carbon_apple")
	public static final Item block = null;

	public CarbonAppleItem(MoreOresAndArmourModElements instance) {
		super(instance, 198);
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
			setRegistryName("carbon_apple");
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
