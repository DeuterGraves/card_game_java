import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    //private Card card;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int cardCount() {
        return cards.size();
    }

    public void populateDeck() {
//    take the array of suits
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
//loop through suits
        for (SuitType suit : suits) {
            for (RankType rank : ranks) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }

        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }

    public Card dealCard(){
        return this.cards.remove(0);
    }

//    computer plays itself
    public Card compareCard(){
        populateDeck();
        shuffleDeck();
        Card card1 = dealCard();
        System.out.println(card1.getValueFromEnum());
        Card card2 = dealCard();
        System.out.println(card2.getValueFromEnum());
        if (card1.getValueFromEnum() > card2.getValueFromEnum()){
            return card1;
        }
        return card2;
    }



}
