package finalJavaProject;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();					// Instantiated a new deck of Deck class
			System.out.println("DECK OF CARDS:");
			System.out.println();
		deck.describe();						// Describe method to display the deck.
		
		System.out.println();
		System.out.println("SHUFFLED DECK OF CARDS:");
		deck.shuffle();							// Shuffle method to randomize the order.
		System.out.println();
		deck.describe();						// Describe method to display newly shuffled deck.
	Player playerOne = new Player();			// Instantiating two players from Player class and assigning them a name.
	Player playerTwo = new Player();
	playerOne.setPlayerName("Player one");
	playerTwo.setPlayerName("Player two");
	
		for (int i = 0; i < 52; i++) {			// Iterating over the deck to split it among player one and two using the modulus operator
			if (i % 2 == 0) {
				playerOne.draw(deck);
			}else {
				playerTwo.draw(deck);
				}
		}
		
		System.out.println();					// Displaying each players cards in their hand.
		System.out.println(playerOne.getPlayerName() + "'s cards: ");
		System.out.println();
		System.out.println(playerOne.getHand());
		System.out.println();
		System.out.println(playerTwo.getPlayerName() + "'s cards: ");
		System.out.println();
		System.out.println(playerTwo.getHand());
			int round = 1;						// Displaying each round using a for loop.
		for (int i = 0; i < 26; i++) {
			System.out.println();
			System.out.println("     Round " + round + ":");
			round++;
		Card card = playerOne.flip();			// Flipping a card from the top of each players hand and printing it to start each round.
		Card card2 = playerTwo.flip();
			System.out.println(playerOne.getPlayerName() + " flips card: ");
		card.describe();
			System.out.println(playerTwo.getPlayerName() + " flips card: ");
		card2.describe();
		
		if (card.getValue() > card2.getValue()) { // If else method to determine the winner of each round.
			playerOne.incrementScore();
			System.out.println();
			System.out.println("Winning point goes to " + playerOne.getPlayerName() + ".");
			System.out.println();
		}else if (card.getValue() < card2.getValue()) {
			playerTwo.incrementScore();
			System.out.println();
			System.out.println("Winning point goes to " + playerTwo.getPlayerName() + ".");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("It's a draw. No points given this round.");
			System.out.println();
		}
			System.out.println("Score tracker:");
			System.out.println("Player one's score: " + playerOne.getScore());
			System.out.println("Player two's score: " + playerTwo.getScore());
		}
		
		System.out.println("--------------------------");	// Printing out each players final score.
		System.out.println("Player one's game score: " + playerOne.getScore());
		System.out.println("Player two's game score: " + playerTwo.getScore());
		System.out.println("--------------------------");	
		System.out.println();
		System.out.println("      END OF GAME");
			int playerOneGameScore = playerOne.getScore();
			int playerTwoGameScore = playerTwo.getScore();
		
			if (playerTwoGameScore > playerOneGameScore) {	// Comparing the final score of each player and declaring a winner.
				System.out.println("Player two wins the game!");
			}else if (playerOneGameScore > playerTwoGameScore) {
				System.out.println("Player one wins the game!");
			}else {
				System.out.println("It's a draw!");
			}
	}
}
