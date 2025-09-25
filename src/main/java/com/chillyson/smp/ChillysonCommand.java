package com.chillyson.smp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChillysonCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("§bWelcome to §3ChillysonSmp§b! Custom SMP features coming soon...");
        return true;
    }
}
