
package net.mcreator.moreoresandarmour.fuel;

@MoreOresAndArmourModElements.ModElement.Tag
public class BoltFuelFuel extends MoreOresAndArmourModElements.ModElement {

	public BoltFuelFuel(MoreOresAndArmourModElements instance) {
		super(instance, 69);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(BoltItem.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}

}
