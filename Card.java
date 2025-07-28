public class Card {

    /*** CONSTANT VARIABLES ***/
    public static final char HEART = '♥';
    public static final char DIAMOND = '♦';
    public static final char CLUB = '♣';
    public static final char SPADE = '♠';
    public static final int DEFAULT_VALUE = 1;
    public static final char DEFAULT_SUIT = HEART;

    /*** INSTANCE VARIABLES ***/
    private int value;
    private char suit;

    /*** CONSTRUCTOR METHODS ***/

    /**
     * Default constructor, builds default card object as: A ♥
     */
    public Card() {
        this.value = DEFAULT_VALUE;
        this.suit = DEFAULT_SUIT;
    }

    /**
     * Full constructor builds object with all data for instance variables provided.
     * If arguments are not valid, program shuts down with error message
     */
    public Card(int value, char suit) {
        if (isValidValue(value) && isValidSuit(suit)) {
            this.value = value;
            this.suit = suit;
        } else {
            System.out.println("Error: Invalid card value or suit.");
            System.exit(1);
        }
    }

    /**
     * Copy constructor builds object with all data from Card object provided.
     */
    public Card(Card original) {
        this.value = original.value;
        this.suit = original.suit;
    }

    /*** MUTATOR METHODS (SETTERS) ***/

    public boolean setValue(int value) {
        if (isValidValue(value)) {
            this.value = value;
            return true;
        }
        return false;
    }

    public boolean setSuit(char suit) {
        if (isValidSuit(suit)) {
            this.suit = suit;
            return true;
        }
        return false;
    }

    public boolean setAll(int value, char suit) {
        if (isValidValue(value) && isValidSuit(suit)) {
            this.value = value;
            this.suit = suit;
            return true;
        }
        return false;
    }

    /*** ACCESSOR METHODS (GETTERS) ***/

    public char getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public String getPrintValue() {
        switch (this.value) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(this.value);
        }
    }

    public String getPrintCard() {
        String val = getPrintValue();
        String space = val.length() == 1 ? " " : ""; // Align for "10"
        return  "┌───────┐\n" +
                "│" + val + space + "     │\n" +
                "│       │\n" +
                "│   " + suit + "   │\n" +
                "│       │\n" +
                "│     " + space + val + "│\n" +
                "└───────┘";
    }

    /*** OTHER REQUIRED METHODS ***/

    public String toString() {
        return getPrintValue() + " " + suit;
    }

    public boolean equals(Card other) {
        return this.value == other.value && this.suit == other.suit;
    }

    /*** EXTRA METHODS ***/

    public void printCard() {
        System.out.println(getPrintCard());
    }

    /*** HELPER METHODS (PRIVATE) ***/
    private boolean isValidValue(int value) {
        return value >= 1 && value <= 13;
    }

    private boolean isValidSuit(char suit) {
        return suit == HEART || suit == DIAMOND || suit == CLUB || suit == SPADE;
    }
}
