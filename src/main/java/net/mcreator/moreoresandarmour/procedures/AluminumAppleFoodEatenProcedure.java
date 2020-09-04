package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.GameType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.moreoresandarmour.item.AluminumIngotItem;
import net.mcreator.moreoresandarmour.block.AluminumBlockBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class AluminumAppleFoodEatenProcedure extends MoreOresAndArmourModElements.ModElement {
	public AluminumAppleFoodEatenProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 495);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AluminumAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack item = ItemStack.EMPTY;
		double randomItem = 0;
		double randomAmount = 0;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 999999, (int) 1));
		if ((!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((ClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)))) {
			randomItem = (double) ((new java.util.Random()).nextInt((int) 5 + 1));
			if (((randomItem) >= 1)) {
				item = new ItemStack(AluminumIngotItem.block, (int) (1));
				randomItem = (double) (1 + ((new java.util.Random()).nextInt((int) 3 + 1)));
			} else if (((randomItem) >= 0)) {
				item = new ItemStack(AluminumBlockBlock.block, (int) (1));
				randomItem = (double) 1;
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = (item);
				_setstack.setCount((int) (randomItem));
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
