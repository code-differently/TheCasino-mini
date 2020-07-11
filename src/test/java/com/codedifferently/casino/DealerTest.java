package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {
    
    @Test
    public void dealerConstructorTest(){
        //Given
        int expectedChips = new chip(10);
        int expectedHand = new hand();
        int expectedDeck = new deck(52);

        //When
        Dealer dealer = new Dealer();
        int actualChips = dealer.getChips(10);
        int actualHand = dealer.getHand();
        int actualDeck = dealer.getDeck(52);

        //Then
        Assert.assertEquals(expectedChips, actualChips);
        Assert.assertEquals(expectedHand, actualHand);
        Assert.assertEquals(expectedDeck, actualDeck);
    }

    @Test
    public void shuffleCardsTest(){
       //Given

        //When

        //Then

    }

    @Test
    public void distributeCardsTest(){
        //Given

        //When

        //Then

    }

    @Test 
    public void getChipsTest(){
        //Given
        int expectedSize = 0;

        //When
        GroupOfCards groupOfCards = new GroupOfCards(hand, 0);
        int actualSize = groupOfCards.getCurrentSize();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);

    }

    @Test
    public void getCardsTest() {
        //Given
        List<Card> expected = hand;
        //When
        GroupOfCards groupOfCards = new GroupOfCards(hand, 0);
        List<Card> actual = groupOfCards.getCards();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void giveWinningChipsTest(){
        //Given

        //When

        //Then

    }

}