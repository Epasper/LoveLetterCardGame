package LoveLetter;

import java.util.ArrayList;

public class Princess extends Card {
    static int cardNumber = 8;
    static int numberOfCardsInDeck = 1;
    static String cardText = "If you discard this card, you are out of this round.";
    static String cardName = "Princess";

    public Princess(int cardNumber, int numberOfCardsInDeck, String cardText, String cardName) {
        super(cardNumber, numberOfCardsInDeck, cardText, cardName);
    }

    @Override
    public void performCardInstruction(Player currentPlayer, ArrayList<Player> currentRoundsListOfPlayers, Deck thisRoundsDeck) {
        discardCardAfterUsing(currentPlayer,8);
        System.out.println("You have discarded a Princess card! You are out of this round!");
        currentPlayer.isEliminated = true;
    }
}
