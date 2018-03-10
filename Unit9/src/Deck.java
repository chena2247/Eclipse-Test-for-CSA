import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private Card[] cards;
	//private Card holder;
	
	private ArrayList<Card> cards;
	private Card holder;
	
	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values) {
		int counter = 0;
		ArrayList<Card> single;
		for (int i=0; i<suits.size(); i++) {
			for (int a=0; a<ranks.size(); a++) {
				single.add(ranks.get(a), suits.get(i), values.get(a));
				cards.add(single);
				counter++;
			}
		}
		
		/*		cards = new Card[(suits.length*values.length)];
		int counter = 0;
		for (int i=0; i<suits.length;i++) {
			for (int a=0; a<ranks.length; a++) {
				cards[counter] = new Card(ranks[a], suits[i], values[a]);
				counter++;
			}
		}*/
		size = cards.size();
		shuffle(cards);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size==0) 
			return true;
		else
			return false;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle(ArrayList<Card> values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		int random =0;
		ArrayList<Card> shuffled = values;
		for (int k=values.size()-1; k>=0; k--) {
			random = (int)(Math.random()*(values.size()-1));
			/*for (int i=0; i<3;i++) {
				holder[i] = shuffled[k];
			}*/
			holder = shuffled.get(k);
			shuffled.set(k, shuffled.get(random));
			shuffled.set(random, holder);
		}
		size = cards.size();
	
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		while (size>0) {
			size--;
			return cards.get(size);
		}
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "Size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			else if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
