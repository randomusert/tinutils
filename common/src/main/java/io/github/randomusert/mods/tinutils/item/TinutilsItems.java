package io.github.randomusert.mods.tinutils.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.randomusert.mods.tinutils.Tinutils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class TinutilsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Tinutils.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> CRUDE_DIAMOND = ITEMS.register("crude_diamond",
            () -> new Item(new Item.Properties().stacksTo(64).fireResistant()));

    public static void init() {
        ITEMS.register();
    }
}
