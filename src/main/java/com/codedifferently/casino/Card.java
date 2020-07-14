package com.codedifferently.casino;


public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }


    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String newCard() {
        return (rank.getRank() +  suit.getSuit());
    }

}

//return val % 2==0 ? true:false
