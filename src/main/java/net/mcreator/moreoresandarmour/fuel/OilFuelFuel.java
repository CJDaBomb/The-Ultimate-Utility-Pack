
package net.mcreator.moreoresandarmour.fuel;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilFuelFuel extends MoreOresAndArmourModElements.ModElement {

	public OilFuelFuel(MoreOresAndArmourModElements instance) {
		super(instance, 46);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CarbonBlockBlock.block, (int) (1)).getItem())
			event.setBurnTime(16000);
	}

}
