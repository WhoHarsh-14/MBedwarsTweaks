package me.metallicgoat.tweaksaddon;

public class Console {

    public static void printWarn(String warn){
        MBedwarsTweaksPlugin.getInstance().getLogger().warning(warn);
    }

    public static void printInfo(String info){
        MBedwarsTweaksPlugin.getInstance().getLogger().info(info);
    }

    public static void printInfo(String... strings){
        for(String s : strings)
            printInfo(s);
    }

    public static void printConfigWarn(String warn, String config){
        printWarn("[Config-" + config + "] " + warn);
    }

    public static void printConfigInfo(String info, String config){
        printInfo("[Config-" + config + "] " + info);
    }
}
