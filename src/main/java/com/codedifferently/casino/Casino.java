package com.codedifferently.casino;


public class Casino{
    //private Player player[];

    public void selectGame(String input) {
        if("blackJack".equals(input)) {
            new BlackJack().startGame();
        } else if("GoFish".equals(input)) {
            new GoFish().startGame();
        }
    }

    public void addPlayer(Player aPlayer) {
        Player player = new Player();
        //return this.player
    }
}

