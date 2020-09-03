package net.mcreator.moreoresandarmour.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreoresandarmour.potion.AbsorbsionPotion;
import net.mcreator.moreoresandarmour.MoreOresAndArmourModElements;

import java.util.Map;
import java.util.Collection;

@MoreOresAndArmourModElements.ModElement.Tag
public class AbsorbsionPotionStartedappliedProcedure extends MoreOresAndArmourModElements.ModElement {
	public AbsorbsionPotionStartedappliedProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 244);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AbsorbsionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 0) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3600))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3600, (int) 0));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 0) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 7200))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 7200, (int) 0));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 1) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3600))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3600, (int) 1));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 1) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 7200))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 7200, (int) 1));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 2) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3600))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3600, (int) 2));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 2) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 7200))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 7200, (int) 2));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3600))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3600, (int) 3));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 7200))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 7200, (int) 3));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 4) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 3600))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 3600, (int) 4));
		} else if ((((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 4) && ((new Object() {
			int check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AbsorbsionPotion.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check((LivingEntity) entity)) == 7200))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 7200, (int) 4));
		}
	}
}
