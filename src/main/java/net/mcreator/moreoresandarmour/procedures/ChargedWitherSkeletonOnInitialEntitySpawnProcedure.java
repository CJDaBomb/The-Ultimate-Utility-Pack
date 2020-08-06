package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class ChargedWitherSkeletonOnInitialEntitySpawnProcedure extends MoreOresAndArmourModElements.ModElement {

	public ChargedWitherSkeletonOnInitialEntitySpawnProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 300);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChargedWitherSkeletonOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ChargedWitherSkeletonOnInitialEntitySpawn!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		if ((world.getDifficulty() == Difficulty.EASY)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setHealth((float) 50);
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			entity.getPersistentData().putDouble("chargedWitherSkellyChanceOfArmour", Math.random());
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.91)) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.91)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.91)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType2", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.91)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType3", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.91)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType4", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
		} else if ((world.getDifficulty() == Difficulty.NORMAL)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setHealth((float) 75);
			entity.getPersistentData().putDouble("chargedWitherSkellyChanceOfArmour", Math.random());
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.85)) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.85)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.85)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType2", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.85)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType3", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.85)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType4", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
		} else if ((world.getDifficulty() == Difficulty.HARD)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setHealth((float) 100);
			entity.getPersistentData().putDouble("chargedWitherSkellyChanceOfArmour", Math.random());
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.5)) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.7)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.boots, (int) (1));
						final int _sltid = (int) (0);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.7)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType2", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType2")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.legs, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.7)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType3", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType3")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.body, (int) (1));
						final int _sltid = (int) (2);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getPersistentData().getDouble("chargedWitherSkellyChanceOfArmour")) >= 0.7)) {
				entity.getPersistentData().putDouble("chargedWitherSkellyArmourType4", Math.round((Math.random() * 2)));
				if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 0)) {
					{
						final ItemStack _setstack = new ItemStack(RubyArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(SapphireArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				} else if (((entity.getPersistentData().getDouble("chargedWitherSkellyArmourType4")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(ShadowArmourItem.helmet, (int) (1));
						final int _sltid = (int) (3);
						_setstack.setCount((int) 1);
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
		}

	}

}
