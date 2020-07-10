package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {

    @Test
    public void cardConstructorTest(){
        
        //Given
        String expectedSuit = "";
        int expectedNumber = 0;
        //When
        Card card = new Card("", 0);
        String actualSuit = card.getSuit();
        int actualNumber = card.getNumber();

        //Then
        Assert.assertEquals(expectedSuit, actualSuit);
        Assert.assertEquals(expectedNumber, actualNumber);

    }

    @Test
    public void getSuitTest(){
        //Given
        String expected = "K";

        //When
        Card card = new Card(expected, 10);
        String actual = card.getSuit();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void getNumberTest(){
        //Given
        int expected = 11;
        int exp = 0;
        //When
        Card card = new Card("A", expected);
        Card newCard = new Card("", exp);

        int actual = card.getNumber();
        int act = newCard.getNumber();

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(exp, act);
    }
    
}
