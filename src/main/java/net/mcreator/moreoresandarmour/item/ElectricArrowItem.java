
package net.mcreator.moreoresandarmour.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.moreoresandarmour.procedures.ElectricArrowLivingEntityIsHitWithItemProcedure;
import net.mcreator.moreoresandarmour.itemgroup.CustomOreModItemGroup;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

@MoreOresAndArmourModElements.ModElement.Tag
public class ElectricArrowItem extends MoreOresAndArmourModElements.ModElement {
	@ObjectHolder("more_ores_and_armour:electric_arrow")
	public static final Item block = null;
	public ElectricArrowItem(MoreOresAndArmourModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CustomOreModItemGroup.tab).maxStackSize(64));
			setRegistryName("electric_arrow");
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

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ElectricArrowLivingEntityIsHitWithItemProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
