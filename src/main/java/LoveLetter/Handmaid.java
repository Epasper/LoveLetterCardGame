package LoveLetter;

import java.util.ArrayList;

public class Handmaid extends Card {

    static int cardNumber = 4;
    static int numberOfCardsInDeck = 2;
    static String cardText = "Until your next turn, ignore all effects from other players' cards.";
    static String cardName = "Handmaid";

    public Handmaid(int cardNumber, int numberOfCardsInDeck, String cardText, String cardName) {
        super(cardNumber, numberOfCardsInDeck, cardText, cardName);
    }

    @Override
    public void performCardInstruction(Player currentPlayer, ArrayList<Player> currentRoundsListOfPlayers, Deck thisRoundsDeck) {
        discardCardAfterUsing(currentPlayer, 4);
        currentPlayer.isHandmaidOnline = true;
    }
}
