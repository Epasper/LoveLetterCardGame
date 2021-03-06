package LoveLetter;

import java.util.ArrayList;

public class Priest extends Card {

    static int cardNumber = 2;
    static int numberOfCardsInDeck = 2;
    static String cardText = "Look at another player's hand";
    static String cardName = "Priest";

    public Priest(int cardNumber, int numberOfCardsInDeck, String cardText, String cardName) {
        super(cardNumber, numberOfCardsInDeck, cardText, cardName);
    }

    @Override
    public void performCardInstruction(Player currentPlayer, ArrayList<Player> currentRoundsListOfPlayers, Deck thisRoundsDeck) {
        discardCardAfterUsing(currentPlayer,2);
        int playerChoice = chooseAPlayer(currentRoundsListOfPlayers.size(),currentRoundsListOfPlayers);
        System.out.println("The chosen player's card in hand is: " + currentRoundsListOfPlayers.get(playerChoice).playerCardList.get(0).cardName + ".");
    }
}

