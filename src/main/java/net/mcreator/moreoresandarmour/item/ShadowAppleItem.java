
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowAppleItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:shadow_apple")
	public static final Item block = null;

	public ShadowAppleItem(MoreOresAndArmourModElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(UltimateUtilityFoodItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(10).saturation(3.9999999999999996f).setAlwaysEdible()

							.build()));
			setRegistryName("shadow_apple");
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

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				ShadowAppleFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

	}

}
