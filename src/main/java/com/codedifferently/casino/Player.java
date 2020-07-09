package com.codedifferently.casino;

public class Player 
{
    private String name;

    //create chip class
    
    private int age;
    //After implenting the Card class, add in Card arraylist

    public Player(String name, int age)
    {
        this.name = name;
            this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        if(this.age >= 21)
        {
            return this.age;
        }
        else
        {
            return 0;
        }
    }

    // Create gamble method after chip class is made
}