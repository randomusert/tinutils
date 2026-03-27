package io.github.randomusert.mods.tinutils.blocks;

import io.github.randomusert.mods.tinutils.api.energy.EnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BasicTinEnergyCubeEntity extends BlockEntity {
    private int energy;

    private final EnergyStorage energyStorage = new EnergyStorage(10000);

    public BasicTinEnergyCubeEntity(BlockPos pos, BlockState state) {
        super(TinutilsBlockEntities.BASIC_TIN_ENERGY_CUBE.get(), pos, state);
    }

    public int getEnergy() {
        return energyStorage.getEnergy();
    }

    public int getCapacity() {
        return energyStorage.getCapacity();
    }

    public int insertEnergy(int amount, boolean simulate) {
        return energyStorage.insert(amount, simulate);
    }

    public int extractEnergy(int amount, boolean simulate) {
        return energyStorage.extract(amount, simulate);
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        setChanged();
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag, HolderLookup.Provider provider) {
        super.saveAdditional(compoundTag, provider);

        compoundTag.putInt("Energy", energy);
    }

    @Override
    protected void loadAdditional(CompoundTag compoundTag, HolderLookup.Provider provider) {
        super.loadAdditional(compoundTag, provider);

        this.energy = compoundTag.getInt("Energy");
    }
}
