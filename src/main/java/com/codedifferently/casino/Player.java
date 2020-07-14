package com.codedifferently.casino;

import java.util.ArrayList;

public class Player {
    private String name;
    public ArrayList<Card> hand;
    private Hand hands;
    private double money;

    public Player(String name, double money) {
        this.name = name;
        this.money  = money;
        hand = new ArrayList<Card>();
        this.hands = new Hand();
    }


    public String getName(){
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public int getHandAmount(){
        return this.hand.size();
    }

    public void gainsCard(Card card) {
        this.hand.add(card);
    }

    public void removeCardFromHand(Card card) {
        this.hand.remove(card);
    }

    //public Card getCard(Card card) {
       // return card;
    //}

}
