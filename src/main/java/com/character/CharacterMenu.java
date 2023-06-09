package main.java.com.character;
import main.java.com.zunescape.royale.util.PlayerDb;

import java.util.Scanner;
import java.util.Set;

public class CharacterMenu {

    private PlayerDb playerDb;

    public CharacterMenu(PlayerDb playerDb) {
        this.playerDb = playerDb;
    }

    public void open() {
        Set<String> items = playerDb.getItems();
        System.out.println("Greetings, this is the character menu; your inventory is displayed here:");
        for (String item : items) {
            System.out.println("- " + item);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an item to equip (type 'exit' to close this menu): ");
        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            System.out.println("Equipped " + input);
            System.out.print("Equip an other item by selecting it (type 'exit' to close the menu): ");
            input = scanner.nextLine();
        }
    }
}
