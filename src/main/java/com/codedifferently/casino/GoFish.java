package com.codedifferently.casino;

public class GoFish extends CardGame {

    public GoFish() {
        super(2, 4);
    }
    public void startGoFish(){
        start();
    }

    public static void playGoFish (Player asking, Player asked, Card card){
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffleCards();
        asking.gainsCard(card);
        if(asking == asked) {
            asked.removeCardFromHand(card);
            asking.gainsCard(card);
            card.newCard();
        }
        if (asking != asked) {

        }
    }
}
