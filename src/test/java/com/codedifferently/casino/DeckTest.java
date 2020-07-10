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
        Deck deck = new Deck(cards, cards.size());
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
        Deck deck = new Deck(cards, cards.size());
        deck.shuffle();
        List<Card> expected = deck.getCards();
        int expectedSize = 52;
        List<Card> actual = expected;
        int actualSize = deck.getCurrentSize();
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void removeCardTest(){
        //Given
        int expected = 51;

        //When
        Deck deck = new Deck(cards, cards.size());
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
        List<Card> array = new ArrayList<Card>();
        Deck deck = new Deck(array, array.size());
        deck.resetDeck();
        List<Card> expected = array;
        List<Card> actual = deck.getCards();
        int actualLength = deck.getCurrentSize();
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedLength, actualLength);
    }
    
}