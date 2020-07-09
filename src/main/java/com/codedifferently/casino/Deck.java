package com.codedifferently.casino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck extends GroupOfCards 
{

    public Deck(Card[] cards, int currentSize) 
    {
        super(cards, currentSize);
    }

    public void shuffle()
    {
        List<Card> strList = Arrays.asList(cards); 
        Collections.shuffle(strList);
        this.cards = strList.toArray(new Card[strList.size()]);
    }  
}