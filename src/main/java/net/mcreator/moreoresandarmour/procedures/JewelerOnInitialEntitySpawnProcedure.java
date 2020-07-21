package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class JewelerOnInitialEntitySpawnProcedure extends MoreOresAndArmourModElements.ModElement {
	public JewelerOnInitialEntitySpawnProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 165);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JewelerOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JewelerOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((!(world.isRemote))) {
			entity.getPersistentData().putDouble("randomTradeItem1", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.917)) {
				entity.getPersistentData().putDouble("tradeItem1", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.834)) {
				entity.getPersistentData().putDouble("tradeItem1", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.751)) {
				entity.getPersistentData().putDouble("tradeItem1", 3);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.668)) {
				entity.getPersistentData().putDouble("tradeItem1", 4);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.585)) {
				entity.getPersistentData().putDouble("tradeItem1", 5);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.502)) {
				entity.getPersistentData().putDouble("tradeItem1", 6);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.419)) {
				entity.getPersistentData().putDouble("tradeItem1", 7);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.336)) {
				entity.getPersistentData().putDouble("tradeItem1", 8);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.253)) {
				entity.getPersistentData().putDouble("tradeItem1", 9);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.17)) {
				entity.getPersistentData().putDouble("tradeItem1", 10);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0.083)) {
				entity.getPersistentData().putDouble("tradeItem1", 11);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem1")) >= 0)) {
				entity.getPersistentData().putDouble("tradeItem1", 12);
			}
			entity.getPersistentData().putDouble("randomTradeItem2", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeItem2")) >= 0.834)) {
				entity.getPersistentData().putDouble("tradeItem2", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem2")) >= 0.668)) {
				entity.getPersistentData().putDouble("tradeItem2", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem2")) >= 0.502)) {
				entity.getPersistentData().putDouble("tradeItem2", 3);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem2")) >= 0.336)) {
				entity.getPersistentData().putDouble("tradeItem2", 4);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem2")) >= 0.166)) {
				entity.getPersistentData().putDouble("tradeItem2", 5);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem2")) >= 0)) {
				entity.getPersistentData().putDouble("tradeItem2", 6);
			}
			entity.getPersistentData().putDouble("randomTradeItem3", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeItem3")) >= 0)) {
				entity.getPersistentData().putDouble("tradeItem3", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem3")) >= 0.25)) {
				entity.getPersistentData().putDouble("tradeItem3", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem3")) >= 0.5)) {
				entity.getPersistentData().putDouble("tradeItem3", 3);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem3")) >= 0.75)) {
				entity.getPersistentData().putDouble("tradeItem3", 4);
			}
			entity.getPersistentData().putDouble("randomTradeItem4", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeItem4")) >= 0)) {
				entity.getPersistentData().putDouble("tradeItem4", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem4")) >= 0.25)) {
				entity.getPersistentData().putDouble("tradeItem4", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem4")) >= 0.5)) {
				entity.getPersistentData().putDouble("tradeItem4", 3);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem4")) >= 0.75)) {
				entity.getPersistentData().putDouble("tradeItem4", 4);
			}
			entity.getPersistentData().putDouble("randomTradeItem5", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeItem5")) >= 0)) {
				entity.getPersistentData().putDouble("tradeItem5", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem5")) >= 0.25)) {
				entity.getPersistentData().putDouble("tradeItem5", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem5")) >= 0.5)) {
				entity.getPersistentData().putDouble("tradeItem5", 3);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem5")) >= 0.75)) {
				entity.getPersistentData().putDouble("tradeItem5", 4);
			}
			entity.getPersistentData().putDouble("randomTradeItem6", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeItem6")) >= 0)) {
				entity.getPersistentData().putDouble("tradeItem6", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem6")) >= 0.166)) {
				entity.getPersistentData().putDouble("tradeItem6", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem6")) >= 0.336)) {
				entity.getPersistentData().putDouble("tradeItem6", 3);
			} else if (((entity.getPersistentData().getDouble("randomTradeItem6")) >= 0.502)) {
				entity.getPersistentData().putDouble("tradeItem6", 4);
			}
			entity.getPersistentData().putDouble("randomTradeCount1", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeCount1")) >= 0)) {
				entity.getPersistentData().putDouble("tradeCount1", 1);
			}
			entity.getPersistentData().putDouble("randomTradeCount2", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeCount2")) >= 0.834)) {
				entity.getPersistentData().putDouble("tradeCount2", 1);
			} else if (((entity.getPersistentData().getDouble("randomTradeCount2")) >= 0.668)) {
				entity.getPersistentData().putDouble("tradeCount2", 2);
			} else if (((entity.getPersistentData().getDouble("randomTradeCount2")) >= 0.502)) {
				entity.getPersistentData().putDouble("tradeCount2", 4);
			} else if (((entity.getPersistentData().getDouble("randomTradeCount2")) >= 0.336)) {
				entity.getPersistentData().putDouble("tradeCount2", 6);
			}
			entity.getPersistentData().putDouble("randomTradeCount3", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeCount3")) >= 0)) {
				entity.getPersistentData().putDouble("tradeCount3", 1);
			}
			entity.getPersistentData().putDouble("randomTradeCount4", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeCount4")) >= 0)) {
				entity.getPersistentData().putDouble("tradeCount4", 1);
			}
			entity.getPersistentData().putDouble("randomTradeCount5", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeCount5")) >= 0)) {
				entity.getPersistentData().putDouble("tradeCount5", 1);
			}
			entity.getPersistentData().putDouble("randomTradeCount6", Math.random());
			if (((entity.getPersistentData().getDouble("randomTradeCount6")) >= 0)) {
				entity.getPersistentData().putDouble("tradeCount6", 1);
			}
		}
	}
}
