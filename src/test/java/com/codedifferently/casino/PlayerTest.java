package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest 
{
    @Test
    public void playerConstructorTest()
    {
        //Given
        String expectedName = "";
        int expectedAge = 0;

         //When
        Player player = new Player("", 0);
        String actualName = player.getName();
        int actualAge = player.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getNameTest()
    {
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
    public void getAgeTest()
    {
        //Given
        int expected = 21;
        String name = "Billy";
    
        //When
        Player player = new Player(name, expected);
        int actual = player.getAge();
    
        //Then
        Assert.assertEquals(expected, actual); 

    }

    
}