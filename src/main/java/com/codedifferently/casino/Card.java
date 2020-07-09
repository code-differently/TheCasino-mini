package com.codedifferently.casino;


class Card {
    private String suit;
    private int number;

public Card(String suit, int number){
    this.suit = suit;
    this.number = number;
}
public String getSuit(){
    return this.suit;
}
public int getNumber(){
    int num = 0;
    if(this.suit == "A"){
        num = 11;
        return num;
    }
    else if(this.suit == "K" || suit == "Q" || suit == "J"){
        num = 10;
        return num;
    }
    else if(this.number >= 2 && this.number <= 10){
        num = this.number;
    }
    return num;
    }  
} 
class GroupOfCards{
    protected Card[] cards = {new Card("", 2), new Card("", 2) 
    ,new Card("", 2), new Card("", 2), new Card("", 3), new Card("", 3) 
    ,new Card("", 3), new Card("", 3), new Card("", 4), new Card("", 4) 
    ,new Card("", 4), new Card("", 4), new Card("", 5), new Card("", 5) 
    ,new Card("", 5), new Card("", 5), new Card("", 6), new Card("", 6) 
    ,new Card("", 6), new Card("", 6), new Card("", 7), new Card("", 7) 
    ,new Card("", 7), new Card("", 7), new Card("", 8), new Card("", 8) 
    ,new Card("", 8), new Card("", 8), new Card("", 9), new Card("", 9) 
    ,new Card("", 9), new Card("", 9), new Card("", 10), new Card("", 10) 
    ,new Card("", 10), new Card("", 10), new Card("J", 10), new Card("J", 10) 
    ,new Card("J", 10), new Card("J", 10), new Card("Q", 10), new Card("Q", 10) 
    ,new Card("Q", 10), new Card("Q", 10), new Card("K", 10), new Card("K", 10) 
    ,new Card("K", 10), new Card("K", 10), new Card("A", 11), new Card("A", 11) 
    ,new Card("A", 11), new Card("A", 11)};

    protected int currentSize;

    public GroupOfCards(Card[] cards, int currentSize){
        this.cards = cards;
        this.currentSize = currentSize;
    }
    public Card[] getCards(){
        return this.cards;
    }
    public int getCurrentSize(){
        return this.cards.length;
    }
}











































































































































