package io.github.randomusert.mods.tinutils.neoforge;

import io.github.randomusert.mods.tinutils.Tinutils;
import net.neoforged.fml.common.Mod;

@Mod(Tinutils.MOD_ID)
public final class TinutilsNeoForge {

    //tin utils neoforge module constructor
    public TinutilsNeoForge() {
        // Run our common setup.
        Tinutils.init();
    }
}
