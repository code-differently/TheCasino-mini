package com.codedifferently.casino;

public enum Suit {
    Hearts("Hearts"), Spades("Spades"),
    Diamonds("Diamonds"), Clubs("Clubs");

    private final String suitValue;


    Suit(String suitValue) {
        this.suitValue = suitValue;
    }

    public String getSuit() {
        return suitValue;
    }
}
