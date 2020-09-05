package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.moreoresandarmour.MoreOresAndArmourModVariables;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.HashMap;

@MoreOresAndArmourModElements.ModElement.Tag
public class EnchantedTotemTickProcedure extends MoreOresAndArmourModElements.ModElement {
	public EnchantedTotemTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 503);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EnchantedTotemTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getBoolean("showTotemAnimation")) == (true))) {
			Minecraft.getInstance().gameRenderer
					.displayItemActivation( /* @ItemStack */((entity.getCapability(MoreOresAndArmourModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoreOresAndArmourModVariables.PlayerVariables())).enchantedToem));
			entity.getPersistentData().putBoolean("showTotemAnimation", (false));
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
