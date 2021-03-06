
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class EnchantedTotemItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:enchanted_totem")
	public static final Item block = null;

	public EnchantedTotemItem(MoreOresAndArmourModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(UltimateUtilityFoodItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(20).saturation(0.3f).setAlwaysEdible()

							.build()));
			setRegistryName("enchanted_totem");
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

				EnchantedTotemFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

	}

}
