package com.github.euonmyoji.newhonor.command.admin;

import com.github.euonmyoji.newhonor.mung.command.SubCommand;
import org.bukkit.command.CommandSender;

public class HelpCommand {

    @SubCommand(
            command = "Admin",
            description = "${newhonor.command.describe.admin}",
            console = true
    )
    public void execute(CommandSender sender) {
    }
}