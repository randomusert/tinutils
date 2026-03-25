package io.github.randomusert.mods.tinutils.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.randomusert.mods.tinutils.Tinutils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class TinutilsBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Tinutils.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<BasicTinEnergyCubeEntity>> BASIC_TIN_ENERGY_CUBE =
            BLOCK_ENTITIES.register("basic_tin_energy_cube", () -> BlockEntityType.Builder.of(BasicTinEnergyCubeEntity::new, TinutilsBlocks.BASIC_TIN_ENERGY_CUBE.get()).build(null));

    public static void init() {
        BLOCK_ENTITIES.register();
    }
}
