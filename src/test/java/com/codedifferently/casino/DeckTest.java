package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

    @Test
    public void numberOfCardsTest() {
        //Given
        Deck deck = new Deck();
        deck.createDeck();
        int expected = 52;

        //When
        int actual = deck.numberOfCards();

        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void shuffleCardsTest() {
        //Given
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffleCards();
        int expected = 52;

        //When
        int actual = deck.numberOfCards();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCardsTest() {
        //Given
        Deck deck = new Deck();
        deck.createDeck();
        int expected = 50;

        //When
        deck.removeCard();
        deck.removeCard();
        int actual = deck.numberOfCards();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
