package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

public class CardGame implements Game {
    Dealer dealer;
    List<Player> players;
    String gameName;
    int minPlayers;
    int maxPlayers;
public CardGame(String gameName, int minPlayers, int maxPlayers){
    this.gameName = gameName;
    this.dealer = new Dealer();
    this.players = new ArrayList<Player>();
    this.minPlayers = minPlayers;
    this.maxPlayers = maxPlayers;
}
public List<Player> getPlayers(){
    return this.players;
}
public void addPlayers(Player player){
    this.players.add(player);
}
public int getPlayersSize(){
    return this.players.size();
}
public String getGameName(){
    return this.gameName;
}
public int getMinPlayers(){
    return this.minPlayers;
}
public int getMaxPlayers(){
    return this.maxPlayers;
}
public void distribute(int numOfCards){
    int amountPlayers = this.getPlayersSize();
    for(int i = 0; i < amountPlayers; i++){
        this.dealer.distributeCards(players.get(i), numOfCards);
    }
}
public void shuffle(){
    this.dealer.shuffle();
}


public void startGame(int numOfCards) {
    if(players.size() >= this.minPlayers && players.size() <= maxPlayers){
        distribute(numOfCards);
    }
}

public void endGame() {
    int amountPlayers = this.getPlayersSize();
    for(int i = 0; i < amountPlayers; i++){
        this.dealer.getCards(players.get(i));
    }
    players.clear();
}
/* FOR REFERENCE ONLY 

public static void main(String[] args){
    CardGame game=new CardGame("Generaic Card Game", 2, 1000);
    System.out.println("WELCOME TO "+game.getGameName());
    Player bob=new Player("Not Bob", 21);
    Player bob2=new Player("Not Bob2", 21);
    game.addPlayers(bob);
    game.addPlayers(bob2);
    game.startGame(2);
    System.out.println(bob.getMyCards().size());
    for (Card card : bob.getMyCards()) {
        System.out.println(card.getNumber()+" "+card.getSuit());
    }
    game.endGame();
    System.out.println(bob.getMyCards().size());
}
*/
}

