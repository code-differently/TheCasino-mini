package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    List<Card> hand = new ArrayList<Card>();

    @Test
    public void playerConstructorTest(){
    //Given
    String expectedName = "Lil";
    int expectedAge = 0;
     //When
     Player player = new Player("Lil", 0);
     String actualName = player.getName();
     int actualAge = player.getAge();

    //Then
    Assert.assertEquals(expectedName, actualName);
    Assert.assertEquals(expectedAge, actualAge);

    }

    @Test
    public void getNameTest(){
    //Given
    String expected = "Billy";
    int age = 21;
    
    //When
    Player player = new Player(expected, age);
    String actual = player.getName();

    //Then
    Assert.assertEquals(expected, actual);      
    }
    
    @Test
    public void getAgeTest(){
    //Given
    int expected = 21;
    String name = "Billy";
    
    //When
    Player player = new Player(name, expected);
    int actual = player.getAge();
    
    //Then
    Assert.assertEquals(expected, actual); 

    }
    @Test
    public void addCardsTest(){
        //Given
        int expected = 1;
        //When
        Player player = new Player("Joe", 24);
        player.addCards(new Card("K", 10));
        int actual = player.getMyCardAmount();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test 
    public void getMyCardsTest(){
        //Given
        int expected = 0;
        //When
        Player player = new Player("Joe", 24);
        int actual = player.getMyCardAmount();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getMyCardAmountTest(){
        //Given
        int expectedSize = 0;
        //When
        Player player = new Player("Joe", 24);
        int actualSize = player.getMyCardAmount();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void giveCardsTest(){
        //Given
        Player Joe = new Player("Joe", 22);
        Card card = new Card("A", 11);
        Joe.addCards(new Card("K", 10));
        //When
        Player Milly = new Player("Milly", 21);
        Milly.addCards(card);
        Milly.giveCards(Joe, card);
        int expectedMillyCards = 0;
        int expectedJoeCards = 2;
        int actualMillyCards = Milly.getMyCardAmount();
        int actualJoeCards = Joe.getMyCardAmount();
        //Then
        Assert.assertEquals(expectedMillyCards, actualMillyCards);
        Assert.assertEquals(expectedJoeCards, actualJoeCards);
    }
    @Test
    public void getMyChipAmountTest(){
        //Given
        int expectedSize = 0;

        //When
        Player player = new Player("Joe", 27);
        int actualSize = player.getMyChipAmount();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void getMyChipsTest(){
        //Given
        int expectedSize = 1;

        //When
        Player player = new Player("Joe", 27);
        player.addChips(new Chip());
        int actualSize = player.getMyChipAmount();
            
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void addChipsTest(){
        //Given
        int expectedSize = 1;

        //When
        Player player = new Player("Joe", 27);
        player.addChips(new Chip());
        int actualSize = player.getMyChipAmount();
            
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void gambleTest(){
        //Given
        int expectedNumOfChips = 1;
        //When
        Player Joe = new Player("Joe", 24);
        Joe.addChips(new Chip());
        Joe.addChips(new Chip());
        Joe.addChips(new Chip());
        Joe.addChips(new Chip());
        Joe.gamble(3);
        int actualNumOfChips = Joe.getMyChipAmount();
        //Then
        Assert.assertEquals(expectedNumOfChips, actualNumOfChips);
    }

    
}