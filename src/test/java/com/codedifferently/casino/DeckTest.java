package com.codedifferently.casino;

import org.junit.Test;
import org.junit.Assert;


public class DeckTest {
    Card[] cards = {new Card("", 2), new Card("", 2) 
    ,new Card("", 2), new Card("", 2), new Card("", 3), new Card("", 3) 
    ,new Card("", 3), new Card("", 3), new Card("", 4), new Card("", 4) 
    ,new Card("", 4), new Card("", 4), new Card("", 5), new Card("", 5) 
    ,new Card("", 5), new Card("", 5), new Card("", 6), new Card("", 6) 
    ,new Card("", 6), new Card("", 6), new Card("", 7), new Card("", 7) 
    ,new Card("", 7), new Card("", 7), new Card("", 8), new Card("", 8) 
    ,new Card("", 8), new Card("", 8), new Card("", 9), new Card("", 9) 
    ,new Card("", 9), new Card("", 9), new Card("", 10), new Card("", 10) 
    ,new Card("", 10), new Card("", 10), new Card("J", 10), new Card("J", 10) 
    ,new Card("J", 10), new Card("J", 10), new Card("Q", 10), new Card("Q", 10) 
    ,new Card("Q", 10), new Card("Q", 10), new Card("K", 10), new Card("K", 10) 
    ,new Card("K", 10), new Card("K", 10), new Card("A", 11), new Card("A", 11) 
    ,new Card("A", 11), new Card("A", 11)};
    
    @Test 
    public void deckConstructorTest(){
        //Given
        Card[] expected = cards;
        int expectedSize = expected.length;
        //When
        Deck deck = new Deck(expected, expectedSize);
        int actualSize = deck.getCurrentSize();
        //Then
        Assert.assertArrayEquals(expected, cards);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void shuffleTest(){
        //Given
        //When
        Deck deck = new Deck(cards, cards.length);
        deck.shuffle();
        Card[] expected = deck.getCards();
        Card[] actual = expected;
        //Then
        Assert.assertArrayEquals(expected, actual);
    }
    
}