import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
//    private ArrayList card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void deckPopulate(){
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void deckCanShuffle(){
        deck.populateDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
        deck.shuffleDeck();
//        how do we test that it's shuffled?!
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void deckCanDealCard(){
        deck.populateDeck();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void deckCanPlaySelf(){
        deck.compareCard();
        assertEquals(50, deck.cardCount());
    }



}
