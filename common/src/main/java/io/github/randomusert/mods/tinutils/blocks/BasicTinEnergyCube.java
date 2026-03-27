package io.github.randomusert.mods.tinutils.blocks;

import io.github.randomusert.mods.tinutils.api.block.BaseBlock;
import io.github.randomusert.mods.tinutils.menu.BasicTinEnergyCubeMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;


public class BasicTinEnergyCube extends BaseBlock {


    public BasicTinEnergyCube(Properties properties) {
        super(properties);
    }


    @Override
    protected @NotNull InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos,
                                                        Player player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide) {
            MenuProvider provider = new MenuProvider() {
                @Override
                public @NotNull Component getDisplayName() {
                    return Component.literal("Energy Cube");
                }

                @Override
                public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                    BlockEntity be = world.getBlockEntity(pos);
                    if (be instanceof BasicTinEnergyCubeEntity energyBE) {
                        return new BasicTinEnergyCubeMenu(id, energyBE);
                    }
                    return null;
                }
            };

            NetworkHooks.openGui((ServerPlayer) player, provider, pos);
        }

        return InteractionResult.sidedSuccess(world.isClientSide);
    }
}
