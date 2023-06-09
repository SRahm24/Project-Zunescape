package main.java.com.zunescape.arenas;
import java.util.Set;
import java.util.HashSet;

public class Arenas {
    public Set<String> arenasSet;

    public void setArenas()
    {
        arenasSet = new HashSet<>();
    }

    public Set<String>getArenas()
    {
        return arenasSet;
    }
    public void addArenas(String arena)
    {
        arenasSet.add(arena);
    }
    public boolean loadArena(String arena) {
        if (arenasSet.contains(arena)) {
            return true;
        }
        return false;
    }
}