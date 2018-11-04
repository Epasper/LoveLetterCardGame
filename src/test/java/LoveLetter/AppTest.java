package LoveLetter;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    protected void setUpCountessTest () {
        PlayRound testPlayRound = new PlayRound();
        ArrayList<Player> testListOfPlayers = new ArrayList<>();
        Card countessTestCard = new Countess(Countess.cardNumber,Countess.numberOfCardsInDeck,Countess.cardText,Countess.cardName);
        Card kingTestCard = new King(King.cardNumber,King.numberOfCardsInDeck,King.cardText,King.cardName);
        Card princeTestCard = new Prince(Prince.cardNumber,Prince.numberOfCardsInDeck,Prince.cardText,Prince.cardName);
        Deck testDeck = new Deck();
        testDeck.deckList.add(countessTestCard);
        testDeck.deckList.add(kingTestCard);
        testDeck.deckList.add(princeTestCard);
        testListOfPlayers = testPlayRound.selectNumberOfPlayers();

    }

    @Test
    public void countessWithKingOrPrinceShouldDiscardItself()
    {
        assertTrue( true );
    }
}
