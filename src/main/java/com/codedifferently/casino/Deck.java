package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();

    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card nCard = new Card(rank, suit);
                deck.add(nCard);
            }
        }
    }

    //public ArrayList<Card> getDeck() {
        //return this.deck;
   //}

    public void shuffleCards() {
        Collections.shuffle(deck);
    }

    public int numberOfCards() {
        return deck.size();
    }


    public Card removeCard() {
        if (deck.isEmpty()) {
            return null;
        } else {
            return deck.remove(0);
        }
    }
}
