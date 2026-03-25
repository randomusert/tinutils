package io.github.randomusert.mods.tinutils.blocks;

import io.github.randomusert.mods.tinutils.api.block.BaseBlockEntity;
import io.github.randomusert.mods.tinutils.api.energy.EnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public class BasicTinEnergyCube extends BaseBlockEntity {
    private final EnergyStorage energy = new EnergyStorage(10000);

    public BasicTinEnergyCube(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState blockState, Level level, BlockPos blockPos, Player player, BlockHitResult blockHitResult) {
        if (!level.isClientSide) {
            Component.literal("Energy:" + energy);
        }
        return super.useWithoutItem(blockState, level, blockPos, player, blockHitResult);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BasicTinEnergyCubeEntity(blockPos, blockState);
    }
}
