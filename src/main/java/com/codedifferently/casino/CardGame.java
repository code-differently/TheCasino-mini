package com.codedifferently.casino;

import java.util.ArrayList;

public class CardGame implements Game{

    private ArrayList<Player> players;
    private int minPlayers;
    private int maxPlayers;
    Deck deck;

    public CardGame(int minPl, int maxPl) {
        this.minPlayers = minPl;
        this.maxPlayers = maxPl;
        this.players = new ArrayList<Player>();
    }

    public void start(){
        this.deck = new Deck();
    }

    public void stop() {
    }


    public void startGame() {
        start();
    }
    public void stopGame(Game games) {
        games.stop();
    }

    public String declareWinner(Player wPlayer) {
        return wPlayer.getName() + "is the Winner!";
    }

    public String declareTie( ) {
        return "There was a tie!";
    }

    public void dealCards(Player players, int numCards) {
        deck.shuffleCards();
        for(int i = 0; i < numCards; i++) {
            players.gainsCard(deck.removeCard());
        }
    }



}
