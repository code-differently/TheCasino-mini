package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deckCard = new ArrayList<Card>();


    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card nCard = new Card(rank, suit);
                deckCard.add(nCard);
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return this.deckCard;
   }

    public void shuffleCards() {
        Collections.shuffle(deckCard);
    }

    public int numberOfCards() {
        return deckCard.size();
    }

    public void addCard(Card newCard) {
        deckCard.add(newCard);

    }

    public Card removeCard() {
        if (deckCard.isEmpty()) {
            return null;
        } else {
            return deckCard.remove(0);
        }
    }
}
