package com.chillysonsmp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ChillysonSmp extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ChillysonSmp plugin has started!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ChillysonSmp plugin has stopped!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("infuse")) {
            if (args.length != 1) {
                player.sendMessage(ChatColor.RED + "Usage: /infuse <fire|water|earth|air|reset>");
                return true;
            }

            String choice = args[0].toLowerCase();

            switch (choice) {
                case "fire":
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 0));
                    player.sendMessage(ChatColor.RED + "🔥 You are infused with Fire!");
                    break;

                case "water":
                    player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Integer.MAX_VALUE, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 0));
                    player.sendMessage(ChatColor.AQUA + "💧 You are infused with Water!");
                    break;

                case "earth":
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1));
                    player.sendMessage(ChatColor.DARK_GREEN + "⛰ You are infused with Earth!");
                    break;

                case "air":
                    player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, Integer.MAX_VALUE, 0));
                    player.sendMessage(ChatColor.WHITE + "🌬 You are infused with Air!");
                    break;

                case "reset":
                    player.getActivePotionEffects().forEach(effect -> player.removePotionEffect(effect.getType()));
                    player.sendMessage(ChatColor.YELLOW + "✨ Your infusion has been reset!");
                    break;

                default:
                    player.sendMessage(ChatColor.RED + "Unknown infuse type! Use /infuse <fire|water|earth|air|reset>");
            }
            return true;
        }

        return false;
    }
}

