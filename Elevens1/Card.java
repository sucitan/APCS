/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card  {

	
	private String suit;

	private String rank;

	private int pointValue;


   
	public Card(String cardRank, String cardSuit, int cardPointValue) {
	    this.suit = cardSuit;
	    this.rank = cardRank;
	    this.pointValue = cardPointValue;

	}


	
	public String suit() {
		return suit;
   }

	
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank;
	}

   
	public int pointValue() {
		return pointValue;
	}

	
	
	public boolean matches(Card otherCard) {
if(rank!= otherCard.rank()){return false;}
else if(suit!=otherCard.suit()){ return false;}
else if (pointValue!=otherCard.pointValue()){return false;}
else return true;
}
	
	@Override
	public String toString() {
 String s = (rank + " of " + suit + " (point value = " + pointValue + ")");
 return s;
	}
}
