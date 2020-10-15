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
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.potion.Effects;
import net.minecraft.item.SuspiciousStewItem;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.moreoresandarmour.item.RubyItem;

import javax.annotation.Nullable;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@MoreOresAndArmourModElements.ModElement.Tag
public class VillagerTradeAdder extends MoreOresAndArmourModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public VillagerTradeAdder(MoreOresAndArmourModElements instance) {
		super(instance, 506);
		MinecraftForge.EVENT_BUS.register(this);
	}
	private static Random rand = new Random();
	@SubscribeEvent
	public void addNewTrade(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 5), new ItemStack(Items.IRON_HELMET, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 9), new ItemStack(Items.IRON_CHESTPLATE, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 7), new ItemStack(Items.IRON_BOOTS, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.IRON_LEGGINGS, 1), 12, 1, 0.2F));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 36), new ItemStack(Items.BELL, 1), 12, 5, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.CHAINMAIL_LEGGINGS, 1), 12, 5, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.CHAINMAIL_BOOTS, 1), 12, 5, 0.2F));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.CHAINMAIL_HELMET, 1), 12, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(Items.DIAMOND, 4), new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1), 12, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(Items.DIAMOND, 5), new ItemStack(Items.SHIELD, 1), 12, 10, 0.2F));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 19, 33, new ItemStack(Items.DIAMOND_LEGGINGS), 1, 1, 3, 15, 0.2F)
					.randomizeEnchantment(EnchantmentType.ARMOR_LEGS, 3)); // 6
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 13, 27, new ItemStack(Items.DIAMOND_BOOTS), 1, 1, 3, 15, 0.2F)
					.randomizeEnchantment(EnchantmentType.ARMOR_FEET, 3)); // 6
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 13, 27, new ItemStack(Items.DIAMOND_HELMET), 1, 1, 3, 30, 0.2F)
					.randomizeEnchantment(EnchantmentType.ARMOR_HEAD, 3)); // 6
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 21, 35, new ItemStack(Items.DIAMOND_CHESTPLATE), 1, 1, 3, 30, 0.2F)
					.randomizeEnchantment(EnchantmentType.ARMOR_CHEST, 3)); // 6
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.RABBIT_STEW, 1), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.COOKED_PORKCHOP, 5), 16, 5, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.COOKED_CHICKEN, 8), 16, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 7), new ItemStack(Items.MAP, 1), 12, 1, 0.2F));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 7), new ItemStack(Items.ITEM_FRAME, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.WHITE_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.LIGHT_GRAY_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.GRAY_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.BLACK_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.BROWN_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.ORANGE_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.YELLOW_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.LIME_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.GREEN_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.CYAN_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.LIGHT_BLUE_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.BLUE_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.PURPLE_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.MAGENTA_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.PINK_BANNER, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.RED_BANNER, 1), 12, 15, 0.05F));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 8), new ItemStack(Items.GLOBE_BANNER_PATTERN, 1), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.REDSTONE, 2), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LAPIS_LAZULI, 1), 12, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.GLOWSTONE, 1), 12, 10, 0.05F));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 5), new ItemStack(Items.ENDER_PEARL, 1), 12, 15, 0.05F));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.EXPERIENCE_BOTTLE, 1), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BREAD, 6), 16, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.PUMPKIN_PIE, 4), 12, 5, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.APPLE, 4), 16, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.COOKIE, 18), 12, 10, 0.05F));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.CAKE, 1), 12, 15, 0.05F));
			
			ItemStack susStew = new ItemStack(Items.SUSPICIOUS_STEW);
			SuspiciousStewItem.addEffect(susStew, Effects.NIGHT_VISION, 100);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew, 12, 15, 0.05F));
			
			
			ItemStack susStew2 = new ItemStack(Items.SUSPICIOUS_STEW);
			SuspiciousStewItem.addEffect(susStew2, Effects.JUMP_BOOST, 160);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew2, 12, 15, 0.05F));
			
			
			ItemStack susStew3 = new ItemStack(Items.SUSPICIOUS_STEW);
			SuspiciousStewItem.addEffect(susStew3, Effects.WEAKNESS, 140);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew3, 12, 15, 0.05F));
			

			ItemStack susStew4 = new ItemStack(Items.SUSPICIOUS_STEW);
			SuspiciousStewItem.addEffect(susStew4, Effects.BLINDNESS, 120);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew4, 12, 15, 0.05F));
			

			ItemStack susStew5 = new ItemStack(Items.SUSPICIOUS_STEW);
			SuspiciousStewItem.addEffect(susStew5, Effects.POISON, 280);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew5, 12, 15, 0.05F));
			
			ItemStack susStew6 = new ItemStack(Items.SUSPICIOUS_STEW);
			SuspiciousStewItem.addEffect(susStew6, Effects.SATURATION, 100);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew6, 12, 15, 0.05F));
			
		}
		if (event.getType() == VillagerProfession.FARMER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.GOLDEN_CARROT, 3), 12, 30, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.GLISTERING_MELON_SLICE, 3), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(
					new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.COD, 6), new ItemStack(Items.COOKED_COD, 6), 16, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.COD_BUCKET, 1), 16, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.SALMON, 6), new ItemStack(Items.COOKED_SALMON, 6), 16, 5,
					0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.CAMPFIRE, 1), 12, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 7, 22, new ItemStack(Items.FISHING_ROD), 1, 1, 3, 10, 0.2F)
					.randomizeEnchantment(EnchantmentType.FISHING_ROD, 3)); // 6
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.ARROW, 16), 12, 1, 0.05F));
			trades.add(
					new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GRAVEL, 10), new ItemStack(Items.FLINT, 10), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.BOW, 1), 12, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.CROSSBOW, 1), 12, 10, 0.05F));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 7, 21, new ItemStack(Items.BOW), 1, 1, 3, 15, 0.05F)
					.randomizeEnchantment(EnchantmentType.BOW, 3)); // 6
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 8, 22, new ItemStack(Items.CROSSBOW), 1, 1, 3, 15, 0.05F)
					.randomizeEnchantment(EnchantmentType.CROSSBOW, 3)); // 6
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.ARROW, 5), new ItemStack(Items.SPECTRAL_ARROW, 5), 12, 30,
					0.05F));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 6), new ItemStack(Items.LEATHER_HORSE_ARMOR, 1), 12, 15, 0.2F));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 6), new ItemStack(Items.SADDLE, 1), 12, 30, 0.2F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 64, new ItemStack(Items.BOOK), 1, 1, new ItemStack(Items.ENCHANTED_BOOK),
					1, 1, 12, 1, 0.2F).randomizeEnchantment(1)); // 1
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 9), new ItemStack(Items.BOOKSHELF, 1), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 64, new ItemStack(Items.BOOK), 1, 1, new ItemStack(Items.ENCHANTED_BOOK),
					1, 1, 12, 5, 0.2F).randomizeEnchantment(1)); // 1
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LANTERN, 1), 12, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 64, new ItemStack(Items.BOOK), 1, 1, new ItemStack(Items.ENCHANTED_BOOK),
					1, 1, 12, 10, 0.2F).randomizeEnchantment(1)); // 1
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GLASS, 4), 12, 10, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 5, 64, new ItemStack(Items.BOOK), 1, 1, new ItemStack(Items.ENCHANTED_BOOK),
					1, 1, 12, 15, 0.2F).randomizeEnchantment(1)); // 1
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 5), new ItemStack(Items.CLOCK, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.COMPASS, 1), 12, 15, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 20), new ItemStack(Items.NAME_TAG, 1), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.MASON) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BRICKS, 10), 16, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.MASON) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.CHISELED_STONE_BRICKS, 4), 16, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.MASON) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.POLISHED_ANDESITE, 4), 16, 10, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.POLISHED_GRANITE, 4), 16, 10, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.POLISHED_DIORITE, 4), 16, 10, 0.05F));
		}
		if (event.getType() == VillagerProfession.MASON) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.YELLOW_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.WHITE_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BLACK_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.ORANGE_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GRAY_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LIGHT_GRAY_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.RED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.PINK_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.MAGENTA_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.PURPLE_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BLUE_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LIGHT_BLUE_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.CYAN_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GREEN_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LIME_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BROWN_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.YELLOW_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.WHITE_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BLACK_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.ORANGE_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GRAY_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LIGHT_GRAY_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.RED_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.PINK_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.MAGENTA_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.PURPLE_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BLACK_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LIGHT_BLUE_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.CYAN_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GREEN_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LIME_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.BROWN_GLAZED_TERRACOTTA, 1), 12, 15, 0.05F));
		}
		if (event.getType() == VillagerProfession.MASON) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.QUARTZ_PILLAR, 1), 12, 30, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.QUARTZ_BLOCK, 1), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.SHEARS, 1), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.PAINTING, 3), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.STONE_AXE, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.STONE_SHOVEL, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.STONE_PICKAXE, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.STONE_HOE, 1), 12, 1, 0.2F));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 36), new ItemStack(Items.BELL, 1), 12, 5, 0.2F));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 6, 20, new ItemStack(Items.IRON_AXE), 1, 1, 3, 10, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 5)); // 10
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 7, 21, new ItemStack(Items.IRON_SHOVEL), 1, 1, 3, 10, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 5)); // 10
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 8, 22, new ItemStack(Items.IRON_PICKAXE), 1, 1, 3, 10, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 5)); // 10
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.DIAMOND_HOE), 3, 10, 0.2F));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 17, 31, new ItemStack(Items.DIAMOND_AXE), 1, 1, 3, 15, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 10, 24, new ItemStack(Items.DIAMOND_SHOVEL), 1, 1, 3, 15, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 18, 32, new ItemStack(Items.DIAMOND_PICKAXE), 1, 1, 3, 30, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 5)); // 10
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block), new ItemStack(Items.IRON_AXE), 12, 1, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 7, 21, new ItemStack(Items.IRON_SWORD), 1, 1, 3, 1, 0.2F)
					.randomizeEnchantment(EnchantmentType.WEAPON, 5)); // 10
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 36), new ItemStack(Items.BELL, 1), 12, 5, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 17, 31, new ItemStack(Items.DIAMOND_AXE), 1, 1, 3, 15, 0.2F)
					.randomizeEnchantment(EnchantmentType.DIGGER, 3)); // 6
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new AdvancedTrade(new ItemStack(RubyItem.block), 13, 27, new ItemStack(Items.DIAMOND_SWORD), 1, 1, 3, 30, 0.2F)
					.randomizeEnchantment(EnchantmentType.WEAPON, 3)); // 6
		}
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
