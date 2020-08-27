
package net.mcreator.moreoresandarmour.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandarmour.block.OilBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilBucketFuelFuel extends MoreOresAndArmourModElements.ModElement {
	public OilBucketFuelFuel(MoreOresAndArmourModElements instance) {
		super(instance, 247);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(OilBlock.block, (int) (1)).getItem())
			event.setBurnTime(32000);
	}
}
