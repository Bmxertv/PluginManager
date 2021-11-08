package de.bmxertv.pluginmanager.utils;

import org.bukkit.ChatColor;

public class ColorUtils {

    public static String colorize(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static String strip(String s) {
        return ChatColor.stripColor(s);
    }

}
