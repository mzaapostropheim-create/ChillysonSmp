package com.chillyson.smp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ChillysonSmp extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ChillysonSmp Plugin Enabled!");

        // Example: give every online player Resistance when plugin enables
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 200, 1));
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("ChillysonSmp Plugin Disabled!");
    }
}


