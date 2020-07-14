package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void getSuitTest() {
        //Given
        Card card = new Card(Rank.Two, Suit.Hearts);
        Suit expected = Suit.Hearts;

        //When
        Suit actual = card.getSuit();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getRankTest() {
        //Given
        Card card = new Card(Rank.Two, Suit.Hearts);
        Rank expected = Rank.Two;

        //When
        Rank actual = card.getRank();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void newCardTest() {
        //Given
        Card card = new Card(Rank.Two, Suit.Hearts);
        String expected ="2Hearts";

        //When
        String actual = card.newCard();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
