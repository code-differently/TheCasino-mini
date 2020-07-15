package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

import com.codedifferently.casino.Card;

public class Hand {
    private List<Card> hand;
    private int handSize;

    public Hand(){
        this.hand = new ArrayList<Card>();
        this.handSize = hand.size();
    }
    public List<Card> getHand(){
        return this.hand;
    }
    public int getHandSize(){
        return this.hand.size();
    }
    public List<Card> removeHand(Card card){
        List<Card>temp = new ArrayList<Card>();

        Iterator<Card> iter = this.hand.iterator();
        System.out.println("NEW HAND IS " +this.hand.toString());
        while(iter.hasNext()){
            Card currentCard = iter.next();
            if(currentCard.getNumber() == card.getNumber()){
                this.hand.remove(currentCard);
                temp.add(currentCard);
                iter.remove();
            }
        }
        System.out.println("TEMP HAND IS " +temp.toString());
        return temp;


    }
    public void addHand(Card card){
        this.hand.add(card);
    }

/*
    public String displayHand(){
        StringBuilder result = new StringBuilder("Cards in hand: \n");
        for(int i = 0; i < this.handSize; i++){
            result.append(this.hand.get(i).getSuit().toString()).append(",");
            result.append(this.hand.get(i).getNumber().toString()).append(",");
            
            
            .append("\n");
        }
        return result.toString();
    }
*/
    
}