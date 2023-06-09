package main.java.com.zunescape.market;
import java.util.Scanner;

import main.java.com.zunescape.royale.util.PlayerDb;

public class GameStore {

    private PlayerDb playerDb;

    public GameStore(PlayerDb playerDb) {
        this.playerDb = playerDb;
    }

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the marketplace! Whatever you want, it's yours, my friend, as long as you have enough rubies:");
        System.out.println("1. Elder Scroll - 1000 gold");
        System.out.println("2 - Wooden Sword - 100 gold");
        System.out.println("3 - Holy Hand Grenade - 500 gold");
        System.out.print("Select an item to purchase: ");
        String item = scanner.nextLine();
        if (playerDb.addItem(item)) {
            System.out.println("Item successfully bought!");
        } else {
            System.out.println("This item is already in your inventory.");
        }
    }
}