import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SWORDS, RankType.QUEEN);
    }

    @Test
    public void cardCanHazSuit(){
        assertEquals(SuitType.SWORDS, card.getSuit());
    }

    @Test
    public void cardCanHazRank(){
        assertEquals(RankType.QUEEN, card.getRank());
    }

    @Test
    public void queenCanHazValue(){
        assertEquals(12, card.getValueFromEnum());
    }

}
