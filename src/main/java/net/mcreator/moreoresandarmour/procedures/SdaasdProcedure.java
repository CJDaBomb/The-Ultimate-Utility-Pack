package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class SdaasdProcedure extends MoreOresAndArmourModElements.ModElement {

	public SdaasdProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 198);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure Sdaasd!");
			return;
		}

		Entity sourceentity = (Entity) dependencies.get("sourceentity");

		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(RubyItem.block, (int) (1)).getItem())) {
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(NightmarePlanksBlock.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
		}

	}

}
