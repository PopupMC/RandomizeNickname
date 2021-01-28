package com.popupmc.randomizenickname;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandRNick implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if(args.length > 0) {
            sender.sendMessage(new String[]{
                    ChatColor.translateAlternateColorCodes('&', "&7Usage: &e/rnick"),
                    ChatColor.translateAlternateColorCodes('&', "&6Randomizes your nickname for easy anonymity")
            });
            return false;
        }

        String adj = Adjectives.getAdj();
        String noun = Nouns.getNoun();
        String uid = Integer.toString(FormatTools.getRandomNumber(0, 9999));

        if(FormatTools.getRandomNumber(0, 100) <= 25) {
            adj = FormatTools.getFormat() + adj;
        }

        if(FormatTools.getRandomNumber(0, 100) <= 25) {
            adj = FormatTools.getColor() + adj;
        }
        else {
            adj = "&f" + adj;
        }

        if(FormatTools.getRandomNumber(0, 100) <= 25) {
            noun = FormatTools.getFormat() + noun;
        }

        if(FormatTools.getRandomNumber(0, 100) <= 25) {
            noun = FormatTools.getColor() + noun;
        }
        else {
            noun = "&f" + noun;
        }

        if(FormatTools.getRandomNumber(0, 100) <= 25) {
            uid = FormatTools.getFormat() + uid;
        }

        if(FormatTools.getRandomNumber(0, 100) <= 25) {
            uid = FormatTools.getColor() + uid;
        }
        else {
            uid = "&f" + uid;
        }

        String newNick = adj + "&r" + noun + "&r" + uid;

        Bukkit.dispatchCommand(sender, "nick " + newNick);

        sender.sendMessage(new String[]{
                ChatColor.translateAlternateColorCodes('&', "&6Your nickname is now: &r" + newNick)
        });

        return true;
    }
}
