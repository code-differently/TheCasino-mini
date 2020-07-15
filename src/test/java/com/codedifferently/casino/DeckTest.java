package com.codedifferently.casino;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;


public class DeckTest {
    List<Card> cards = new ArrayList<Card>();
    
    @Test 
    public void deckConstructorTest(){
        //Given
        List<Card> expected = cards;
        int expectedSize = expected.size();
        //When
        Deck deck = new Deck();
        List<Card> actual = deck.getCards();
        int actualSize = deck.getCurrentSize();
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void shuffleTest(){
        //Given
        //When
        Deck deck = new Deck();
        deck.shuffle();
        int expectedSize = 52;
        int actualSize = deck.getCurrentSize();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void removeCardTest(){
        //Given
        int expected = 51;
        //When
        Deck deck = new Deck();
        deck.shuffle();
        deck.removeCard();
        int actual = deck.getCurrentSize();
        //Then
        Assert.assertEquals(expected, actual);
    } 
    @Test
    public void resetDeck(){
        //Given
        int expectedLength = 52;
        //When
        Deck deck = new Deck();
        deck.resetDeck();
        int actualLength = deck.getCurrentSize();
        //Then
        Assert.assertEquals(expectedLength, actualLength);
    }
    
}