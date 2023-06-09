package main.java.com.zunescape.market;
import java.util.Scanner;

import main.java.com.zunescape.royale.util.PlayerDb;

public class PlayerExchange {

    private PlayerDb playerDb;

    public PlayerExchange(PlayerDb playerDb) {
        this.playerDb = playerDb;
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, This is the player exchange! You can trade or barter items here:");
        System.out.println("1 - Troll Fat - 200 gold");
        System.out.println("2 - Old Bones - 20 gold");
        System.out.println("3 - Ebony Armor - 1000 gold");
        System.out.print("Select an item to trade: ");
        String item = scanner.nextLine();
        if (playerDb.addItem(item)) {
            System.out.println("Your trade/barter was successful!");
        } else {
            System.out.println("This item is already in your inventory.");
        }
    }
}
