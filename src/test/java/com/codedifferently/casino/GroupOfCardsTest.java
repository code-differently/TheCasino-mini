package com.codedifferently.casino;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class GroupOfCardsTest {
    List<Card> cards = new ArrayList();
    @Test
    public void groupOfCardsConstructorTest(){
        //Given
        //When
        GroupOfCards groupOfCards = new GroupOfCards();
        List<Card> expected = cards;
        int expectedNum = 0;
        List<Card> actual = groupOfCards.getCards();
        int actualNum = groupOfCards.getCurrentSize();

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void getCurrentSizeTest(){
        //Given
        int expectedSize = 0;

        //When
        GroupOfCards groupOfCards = new GroupOfCards();
        int actualSize = groupOfCards.getCurrentSize();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void getCardsTest(){
        //Given
        List<Card> expected = cards;
        //When
        GroupOfCards groupOfCards = new GroupOfCards();
        List<Card> actual = groupOfCards.getCards();
        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void cardsTest(){
        //Given
        //When

        GroupOfCards groupOfCards = new GroupOfCards();
        groupOfCards.cards();
        int expected = 52;
        int actual = groupOfCards.getCurrentSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

}