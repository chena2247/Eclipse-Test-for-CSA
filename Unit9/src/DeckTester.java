/**
 * This is a class that tests the Deck class.
 */
import java.util.ArrayList;
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* ACTIVITY 2 CODE::
		String[] rank = {"A", "B", "C"};
		String[] suit = {"Giraffes", "Lions"};
		int[] pointValue = {2,1,6};
		
		Deck test = new Deck(rank, suit, pointValue);
		System.out.println(test.size());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());


		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		
		Deck second = new Deck(ranks, suits, pointValues);
		for (int i=0; i<ranks.length*suits.length;i++) {
			System.out.println(second.deal());
		}
		
		rank = new String[] {"jack", "queen", "king", "ace", "2"};
		suit = new String[] {"hearts", "spades", "clubs"};
		pointValue = new int[] {11, 12, 13, 1, 2};
		
		Deck third = new Deck(rank, suit, pointValue);
		for (int i=0; i<rank.length*suit.length;i++) {
			System.out.println(third.deal());
		}*/
		
		//ACTIVITY 4 CODE::
		ArrayList<String> rank;
		rank = new ArrayList<String>();
		rank.add("Ace");
		rank.add("One");
		rank.add("Two");
		rank.add("Three");
		rank.add("Four");
		rank.add("King");
		rank.add("Queen");

		ArrayList<String> suit;
		suit = new ArrayList<String>();
		suit.add("Hearts");
		suit.add("Spades");
		suit.add("Clubs");
		suit.add("Diamonds");

		ArrayList<Integer> pointValue;
		pointValue = new ArrayList<Integer>();
		pointValue.add(1);
		pointValue.add(2);
		pointValue.add(3);
		pointValue.add(4);
		pointValue.add(13);
		pointValue.add(12);
		
		Deck full = new Deck(rank, suit, pointValue);
		for (int i=0; i<rank.size()*suit.size();i++) {
			System.out.println(full.deal());
			System.out.println(full);
		}
		
	}
}
