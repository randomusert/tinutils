package io.github.randomusert.mods.tinutils.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BaseBlockEntity extends BlockEntity {
    public BaseBlockEntity(BlockEntityType<?> blockEntityType, BlockPos Pos, BlockState State) {
        super(blockEntityType, Pos, State);
    }
}
