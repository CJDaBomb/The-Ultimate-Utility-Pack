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

import net.minecraft.util.datafix.fixes.VillagerTrades;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades.ITrade;

import net.mcreator.moreoresandarmour.item.ShadowIngotItem;
import net.mcreator.moreoresandarmour.item.RubyItem;
import net.mcreator.moreoresandarmour.item.GoldenAppleSeedsItem;
import net.mcreator.moreoresandarmour.block.EndRootsBlock;

import net.minecraft.item.MerchantOffer;
import javax.annotation.Nullable;

import java.util.Random;


@MoreOresAndArmourModElements.ModElement.Tag
public class WandererTradesAdder extends MoreOresAndArmourModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public WandererTradesAdder(MoreOresAndArmourModElements instance) {
		super(instance, 507);
	}

	@Override
	public void initElements() {
	MinecraftForge.EVENT_BUS.register(this);

	}


	@SubscribeEvent
	public void wt(WandererTradesEvent e) {
		e.getGenericTrades()
		e.getGenericTrades()
		e.getGenericTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(3) + 5)),
		e.getGenericTrades().add(
		e.getGenericTrades().add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(GoldenAppleSeedsItem.block, 1), 12, 1, 0.2F));
		e.getGenericTrades().add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(EndRootsBlock.block, 1), 12, 1, 0.2F));
		
		e.getRareTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(35) + 5)),
		e.getRareTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(20) + 10)),
		e.getRareTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(20) + 5)),
		e.getRareTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(20) + 5)),
		e.getRareTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(15) + 5)),
		e.getRareTrades().add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(20) + 12)),
	}

	private static ItemStack randomizeEnchantment(ItemStack itemStack, EnchantmentType type, int chance) {
		Random rand = new Random();
		for (Enchantment ench : ForgeRegistries.ENCHANTMENTS.getValues()) {
			if (ench.type == type && rand.nextInt(chance) == 0) {
				itemStack.addEnchantment(ench, rand.nextInt(ench.getMaxLevel()) + 1);
			}
		}
		return itemStack;
	}

	private static ItemStack randomizeEnchantmentBook(ItemStack itemStack, EnchantmentType type, int chance) {
		Random rand = new Random();
		for (Enchantment ench : ForgeRegistries.ENCHANTMENTS.getValues()) {
			if (ench.type == type && rand.nextInt(chance) == 0) {
				itemStack.addEnchantment(ench, rand.nextInt(ench.getMaxLevel()) + 1);
				break;
			}
		}
		return itemStack;
	}
}