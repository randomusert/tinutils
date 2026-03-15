package io.github.randomusert.mods.tinutils.item;

import dev.architectury.registry.registries.DeferredRegister;
import io.github.randomusert.mods.tinutils.Tinutils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Tinutils.MOD_ID, Registries.ITEM);

    public static void init() {
        ITEMS.register();
    }
}
