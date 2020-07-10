package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;
import com.codedifferently.casino.Card;

public class Hand {
    private List<Card> hand = new ArrayList<Card>();;
    private int handSize;

    public Hand(List<Card> hand, int handSize){
        this.hand = hand;
        this.handSize = hand.size();
    }
    public List<Card> getHand(){
        return this.hand;
    }
    public int getHandSize(){
        return this.hand.size();
    }
    public Card removeHand(Card card){
        Card heldCard = new Card("", 0);
        if(this.handSize > 0){
            for(int i = 0; i < this.hand.size(); i++){
                if(this.hand.get(i).getSuit() == card.getSuit() && this.hand.get(i).getNumber() == card.getNumber()){
                    heldCard = this.hand.remove(i);
                }
            }
        }
        return heldCard;

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