package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChorusFruitEatenProcedure extends MoreOresAndArmourModElements.ModElement {

	public ChorusFruitEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 468);

		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChorusFruitEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ChorusSaladItem.block, (int) (1)).getItem())) {
		}

	}

	@SubscribeEvent
	public void onUseItemStart(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			int i = (int) entity.getPosX();
			int j = (int) entity.getPosY();
			int k = (int) entity.getPosZ();
			double duration = event.getDuration();
			ItemStack getresultstack = event.getResultStack();
			ItemStack itemstack = event.getItem();
			World world = entity.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("getresultstack", getresultstack);
			dependencies.put("itemstack", itemstack);
			dependencies.put("duration", duration);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

}
