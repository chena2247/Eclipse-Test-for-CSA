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
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());


	}
}
