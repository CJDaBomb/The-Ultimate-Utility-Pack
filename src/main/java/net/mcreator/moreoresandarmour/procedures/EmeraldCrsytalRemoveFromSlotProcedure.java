package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class EmeraldCrsytalRemoveFromSlotProcedure extends MoreOresAndArmourModElements.ModElement {

	public EmeraldCrsytalRemoveFromSlotProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 172);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmeraldCrsytalRemoveFromSlot!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
						_current.detectAndSendChanges();
					}
				}
			}
		}

	}

}
