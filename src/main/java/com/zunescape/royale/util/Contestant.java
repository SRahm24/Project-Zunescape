package main.java.com.zunescape.royale.util;

public class Contestant {
    private String playerId;
    private int elo;

    public Contestant(String playerId, int elo) {
        this.playerId = playerId;
        this.elo = elo;
    }
    public String getPID()
    {
        return this.playerId;
    }
    public int getElo()
    {
        return this.elo;
    }

}
