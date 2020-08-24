package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.item.TurquoisePickaxeItem;
import net.mcreator.moreoresandarmour.item.TurquoiseAppleItem;
import net.mcreator.moreoresandarmour.item.SapphireSwordItem;
import net.mcreator.moreoresandarmour.item.SapphirePickaxeItem;
import net.mcreator.moreoresandarmour.item.SapphireAxeItem;
import net.mcreator.moreoresandarmour.item.SapphireArmourItem;
import net.mcreator.moreoresandarmour.item.RubySwordItem;
import net.mcreator.moreoresandarmour.item.RubyPickaxeItem;
import net.mcreator.moreoresandarmour.item.RubyItem;
import net.mcreator.moreoresandarmour.item.RubyAxeItem;
import net.mcreator.moreoresandarmour.item.RubyArmourItem;
import net.mcreator.moreoresandarmour.item.EmeraldCrystalItem;
import net.mcreator.moreoresandarmour.item.DiamondAppleItem;
import net.mcreator.moreoresandarmour.item.CopperIngotItem;
import net.mcreator.moreoresandarmour.item.AluminumSwordItem;
import net.mcreator.moreoresandarmour.item.AluminumIngotItem;
import net.mcreator.moreoresandarmour.item.AluminumAxeItem;
import net.mcreator.moreoresandarmour.item.AluminumArmourItem;
import net.mcreator.moreoresandarmour.item.AluminumAppleItem;
import net.mcreator.moreoresandarmour.item.AlexandriteSwordItem;
import net.mcreator.moreoresandarmour.item.AlexandritePickaxeItem;
import net.mcreator.moreoresandarmour.item.AlexandriteItem;
import net.mcreator.moreoresandarmour.item.AlexandriteAxeItem;
import net.mcreator.moreoresandarmour.item.AlexadriteAppleItem;
import net.mcreator.moreoresandarmour.block.RubyBlockBlock;
import net.mcreator.moreoresandarmour.block.AluminumBlockBlock;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.function.Supplier;
import java.util.Map;

@MoreOresAndArmourModElements.ModElement.Tag
public class SetTradeItemAmountProcedure extends MoreOresAndArmourModElements.ModElement {
	public SetTradeItemAmountProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 344);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetTradeItemAmount!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getDouble("playerTradesPage")) == 1)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumArmourItem.helmet, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumArmourItem.body, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumArmourItem.legs, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumArmourItem.boots, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 5)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyArmourItem.helmet, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 6)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyArmourItem.body, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 7)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyArmourItem.legs, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 8)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyArmourItem.boots, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 9)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphireArmourItem.helmet, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 10)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphireArmourItem.body, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 11)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphireArmourItem.legs, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem1")) == 12)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphireArmourItem.boots, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount1"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (((entity.getPersistentData().getDouble("playerTradesPage")) == 2)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playerTradeItem2")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem2")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumIngotItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem2")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(CopperIngotItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem2")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AlexandriteItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem2")) == 5)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyBlockBlock.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem2")) == 6)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumBlockBlock.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount2"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (((entity.getPersistentData().getDouble("playerTradesPage")) == 3)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playerTradeItem3")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem3")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumSwordItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem3")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphireSwordItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem3")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AlexandriteSwordItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount3"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (((entity.getPersistentData().getDouble("playerTradesPage")) == 4)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playerTradeItem4")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyPickaxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount4")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem4")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(TurquoisePickaxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount4")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem4")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphirePickaxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount4")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem4")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AlexandritePickaxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount4")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount4"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (((entity.getPersistentData().getDouble("playerTradesPage")) == 5)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playerTradeItem5")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RubyAxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount5")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem5")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumAxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount5")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem5")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(SapphireAxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount5")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem5")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AlexandriteAxeItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount5")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount5"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (((entity.getPersistentData().getDouble("playerTradesPage")) == 6)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(EmeraldCrystalItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playerTradeItem6")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AluminumAppleItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount6")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem6")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(DiamondAppleItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount6")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem6")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(TurquoiseAppleItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount6")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playerTradeItem6")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(AlexadriteAppleItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount6")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount6"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		}
	}
}
