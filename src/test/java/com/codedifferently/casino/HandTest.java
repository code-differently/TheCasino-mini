package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;
import com.codedifferently.casino.Card;

import org.junit.Assert;
import org.junit.Test;

public class HandTest {
    List<Card> hand = new ArrayList<Card>();
    @Test
    public void handConstructorTest(){
        //Given
        int expectedSize = hand.size();

        //When
        Hand hands = new Hand(hand, hand.size());
        List<Card> actual = hands.getHand();
        int actualSize = hands.getHandSize();
        //Then
        Assert.assertEquals(hand, actual);
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void getHandTest(){
        //Given
        //When
        Hand hands = new Hand(hand, hand.size());
        List<Card> actual = hands.getHand();
        //Then
        Assert.assertEquals(hand, actual);
    }
    @Test
    public void getHandSizeTest(){
        //Given
        int expectedSize = hand.size();
        //When
        Hand hands = new Hand(hand, hand.size());
        int actualSize = hands.getHandSize();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void removeHandTest(){
        //Given
        hand.add(new Card("K", 10));
        hand.add(new Card("", 2));
        int expectedSize = 1;
        //When
        Card newCard = new Card("", 2);
        Hand hands = new Hand(hand, hand.size());
        hands.removeHand(newCard);
        int actualSize = hands.getHandSize();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
/*
    @Test
    public void displayHandTest(){
        //Given
        hand.add(new Card("K", 10));
        hand.add(new Card("", 2));
        //When
        Hand hands = new Hand(hand, hand.size());
        String actualHand = hands.displayHand();
        String expectedHand = "Cards in hand\nnewCard(K), 10)newCard(, 2)";
        
        //Then
        Assert.assertEquals(expectedHand, actualHand);
    }
*/
}