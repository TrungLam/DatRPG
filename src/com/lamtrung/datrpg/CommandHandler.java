package com.lamtrung.datrpg;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor{

	public DatRPG plugin;
	
	public CommandHandler(DatRPG plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2,
			String[] arg3) {
		return false;
		
	}

}
