package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

public class Chip {
    String color;
    int amountMoney;

    
    public Chip(){
        this.color = "Blue";
        this.amountMoney = 10;
    }
    public String getColor(){
        return this.color;
    }
    public int getAmountMoney(){
        return this.amountMoney;
    }
}