//@author: Kiranpreet Kaur
public class Card {

    private static class Value1 {

        public Value1() {
        }
    }

        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        private final Value1 jocker=null;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}


	public Suit getSuit() {
		return this.suit;
        }
}
