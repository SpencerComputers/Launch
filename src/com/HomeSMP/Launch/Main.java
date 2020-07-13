package com.HomeSMP.Launch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// startup
		// reloads
		// plugin reloads
	}
	
	@Override
	public void onDisable() {
		// shutdown
		// reloads
		// plugin reloads
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("launch") || label.equalsIgnoreCase("up") || label.equalsIgnoreCase("whee")){
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command must be executed by a player!");
				return true;
			}
			Player player = (Player) sender;
			// /launch & /launch <num>
			if (args.length == 0) {
				// /launch
				player.sendMessage(ChatColor.GREEN + "Woosh!");
				player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
				
				return true;
			}
			
			// /launch <num>
			player.sendMessage(ChatColor.GREEN + "Woosh!");
			player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));
			
			return true;
		}
		return false;
	}
}
