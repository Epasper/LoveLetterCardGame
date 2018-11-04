package LoveLetter;

import java.util.ArrayList;

public class Player {
    int playersID = 0;
    ArrayList<Card> playerCardList = new ArrayList<>();
    boolean isEliminated = false;
    boolean isHandmaidOnline = false;
    boolean countessCondition = false;

    void drawACard(Player theDrawingPlayer, Deck thisRoundsDeck) {
        theDrawingPlayer.playerCardList.add(thisRoundsDeck.shuffledDeckList.get(0));
        thisRoundsDeck.shuffledDeckList.remove(0);
    }

    void checkTheCountessCondition(Player currentPlayer) {
        if (currentPlayer.playerCardList.get(0).cardNumber == 7 || currentPlayer.playerCardList.get(1).cardNumber == 7) {
            if (currentPlayer.playerCardList.get(0).cardNumber == 6 || currentPlayer.playerCardList.get(1).cardNumber == 6) {
                System.out.println("You have both the Countess and the King card in your hand. Press Enter to discard Countess");
                countessCondition = true;
            } else if (currentPlayer.playerCardList.get(0).cardNumber == 5 || currentPlayer.playerCardList.get(1).cardNumber == 5) {
                System.out.println("You have both the Countess and the Prince card in your hand. Press Enter to discard Countess");
                countessCondition = true;
            }
        }
        if (countessCondition) {
            try {
                System.in.read();
            } catch (Exception ignored) {
            }
            for (int i = 0; i < currentPlayer.playerCardList.size(); i++) {
                if (currentPlayer.playerCardList.get(i).cardNumber == 7) {
                    currentPlayer.playerCardList.remove(i);
                }
            }
            System.out.println("Countess has been discarded.");
        }
    }

    public void printThePlayersHand(Player targetPlayer) {
        for (int i = 0; i < targetPlayer.playerCardList.size(); i++) {
            System.out.println("(This player has " + targetPlayer.playerCardList.get(i).cardName + " card in hand.)");
        }
    }

}
