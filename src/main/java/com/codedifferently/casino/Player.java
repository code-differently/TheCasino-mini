package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Card card;
    private GroupOfCards groupOfCards;
    private String name;
    //create chip class
    private int age;
    private List<Card> myCards = new ArrayList<Card>();

public Player(String name, int age, List<Card>myCards){
    this.name = name;
    this.age = age;
    this.myCards = myCards;
}

public String getName(){
    return this.name;
}

public int getAge(){
    if(this.age >= 21){
    return this.age;
    }
    else{
        return 0;
    }

}
public List<Card> getMyCards(){
    return this.myCards;
}
public void giveCards(Player player, Card card){
    
    
}

public int chip(){
    
}

    

}