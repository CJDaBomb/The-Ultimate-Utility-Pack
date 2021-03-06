
package net.mcreator.moreoresandarmour.item;

@MoreOresAndArmourModElements.ModElement.Tag
public class ShadowPickaxeItem extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:shadow_pickaxe")
	public static final Item block = null;

	public ShadowPickaxeItem(MoreOresAndArmourModElements instance) {
		super(instance, 510);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 2.3f;
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
		}, 1, -2.7999999999999998f, new Item.Properties().group(UltimateUtilityToolsItemGroup.tab)) {

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState bl, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();

					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);

					ShadowPickaxeBlockDestroyedWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

		}.setRegistryName("shadow_pickaxe"));
	}

}
