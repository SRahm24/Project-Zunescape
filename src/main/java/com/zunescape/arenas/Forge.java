package main.java.com.zunescape.arenas;
import java.util.Scanner;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.arenas.Tourneys;
import main.java.com.zunescape.royale.BattleRoyale;

public class Forge {
    private static Scanner inputScanner;
    private static Arenas arenas;
    private static Tourneys tourneys;

    public Forge(Arenas arenas, Tourneys tourneys)
    {
        this.arenas = arenas;
        this.tourneys = tourneys;
    }

    public void enter()
    {
        System.out.println("Welcome! Enter in the name of an arena or 'Tourney' followed with its invite!");
        inputScanner = new Scanner(System.in);
        String forgeInput = inputScanner.nextLine();
        if (forgeInput.equals("arena") || forgeInput.equals("Arena"))
        {
            arenas.addArenas(forgeInput);
        }
        else if (forgeInput.startsWith("Tourney"))
        {
            String tourneyInvite = forgeInput.substring(7);
            tourneys.addTourney(forgeInput);
        }
        else
        {
            System.out.println("Invalid Input!");
        }
    }
}
