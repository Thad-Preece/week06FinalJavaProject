package finalJavaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();		// Instantiates an ArrayList of the Card class.
	
	String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};		// The suits off each card represented in an array.
	
	public Deck() {
		int[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};	// An array of integers to give a proper integer value to each card.
		for (String suit : suits) {		// Nested for loop to add every suit to every card to the ArrayList.
			int i = 2;
			for (int rank : ranks) {
				cards.add(new Card(rank, suit));
				i++;
			}
		}
	} 
	
	public void describe() {		// Method to print every card contained within the cards ArrayList.
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {			// Method to randomize the elements order in cards ArrayList using a collections method.
		Collections.shuffle(cards);
	}
	
	public Card draw() {			// method to remove the first card in the cards list and returns the card that was removed.
		Card card = cards.remove(0);
		return card;
	}
}
