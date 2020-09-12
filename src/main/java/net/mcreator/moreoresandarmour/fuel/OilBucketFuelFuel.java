
package net.mcreator.moreoresandarmour.fuel;

@MoreOresAndArmourModElements.ModElement.Tag
public class OilBucketFuelFuel extends MoreOresAndArmourModElements.ModElement {

	public OilBucketFuelFuel(MoreOresAndArmourModElements instance) {
		super(instance, 47);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(OilBlock.block, (int) (1)).getItem())
			event.setBurnTime(32000);
	}

}
