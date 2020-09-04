package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModVariables;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

@MoreOresAndArmourModElements.ModElement.Tag
public class SapphireTickProcedure extends MoreOresAndArmourModElements.ModElement {
	public SapphireTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 500);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SapphireTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("SapphireIncreased")) == (true))) {
			{
				double _setval = (double) (((entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MoreOresAndArmourModVariables.PlayerVariables())).attack) + 1);
				entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.attack = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((((entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MoreOresAndArmourModVariables.PlayerVariables())).attack) == 400)) {
				{
					double _setval = (double) 0;
					entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.attack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("SapphireIncreased", (false));
				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Your 20 Seconds of Increased Strength are Over"), (false));
				}
			}
		}
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
