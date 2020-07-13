package com.codedifferently.casino;

public class CardGame implements Game{

    Game game;

    public Player player = new Player();
    public Deck deck = new Deck();

    public void start(){
    }

    public void stop() {
    }

    public void startGame(Game games) {
        games.start();
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



}
