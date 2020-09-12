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
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;

import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.moreoresandarmour.item.RubyItem;

import java.util.Random;
import java.util.List;

import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.MerchantOffer;
import javax.annotation.Nullable;


@MoreOresAndArmourModElements.ModElement.Tag
public class VillagerTradeAdder extends MoreOresAndArmourModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public VillagerTradeAdder(MoreOresAndArmourModElements instance) {
		super(instance, 506);
	}

	@Override
	public void initElements() {
	MinecraftForge.EVENT_BUS.register(this);

	}


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
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.CHAINMAIL_HELMET, 1), 12, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1), 12, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 5), new ItemStack(Items.SHIELD, 1), 12, 10, 0.2F));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 19)), randomizeEnchantment(new ItemStack(Items.DIAMOND_LEGGINGS, 1), EnchantmentType.ARMOR_LEGS, 6), 3, 15, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 13)), randomizeEnchantment(new ItemStack(Items.DIAMOND_BOOTS, 1), EnchantmentType.ARMOR_FEET, 6), 3, 15, 0.2F));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 13)), randomizeEnchantment(new ItemStack(Items.DIAMOND_HELMET), EnchantmentType.ARMOR_HEAD, 6), 3, 30, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 21)), randomizeEnchantment(new ItemStack(Items.DIAMOND_CHESTPLATE, 1), EnchantmentType.ARMOR_CHEST, 6), 3, 30, 0.2F));
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
			ItemStack susStew = new ItemStack(Items.SUSPICIOUS_STEW, 1);
			susStew.getOrCreateTag().putInt("16", 100);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew, 12, 15, 0.05F));
			ItemStack susStew1 = new ItemStack(Items.SUSPICIOUS_STEW, 1);
			susStew1.getOrCreateTag().putInt("8", 160);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew1, 12, 15, 0.05F));
			ItemStack susStew2 = new ItemStack(Items.SUSPICIOUS_STEW, 1);
			susStew2.getOrCreateTag().putInt("18", 140);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew2, 12, 15, 0.05F));
			ItemStack susStew3 = new ItemStack(Items.SUSPICIOUS_STEW, 1);
			susStew3.getOrCreateTag().putInt("15", 120);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew3, 12, 15, 0.05F));
			ItemStack susStew4 = new ItemStack(Items.SUSPICIOUS_STEW, 1);
			susStew4.getOrCreateTag().putInt("19", 280);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew4, 12, 15, 0.05F));
			ItemStack susStew5 = new ItemStack(Items.SUSPICIOUS_STEW, 1);
			susStew5.getOrCreateTag().putInt("23", 7);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), susStew5, 12, 15, 0.05F));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.GOLDEN_CARROT, 3), 12, 30, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.GLISTERING_MELON_SLICE, 3), 12, 30, 0.05F));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.COD, 6), new ItemStack(Items.COOKED_COD, 6), 16, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 3), new ItemStack(Items.COD_BUCKET, 1), 16, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.SALMON, 6), new ItemStack(Items.COOKED_SALMON, 6), 16, 5, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.CAMPFIRE, 1), 12, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(15) + 7)), randomizeEnchantment(new ItemStack(Items.FISHING_ROD, 1), EnchantmentType.FISHING_ROD, 6), 3, 10, 0.2F));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.ARROW, 16), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GRAVEL, 10), new ItemStack(Items.FLINT, 10), 12, 1, 0.05F));
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
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 7)), randomizeEnchantment(new ItemStack(Items.BOW, 1), EnchantmentType.BOW, 6), 3, 15, 0.05F));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 8)), randomizeEnchantment(new ItemStack(Items.CROSSBOW, 1), EnchantmentType.CROSSBOW, 6), 3, 15, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.ARROW, 5), new ItemStack(Items.SPECTRAL_ARROW, 5), 12, 30, 0.05F));
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
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(59) + 5)), new ItemStack(Items.BOOK, 1), randomizeEnchantmentBook(new ItemStack(Items.ENCHANTED_BOOK, 1), EnchantmentType.ALL, 1), 12, 1, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 9), new ItemStack(Items.BOOKSHELF, 1), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(59) + 5)), new ItemStack(Items.BOOK, 1), randomizeEnchantmentBook(new ItemStack(Items.ENCHANTED_BOOK, 1), EnchantmentType.ALL, 1), 12, 5, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.LANTERN, 1), 12, 5, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(59) + 5)), new ItemStack(Items.BOOK, 1), randomizeEnchantmentBook(new ItemStack(Items.ENCHANTED_BOOK, 1), EnchantmentType.ALL, 1), 12, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 1), new ItemStack(Items.GLASS, 4), 12, 10, 0.05F));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(59) + 5)), new ItemStack(Items.BOOK, 1), randomizeEnchantmentBook(new ItemStack(Items.ENCHANTED_BOOK, 1), EnchantmentType.ALL, 1), 12, 15, 0.2F));
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
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.LIGHT_GRAY_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.GRAY_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.BLACK_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.BROWN_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.ORANGE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.YELLOW_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.LIME_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.GREEN_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.CYAN_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.BLUE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.LIGHT_BLUE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 2), new ItemStack(Items.WHITE_WOOL, 1), 12, 1, 0.05F));
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
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 6)), randomizeEnchantment(new ItemStack(Items.IRON_AXE, 1), EnchantmentType.DIGGER, 10), 3, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 7)), randomizeEnchantment(new ItemStack(Items.IRON_SHOVEL, 1), EnchantmentType.DIGGER, 10), 3, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 8)), randomizeEnchantment(new ItemStack(Items.IRON_PICKAXE, 1), EnchantmentType.DIGGER, 10), 3, 10, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 4), new ItemStack(Items.DIAMOND_HOE, 1), 3, 10, 0.2F));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 17)), randomizeEnchantment(new ItemStack(Items.DIAMOND_AXE, 1), EnchantmentType.DIGGER, 6), 3, 15, 0.2F));
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 10)), randomizeEnchantment(new ItemStack(Items.DIAMOND_SHOVEL, 1), EnchantmentType.DIGGER, 6), 3, 15, 0.2F));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 18)), randomizeEnchantment(new ItemStack(Items.DIAMOND_PICKAXE, 1), EnchantmentType.DIGGER, 10), 3, 30, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(1);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block), new ItemStack(Items.IRON_AXE), 12, 1, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(2);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 7)), randomizeEnchantment(new ItemStack(Items.IRON_SWORD, 1), EnchantmentType.WEAPON, 10), 3, 1, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(3);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, 36), new ItemStack(Items.BELL, 1), 12, 5, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(4);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 17)), randomizeEnchantment(new ItemStack(Items.DIAMOND_AXE, 1), EnchantmentType.DIGGER, 6), 3, 15, 0.2F));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			List<VillagerTrades.ITrade> trades = event.getTrades().get(5);
			trades.add(new BasicTrade(new ItemStack(RubyItem.block, (new Random().nextInt(14) + 13)), randomizeEnchantment(new ItemStack(Items.DIAMOND_SWORD, 1), EnchantmentType.WEAPON, 6), 3, 30, 0.2F));
		}
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
