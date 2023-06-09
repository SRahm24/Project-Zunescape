package main.java.com.zunescape.royale;

import java.util.Random;
import java.util.Set;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.arenas.Tourneys;
import main.java.com.zunescape.royale.util.Contestant;
import main.java.com.zunescape.royale.chat.Chat;

public class BattleRoyale {
    private static Arenas arenas;
    private static Tourneys tourneys;
    private Chat chat;

    public BattleRoyale(Arenas arenas, Tourneys tourneys, Chat chat) 
    {
        this.arenas = arenas;
        this.tourneys = tourneys;
        this.chat = chat;
    }
    
    public void battle(String input, Set<Contestant> contestantsSet) {
        if (tourneys.hasInvite(input)) {
          String tourneyName = tourneys.loadTourney(input);
          System.out.println("Welcome to the Tournament " + tourneyName);
          System.out.println("You Win!");
        } else {
          arenas.loadArena(input);
          System.out.println("Welcome to " + input);
          Contestant winner = selectWinner(contestantsSet);
          //System.out.println(winner.getPID() + " wins!");
        }
        chat.postMessage(contestantsSet, null, "Hello, World!");
      }
    private Contestant selectWinner(Set<Contestant> contestantsSet)
    {
      int setSize = contestantsSet.size();
      int setItem = new Random().nextInt(setSize);
      int counter = 0;
      for (Contestant selectedWinner : contestantsSet)
      {
        if (counter == setItem)
        {
            return selectedWinner;
        }
        counter++;
      }
      return null;
    }
}
