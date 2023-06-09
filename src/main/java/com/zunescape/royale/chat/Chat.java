package main.java.com.zunescape.royale.chat;
import java.util.Set;

import main.java.com.zunescape.royale.util.Contestant;
import main.java.com.zunescape.royale.util.RangeValidator;;

public class Chat {
    public void postMessage(Set<Contestant> contestants, Contestant sender, String chatMessage)
    {
        Set<Contestant> withinRangeContestants = RangeValidator.withinRange(contestants, sender);
        if (!withinRangeContestants.isEmpty()) {
            for (Contestant contestant : withinRangeContestants) {
                System.out.println(sender.getPID() + ": " + chatMessage);
            }
        }
    }
}
