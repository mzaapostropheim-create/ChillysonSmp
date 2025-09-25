package com.chillyson.smp;

import org.bukkit.plugin.java.JavaPlugin;

public class ChillysonSmp extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ChillysonSmp plugin enabled!");
        getCommand("chillyson").setExecutor(new ChillysonCommand());
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("ChillysonSmp plugin disabled!");
    }
}
