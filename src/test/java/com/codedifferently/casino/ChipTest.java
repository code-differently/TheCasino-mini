package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

public class ChipTest {
    Chip chip;

    @Test
    public void chipConstructorTest(){
        //Given 
        String expected = "Blue";
        int expectedAmountMoney = 10;
        //When
        Chip chip = new Chip();
        String actual = chip.getColor();
        int actualAmountMoney = chip.getAmountMoney();
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedAmountMoney, actualAmountMoney);
    }

    @Test
    public void getColorTest(){
        //Given
        String expected = "Blue";
       
        //When
        Chip chip = new Chip();
        String actual = chip.getColor();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountMoneyTest(){
        //Given
        int expected = 10;
        //When
        Chip chip = new Chip();
        int actual = chip.getAmountMoney();
        //Then
        Assert.assertEquals(expected, actual);
    }
    
}