package me.junias20.firstplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Firstplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("v2.0");
        System.out.println("HELLO");
        System.out.println("HELLO");
        System.out.println("HELLO");
        System.out.println("HELLO");
    getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        player.kickPlayer("Goblok belum login tolol");
        System.out.println("!!!!!!!!!!!A player has join the server name: "+ e.getPlayer().getDisplayName());
    }
}
