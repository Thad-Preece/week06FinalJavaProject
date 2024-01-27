package finalJavaProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String playerName;			// Fields Displaying the players name, their score, and their hand.
	int score;
	
	List<Card> hand = new ArrayList<Card>();	// Instantiating an ArrayList of card called hand.
	
public Player() {}			// The constructor
	
public Player(String playerName, List<Card> hand, int score) {
	this.playerName = playerName;
	this.hand = hand;
	this.score = 0;
	}

public void describe() {			// Method that displays the players cards in their hand.
	for (Card card : this.hand) {
		card.describe();
	}
}

public Card flip() {				// Method that removes the top card of players hand.
	return hand.remove(0);
}

public void draw(Deck deck) {		// Method that deals the deck to the hand.
	hand.add(deck.draw());
}

public void incrementScore() {		// Method that adds a point to the score.
	score++;
}

public int getScore() {				// Getter/Setter methods.
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public List<Card> getHand() {
	return hand;
}

public void setHand(List<Card> hand) {
	this.hand = hand;
}

}
