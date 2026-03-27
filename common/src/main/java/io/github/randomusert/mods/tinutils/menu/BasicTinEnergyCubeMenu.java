package io.github.randomusert.mods.tinutils.menu;

import io.github.randomusert.mods.tinutils.blocks.BasicTinEnergyCubeEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;

public class BasicTinEnergyCubeMenu extends AbstractContainerMenu {

    private final BasicTinEnergyCubeEntity blockEntity;

    public BasicTinEnergyCubeMenu(int id, BasicTinEnergyCubeEntity blockEntity) {
        super(, id);
        this.blockEntity = blockEntity;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return blockEntity.getBlockPos().distSqr(player.blockPosition()) <= 64;
    }
}
