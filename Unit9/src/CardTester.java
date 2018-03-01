/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card first = new Card("4", "heart", 4);
		Card second = new Card("K", "spades", 13);
		Card third = new Card("10", "clubs", 10);
		
		System.out.println(first.matches(first));
		System.out.println(second.matches(third));
		System.out.println(third.matches(first));
		System.out.print("\n");
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}
}
