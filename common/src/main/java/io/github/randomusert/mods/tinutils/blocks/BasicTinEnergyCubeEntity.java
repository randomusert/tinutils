package io.github.randomusert.mods.tinutils.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTinEnergyCubeEntity extends BlockEntity {
    public BasicTinEnergyCubeEntity(BlockPos blockPos, BlockState blockState) {
        super(TinutilsBlockEntities.BASIC_TIN_ENERGY_CUBE.get(),blockPos, blockState);
    }
}
