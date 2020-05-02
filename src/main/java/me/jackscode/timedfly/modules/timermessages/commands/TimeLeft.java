package me.jackscode.timedfly.modules.timermessages.commands;

import me.jackscode.timedfly.api.Command;
import me.jackscode.timedfly.api.Messenger;
import me.jackscode.timedfly.api.entity.TFPlayer;
import me.jackscode.timedfly.enums.CommandType;

public class TimeLeft extends Command {

    public TimeLeft() {
        super("timeleft", CommandType.TFLY, "Get the time left of [player]", null);
    }

    @Override public void execute(Messenger messenger, String[] args) {
        if (messenger.isConsole()) {
            System.out.println("Only players!");
            return;
        }

        TFPlayer player = messenger.getTfPlayer();
        player.sendMessage(String.format("You have %d left", player.getTimeLeft()));
    }
}
