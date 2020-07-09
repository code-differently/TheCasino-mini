package com.codedifferently.casino;

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

public class Card {
    
    public static void main(String[] args){
       // Rank deckRank = Rank.ACE;

        for (Rank deckRank : Rank.values()){
            System.out.println(deckRank);
        }
        for (Suit deckSuit : Suit.values()){
            System.out.println(deckSuit);
        }
        }
    }
