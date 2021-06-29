package me.aglerr.lazylibs.libs;

import me.aglerr.lazylibs.LazyLibs;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class Executor {

    public static BukkitTask sync(Runnable runnable){
        return Bukkit.getScheduler().runTask(LazyLibs.getInstance(), runnable);
    }

    public static BukkitTask syncTimer(long delay, long time, Runnable runnable){
        return Bukkit.getScheduler().runTaskTimer(LazyLibs.getInstance(), runnable, delay, time);
    }

    public static BukkitTask syncLater(long delay, Runnable runnable){
        return Bukkit.getScheduler().runTaskLater(LazyLibs.getInstance(), runnable, delay);
    }

    public static BukkitTask async(Runnable runnable){
        return Bukkit.getScheduler().runTaskAsynchronously(LazyLibs.getInstance(), runnable);
    }

    public static BukkitTask asyncTimer(long delay, long time, Runnable runnable){
        return Bukkit.getScheduler().runTaskTimerAsynchronously(LazyLibs.getInstance(), runnable, delay, time);
    }

    public static BukkitTask asyncLater(long delay, Runnable runnable){
        return Bukkit.getScheduler().runTaskLaterAsynchronously(LazyLibs.getInstance(), runnable, delay);
    }
}
