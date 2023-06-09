package main.java.com.zunescape.app;

import java.util.Scanner;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.arenas.Forge;
import main.java.com.zunescape.arenas.Tourneys;
import main.java.com.zunescape.royale.BattleMatcher;
import main.java.com.zunescape.royale.BattleQueue;
import main.java.com.zunescape.royale.BattleRoyale;
import main.java.com.zunescape.royale.chat.Chat;
import main.java.com.zunescape.royale.util.Contestant;
import main.java.com.zunescape.royale.util.PlayerDb;
import main.java.com.character.CharacterMenu;
import main.java.com.zunescape.market.GameStore;
import main.java.com.zunescape.market.PlayerExchange;

public class App {
    private static final Scanner userInput = new Scanner(System.in);

    private static Arenas arenas = new Arenas();
    private static Tourneys tourneys = new Tourneys();
    private static Forge forge = new Forge(arenas, tourneys);
    private static BattleMatcher matcher = new BattleMatcher();
    private static BattleQueue queue = new BattleQueue();
    private static PlayerDb playerDb =  new PlayerDb();
    private static CharacterMenu characterMenu = new CharacterMenu(playerDb);
    private static GameStore gameStore = new GameStore(playerDb);
    private static PlayerExchange playerExchange = new PlayerExchange(playerDb);
    private static Chat chat = new Chat();
    private static BattleRoyale royale = new BattleRoyale(arenas, tourneys, chat);



    public static void main(String[] args) {
        System.out.println("Welcome to Ze Wilds of Zunescape!");
        System.out.println("What would you like to do?");
        System.out.println("1)  Battle");
        System.out.println("2)  Forge");
        System.out.println("3)  Purchase");
        System.out.println("4)  Trade");
        System.out.println("5)  Accessorize");
        System.out.println("6)  Quit");

        while (true) {
            String userChoice = getInput();
            System.out.println(userChoice); // Debug for user input
            if (userChoice.equals("1")) {
                Contestant playerContestant = new Contestant("Test", 20);
                BattleQueue.enqueue(playerContestant);
            }
            else if (userChoice.equals("2"))
            {
                forge.enter();
            }
            else if (userChoice.equals("3"))
            {
                gameStore.enter();
            }
            else if (userChoice.equals("4"))
            {
                playerExchange.enter();
            }
            else if (userChoice.equals("5"))
            {
                characterMenu.open();
            }
            else if (userChoice.equals("6") || userChoice.equals("Quit") || userChoice.equals("quit")) 
            {
                userInput.close();
                break;
            }
        }
    }
    public static String getInput() {
        String selectedInput = userInput.nextLine();
        return selectedInput;
    }
}