import java.util.ArrayList;
import java.util.List;

public class Player {
    String playerName;
    List<Card> playerHand;
    private int score;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHand = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public void incrementScore(){
        score++;
    }

    public int getScore(){
        return score;
    }
}