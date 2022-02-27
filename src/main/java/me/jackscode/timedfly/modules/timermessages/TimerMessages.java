package me.jackscode.timedfly.modules.timermessages;

import me.jackscode.timedfly.modules.timermessages.commands.TimeLeft;
import me.jackscode.timedfly.api.Module;
import me.jackscode.timedfly.exceptions.CommandException;

public final class TimerMessages extends Module {

    @Override public void onModuleEnable() {
        this.registerEvents(new TimedFlyEventsListener());
        try {
            this.getCommandHandler().register(new TimeLeft(), this);
        } catch (CommandException e) {
            e.printStackTrace();
        }
    }

    @Override public void onModuleDisable() {
        // TODO: Something
    }
}
