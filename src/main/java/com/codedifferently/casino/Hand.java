package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand;
    private int handSize;

    public Hand() {
        this.hand = new ArrayList<Card>();
        this.handSize = hand.size();
    }

    public List<Card> getHand(){
        return this.hand;
    }

    public int getHandSize(){
        return this.hand.size();
    }

    public void addHand(Card card){
        this.hand.add(card);
    }
}
