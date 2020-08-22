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

import net.minecraft.entity.merchant.villager.VillagerTrades.ITrade;

@MoreOresAndArmourModElements.ModElement.Tag
public class VillageTradeAdder extends MoreOresAndArmourModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public VillageTradeAdder(MoreOresAndArmourModElements instance) {
		super(instance, 314);
	}

	
}
