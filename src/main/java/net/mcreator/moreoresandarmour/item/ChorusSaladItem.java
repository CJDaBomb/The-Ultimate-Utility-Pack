
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;

import net.mcreator.moreoresandarmour.itemgroup.UltimateUtilityFoodItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChorusSaladItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:chorus_salad")
	public static final Item block = null;
	public ChorusSaladItem(MoreOresAndArmourModElements instance) {
		super(instance, 193);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(UltimateUtilityFoodItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(6).saturation(2.8000000000000003f).build()));
			setRegistryName("chorus_salad");
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
		public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
			ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
			if (!worldIn.isRemote) {
				double d0 = entityLiving.getPosX();
				double d1 = entityLiving.getPosY();
				double d2 = entityLiving.getPosZ();
				for (int i = 0; i < 16; ++i) {
					double d3 = entityLiving.getPosX() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
					double d4 = MathHelper.clamp(entityLiving.getPosY() + (double) (entityLiving.getRNG().nextInt(16) - 8), 0.0D,
							(double) (worldIn.getActualHeight() - 1));
					double d5 = entityLiving.getPosZ() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
					if (entityLiving.isPassenger()) {
						entityLiving.stopRiding();
					}
					if (entityLiving.attemptTeleport(d3, d4, d5, true)) {
						worldIn.playSound((PlayerEntity) null, d0, d1, d2, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
						entityLiving.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
						break;
					}
				}
				if (entityLiving instanceof PlayerEntity) {
					((PlayerEntity) entityLiving).getCooldownTracker().setCooldown(this, 20);
				}
			}
			return itemstack;
		}
	}
}
