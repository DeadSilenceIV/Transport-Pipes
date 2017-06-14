package de.robotricker.transportpipes.pipeutils.commands;

import org.bukkit.command.CommandSender;

import de.robotricker.transportpipes.TransportPipes;

public class ReloadConfigCommandExecutor implements PipesCommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs) {
		if (!cs.hasPermission(TransportPipes.instance.getConfig().getString("permissions.reload", "tp.reload"))) {
			return false;
		}
		TransportPipes.instance.reloadConfig();
		cs.sendMessage(TransportPipes.instance.PREFIX + "Config reloaded");
		return true;
	}

}