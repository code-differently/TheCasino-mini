package com.codedifferently.casino;

public enum Rank {
    One(1), Two(2), Three(3),
    Four(4), Five(5), Six(6),
    Seven(7), Eight(8), Nine(9),
    Ace(10), King(10), Queen(10), Jack(10);

    private final int rankValue;

    Rank(int rankValue) {
        this.rankValue = rankValue;
    }

    public int getRank() {
        return rankValue;
    }
}
