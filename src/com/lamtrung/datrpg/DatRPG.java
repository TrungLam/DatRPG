package com.lamtrung.datrpg;

import org.bukkit.plugin.java.JavaPlugin;

public class DatRPG extends JavaPlugin{


	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		super.onEnable();
		getServer().getPluginManager().registerEvents(new FireStick(this), this);

	}

}
