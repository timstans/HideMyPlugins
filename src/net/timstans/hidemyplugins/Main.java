package net.timstans.hidemyplugins;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable(){
		PluginManager pm = this.getServer().getPluginManager();
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"[HideMyPlugins] "
				+ChatColor.RED+"Loaded!");
		pm.registerEvents(new PlayerListener(), this);
		
		
	}

}
