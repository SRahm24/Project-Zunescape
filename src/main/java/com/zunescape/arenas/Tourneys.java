package main.java.com.zunescape.arenas;
import java.util.HashMap;

public class Tourneys {
    private HashMap<String, String> tourneysMap;

    public Tourneys()
    {
        tourneysMap = new HashMap<>();
    }
    public String addTourney(String tourney)
    {
        String tourneyInvite = String.valueOf(tourney.hashCode());
        tourneysMap.put(tourneyInvite, tourney);
        return tourneyInvite;
    }
    public boolean hasInvite(String tourneyInvite)
    {
        if (tourneysMap.containsValue(tourneyInvite))
        {
            return true;
        }
        return false;
    }
    public String loadTourney(String tourneyInvite)
    {
        if (tourneysMap.containsValue(tourneyInvite))
        {
            return tourneysMap.get(tourneyInvite);
        }
        return null;
    }
}
