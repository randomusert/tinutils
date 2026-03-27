package io.github.randomusert.mods.tinutils.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.randomusert.mods.tinutils.Tinutils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TinutilsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Tinutils.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> BASIC_TIN_ENERGY_CUBE =
            BLOCKS.register("basic_tin_energy_cube", () -> new BasicTinEnergyCube(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(4f)));

    public static void init() {
        BLOCKS.register();
    }
}
