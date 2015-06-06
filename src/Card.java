
public class Card implements Comparable<Card>{
	
	private final int value;
	private final int suit;
	
	public Card(int value0, int suit0)
	{
		value = value0;
		suit = suit0;
	}
	public int compareTo(Card o)
	{
		int card1 = this.value;
		int card2 = o.value;
		
		if(card1 > card2)
			return 1;
		else if(card1 < card2)
			return -1;
		else 
			return 0;
		
	}
	
	public String toString()
	{
		String output;
		
		// First space is blank so that literalNames[1] is 1 and so on
		String[] literalNames = {"Blank", "Ace", "Two", "Three", "Four", "Five", "Six",
				                 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

		String[] suits = {"Blank","Clubs","Spades","Diamonds","Hearts"};
				
		output = literalNames[this.value] + " of " + suits[this.suit];
		return output;
	}
	
	public int valueOf()
	{
		return value;
	}
	
	public int suitOf()
	{
		return suit;
	}
	
	
		
		
}

