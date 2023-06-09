package main.java.com.zunescape.royale;
import java.util.Set;
import java.util.HashSet;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.royale.util.Contestant;

public class BattleMatcher {
    Set<Contestant> findContestants(Contestant contestantName, String chosenArena)
    {
        Set<Contestant> contestantsSet = new HashSet<>();
        contestantsSet.add(contestantName);
        contestantsSet.add(new Contestant("Ulfric", contestantName.getElo()));
        contestantsSet.add(new Contestant("Whiterun Guard", contestantName.getElo()));
        contestantsSet.add(new Contestant("Dragonborn", contestantName.getElo()));
        return contestantsSet;
    }
}
