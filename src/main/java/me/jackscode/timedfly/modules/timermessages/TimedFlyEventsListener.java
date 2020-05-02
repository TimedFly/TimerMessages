package me.jackscode.timedfly.modules.timermessages;

import me.jackscode.timedfly.api.entity.TFPlayer;
import me.jackscode.timedfly.api.events.TimedFlyEndEvent;
import me.jackscode.timedfly.api.events.TimedFlyRunningEvent;
import me.jackscode.timedfly.api.events.TimedFlyStartEvent;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TimedFlyEventsListener implements Listener {

    @EventHandler
    public void timeStart(TimedFlyStartEvent event) {
        TFPlayer player = event.getPlayer();
        player.sendMessage("Your timer has started");
    }

    @EventHandler
    public void timeEnd(TimedFlyEndEvent event) {
        TFPlayer player = event.getPlayer();
        player.sendMessage("Your timer has stopped");
    }

    @EventHandler
    public void timeRunning(TimedFlyRunningEvent event) {
        TFPlayer player = event.getPlayer();
        String timeLeft = String.format("You have %d left", player.getTimeLeft());

        player.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(timeLeft));
    }

}
