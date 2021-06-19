package com.mattborle.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ZeoCoreBlock extends BaseHorizontalBlock{

    protected static final Map<Direction, VoxelShape> SHAPES = new HashMap<Direction, VoxelShape>();

    private static final VoxelShape SHAPE = Stream.of(
            Block.box(1, 1, 1, 15, 15, 15),
            Block.box(3, 1, 3, 13, 15, 13),
            Block.box(0, 0, 0, 16, 1, 16),
            Block.box(0, 15, 0, 16, 16, 16),
            Block.box(0, 1, 0, 1, 15, 1),
            Block.box(0, 1, 15, 1, 15, 16),
            Block.box(15, 1, 15, 16, 15, 16),
            Block.box(15, 1, 0, 16, 15, 1)
            ).reduce((v1, v2) -> {return VoxelShapes.join(v1, v2, IBooleanFunction.OR);}).get();

    public ZeoCoreBlock(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.getValue(HORIZONTAL_FACING));
    }

    protected static VoxelShape calculateShapes(Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[] { shape, VoxelShapes.empty() };

        int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1],
                    VoxelShapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        return buffer[0];
    }

    protected void runCalculation(VoxelShape shape) {
        SHAPES.put(this, new HashMap<Direction, VoxelShape>());
        Map<Direction, VoxelShape> facingMap = SHAPES.get(this);
        for (Direction direction : Direction.values()) {
            facingMap.put(direction, calculateShapes(direction, shape));
        }
    }
}
