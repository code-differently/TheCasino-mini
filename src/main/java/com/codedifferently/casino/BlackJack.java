package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

public class BlackJack extends CardGame {

    Hand dealer;
    Hand player;
    Deck newDeck;

    public BlackJack(Hand deal, Hand play) {
        super("BlackJack", 2, 4);
        dealer = deal;
        player = play;
        newDeck = newDeck();  
    }

    private Deck newDeck() {
        return null;
    }

    public Card cardHit(Hand hit){
        Card result = hit.newCard(newDeck);
        return result;
    }

    public int getHandValue(Hand hand){
        int total = hand.getHandSize();

        return total;
    }

    public boolean blackJack(){
        boolean result = false;
        
        if(player.getHandSize() == 21){
            result = true;
        }

        return result;
    }

    public boolean bust(Hand bust){
        boolean result = false;

        if(bust.getHandSize() > 21){
            result = true;
        }

        return result;
    }

    public Hand dealerPlay(){
        Hand result = dealer;

        while(dealer.getHandSize() <= 18){
            dealer.newCard(newDeck);
        }

        return result;
    }

    public String winner(){
        String endResult = " ";

        if((player.getHandSize() < dealer.getHandSize() && 
                dealer.getHandSize() <= 21){
            
            endResult = "Lose";
        }
        else{
            endResult = "Win";
        }

        return endResult;
    }
}