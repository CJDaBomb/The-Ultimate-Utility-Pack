/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class MoreOresAndArmourModElements.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser - New... and make sure to make the class
 * outside net.mcreator.moreoresandarmour as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.moreoresandarmour;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.MerchantOffer;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.moreoresandarmour.item.ShadowIngotItem;
import net.mcreator.moreoresandarmour.item.RubyItem;
import net.mcreator.moreoresandarmour.item.GoldenAppleSeedsItem;
import net.mcreator.moreoresandarmour.block.EndRootsBlock;

import javax.annotation.Nullable;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@MoreOresAndArmourModElements.ModElement.Tag
public class WandererTradesAdder extends MoreOresAndArmourModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public WandererTradesAdder(MoreOresAndArmourModElements instance) {
		super(instance, 507);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void wt(WandererTradesEvent e) {
		e.getGenericTrades().add(new AdvancedTrade(new ItemStack(Items.EMERALD), 1, 3, new ItemStack(RubyItem.block), 1, 1, 64, 1, 0.2F));
		e.getGenericTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 1, 6, new ItemStack(Items.GOLDEN_APPLE), 1, 1, 12, 1, 0.2F));
		e.getGenericTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(3) + 5)),
				new ItemStack(Items.ENDER_PEARL, (new Random().nextInt(2) + 2)), 12, 1, 0.2F));
		e.getGenericTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 10, new ItemStack(ShadowIngotItem.block), 1, 1, 8, 1, 0.2F));
		e.getGenericTrades().add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(GoldenAppleSeedsItem.block, 1), 12, 1, 0.2F));
		e.getGenericTrades().add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(EndRootsBlock.block, 1), 12, 1, 0.2F));
		e.getRareTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 40, new ItemStack(Items.ENCHANTED_BOOK, 1), 1, 1, 5, 15, 0.2F)
				.randomizeEnchantment(1)); // 1
		e.getRareTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 10, 30, new ItemStack(Items.DIAMOND_PICKAXE, 1), 1, 1, 3, 15, 0.2F)
				.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
		e.getRareTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 25, new ItemStack(Items.DIAMOND_AXE, 1), 1, 1, 3, 15, 0.2F)
				.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
		e.getRareTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 25, new ItemStack(Items.DIAMOND_SHOVEL, 1), 1, 1, 3, 15, 0.2F)
				.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
		e.getRareTrades().add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 20, new ItemStack(Items.DIAMOND_PICKAXE, 1), 1, 1, 3, 15, 0.2F)
				.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
		e.getRareTrades()
				.add(new AdvancedTrade(new ItemStack(RubyItem.block), 12, 32, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1), 1, 1, 2, 1, 0.2F));
	}
	public static class AdvancedTrade extends BasicTrade {
		private int minimumNumOfItemsP1;
		private int maximumNumOfItemsP1;
		private int minimumNumOfItemsP2;
		private int maximumNumOfItemsP2;
		private int minimumNumOfItemsForSale;
		private int maximumNumOfItemsForSale;
		private boolean hasRandomEnchantment;
		private int chance;
		private List<Enchantment> enchantments = new ArrayList<>();
		public AdvancedTrade(ItemStack price, int minimumNumOfItemsPrice1, int maximumNumOfItemsPrice1, ItemStack price2, int minimumNumOfItemsPrice2,
				int maximumNumOfItemsPrice2, ItemStack forSale, int minimumNumOfItemsForSale, int maximumNumOfItemsForSale, int maxTrades, int xp,
				float priceMult) {
			super(price, price2, forSale, maxTrades, xp, priceMult);
			this.minimumNumOfItemsP1 = minimumNumOfItemsPrice1;
			this.maximumNumOfItemsP1 = maximumNumOfItemsPrice1;
			this.minimumNumOfItemsP2 = minimumNumOfItemsPrice2;
			this.maximumNumOfItemsP2 = maximumNumOfItemsPrice2;
			this.minimumNumOfItemsForSale = minimumNumOfItemsForSale;
			this.maximumNumOfItemsForSale = maximumNumOfItemsForSale;
		}

		public AdvancedTrade(ItemStack price, int minimumNumOfItemsPrice, int maximumNumOfItemsPrice, ItemStack forSale, int minimumNumOfItemsForSale,
				int maximumNumOfItemsForSale, int maxTrades, int xp, float priceMult) {
			super(price, forSale, maxTrades, xp, priceMult);
			this.minimumNumOfItemsP1 = minimumNumOfItemsPrice;
			this.maximumNumOfItemsP1 = maximumNumOfItemsPrice;
			this.minimumNumOfItemsForSale = minimumNumOfItemsForSale;
			this.maximumNumOfItemsForSale = maximumNumOfItemsForSale;
		}

		@Nullable
		@Override
		public MerchantOffer getOffer(Entity merchant, Random rand) {
			if (this.maximumNumOfItemsForSale != this.minimumNumOfItemsForSale && this.maximumNumOfItemsForSale > 1)
				this.forSale
						.setCount(rand.nextInt(this.maximumNumOfItemsForSale - this.minimumNumOfItemsForSale) + this.minimumNumOfItemsForSale + 1);
			if (this.maximumNumOfItemsP1 != this.minimumNumOfItemsP1 && this.maximumNumOfItemsP1 > 1)
				this.price.setCount(rand.nextInt(this.maximumNumOfItemsP1 - this.minimumNumOfItemsP1) + this.minimumNumOfItemsP1 + 1);
			if (this.maximumNumOfItemsP2 != this.minimumNumOfItemsP2 && this.maximumNumOfItemsP2 > 1)
				this.price2.setCount(rand.nextInt(this.maximumNumOfItemsP2 - this.minimumNumOfItemsP2) + this.minimumNumOfItemsP2 + 1);
			if (this.hasRandomEnchantment && rand.nextInt(this.chance) == 0) {
				Enchantment enchantment = this.enchantments.get(rand.nextInt(this.enchantments.size()));
				this.forSale.addEnchantment(enchantment, rand.nextInt(enchantment.getMaxLevel()) + 1);
			}
			return super.getOffer(merchant, rand);
		}

		public AdvancedTrade randomizeEnchantment(EnchantmentType enchantmentType, int chance) {
			this.chance = chance;
			this.hasRandomEnchantment = true;
			for (Enchantment enchantment : ForgeRegistries.ENCHANTMENTS.getValues()) {
				if (enchantment.type == enchantmentType) {
					this.enchantments.add(enchantment);
				}
			}
			return this;
		}

		public AdvancedTrade randomizeEnchantment(int chance) {
			this.chance = chance;
			this.hasRandomEnchantment = true;
			for (Enchantment enchantment : ForgeRegistries.ENCHANTMENTS.getValues()) {
				this.enchantments.add(enchantment);
			}
			return this;
		}
	}
}
