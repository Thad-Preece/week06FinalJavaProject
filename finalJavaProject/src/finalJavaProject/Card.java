package finalJavaProject;


public class Card {
	 
	int value;			// Fields
	String name;
	
public Card() {}	
	
public Card(int value, String suit) {   	//If else statements to determine the card value and equating it to it's name.
	this.value = value;
	
	if (value == 2) {
		name = "two";
	}else if (value == 3) {
		name = "Three";
	}else if (value == 4) {
		name = "Four";
	}else if (value == 5) {
		name = "Five";
	}else if (value == 6) {
		name = "Six";
	}else if (value == 7) {
		name = "Seven";
	}else if (value == 8) {
		name = "Eight";
	}else if (value == 9) {
		name = "Nine";
	}else if (value == 10) {
		name = "Ten";
	}else if (value == 11) {
		name = "Jack";
	}else if (value == 12) {
		name = "Queen";
	}else if (value == 13) {
		name = "King";
	}else {
		name = "Ace";
	}
	name = name + " of " + suit;			// Joins the name of the card with the suit of the card.
}

public int getValue() {						// Getter and Setter methods for value.
	return value;
}

public void setValue(int value) {
	this.value = value;
}

@Override
public String toString() {					// Overrides standard toString() method to return the name of the card. 
	return name;
}

public void describe() {					// Method to print the name of a card.
	System.out.println(name);
	}
}


