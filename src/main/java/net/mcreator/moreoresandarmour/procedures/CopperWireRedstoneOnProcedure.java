package net.mcreator.moreoresandarmour.procedures;

@MoreOresAndArmourModElements.ModElement.Tag
public class CopperWireRedstoneOnProcedure extends MoreOresAndArmourModElements.ModElement {

	public CopperWireRedstoneOnProcedure(MoreOresAndArmourModElements instance) {
		super(instance, 309);

	}

	public static void executeProcedure(Map<String, Object> dependencies){
		if(dependencies.get("x") == null){
			System.err.println("Failed to load dependency x for procedure CopperWireRedstoneOn!");
			return;
		}
		if(dependencies.get("y") == null){
			System.err.println("Failed to load dependency y for procedure CopperWireRedstoneOn!");
			return;
		}
		if(dependencies.get("z") == null){
			System.err.println("Failed to load dependency z for procedure CopperWireRedstoneOn!");
			return;
		}
		if(dependencies.get("world") == null){
			System.err.println("Failed to load dependency world for procedure CopperWireRedstoneOn!");
			return;
		}

				double x = dependencies.get("x") instanceof Integer
					? (int) dependencies.get("x") : (double) dependencies.get("x");
				double y = dependencies.get("y") instanceof Integer
					? (int) dependencies.get("y") : (double) dependencies.get("y");
				double z = dependencies.get("z") instanceof Integer
					? (int) dependencies.get("z") : (double) dependencies.get("z");
				IWorld world = (IWorld) dependencies.get("world");

		if ((==(true))) {if(!world.getWorld().isRemote) {
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	TileEntity _tileEntity=world.getTileEntity(_bp);
	BlockState _bs = world.getBlockState(_bp);
	if(_tileEntity != null)
		_tileEntity.getTileData().putBoolean("copperWireIsPowered", (true));

	world.getWorld().notifyBlockUpdate(_bp, _bs, _bs, 3);
}if(world instanceof ServerWorld) {
		((ServerWorld)world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z,
		(int)5, 3, 3, 3, 1);
}}

	}

}
