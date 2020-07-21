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
 * If you want to make a plain independent class, create it in
 * "Workspace" -> "Source" menu.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.moreoresandarmour;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.potion.Potions;
import net.minecraft.potion.Potion;
import net.minecraft.item.Items;
import net.minecraft.item.Item;

import net.mcreator.moreoresandarmour.potion.WitherPotionPotion;
import net.mcreator.moreoresandarmour.potion.AbsorbsionPotion;

import java.lang.reflect.Method;

@MoreOresAndArmourModElements.ModElement.Tag
public class CustomBrewingRecipes extends MoreOresAndArmourModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public CustomBrewingRecipes(MoreOresAndArmourModElements instance) {
		super(instance, 135);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		try {
			Class clazz = net.minecraft.potion.PotionBrewing.class;
			Method mth = ObfuscationReflectionHelper.findMethod(clazz, "func_193357_a", Potion.class, Item.class, Potion.class);
			Object obj = mth.invoke(null, Potions.AWKWARD, Items.GOLDEN_APPLE, AbsorbsionPotion.potionType);
			obj = mth.invoke(null, Potions.AWKWARD, Items.WITHER_ROSE, WitherPotionPotion.potionType);
			// To add more recipes, you can copy the line above, without "Object", ex.
			// obj = mth.invoke(null, potion2, item2, potion3);
		} catch (Throwable e) {
			System.err.println("ERROR:Something is wrong with the code!" + e); // You can change this part
		}
	}
}
