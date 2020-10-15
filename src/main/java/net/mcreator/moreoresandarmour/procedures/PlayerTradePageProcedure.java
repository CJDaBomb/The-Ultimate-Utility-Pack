package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class PlayerTradePageProcedure extends MoreOresAndArmourModElements.ModElement {

	public PlayerTradePageProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 171);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlayerTradePage!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity.getPersistentData().getDouble("playerTradePage")) == 1)) {
			entity.getPersistentData().putDouble("playerTradePage", 2);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 2)) {
			entity.getPersistentData().putDouble("playerTradePage", 3);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 3)) {
			entity.getPersistentData().putDouble("playerTradePage", 4);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 4)) {
			entity.getPersistentData().putDouble("playerTradePage", 5);
		} else if (((entity.getPersistentData().getDouble("playerTradePage")) == 5)) {
			entity.getPersistentData().putDouble("playerTradePage", 6);
		}

	}

}
