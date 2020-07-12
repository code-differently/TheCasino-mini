package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();


    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card nCard = new Card(rank, suit);
                cards.add(nCard);
            }
        }
    }


    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public int numberOfCards() {
        return cards.size();
    }

    public void addCard(Card newCard) {
        cards.add(newCard);

    }

    public void removeCard(Card removeCard) {
        cards.remove(removeCard);

    }
}
