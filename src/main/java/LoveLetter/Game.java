package LoveLetter;

import java.util.ArrayList;

public class Game {
    void setUpTheGame () {
        PlayRound playRound = new PlayRound();
        Deck currentDeck = new Deck();
        currentDeck.shuffleTheDeck();
        ArrayList<Player> listOfPlayers = playRound.selectNumberOfPlayers();
        playRound.drawCardsAtTheBeginning(listOfPlayers, currentDeck);
        while (currentDeck.shuffledDeckList.size() > 0) {
            for (int i = 0; i < listOfPlayers.size(); i++) {
                int j = i + 1;
                if (listOfPlayers.get(i).isEliminated) {
                    System.out.println("Player " + j + " have already been eliminated. Proceeding to next player.");
                } else {
                    System.out.println("=====NEXT PLAYER=====");
                    System.out.println("Current Player: " + j);
                    playRound.executePlayersPhase(listOfPlayers, listOfPlayers.get(i), currentDeck);
                    listOfPlayers.get(i).printThePlayersHand(listOfPlayers.get(i));
                }
            }
        }

    }
}
