package io.github.randomusert.mods.tinutils.commands;

import io.github.randomusert.mods.tinutils.interfaces.ICommandClass;
import net.minecraft.commands.CommandSourceStack;

public class InfoCmd implements ICommandClass {

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public int execute(CommandSourceStack source, String[] args) {
        source.sendSuccess(
                () -> net.minecraft.network.chat.Component.literal("Tin Utils v1.0"),
                false
        );
        return 1;
    }
}
