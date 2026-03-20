package io.github.randomusert.mods.tinutils.interfaces;

public interface ICommandClass {

    // Command name (e.g. "info", "tpall")
    String getName();

    // Execute command
    int execute(net.minecraft.commands.CommandSourceStack source, String[] args);

}