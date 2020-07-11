package com.codedifferently.casino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck extends GroupOfCards {

    public Deck() {
        super();
    }
    public void shuffle(){
        GroupOfCards groupOfCards = new GroupOfCards();
        groupOfCards.cards();
        Collections.shuffle(groupOfCards.getCards());
        this.cards = groupOfCards.getCards();
    } 
    public Card removeCard(){
        Card card = new Card("", 0);
        if(this.cards.size() > 0){
        card = this.cards.remove(0);
        }
        return card;
    }
    public void resetDeck(){
        GroupOfCards groupOfCards = new GroupOfCards();
        groupOfCards.cards();
        this.cards = groupOfCards.getCards();
    }
}