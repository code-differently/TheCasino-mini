package com.codedifferently.casino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck extends GroupOfCards {

    public Deck(List<Card> cards, int currentSize) {
        super(cards, currentSize);
    }
    public void shuffle(){
        GroupOfCards groupOfCards = new GroupOfCards(cards, currentSize);
        groupOfCards.cards();
        Collections.shuffle(cards);
        this.cards = cards;
    } 
    public Card removeCard(){
        Card card = new Card("", 0);
        GroupOfCards groupOfCards = new GroupOfCards(cards, currentSize);
        if(groupOfCards.currentSize > 0){
        card = groupOfCards.getCards().remove(0);
        }
        return card;
    }
    public void resetDeck(){
        GroupOfCards groupOfCards = new GroupOfCards(cards, currentSize);
        groupOfCards.cards();
        this.cards = cards;
    }
}