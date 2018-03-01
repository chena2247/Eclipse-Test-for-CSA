/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
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

		Deck third = new Deck(ranks, suits, pointValues);
		for (int i=0; i<ranks.length*suits.length;i++) {
			System.out.println(third.deal());
		}
		
	}
}
