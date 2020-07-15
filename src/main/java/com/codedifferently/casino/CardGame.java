package com.codedifferently.casino;
import java.util.ArrayList;

public class BlackJack extends CardGame {
    
    
    public BlackJack() {
        
        CardDeck cardDeck = new CardDeck();
        ArrayList<Card> handD = new ArrayList<Card>(); // Dealer's hand
        ArrayList<Card> handP = new ArrayList<Card>(); // Player's hand
        Dealer dealer = new Dealer(handD);
        Player p1 = new Player(handP);
    }
    @Override
    public void declareWinner(Player player) {
        System.out.println("You won at Blackjack! Congratulations " + player);
    }
}

