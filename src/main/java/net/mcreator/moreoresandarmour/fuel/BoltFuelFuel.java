
package net.mcreator.moreoresandarmour.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandarmour.item.BoltItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class BoltFuelFuel extends MoreOresAndArmourModElements.ModElement {
	public BoltFuelFuel(MoreOresAndArmourModElements instance) {
		super(instance, 247);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(BoltItem.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
