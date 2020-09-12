package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class BedrockZonePlayerEntersDimensionProcedure extends MoreOresAndArmourModElements.ModElement {

	public BedrockZonePlayerEntersDimensionProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 117);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BedrockZonePlayerEntersDimension!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		ItemStack randomtrade = ItemStack.EMPTY;
		double randomtrade1 = 0;
		randomtrade1 = (double) ((new java.util.Random()).nextInt((int) 5 + 1));
		if (((randomtrade1) == 0)) {
			randomtrade = new ItemStack(RubyAppleItem.block, (int) (1));
		} else if (((randomtrade1) == 1)) {
			randomtrade = new ItemStack(AluminumAppleItem.block, (int) (1));
		} else if (((randomtrade1) == 2)) {
			randomtrade = new ItemStack(TurquoiseAppleItem.block, (int) (1));
		} else if (((randomtrade1) == 3)) {
			randomtrade = new ItemStack(DiamondAppleItem.block, (int) (1));
		} else if (((randomtrade1) == 4)) {
			randomtrade = new ItemStack(CopperAppleItem.block, (int) (1));
		} else if (((randomtrade1) == 5)) {
			randomtrade = new ItemStack(SapphireAppleItem.block, (int) (1));
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = (randomtrade);
			_setstack.setCount((int) (((new java.util.Random()).nextInt((int) 4 + 1)) + 1));
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Blocks.TNT, (int) (1));
			_setstack.setCount((int) (((new java.util.Random()).nextInt((int) 20 + 1)) + 5));
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}

	}

}
