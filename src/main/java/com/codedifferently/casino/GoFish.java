package com.codedifferently.casino;

import java.util.List;

public class GoFish extends CardGame {

    public GoFish() {
        super("Go Fish", 2, 5);
    }
    public void goFish(){
        if(getPlayersSize() >= 2 && getPlayersSize() <= 3){
            startGame(7);
        }
        else if(getPlayersSize() >= 4 && getPlayersSize() <= 5){
            startGame(5);
        }
    }
    public String askForCards(Player asking, Player beingAsked, Card card){
        String dialogue = "Go Fish";
        int initialBeingAsked = beingAsked.getMyCardAmount();
        beingAsked.giveCards(asking, card);
        if(beingAsked.getMyCardAmount() < initialBeingAsked){
            if(card.getSuit() == ""){
                dialogue = beingAsked.getName() + " gave " + asking.getName()
                + " card(s) of " + card.getNumber();
            }
            else{
                dialogue = beingAsked.getName() + " gave " + asking.getName()
                + " card(s) of " + card.getSuit();
            }
        }
        return dialogue;
    }
    public void takeACard(Player goingFish){
        goingFish.addCards(this.dealer.removeCard());
    }
    /* FOR REFERENCE ONLY
    public static void main(String[]args){
        GoFish game = new GoFish();
        Card card = new Card("", 5);
        Player Bob = new Player("Bob", 21);
        Player Lil = new Player("Lil", 23);
        game.addPlayers(Bob);
        game.addPlayers(Lil);
        game.goFish();
        System.out.println(Bob.getMyCardAmount());
        System.out.println(Lil.getMyCardAmount());
        System.out.println(game.askForCards(Bob, Lil, card));
        game.takeACard(Bob);
        System.out.println(Bob.getMyCardAmount());
    }
    */
    
}