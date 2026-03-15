package io.github.randomusert.mods.tinutils.fabric;

import io.github.randomusert.mods.tinutils.Tinutils;
import net.fabricmc.api.ModInitializer;

public final class TinutilsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Tinutils.init();
    }
}
