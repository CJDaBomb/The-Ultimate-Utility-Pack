
package net.mcreator.moreoresandarmour.block;

import net.minecraft.block.material.Material;

@MoreOresAndArmourModElements.ModElement.Tag
public class CopperWireBlock extends MoreOresAndArmourModElements.ModElement {

	@ObjectHolder("more_ores_and_armour:copper_wire")
	public static final Block block = null;

	@ObjectHolder("more_ores_and_armour:copper_wire")
	public static final TileEntityType<CustomTileEntity> tileEntityType = null;

	public CopperWireBlock(MoreOresAndArmourModElements instance) {
		super(instance, 67);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(UltimateUtlityDecorItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public void registerTileEntity(RegistryEvent.Register<TileEntityType<?>> event) {
		event.getRegistry().register(TileEntityType.Builder.create(CustomTileEntity::new, block).build(null).setRegistryName("copper_wire"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
	}

	public static class CustomBlock extends Block {

		public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

		public CustomBlock() {
			super(

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.2f, 10f).lightValue(0)
							.doesNotBlockMovement().notSolid());

			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));

			setRegistryName("copper_wire");
		}

		@Override
		public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return false;
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
			switch ((Direction) state.get(FACING)) {
				case UP :
				case DOWN :
				case SOUTH :
				default :
					return VoxelShapes.create(1D, 0D, 1D, 0D, 0.4D, 0D);
				case NORTH :
					return VoxelShapes.create(0D, 0D, 0D, 1D, 0.4D, 1D);
				case WEST :
					return VoxelShapes.create(0D, 0D, 1D, 1D, 0.4D, 0D);
				case EAST :
					return VoxelShapes.create(1D, 0D, 0D, 0D, 0.4D, 1D);
			}
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
		}

		@Override
		public PushReaction getPushReaction(BlockState state) {
			return PushReaction.DESTROY;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean moving) {
			super.onBlockAdded(state, world, pos, oldState, moving);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, this.tickRate(world));
		}

		@Override
		public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
			super.tick(state, world, pos, random);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);

				CopperWireRedstoneOnProcedure.executeProcedure($_dependencies);
			}
			world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, this.tickRate(world));
		}

		@Override
		public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			return tileEntity instanceof INamedContainerProvider ? (INamedContainerProvider) tileEntity : null;
		}

		@Override
		public boolean hasTileEntity(BlockState state) {
			return true;
		}

		@Override
		public TileEntity createTileEntity(BlockState state, IBlockReader world) {
			return new CustomTileEntity();
		}

		@Override
		public boolean eventReceived(BlockState state, World world, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, world, pos, eventID, eventParam);
			TileEntity tileentity = world.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public boolean hasComparatorInputOverride(BlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(BlockState blockState, World world, BlockPos pos) {
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity instanceof CustomTileEntity)
				return Container.calcRedstoneFromInventory((CustomTileEntity) tileentity);
			else
				return 0;
		}

	}

	public static class CustomTileEntity extends LockableLootTileEntity implements ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);

		protected CustomTileEntity() {
			super(tileEntityType);
		}

		@Override
		public void read(CompoundNBT compound) {
			super.read(compound);

			if (!this.checkLootAndRead(compound)) {
				this.stacks = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
			}

			ItemStackHelper.loadAllItems(compound, this.stacks);

		}

		@Override
		public CompoundNBT write(CompoundNBT compound) {
			super.write(compound);

			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
			}

			return compound;
		}

		@Override
		public SUpdateTileEntityPacket getUpdatePacket() {
			return new SUpdateTileEntityPacket(this.pos, 0, this.getUpdateTag());
		}

		@Override
		public CompoundNBT getUpdateTag() {
			return this.write(new CompoundNBT());
		}

		@Override
		public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
			this.read(pkt.getNbtCompound());
		}

		@Override
		public int getSizeInventory() {
			return stacks.size();
		}

		@Override
		public boolean isEmpty() {
			for (ItemStack itemstack : this.stacks)
				if (!itemstack.isEmpty())
					return false;
			return true;
		}

		@Override
		public ITextComponent getDefaultName() {
			return new StringTextComponent("copper_wire");
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public Container createMenu(int id, PlayerInventory player) {
			return ChestContainer.createGeneric9X3(id, player, this);
		}

		@Override
		public ITextComponent getDisplayName() {
			return new StringTextComponent("Copper Wire");
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		protected void setItems(NonNullList<ItemStack> stacks) {
			this.stacks = stacks;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			return true;
		}

		@Override
		public int[] getSlotsForFace(Direction side) {
			return IntStream.range(0, this.getSizeInventory()).toArray();
		}

		@Override
		public boolean canInsertItem(int index, ItemStack stack, @Nullable Direction direction) {
			return this.isItemValidForSlot(index, stack);
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, Direction direction) {
			return true;
		}

		private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
			if (!this.removed && facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
				return handlers[facing.ordinal()].cast();

			return super.getCapability(capability, facing);
		}

		@Override
		public void remove() {
			super.remove();
			for (LazyOptional<? extends IItemHandler> handler : handlers)
				handler.invalidate();
		}

	}

}
