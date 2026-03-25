package io.github.randomusert.mods.tinutils;

import dev.architectury.event.events.common.CommandRegistrationEvent;
import io.github.randomusert.mods.tinutils.blocks.TinutilsBlockEntities;
import io.github.randomusert.mods.tinutils.blocks.TinutilsBlocks;
import io.github.randomusert.mods.tinutils.commands.InfoCmd;
import io.github.randomusert.mods.tinutils.commands.TinUtilsCommands;
import io.github.randomusert.mods.tinutils.item.TinutilsItems;

public final class Tinutils {
    public static final String MOD_ID = "tinutils";

    public static void init() {
        TinutilsItems.init();
        TinutilsBlocks.init();
        TinutilsBlockEntities.init();

        CommandRegistrationEvent.EVENT.register((dispatcher, registryAccess, environment) -> {
            TinUtilsCommands.register(new InfoCmd());
            TinUtilsCommands.registerAll(dispatcher);
        });

    }
}
