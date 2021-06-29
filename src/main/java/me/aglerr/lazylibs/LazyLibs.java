package me.aglerr.lazylibs;

import org.bukkit.plugin.Plugin;

public class LazyLibs {

    private static Plugin instance;

    public static void inject(Plugin plugin){
        instance = plugin;
    }

    public static Plugin getInstance(){
        return instance;
    }

}
