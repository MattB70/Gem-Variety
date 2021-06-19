package com.mattborle.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;

public class BaseHorizontalBlock extends Block {

    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;

    public BaseHorizontalBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(HORIZONTAL_FACING, Direction.NORTH));
    }

    @SuppressWarnings("depricated")
    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(HORIZONTAL_FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.setValue(HORIZONTAL_FACING, direction.rotate(state.getValue(HORIZONTAL_FACING)));
    }

    @Nullable
    @Override // when block is placed
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(HORIZONTAL_FACING, context.getHorizontalDirection().getOpposite()); // face the player when placed.
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(HORIZONTAL_FACING);
    }
}
