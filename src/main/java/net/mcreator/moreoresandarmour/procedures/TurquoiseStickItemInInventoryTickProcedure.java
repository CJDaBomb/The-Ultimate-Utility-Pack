package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class TurquoiseStickItemInInventoryTickProcedure extends MoreOresAndArmourModElements.ModElement {

	public TurquoiseStickItemInInventoryTickProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 130);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TurquoiseStickItemInInventoryTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(TurquoiseStickItem.block, (int) (1)))
				: false)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1));
		}

	}

}
