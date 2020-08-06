package net.mcreator.moreoresandarmour.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.moreoresandarmour.item.RubyItem;
import net.mcreator.moreoresandarmour.item.EmeraldCrystalItem;
import net.mcreator.moreoresandarmour.item.DiamondAppleItem;
import net.mcreator.moreoresandarmour.item.AmuletofLevitationItem;
import net.mcreator.moreoresandarmour.item.AmuletOfStrenthItem;
import net.mcreator.moreoresandarmour.item.AluminumAppleItem;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class JewelerRightClickedOnEntity2Procedure extends MoreOresAndArmourModElements.ModElement {
	public JewelerRightClickedOnEntity2Procedure(MoreOresAndArmourModElements instance) {
		super(instance, 287);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JewelerRightClickedOnEntity2!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
			(itemstack).getOrCreateTag().putDouble("randomTrade", Math.round((Math.random() * 5)));
			if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 0)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RubyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).inventory
							.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 1)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(DiamondAppleItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).inventory
							.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 2)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AluminumAppleItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).inventory
							.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 3)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletofLevitationItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).inventory
							.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 4)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(AmuletOfStrenthItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).inventory
							.clearMatchingItems(p -> new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			} else if ((((itemstack).getOrCreateTag().getDouble("randomTrade")) == 5)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.AIR, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
				if (!world.getWorld().isRemote) {
					world.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					world.getWorld().playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.ANGRY_VILLAGER, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			}
		}
	}
}
