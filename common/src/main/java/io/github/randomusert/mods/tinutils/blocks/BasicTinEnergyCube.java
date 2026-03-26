package io.github.randomusert.mods.tinutils.blocks;

import io.github.randomusert.mods.tinutils.api.block.BaseBlock;
import io.github.randomusert.mods.tinutils.api.energy.EnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;


public class BasicTinEnergyCube extends BaseBlock {


    public BasicTinEnergyCube(Properties properties) {
        super(properties);
    }


    @Override
    protected @NotNull InteractionResult useWithoutItem(BlockState blockState, Level level, BlockPos blockPos, Player player, BlockHitResult blockHitResult) {
        if (!level.isClientSide() && level.getBlockEntity(blockPos) instanceof BasicTinEnergyCubeEntity cube) {
            int energy = cube.getEnergy();
            int capacity = cube.getCapacity();
            player.sendSystemMessage(Component.literal("Energy: " + energy + " / " + capacity));
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }
}
