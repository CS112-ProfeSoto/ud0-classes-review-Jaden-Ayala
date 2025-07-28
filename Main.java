/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Jaden
 * @version 1
 */

public class Main {

    /* ALGORITHM
    *
    1. Generate 52 card deck into Card array
    - loop through each suit (♥, ♦, ♣, ♠)
    - loop through values 1 to 13
    - create Card for each combination and store in array
    2. Print deck (simple)
    - print each card using toString() and ASCII art
    *
    */
    public static void main(String[] args) {
        /*** RUNNING TESTER ***/
        // Uncomment line below to run CardTester:
        // CardTester.main(null);

        /*** DRIVER PROGRAM ***/
        // 1. Generate 52 card deck into Card array
        Card[] deck = new Card[52];
        char[] suits = {Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE};
        int index = 0;

        for (char suit : suits) {
            for (int value = 1; value <= 13; value++) {
                deck[index] = new Card(value, suit);
                index++;
            }
        }

        // 2. Print deck
        for (Card card : deck) {
            System.out.println(card);           // e.g., "A ♥"
            System.out.println(card.getPrintCard()); // ASCII art
            System.out.println();               // blank line for spacing
        }
    }
}
