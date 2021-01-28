package com.popupmc.randomizenickname;

import org.bukkit.plugin.java.JavaPlugin;

public class RandomizeNickname extends JavaPlugin {
    @Override
    public void onEnable() {
        plugin = this;
        this.getCommand("rnick").setExecutor(new CommandRNick());
        this.getCommand("anick").setExecutor(new CommandANick());
        getLogger().info("RandomizeNickname is enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("RandomizeNickname is disabled");
    }

    static JavaPlugin plugin;
}
