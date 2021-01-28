package com.popupmc.randomizenickname;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandANick implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if(args.length > 0) {
            sender.sendMessage(new String[]{
                    ChatColor.translateAlternateColorCodes('&', "&7Usage: &e/anick"),
                    ChatColor.translateAlternateColorCodes('&', "&6Randomizes and obfuscates your nickname for easy anonymity." +
                            "/rnick for non-obfuscated")
            });
            return false;
        }

        String uid1 = Integer.toString(FormatTools.getRandomNumber(10000000, 99999999));
        String uid2 = Integer.toString(FormatTools.getRandomNumber(1000000,  9999999));

        String newNick = "&r&f&ka" + uid1 + uid2;

        Bukkit.dispatchCommand(sender, "nick " + newNick);

        sender.sendMessage(new String[]{
                ChatColor.translateAlternateColorCodes('&', "&6Your nickname is now: &r" + newNick)
        });

        return true;
    }
}
