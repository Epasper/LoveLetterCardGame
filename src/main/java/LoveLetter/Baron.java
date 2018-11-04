package LoveLetter;

import java.util.ArrayList;

public class Baron extends Card {
    static int cardNumber = 3;
    static int numberOfCardsInDeck = 2;
    static String cardText = "You and another player secretly compare hands. The player with the lower value is out of the round.";
    static String cardName = "Baron";

    public Baron(int cardNumber, int numberOfCardsInDeck, String cardText, String cardName) {
        super(cardNumber, numberOfCardsInDeck, cardText, cardName);
    }

    @Override
    public void performCardInstruction(Player currentPlayer, ArrayList<Player> currentRoundsListOfPlayers, Deck thisRoundsDeck) {
        discardCardAfterUsing(currentPlayer,3);
        int playerChoice = chooseAPlayer(currentRoundsListOfPlayers.size(),currentRoundsListOfPlayers);
        int yourScore = currentPlayer.playerCardList.get(0).cardNumber;
        int opponentsScore = currentRoundsListOfPlayers.get(playerChoice).playerCardList.get(0).cardNumber;
        System.out.println("The chosen player's card value is: " + opponentsScore + ".");
        System.out.println("Your card's value is: " + yourScore + ".");
        if (yourScore > opponentsScore) {
            currentRoundsListOfPlayers.get(playerChoice).isEliminated = true;
            System.out.println("You have higher card value than your opponent. The opponent is eliminated!");
        } else if (yourScore < opponentsScore) {
            currentPlayer.isEliminated = true;
            System.out.println("You have lower card value than your opponent. You are eliminated!");
        } else {
            System.out.println("Draw - neither player is eliminated.");
        }
    }
}
