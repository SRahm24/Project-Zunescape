package main.java.com.zunescape.royale;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.arenas.Tourneys;
import main.java.com.zunescape.royale.chat.Chat;
import main.java.com.zunescape.royale.util.Contestant;

public class BattleQueue {

    private static Scanner inputScanner;

    private static Arenas arenas = new Arenas();
    private static Tourneys tourneys = new Tourneys();
    private static Chat chat = new Chat();
    private static BattleMatcher matcher = new BattleMatcher();
    private static BattleRoyale royale = new BattleRoyale(arenas, tourneys, chat);

    public static void enqueue(Contestant contestant) {
        String arenaID = selectArena();
        Set<Contestant> contestantsSet = matcher.findContestants(contestant, arenaID);
        royale.battle(arenaID, contestantsSet);
    }
    private static String selectArena()
    {
        Set arenasSet = arenas.getArenas();
        System.out.println("Please select an arena from the following:");
        System.out.println(arenasSet);
        inputScanner = new Scanner(System.in);
        String selectedArena = inputScanner.nextLine();
        return selectedArena;
    }
}


