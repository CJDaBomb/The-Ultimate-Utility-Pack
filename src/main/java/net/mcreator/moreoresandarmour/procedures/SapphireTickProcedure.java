package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class SapphireTickProcedure extends MoreOresAndArmourModElements.ModElement {

	public SapphireTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 500);

		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies){
		if(dependencies.get("entity") == null){
			System.err.println("Failed to load dependency entity for procedure SapphireTick!");
			return;
		}

				Entity entity = (Entity) dependencies.get("entity");

		if (((entity.getPersistentData().getBoolean("sapphireIncreased"))==(true))) {if ((==400)) {entity.getPersistentData().putBoolean("sapphireIncreased", (false));if(entity instanceof PlayerEntity && !entity.world.isRemote){
	((PlayerEntity)entity).sendStatusMessage(new StringTextComponent("Your 20 Seconds of Increased Strength are Over"), (false));
}}}

	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

}
