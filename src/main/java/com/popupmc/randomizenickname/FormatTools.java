package com.popupmc.randomizenickname;

import java.util.Random;

public class FormatTools {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static boolean chanceSuccess(int chance) {
        return getRandomNumber(0, 100) <= chance;
    }

    public static String getColor() {
        int rnd = new Random().nextInt(colorOptions.length);
        return colorOptions[rnd];
    }

    public static String getFormat() {
        int rnd = new Random().nextInt(formatOptions.length);
        return formatOptions[rnd];
    }

    public static final String[] colorOptions = {
            "&2",   // Dark Green
            "&3",   // Dark Cyan
            "&4",   // Dark Red
            "&5",   // Dark Magenta
            "&6",   // Dark Yellow
            "&7",   // Light Gray
            "&a",   // Green
            "&b",   // Cyan
            "&c",   // Red
            "&d",   // Magenta
            "&e",   // Yellow
            "&f"    // White
    };

    public static final String[] formatOptions = {
            "&n",   // Underline
            "&o",   // Italic
            "&m"    // Strikethrough
    };
}
