package main.java.com.zunescape.royale.util;
import java.util.HashSet;
import java.util.Set;

public class PlayerDb {
    private Set<String> items;

    public PlayerDb() {
        this.items = new HashSet<>();
    }

    public boolean addItem(String item) {
        return this.items.add(item);
    }

    public Set<String> getItems() {
        return this.items;
    }
}
