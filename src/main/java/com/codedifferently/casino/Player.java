package com.codedifferently.casino;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private double money;

    public Player(String name, double money) {
        this.name = name;
        money  = 0.0;
        this.money = money;
        hand = new ArrayList<Card>();
    }

    public Player() {
        
    }


    public String getName(){
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }


    public void gainsCard(Card card) {
        this.hand.add(card);
    }

    public void removeCardFromHand(Card card) {
        Card oldCard = new Card();
    }

}
