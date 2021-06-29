package me.aglerr.lazylibs;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class Executor {

    public static void sync(Runnable runnable){
        Bukkit.getScheduler().runTask(LazyLibs.getInstance(), runnable);
    }

    public static BukkitTask syncTimer(long delay, long time, Runnable runnable){
        return Bukkit.getScheduler().runTaskTimer(LazyLibs.getInstance(), runnable, delay, time);
    }

    public static void syncLater(long delay, Runnable runnable){
        Bukkit.getScheduler().runTaskLater(LazyLibs.getInstance(), runnable, delay);
    }

    public static void async(Runnable runnable){
        Bukkit.getScheduler().runTaskAsynchronously(LazyLibs.getInstance(), runnable);
    }

    public static void asyncTimer(long delay, long time, Runnable runnable){
        Bukkit.getScheduler().runTaskTimerAsynchronously(LazyLibs.getInstance(), runnable, delay, time);
    }

    public static void asyncLater(long delay, Runnable runnable){
        Bukkit.getScheduler().runTaskLaterAsynchronously(LazyLibs.getInstance(), runnable, delay);
    }

}
