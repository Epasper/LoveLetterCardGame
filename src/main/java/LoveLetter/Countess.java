package LoveLetter;

import java.util.ArrayList;

public class Countess extends Card {
    static int cardNumber = 7;
    static int numberOfCardsInDeck = 1;
    static String cardText = "If you have this card and a King or Prince in your hand, you must discard this card.";
    static String cardName = "Countess";

    public Countess(int cardNumber, int numberOfCardsInDeck, String cardText, String cardName) {
        super(cardNumber, numberOfCardsInDeck, cardText, cardName);
    }

    @Override
    public void performCardInstruction(Player currentPlayer, ArrayList<Player> currentRoundsListOfPlayers, Deck thisRoundsDeck) {
        discardCardAfterUsing(currentPlayer,7);
    }
}
