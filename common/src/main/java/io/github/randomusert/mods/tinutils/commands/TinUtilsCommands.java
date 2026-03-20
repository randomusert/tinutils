package io.github.randomusert.mods.tinutils.commands;

import com.mojang.brigadier.CommandDispatcher;
import io.github.randomusert.mods.tinutils.interfaces.ICommandClass;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public class TinUtilsCommands {
    private static final List<ICommandClass> commands = new ArrayList<>();

    public static void register(ICommandClass cmd) {
        commands.add(cmd);
    }

    public static void registerAll(CommandDispatcher<CommandSourceStack> dispatcher) {
        var root = net.minecraft.commands.Commands.literal("tinutils");

        for (ICommandClass cmd : commands) {
            root.then(
                    net.minecraft.commands.Commands.literal(cmd.getName())
                            .executes(ctx -> cmd.execute(ctx.getSource(), new String[]{}))
            );
        }

        dispatcher.register(root);
    }


}
